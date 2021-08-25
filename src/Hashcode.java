

class Person {
    private String name;

    public Person(String name) {
        super();
        this.name = name;
    }

    public Person() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}

public class Hashcode {
    public static void main(String[] args) {
        Person a = new Person("Noah");
        Person b = new Person("Noah");

        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println(a);

        System.out.println("=================");

        String a2 = "noah";
        String b2 = "noah";
        System.out.println(a2.equals(b2));
        System.out.println(a2 == b2);

        System.out.println("=================");

        String a3 = new String("Noah");
        String b3 = new String("Noah");
        System.out.println(a2.equals(b2));
        System.out.println(a3 == b3);

        System.out.println("=================");

        String a4 = "Noah";
        String b4 = new String("Noah");
        System.out.println(a4.equals(b4));
        System.out.println(a4 == b4);
        System.out.println(a4.hashCode());
        System.out.println(b4.hashCode());

    }
}