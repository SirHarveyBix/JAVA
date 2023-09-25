public class MainObject extends Object {
    public static void main(String[] args) {
        StudentObject max = new StudentObject("Max", 21);
        System.out.println(max.toString());

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8, "Carole");
        System.out.println(jimmy);
    }
}

class StudentObject {
    private String name;
    private int age;

    StudentObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
    @Override // #1
    public String toString() {
        return name + " is " + age;
//        return "StudentObject{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class PrimarySchoolStudent extends StudentObject {
    private String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age); // call constructor from StudentObject
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString(); // super.toString(); calls #1 overwritten toString() method
    }
}