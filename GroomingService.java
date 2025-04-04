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
    private String date;

    public Appointment(Pet pet, GroomingService service, String date) {
        this.pet = pet;
        this.service = service;
        this.date = date;
    }

    public Pet getPet() { return pet; }
    public GroomingService getService() { return service; }
    public String getDate() { return date; }
}

// Payment Class
class Payment {
    private Appointment appointment;
    private double amount;
    private String paymentMethod;

public Payment(Appointment appointment, double amount, String paymentMethod) {
        this.appointment = appointment;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() { return amount; }
    public String getPaymentMethod() { return paymentMethod;}
}

