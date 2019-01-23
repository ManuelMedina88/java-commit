package chapter6;

// Assigning object reference variables to anothere reference.
class PersonalInfo{
    private String name = "Jesús";
    private int age  = 33;
    private String city = "Nazareth";

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
      return name;
    }

    public void setAge(int age){
      this.age = age;
    }

    public int getAge(){
      return age;
    }

    public void setCity(String city){
      this.city = city;
    }

    public String getCity(){
      return city;
    }
}

public class AssigningObjectReference{
  public static void main(String[] args){
    PersonalInfo person1 = new PersonalInfo();

    PersonalInfo person2 = person1;

    person2.setName("Manuel");
    person2.setAge(30);
    person2.setCity("Santo Domingo");

    System.out.printf("Name: %s\nAge: %d\nCity: %s\n\n",
      person1.getName(), person1.getAge(), person1.getCity());
  }
}
