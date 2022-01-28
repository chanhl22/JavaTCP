class Parent {

}

class Child extends Parent {

}

public class Instanceof {
    public static void main(String[] args) {

        String name = "chan";
        Object obj = name;
//        Object obj = new Object();

        if (name instanceof String) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (obj instanceof String) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        Parent parent = new Parent();
        Child child = new Child();
        Parent test1 = new Child();
        //Child test2 = new Parent(); //불가능


        System.out.println( parent instanceof Parent ); // true
        System.out.println( child instanceof Parent ); // true
        System.out.println( parent instanceof Child ); // false
        System.out.println( child instanceof Child ); // true
        System.out.println(test1 instanceof Child); //true
        System.out.println(test1 instanceof Parent); //true

    }
}
