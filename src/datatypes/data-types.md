## Data Types
Java is statically typed which means all variables must have a declared type at compile-time. Statically typed languages like Java include C++, Rust, C#. Dynamically typed languages such as JavaScript, Python, and Ruby check the type at run-time instead of compile-time and the type of a variable could change at any time.

## Java has two types of data:
###  Primitives
#### The most basic data type that are built into Java.

- byte: *Represents a signed integer that can hold a value of -128 to 127 and takes up 1 byte(8 bits) of memory.*
- short: *Represents a signed integer that can hold a value of -32,768 to 32,767 and takes up 2 bytes(16 bits) of memory.*
- int: *Represents a signed integer that can hold a value of -2,147,483,648 to 2,147,483,647 and takes up 4 bytes(32 bits) of memory. Typically used as the default for representing signed integers in Java.*
- long: *Represents a signed integer that can hold a value of -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 and takes up 8 bytes(64 bits) of memory.*
- float: *Represents a single-precision, 32-bit IEEE 754 floating point. A float provides a precision of 7 decimal places. Primarily used for saving memory in large Arrays of floating point numbers.*
- double: *Represents a double-precision, 64-bit IEEE 754 floating point. A double provides a precision of 14 decimal places. Typically used as the standard for representing decimals in Java.*
- boolean: *Represents a true or false value and is often used to store simple flags to check for true or false conditions. Memory usage isn't precisely defined but when used standalone, can use 1 byte because the JVM aligns to byte-boundaries. In Arrays, booleans can use less memory because multiple boolean values can be packed into a byte but the usage depends on the JVM implementation.*
- char: *Represents a single character based on the Unicode specification. Uses 16-bits and can hold a value of '/u0000'(0) to 'u/ffff'(65535)*

All these primitives have a wrapper class which allows the ability to access utility functions or provide an Object when needed.

### Non-Primitive(Complex/Composite)
#### A data type that is made up of two or more primitive data types and is used to organize and structure code to make it easier to work with.

Examples include:
- Arrays: *Collection of elements, identified by an index.*
- Objects: *A collection of fields where each field is a variable with a type and a value. Used in object-oriented programming.*
- Functions: *A type of data that includes a sequence of instructions that can be executed when a function is called.*
- Lists, Maps, Sets: *Other complex structures that hold multiple values.*