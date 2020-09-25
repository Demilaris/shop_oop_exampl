
public class Person {

    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public Person(String name, int age, char gender) {
        if (name.isEmpty()) {
            System.out.println("Please enter the name!");

        }
        else {
            this.name = name;
            if (age < 0 || age >180)
            {
                System.out.println("Wrong age!");
            }
            else {
                this.age = age;
                this.gender = gender;
            }

        }




    }
}
