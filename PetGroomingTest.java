public class PetGroomingTest {
    public static void main(String[] args) {
        // Create a Customer
        Customer customer = new Customer("John Doe", "123-456-7890");

        // Create a Pet
        Pet pet = new Pet("Buddy", "Golden Retriever", 3, customer);

        // Create a Grooming Service
        GroomingService service = new GroomingService("Full Grooming Package", 49.99);

        // Schedule an Appointment
        Appointment appointment = new Appointment(pet, service, "2025-04-05");

        // Process Payment
        Payment payment = new Payment(appointment, service.getPrice(), "Credit Card");

        // Display Output
        System.out.println("=== Pet Grooming Appointment ===");
        System.out.println("Customer: " + customer.getName() + " | Phone: " + customer.getPhone());
        System.out.println("Pet: " + pet.getName() + " | Breed: " + pet.getBreed() + " | Age: " + pet.getAge());
        System.out.println("Service: " + service.getServiceName() + " | Price: $" + service.getPrice());
        System.out.println("Appointment Date: " + appointment.getDate());
        System.out.println("Payment Method: " + payment.getPaymentMethod() + " | Amount Paid: $" + payment.getAmount());
    }
}