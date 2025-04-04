public class Appointment {
    private int id;
    private Customer customer;
    private Pet pet;
    private String serviceType;
    private String appointmentDate;
    
    // Constructor
    public Appointment(int id, Customer customer, Pet pet, String serviceType, String appointmentDate) {
        this.id = id;
        this.customer = customer;
        this.pet = pet;
        this.serviceType = serviceType;
        this.appointmentDate = appointmentDate;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public Customer getCustomer() { return customer; }
    public Pet getPet() { return pet; }
    public String getServiceType() { return serviceType; }
    public String getAppointmentDate() { return appointmentDate; }
}