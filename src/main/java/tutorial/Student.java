package tutorial;

public class Student implements Person {
    private final String id;
    private final String name;
    private final int age;
    
    //Constructor
    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    private int studyHours(){
        return this.age/2;
    }

    @Override
    public boolean equals(Person other) {
        if(!(other instanceof Person))
            return false;
        Student s = (Student)other;
        return this.id.equals(s.id);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Student{" + " Id= " + id + ", Name= " + name + ", Age= " + age + " Study hours= "+studyHours()+" }";
    }
    
    
    
}
