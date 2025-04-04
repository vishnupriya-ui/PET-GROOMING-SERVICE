public class CustomerService {
    public boolean addCustomer(String name, String phone) {
        if (name == null || name.isEmpty()) {
            return false; // Invalid input
        }
        System.out.println("Customer " + name + " added successfully.");
        return true;
    }
}


public class CustomerService {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("PetGroomingPU");

    public void addCustomer(Customer customer) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(customer);
        em.getTransaction().commit();
        em.close();
    }

    public Customer getCustomerById(int id) {
        EntityManager em = emf.createEntityManager();
        Customer customer = em.find(Customer.class, id);
        em.close();
        return customer;
    }

    public void updateCustomer(Customer updatedCustomer) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(updatedCustomer);
        em.getTransaction().commit();
        em.close();
    }

    public void deleteCustomer(int id) {
        EntityManager em = emf.createEntityManager();
        Customer customer = em.find(Customer.class, id);
        if (customer != null) {
            em.getTransaction().begin();
            em.remove(customer);
            em.getTransaction().commit();
        }
        em.close();
    }
}
