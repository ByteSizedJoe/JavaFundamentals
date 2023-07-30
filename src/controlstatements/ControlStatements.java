package controlstatements;

public class ControlStatements {
    public static void main(String[] args) {
        //Decision-Making Statements
        ifStatementExample();
        ifElseStatementExample();
        switchStatementExample();

        //Looping statements
        forLoopExample();
        whileLoopExample();
        doWhileLoopExample();

        //Branching Statements
        branchingStatementsExample();
    }

    //We check if a condition, in this case 2+2=4, is true. If yes, then we print to the console that it is the truth.
    static void ifStatementExample() {
        System.out.println("We're using an if statement to check if 2+2 = 4:");
        if(2 + 2 == 4) {
            System.out.println("Wow it is true that 2+2 = 4");
        }
    }

    //We check if the condition, in this case 2+2=5 is true. If yes, we print to the console that it is the truth,
    //otherwise we print out that it is not the truth.
    static void ifElseStatementExample() {
        System.out.println("\nWe're using an if-else statement to check if 2+2 = 5:");
        if(2 + 2 == 5) {
            System.out.println("Wow it is true that 2+3 = 5");
        } else {
            System.out.println("No it is actually not true that 2+2 = 5");
        }
    }

    //We check if 2+2=1, 2+2=2,2+2=3,2+2=4, or if 2+2 = 5 and when any of these are true, we print out that truth!
    //With a switch statement, we define cases for each possibility of our condition. If the condition matches the possibility
    //it executes that block of code. We use a "break" statement, to end the statement execution because we know that once
    //we have determined the possibility, none of the other branches should be possible.
    static void switchStatementExample() {
        System.out.println("\nWe're using a switch statement to check if 2+2 is equal to a lot of different values:");
        switch(2+2) {
            case 1:
                System.out.println("2+2=1 is true!");
                break;
            case 2:
                System.out.println("2+2=2 is true!");
                break;
            case 3:
                System.out.println("2+2=3 is true!");
                break;
            case 4:
                System.out.println("2+2=4 is true!");
                break;
            case 5:
                System.out.println("2+2=5 is true!");
                break;
            default:
                System.out.println("2+2 is none of these!");
                break;
        }
    }

    //A for loop allows you to define statements that update and check for when the condition should run.
    //In this case, we're defining a variable i that starts at 0 and while i is less than 5, we will increment i and
    //execute the loop body.
    //Use cases: When we know how many times we need to loop, nested for loops allow for sorting/matrix algorithms,
    //iterating through collections including in reverse order, and performing calculations.
    static void forLoopExample() {
        System.out.println("\nWe're using a for-loop to print out 'Hello!' 5 times:");
        for(int i = 0; i < 5; i++) {
            System.out.println("Hello!");
        }
    }

    //A while loop allows you to check the condition of some variable or statement and then executes the loop body
    //until the condition is no longer true. In this case, we're defining a variable countDown which is an int that has
    //a value of 5. We then print out "Hello" to the console and decrement the count down. The while loop checks if the
    //condition countDown > 0 is true and continues executing until it is not.
    //Use cases: When we don't know how many times we need to loop, reading from a file, event loop to continually check for
    //an event, a game loop, generating a sequence(like Fibonacci sequence)
    static void whileLoopExample() {
        System.out.println("\nWe're using a while loop to print out 'Hello' 5 times:");
        int countDown = 5;
        while(countDown > 0) {
            System.out.println("Hello!");
            countDown--;
        }
    }

    //A do-while loop will execute the loop body before checking the condition. While the condition is true, it will continue
    //to execute the loop body. This ensures that the logic in the loop body will always be executed at least once.
    static void doWhileLoopExample() {
        System.out.println("\nWe're using a do-while loop to print out 'Hello!' 1 time!");
        int countDown = 0;
        do {
            System.out.println("Hello!");
            countDown--;
        } while(countDown > 0);
    }

    //To demonstrate all three branching statements, we use a while loop which will loop 5 times. Once a == 2, we use
    // continue to skip the current iteration
    static void branchingStatementsExample() {
        System.out.println("\nWe're demonstrating branching statements!");
        int a = 0;
        while(a < 5) {
            if(a == 2) {
                System.out.println("We won't ever print the iteration when a == 2");
                a++;
                continue;
            }
            if(a == 3) {
                System.out.println("We are breaking out of the loop when a == 3,");
                a++;
                break;
            }
            if(a == 4) {
                System.out.println("We won't ever see this print!");
            }
            System.out.println("We're on " + a + " iteration of this loop!");
            a++;
        }
        return; //We cannot execute any more statements in this function after we return.
    }
}
