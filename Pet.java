package pet;

public class Pet
{

	private String name;
    private String breed;
    private int age;
    private Customer owner;

    public Pet(String name, String breed, int age, Customer owner)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.owner = owner;
    }

    public String getName() { return name; }
    public String getBreed() { return breed; }
    public int getAge() { return age; }
    public Customer getOwner() { return owner; }
}

// Customer Class
class Customer {
    private String name;
    private String phone;

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() { return name; }
    public String getPhone() { return phone; }
}



