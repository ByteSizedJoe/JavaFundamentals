package operators;

public class Operators {
    public static void main(String[] args) {
        System.out.println("=== Arithmetic Operators ===");
        int a = 17;
        int b = 3;
        System.out.println("With a = 15 and b = 3");

        //Addition operation
        int c = a + b;
        //When we use + for the print statement, we're using it as string concatenation.
        //This can be thought of as "this string " + "another string" = "this string another string"
        System.out.println("a + b = " + c);

        //Subtraction operation
        c = a - b;
        System.out.println("a - b = " + c);

        //Multiplication operation
        c = a * b;
        System.out.println("a * b = " + c);

        //Division operation
        c = a / b;
        System.out.println("a / b = " + c);

        //Modulus/Remainder operation
        //Useful for determining if a number is even by using num % 2 = 0, getting the last digit of a number by
        //using num % 10 = lastDigit, checking if the num is a multiple of another number by num1 % num 2 = 0 then num1
        //is a multiple of num2, creating a circular array by doing index % array.length to return the to the beginning
        //and in some types of cryptography algorithms.
        c = a % b;
        System.out.println("a % b = " + c);

        System.out.println("\n=== Bitwise Operators ===");

        //Example of bitwise AND, 2 AND 2 = 2
        //Use cases: checking even/odd where num & 1 = 0 is even, masking certain bits where num & a binary number where
        //1's are places of interest as it 0's all other bits, checking if a number is a power of 2 by doing num & (num - 1) = 0
        //then the number is a power of 2, and flipping lower bits to zero using a mask binary number to flip lower bits.
        System.out.println("2 AND 2 = " + (2 & 2));

        //Example of bitwise OR, 2 OR 2 = 2
        //Use cases: merging bit patterns, permissions management.
        System.out.println("2 OR 2 = " + (2 | 2));

        //Example of bitwise XOR, 2 XOR 2 = 0
        //Use cases: detecting differences between two numbers, swapping two numbers without a temporary variable,
        // determining if a number is odd or even by doing num ^ 1 which will create an odd if num is even and an even if num is odd,
        // and in encryption algorithms.
        System.out.println("2 XOR 2 = " + (2 ^ 2));

        //Example of bitwise left shift where vacant bits become 0's, 2 << 2 = 8
        //Use cases: multiplication by powers of 2 by shifting num left by x bits multiples n by 2^x, creating complex bitwise
        //operations such as rotate left/right, creating a bit mask to work with specific bits, data serialization by creating
        //room in a bit string for new data.
        System.out.println("Bitwise left shift: 2 << 2 = " + (2 << 2));

        //Example of bitwise right shift where vacant bits become 0's for positive nums and 1's for negative nums, 8 >> 2 = 2
        //Use cases: Division by powers of 2 by shifting num to the right by x bits divides n by 2^x, extracting bits
        //from a binary number, and performing arithmetic right shift
        System.out.println("Bitwise right shift: 2 >> 2 = " + (8 >> 2));

        //Example of unsigned bitwise right shift where vacant bits always become 0's, -8 >> 2 = 1073741822
        //Use cases: division by powers of 2 for negative numbers by shifting negative num right by x bits divides n by 2^x.,
        // manipulating binary data, and creating masks that involve higher order bits.
        System.out.println("Bitwise unsigned right shift: -8 >>> 2 = " + (-8 >>> 2));

        System.out.println("\n=== Assignment Operators ===");

        //Example of assigning a value to a variable
        int assignExample = 17;
        System.out.println("The value assigned to variable 'assignExample' is :" + assignExample);

        //Add and assign, essentially doing: assignExample = assignExample + 2
        assignExample += 2;
        System.out.println("Assign example += 2 is : " + assignExample);

        //Subtract and assign, shorthand for: assignExample = assignExample - 2
        assignExample -= 2;
        System.out.println("Assign example -= 2 is : " + assignExample);

        //Multiply and assign, shorthand for: assignExample = assignExample * 2
        assignExample *= 2;
        System.out.println("Assign example *= 2 is : " + assignExample);

        //Divide and assign, shorthand for: assignExample = assignExample / 2;
        assignExample /= 2;
        System.out.println("Assign example /= 2 is : " + assignExample);

        //Modulus and assign, shorthand for: assignExample = assignExample % 2
        assignExample %= 2;
        System.out.println("Assign example %= 2 is : " + assignExample);

        //Bitwise AND and assign, shorthand for assignExample = assignExample & 2
        assignExample &= 2;
        System.out.println("Assign example &= 2 is : " + assignExample);

        //Bitwise OR and assign, shorthand for assignExample = assignExample | 2;
        assignExample |= 2;
        System.out.println("Assign example |= 2 is : " + assignExample);

        //Bitwise XOR and assign, shorthand for assignExample = assignExample ^ 2;
        assignExample ^= 2;
        System.out.println("Assign example ^= 2 is : " + assignExample);

        //We'll reset the value here since 2 XOR 2 is 0
        assignExample = 8;

        //Bitwise right shift and assign, shorthand for assignExample = assignExample >> 2;
        assignExample >>= 2;
        System.out.println("Assign example >>= 2 is : " + assignExample);

        //Bitwise left shift and assign, shorthand for assignExample = assignExample << 2;
        assignExample <<= 2;
        System.out.println("Assign example <<= 2 is : " + assignExample);

        //Bitwise unsigned right shift and assign, short hand for assignExample = assignExample >>> 2;
        assignExample >>>= 2;
        System.out.println("Assign example >>>= 2 is : " + assignExample);

        System.out.println("\n=== Ternary Operator ===");
        //Example of ternary operator, shorthand for:
//        int num = 2;
//        if(num == 2) {
//            num = 3;
//        } else {
//            num = 4;
//        }
        int num = 2;
        System.out.println("Num is: " + num);
        System.out.println("If num is 2, then set to 3 and otherwise set to 4");
        num = (num == 2) ? 3 : 4;
        System.out.println("After ternary operator num is: " + num);

        System.out.println("\n=== Unary Operators ===");
        //Unary operators perform operation based on prefix or postfix position
        //Prefix where the unary operator comes before the single operand means that the operation is done before the
        //variable is evaluated. Postfix means the operation is done after the variable is evaluated.
        int unary = 1;
        System.out.println("Where the value of unary starts as: " + unary);

        //Post fix where the operation is done after the value is evaluated, would expect the value to print 1, then 2.
        System.out.println("Unary post fix increment: " + unary++);
        System.out.println("Unary post fix decrement: " + unary--);

        //Pre fix where the operation is done before the value is evaluated, would expect to print 2, then 1
        System.out.println("Unary pre fix increment: " + ++unary);
        System.out.println("Unary pre fix decrement: " + --unary);

        //Rarely used as it doesn't have a significant effect on values or expressions.
        System.out.println("Unary plus operator(represents postitive a): " + +unary);
        //More commonly used to actively negate a value in Java.
        System.out.println("Unary minus operator(represents negative a): " + -unary);

        //Logical complement takes a logical value like a boolean and negates the value.
        boolean truth = true;
        System.out.println("Unary logical complement operator: " + !truth);

        System.out.println("\n=== String concatenation ===");
        String hello = "Hello ";
        String world = "world!";
        System.out.println(hello + world);
    }
}
