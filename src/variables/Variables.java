package variables;

/*
    This class will provide general examples of variable scopes specific to memory. The Java Language Specification
    does not mandate a specific layout for memory so various JVM implementations may allocate variables differently.
 */
public class Variables {
    // These are instance variables(non-static field) which are created when the object is created and destroyed when the object is
    // destroyed. They are stored on the heap because they are part of the state of the object.
    int number = 123;
    String hello = "Hello";

    // This is a class variable(static field) denoted by the keyword static. Only one copy of each static variable exists
    // and is shared by all instances of the class. Static variables are stored in a part of heap called the method area.
    static int otherNumber = 456;

    // This is a constructor which creates an instance to an Object, in this case the Object "JavaVariables". The code
    // of this method is stored in the method area but when it is called, it creates a new frame on the stack to hold its
    // execution context.
    Variables() {
        // some initialization logic here.
    }

    //An instance method that's code will be stored in the method area but when it's called will create a new frame on
    // the stack which will be discarded after execution.
    void display() {
        //a local variable that is stored on the stack but removed after method execution is complete as the stack frame is popped off the stack.
        char a = 'A';
        System.out.println("An instance variable that is stored in heap, Number: " + number);
        System.out.println("An instance variable that is stored in heap, Hello: " + hello);
        System.out.println("A static variable that is stored in the method area, Other Number: " + otherNumber);
        System.out.println("A local variable that is stored in the stack, a: " + a);
    }

    public static void main(String[] args) {
        //Create a reference to the Object "Java Variables"
        Variables variables = new Variables();
        //Call instance method display, to display contents of instance, static, and local variables.
        variables.display();
    }
}
