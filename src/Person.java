import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected  int age;
    protected String address;
    boolean checkAge = true;

    public Person (String name, String surname) {
        this.name = name;
        this.surname = surname;
        checkAge = false;
    }

    public Person (String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

//    public Person (String name, String surname, int age, String address) {
//        this.name = name;
//        this.surname = surname;
//        this.age = age;
//        this.address = address;
//    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.surname)
                .setAddress(this.address);
    }

    public void happyBirthday() {
        if ((checkAge)) {
            age++;
        } else {
            System.out.println("Возраст не задан");
        }
    }

    public boolean hasAge() {
        return checkAge;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public String setAddress(String address) {
        return this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + " ");
        sb.append(surname + " ");
        if ((checkAge)) sb.append(age + " ");
        if (address != null) sb.append(address);
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name) &&
                surname.equals(person.surname) &&
                Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address, checkAge);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}
