package day48_constructors_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {
    //when a method is static we can directly call it with the class name

        //add is static method, can be called using Classname.staticMethodName
        Calculator.add(5,3);

        //not a static method = instance = object method, we need to create an object using new Keyword, then I can use Multiply
        // Calculator.multiply(2,4);     ERROR: Multiply is not a static method, need an object to call it
       //multiply is an instance method, and we are creating object, then calling it
        Calculator calcObject = new Calculator();

        calcObject.mupltiply(2,4);
        //static method can also be called by using an object but IntelliJ doesn't like it
        calcObject.add(10,45);
    }
}
