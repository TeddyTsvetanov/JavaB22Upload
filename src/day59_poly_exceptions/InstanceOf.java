package day59_poly_exceptions;

import day57_abstraction_polymorphism.shapes.Shape;
import day57_abstraction_polymorphism.shapes.Circle;
import day57_abstraction_polymorphism.shapes.Square;

public class InstanceOf {
    public static void main(String[] args) {
        //instance of operator
        Shape shape = new Circle();
        System.out.println(shape instanceof Circle);   //true, b/c we have = new Circle above
        System.out.println(shape instanceof Square);   //false, b/c we have = new Circle above
        if(shape instanceof Circle){
            System.out.println("It is a Circle object");   //this will print
        }else if (shape instanceof Square){
            System.out.println("It is Square object");
        }


        /**
         * Java reflection API
         */
        System.out.println(shape.getClass().getSimpleName());  //just class name of object
        System.out.println(shape.getClass().getName()); //class name of object and package name
        if(shape.getClass().getSimpleName().equals("Square")){
            System.out.println("It is a square object");
        }

        System.out.println(shape.getClass().getDeclaredMethods().length);

        WebElement el = new Link();
        System.out.println("object class name of el variable = " + el.getClass().getSimpleName());

    }
}
