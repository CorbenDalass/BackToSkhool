public class Main {
    public static void main(String[] args) {
        Person[] plebei={new Person("Coach Bob", 27, "M"),
                new Student("Lynne Brooke",16,"F","HS95129",3.5),
                new Teacher("Duke Java",34,"M","Computer Science"),
                new CollegeStudent("Imma Frosh",18,"F","UCB123",4.0,1,"English")};
        for (Person infa:plebei){
            System.out.println(infa.toString());
        }
    }
}
