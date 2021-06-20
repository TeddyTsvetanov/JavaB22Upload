package day44_custom_classes;

public class App {
    /**
     attribute/data/instance variable:
        -name
        -version
     behaviour/methods:
        -open (use name and version variables in this method)
     */

    String name;  //null by default
    Double version;  // 0.0 by default

    public void open(){
        System.out.println(name+" opened version: " + version);
    }
}
