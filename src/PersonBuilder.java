public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public Person build() {
        if (name == null) throw new IllegalStateException("Не задано имя");
        if (surname == null) throw new IllegalStateException("Не задана фамилия");
        if (age != 0) return new Person(name, surname, age);
        return new Person(name, surname);
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 100) throw new IllegalArgumentException("Неверно задан возраст");
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }
}
