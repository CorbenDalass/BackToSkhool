public class Person {
   private String name;
   private int age;
   private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Person(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    @Override
    public String toString() {
        return name+", age: "+age+", gender: "+gender;
    }
}
