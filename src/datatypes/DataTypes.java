package datatypes;

import java.math.BigDecimal;
import java.util.Arrays;

public class DataTypes {

    /**
     * A class that demonstrates all the Java primitive types as well as some examples
     * of non-primitives.
     **/
    public static void main(String[] args) {
        System.out.println("=== Primitive Types ===");
        // If you need a signed integer that can hold a value of -128 to 127, a byte can be used.
        // Some use cases for using a byte: memory-sensitive applications, file I/O, networking, image processing,
        // binary data manipulation, cryptography/hashing algorithms, interfacing with hardware.
        // We will create a byte with the max positive value it can hold, and print it out using a process called string conversion.
        byte byteExample = 127;
        System.out.println("This is a byte which takes up 1 byte of memory: " + byteExample);

        // If you need a signed integer that can hold a value of -32,768 to 32,767, a short can be used.
        // Some use cases: memory-sensitive application, networking/file I/O, sound data, scientific computing, and hardware interfacing.
        short shortExample = 32767;
        System.out.println("This is a short which takes up 2 bytes of memory: " + shortExample);

        // If you need a signed integer that can hold a value between -2,147,483,648 to 2,147,483,647, then an int can be used.
        // Int is usually the default for representing signed integers in Java because it provides a wide range of integers
        // that can be represented, it's performant on 32-bit and 64-bit architectures because it can be processed natively
        // in a single operation which makes it efficient for mathematical operations, it's compatible, and by convention
        // Java recommends the use of an int unless there are compelling reasons to use byte, short, or long.
        int intExample = 2147483647;
        System.out.println("This is an int which takes up 4 bytes of memory: " + intExample);

        // If you need a signed integer that holds a value greater than what can be found in an ints range, a long can be used.
        // Some use cases: very large numbers, time representation in Java is usually represented in number of milliseconds
        // since the Unix epoch as a long, big data, UUIDs/other long IDs, file sizes that exceed 2 GB, large array indices/lengths,
        // networking/file I/O that specify 8-bit values. 64-bit architectures are performant with long.
        // If the number exceeds the range of "int" in Java, we must specify that a number literal is a long by appending
        // 'L' or 'l'. This is because all integer literals are assumed to be of type int unless followed by a 'L'.
        // We can also specify integer literals in decimal, hexadecimal prefixed with 0X, octal prefixed with '0', or binary
        // prefixed with 0B
        long longExample = 9223372036854775807L;
        System.out.println("This is a long which takes up 8 bytes of memory: " + longExample);

        // If you need a single-precision, 32-bit floating point number that provides only 6-7 decimal places of precision,
        // a float can be used. Some use cases: graphics programming, scientific computation, memory-sensitive application,
        // games, financial applications where precision is not critical, database interaction.
        // In this example, if we provided more precision than the 7 values before such as 3.1415926, the float would
        // round this to 3.1415925. By default, Java interprets decimal literals as doubles, so we have to add "F" to
        // make sure that Java treats this as a float.
        float floatExample = 3.141592F;
        floatExample = 0.1F + 0.2F;
        System.out.printf("This is a float which takes up 4 bytes of memory: %.50f%n", floatExample);

        // If you need a double-precision, 64-bit floating point number that provides 15-17 decimal places of precision,
        // a double can be used. Some use cases: Scientific computing, financial computing where utmost accuracy is not required,
        // graphics/gaming, statistical mathematics/machine learning, geographical information systems, database interaction.
        // When we provide more precision than 3.141592653589793, such as 3.1415926535897935, rounding may occur to fit the
        // precision. BigDecimal can be used when we need more precision but is not as fast as a double.
        double doubleExample = 3.141592653589793;
        doubleExample = 0.1;
        System.out.printf("This is a double which takes up 8 bytes of memory: %.57f%n",doubleExample);
        long bits = Double.doubleToLongBits(doubleExample);
        System.out.println(Long.toBinaryString(bits));

        BigDecimal bigDecimalExample = new BigDecimal("0.1");
        System.out.println("Big Decimal: " + bigDecimalExample);

        // If you just need a simple flag that represents true or false conditions, a boolean can be used
        boolean booleanExample = true;
        System.out.println("This is a boolean which probably uses 1 byte of memory: " + booleanExample);

        // If you need to represent a single unicode character, a char can be used. Some use cases: string manipulation,
        // character validation, reading single characters from user input, character encoding/decoding, array of characters
        // if you are doing a lot of string modification - it's more efficient ot use an array of characters than concatenating strings,
        // and implementing data structures. While char can be used to store unicode characters, it's often used to store ASCII characters
        // which is a subset of unicode characters.
        // For chars, we have to surround the character with literals ' ' so that Java interprets this as a char.
        char characterExample = 'A';
        System.out.println("This is char which uses 3 bytes of memory: " + characterExample);

        // All these primitive types that we have defined also have a wrapper class, which is a class used to convert
        // a primitive data type into an object of that class. Wrapper classes are used in data structures such as
        // ArrayList or HashMap, to use in Collections or generics, to use built-in methods, or to represent null values
        // Wrappers are generally less performant and more memory-intensive than primitives because of object overhead,
        // auto-boxing/unboxing(converting primitive type to Object), indirect access to the value, and memory allocation/garbage collection.
        System.out.println("\n=== Wrapper Classes for Primitive Types ===");
        Byte byteWrapper = 127;
        System.out.println("This is a Byte object with a byte value of: " + byteWrapper);
        Short shortWrapper = 32767;
        System.out.println("This is a Short object with a short value of: " + shortWrapper);
        Integer integerWrapper = 2147483647;
        System.out.println("This is an Integer object with an int value of: " + integerWrapper);
        Long longWrapper = 9223372036854775807L;
        System.out.println("This is a Long object with a long value of: " + longWrapper);
        Float floatWrapper = 3.141592F;
        System.out.println("This is a Float object with a float value of " + floatWrapper);
        Double doubleWrapper = 3.141592653589793;
        System.out.println("This is a Double object with a double value of " + doubleWrapper);
        Boolean booleanWrapper = true;
        System.out.println("This is a Boolean object with a boolean value of " + booleanWrapper);
        Character characterWrapper = 'A';
        System.out.println("This is a Character object with a char value of " + characterWrapper);

        // Non-Primitive types are a data type where you can represent two or more primitive types in a single type.
        // This is useful for organization of code to make it easier to work with. This is fundamental to Object-Oriented Programming
        System.out.println("\n=== Non-Primitive Types ===");
        // A string is a complex type that is immutable(meaning it can't be changed after it's created) and stores
        // its data in the form of a byte array. When string operations are done, a new String objected is created
        // every time.
        String stringExample = "Hello";
        System.out.println("This is a String object: " + stringExample);

        // This is an int array is a special complex type which contains a collection of primitive ints.
        // The runtime environment implicitly creates an object that has a "pseudo-class" associated with it.
        int[] intArrayExample = {1, 2, 3};
        System.out.println("This is an int array: " + Arrays.toString(intArrayExample));

        // This Object is a complex type that is the superclass for every Object created in Java.
        Object objectExample = new Object();
        System.out.println("This is the class name and hashCode of a newly created Object: " + objectExample);
    }
}
