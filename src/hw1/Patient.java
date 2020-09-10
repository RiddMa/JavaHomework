package hw1;

public class Patient {
    String name;
    char sex;
    int age;
    float weight;
    boolean allergies;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setAllergies(boolean allergies) {
        this.allergies = allergies;
    }

    public boolean getAllergies() {
        return allergies;
    }

    @Override
    public String toString() {
        return "hw1.Patient{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", allergies=" + allergies +
                '}';
    }
}

class PatientTest {
    public static void main(String[] args) {
        Patient april = new Patient();
        april.setName("zhangli");
        april.setSex('f');
        april.setAge(330);
        april.setWeight((float) 154.72);
        april.setAllergies(true);
        System.out.println("name:       " + april.getName());
        System.out.println("sex:        " + april.getSex());
        System.out.println("age:        " + april.getAge());
        System.out.println("weight:     " + april.getWeight());
        System.out.println("allergies:  " + april.getAllergies());
        System.out.println(april.toString());
    }
}