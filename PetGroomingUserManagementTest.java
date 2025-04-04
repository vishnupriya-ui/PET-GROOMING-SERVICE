// User Management System for Pet Grooming

// User Class
class User {
    protected String username;
    protected String password;
    protected String email;
    protected Role role;

    public User(String username, String password, String email, Role role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public String getUsername() { return username; }
    public boolean authenticate(String password) { return this.password.equals(password); }
    public Role getRole() { return role; }
}

// Role Class
class Role {
    private String roleName;

    public Role(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() { return roleName; }
}

// Customer Class (inherits from User)
class Customer extends User {
    private String phone;

    public Customer(String username, String password, String email, String phone) {
        super(username, password, email, new Role("Customer"));
        this.phone = phone;
    }

    public String getPhone() { return phone; }
}

// Admin Class (inherits from User)
class Admin extends User {
    public Admin(String username, String password, String email) {
        super(username, password, email, new Role("Admin"));
    }
    public void manageAppointments() {
        System.out.println("Admin managing pet grooming appointments...");
    }
}

// Groomer Class (inherits from User)
class Groomer extends User {
    private String specialty;

    public Groomer(String username, String password, String email, String specialty) {
        super(username, password, email, new Role("Groomer"));
        this.specialty = specialty;
    }

    public String getSpecialty() { return specialty; }
}

// Authentication Class
class Authentication {
    public boolean login(User user, String password) {
        return user.authenticate(password);
    }
}

// UserProfile Class
class UserProfile {
    private User user;
    private String address;

    public UserProfile(User user, String address) {
        this.user = user;
        this.address = address;
    }

    public User getUser() { return user; }
    public String getAddress() { return address; }
}

// Main class to test User Management System for Pet Grooming
public class PetGroomingUserManagementTest {
    public static void main(String[] args) {
        // Create roles
        Role customerRole = new Role("Customer");
        Role groomerRole = new Role("Groomer");
        Role adminRole = new Role("Admin");

        // Create Users
        Customer customer = new Customer("john_doe", "password123", "john@example.com", "555-1234");
        Groomer groomer = new Groomer("emma_groomer", "groomPass", "emma@example.com", "Dog Grooming");
        Admin admin = new Admin("admin_user", "adminPass", "admin@example.com");

        // Create User Profiles
        UserProfile profile1 = new UserProfile(customer, "123 Pet St");
        UserProfile profile2 = new UserProfile(groomer, "Grooming Salon");
        UserProfile profile3 = new UserProfile(admin, "Admin Office");

        // Authentication
        Authentication auth = new Authentication();
        System.out.println("Customer Login Successful: " + auth.login(customer, "password123"));
        System.out.println("Groomer Login Successful: " + auth.login(groomer, "wrongPass"));

        // Display User Details
        System.out.println("Customer: " + profile1.getUser().getUsername() + " | Address: " + profile1.getAddress());
        System.out.println("Groomer: " + profile2.getUser().getUsername() + " | Specialty: " + groomer.getSpecialty());
        System.out.println("Admin: " + profile3.getUser().getUsername() + " | Address: " + profile3.getAddress());
    }
}