package neuespackage;

public class Dog {
    // statisches Attribut gibts nur einmal- egal wie viele Hundeobjekte erstellt werden
    public static String latinName = "Canis lupus familiaris";
    public static void printLatinName(){
        System.out.println(latinName);
        System.out.println();
    }
    // auf private Attribute können abgeleitete Klassen nicht zugreifen, auf protected schon
    private String name;
    protected int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void bark(String wuff){
        System.out.println(name + " bellt: " + wuff);
    }
}
