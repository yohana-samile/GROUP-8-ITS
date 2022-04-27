# GROUP-8-ITS
    This is group work, (Class activity).
        NOTE: It is difficult to implement four pillars of java in C Programming Langauage.
        This is because four pillars of java can be archived in only OBJECT ORIENTED PROGRAMMING SYSTEM, but C Programming Langauage 
        is the procidial programming language so it can not sapport this pillars of java.


                      FOUR PILLARS OF JAVA      
                      
                      

     ABSTRACTION: This is used to hide some unimportant features or information to the user, by displaying only important information to the user.
    
          -> Abstration defiened in OOP as a means of communicating with objects
    
          -> Example sending SMS where you type the text and send the message. You don't know the internal processing about the message delivery.

     POLIMOPHISM: This is the ability of one class to provide different implementation of method depending of an object
     
          -> Any java object that can pass more than one IS-A relationship it can called an polimophic.
     
          -> Therefore polimophism allow us to perform single action in many ways.

    ENCAPSULATION: This is known as data hiding 
        There are two ways to achieve encapsulation in Java:-

        -> Declare the variables of a class as private.

        -> Provide public setter and getter methods to modify and view the variables values.


    INHERITANCE: This is used to describe how one class inherity properties and characheristics of a one mother class to other child class.
        Example the relationship between father and son.
    
        -> One which inherity properties of another class in called a child class or sub class
    
        -> Inheritance in java can be archieved by varius method such as calling of one fuction to work to onether function
    
        -> A chald class can reuse method and other field or super class or parent class
    
        -> Inheritance it is important part in OOP (Object Oriented Progamming System)
    
        -> Inheritance represent an Is-A RELATIONSHIP which means parent-child relationship

        -> Example of inheritance in java

          class Subclass-name extends Superclass-name  
            {  
              //methods and fields  
            }  

            <!--  Example two      -->
            class Employee{  
              float salary=40000;  
            }  
            class Programmer extends Employee{  
                int bonus=10000;  
                public static void main(String args[]){  
                  Programmer p=new Programmer();  
                    System.out.println("Programmer salary is:"+p.salary);  
                    System.out.println("Bonus of Programmer is:"+p.bonus);  
                }  
            }  
            ......


        GROUP MAMBERS:
            -> YOHANA SAMILE
            -> SHADRACK MUSA
            -> ABUBAKAR PANDU
