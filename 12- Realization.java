Realization

 see Examples form Generalization Lec

- Parent(Abstract class) does not exist
- Parent(Abstract class) represents only a concept
- child class (Concreate derived class) implements the   concept   of its parent
...................................................................
java implements realization using two Methods
i) Abstract class
ii)interface
...............................................................

Example: Vehicle is a general type. Car and truck implements the concept of  vehicle.
   
             vehicle(start(), run(),stop())
 
 car(start(), run(),stop())   Truck(start(), run(),stop())

(See Class Diagram on board)

- Car implements the concept of vehicle
- Car realizes vehicle
- Vehicle realizes in the form of car and truck
- Pysically there is no vehicle
- Car should implement all public methods(interfaces) in vehicle
..........................................................................
Solution  with Abstract class

.........................................................................
abstract class Vehicle {
public abstract void start();
public abstract void run();
public abstract void stop();
}
class Car extends Vehicle{
public void start(){System.out.println(" Car Pertol Engine Start"); }
public void run() {System.out.println(" Car runs"); }
public void stop(){System.out.println(" Car stop with ABS Breaks"); }
}
class Truck extends Vehicle{
public void start(){System.out.println(" Truck Diesal Engine Start"); }
public void run() {System.out.println(" TRuck  move"); }
public void stop(){System.out.println("TRuck stop with Air pressure Breaks"); }
}
class Test{
public static void main(String o[]){
Vehicle v;//ok
// v= new Vehicle (); error abstract can't be instanciated
Car c= new Car();
c.start();c.run();c.stop();  //ok
Truck t=new Truck();
t.start();t.run();t.stop();  //ok
v=c;
v.start();v.run();v.stop();  //ok
v=t;
v.start();v.run();v.stop();  //ok
}
}
..........................................................
Solution with Interface
..........................................................
interface  Vehicle {
 public  void start();
 public  void run();
 public  void stop();
}
class Car implements Vehicle{
public void start(){System.out.println(" Car Pertol Engine Start"); }
public void run() {System.out.println(" Car runs"); }
public void stop(){System.out.println(" Car stop with ABS Breaks"); }
}
class Truck implements Vehicle{
public void start(){System.out.println(" Truck Diesal Engine Start"); }
public void run() {System.out.println(" TRuck  move"); }
public void stop(){System.out.println("TRuck stop with Air pressure Breaks"); }
};
class Test{
public static void main(String o[]){
Vehicle v;//ok
// v= new Vehicle (); error abstract can't be instanciated
Car c= new Car();
c.start();c.run();c.stop();  //ok
Truck t=new Truck();
t.start();t.run();t.stop();  //ok
v=c;
v.start();v.run();v.stop();  //ok
v=t;
v.start();v.run();v.stop();  //ok
}
}
...................................................................
Abstract Classes versus Interfaces
...................................................................
- Methods can be implemented in abstract class
- variable can be declared in abstrast class
- At least one method should be declared as abstract
Example:
abstract class GraphicObject {
    int x, y;
    ...
    void moveTo(int newX, int newY) {
        ...
    }
    abstract void draw();
    abstract void resize();
}
Rule of thumb
- If an abstract class contains only abstract method declarations, it should be declared  as an interface instead.
- use always inteferces as compare to abstratct class

.....................................................................
  Mutileval Realization(Abstraction)
      interface extension
.................................................................
Example     	  Car
    Sedan  		              Hatchback
Honda   Suzuki     		Suzuki 		Toyota
civic    Liana      		Alto      	vitz
 see UML Diagram on board
...................................................
interface Car{
public void engine();
public  void tyre();
}
interface Sedan extends Car{
public void luggageCase();
}
interface Honda extends Sedan{
public void enironmenal();
}

class Civic  implements Honda{
public void engine(){System.out.println(" Car Pertol Engine Start\n"); }
public void tyre(){System.out.println(" Car Tyres\n");}
public void luggageCase(){System.out.println(" Car LuggageCase\n");}
public void enironmenal(){System.out.println(" neat and clean Air\n");}
public void digitalMeter() { System.out.println(" DigitalPower\n");}
  // we can implement extra features
}
class Test{
public static void main(String o[]){
Civic c= new Civic();
c.engine();c.tyre();c.luggageCase();c.enironmenal();
Car cr;
cr=c; //possible due to generalization
cr.engine();
cr.tyre();
cr.environmental(); //error
if (cr instanceof Civic){
 Civic ci=(Civic))cr; //specialization, casting required
  ci.digitalMeter();//ok

}
}
}
..........................................................
Use of Realization in Industry

1- Enforcement of standards

2- Decide interfaces before implementation

3- Polymorphism

4- Write Generic Code

5- Network programming
    Remote Method Invocation  (RMI)

..........................................................

1- Enforcement of standards
  - in order to enforce standards among programming teams

Example: Suppose we have three Teams A, Team B and Team C working on three projects.
  Team A    Mail Project
  Team B    Routing Protocols
  Team C    Web Application
All Teams should implemnt RFC and GNU Standards in their codes.(Company's by Law)

interface   RFC {
public void RFC1();
public void RFC2();
}
interface GNU {
public void GNU1();
public void GNU2();
}
................................

Team A   Mail Project 
................................
class SMTP implements RFC,GNU{

void sendMail()  {}
// should implement all RFC and GNU methods

}


.....................................................
Team B   Routing Protocols 
......................................................
class Routing implements RFC,GNU{

void route()  {}
// should implement all RFC and GNU methods

}

.....................................................
Team C   Web Applications 
......................................................
class Web implements RFC,GNU{

void WebRoute()  {}
// should implement all RFC and GNU methods

}

...................................................................................



















