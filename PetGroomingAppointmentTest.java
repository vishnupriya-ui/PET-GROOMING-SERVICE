// Appointment Management System for Pet Grooming

import java.util.ArrayList;
import java.util.List;

// Pet Class
class Pet {
    private String name;
    private String breed;
    private int age;
    private Customer owner;

    public Pet(String name, String breed, int age, Customer owner) {
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

// Groomer Class
class Groomer {
    private String name;
    private String specialty;

    public Groomer(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public String getName() { return name; }
    public String getSpecialty() { return specialty; }
}

// Grooming Service Class
class GroomingService {
    private String serviceName;
    private double price;

    public GroomingService(String serviceName, double price) {
        this.serviceName = serviceName;
        this.price = price;
    }

    public String getServiceName() { return serviceName; }
    public double getPrice() { return price; }
}

// Appointment Class
class Appointment {
    private Pet pet;
    private GroomingService service;
    private Groomer groomer;
    private String date;

    public Appointment(Pet pet, GroomingService service, Groomer groomer, String date) {
        this.pet = pet;
        this.service = service;
        this.groomer = groomer;
        this.date = date;
    }

    public Pet getPet() { return pet; }
    public GroomingService getService() { return service; }
    public Groomer getGroomer() { return groomer; }
    public String getDate() { return date; }
}

// Appointment Manager Class
class AppointmentManager {
    private List<Appointment> appointments;

    public AppointmentManager() {
        this.appointments = new ArrayList<>();
    }

    public void bookAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Appointment booked for " + appointment.getPet().getName() + " on " + appointment.getDate());
    }

    public void cancelAppointment(Appointment appointment) {
        appointments.remove(appointment);
        System.out.println("Appointment canceled for " + appointment.getPet().getName());
    }

    public void listAppointments() {
        for (Appointment appointment : appointments) {
            System.out.println("Pet: " + appointment.getPet().getName() + ", Service: " + appointment.getService().getServiceName() + ", Groomer: " + appointment.getGroomer().getName() + ", Date: " + appointment.getDate());
        }
    }
}

// Main class to test the Appointment Management System
public class PetGroomingAppointmentTest {
    public static void main(String[] args) {
        // Create customers and pets
        Customer customer1 = new Customer("Alice", "555-1234");
        Pet pet1 = new Pet("Buddy", "Golden Retriever", 3, customer1);

        // Create groomers
        Groomer groomer1 = new Groomer("Emma", "Dog Grooming");

        // Create grooming services
        GroomingService service1 = new GroomingService("Full Groom", 50.00);

        // Create appointment manager
        AppointmentManager manager = new AppointmentManager();

        // Book appointments
        Appointment appointment1 = new Appointment(pet1, service1, groomer1, "2025-04-05");
        manager.bookAppointment(appointment1);

        // List appointments
        manager.listAppointments();

        // Cancel appointment
        manager.cancelAppointment(appointment1);
    }
}