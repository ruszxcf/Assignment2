A) This project is a simple Java program that was created to practice Object-Oriented Programming. The main goal of this project is to understand how classes, objects, and methods work together in Java. The program works with different types of vehicles and drivers. It shows how inheritance and abstraction can be used to organize code in a clean and logical way. The user enters data from the keyboard, and the program processes this data and shows the result.

-----------------------------------------------------------------------------------

B) 
Vehicle Class:

    The Vehicle class is an abstract class and it is the parent class for all vehicles in the program. It stores common information such as brand, year, and driver.

Fields:

    brand – stores the vehicle brand
    year – stores the production year
    driver – stores the driver of the vehicle

Methods:

    startEngine() – abstract method for starting the engine
    stopEngine() – abstract method for stopping the engine
    displayInfo() – shows basic vehicle information

Car Class:

    The Car class extends the Vehicle class and represents a car. It has additional information such as the number of doors and the fuel type. This class overrides the engine methods to show car-specific behavior.

Motorcycle Class:

    The Motorcycle class also extends the Vehicle class. It has a field that shows whether the motorcycle has a sidecar or not. This class also overrides the engine methods.

Truck Class:

    The Truck class represents a truck vehicle. It has information about load capacity and number of axles. This class is used to show how inheritance works with more complex objects.

Driver Class:

    The Driver class stores information about the driver. It includes the driver’s name and license number. One driver can be assigned to different vehicles in the program.

-----------------------------------------------------------------------------------


C) To run the program, open the terminal in the project folder and use the following commands:

    javac *.java
    java Main

-----------------------------------------------------------------------------------


D) 

    The program asks the user to enter information about the driver and vehicles. After that, it creates different vehicle objects and assigns drivers to them. All vehicles are stored in an array and processed using a loop. The program then displays vehicle information and starts and stops each engine.

-----------------------------------------------------------------------------------


E) 

    This project helped me understand how Object-Oriented Programming works in Java. I learned how to use inheritance to reduce code repetition and how abstract classes help organize the program structure. I also learned how to work with arrays of objects and how to connect different classes together. This project helped me improve my Java skills and understand OOP concepts better.
