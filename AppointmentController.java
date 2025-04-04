import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppointmentController {
    private AppointmentView view;
    private AppointmentModel model;

    public AppointmentController(AppointmentView view, AppointmentModel model) {
        this.view = view;
        this.model = model;

        this.view.getBookButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String serviceType = view.getServiceType();
                String date = view.getDate();

                // Assuming customer and pet are already selected
                Appointment newAppointment = new Appointment(1, new Customer("John Doe"), new Pet("Buddy"), serviceType, date);

                System.out.println("Appointment booked for " + newAppointment.getPet().getName() + " on " + date);
            }
        });
    }
}

public class Main {
    public static void main(String[] args) {
        AppointmentView view = new AppointmentView();
        AppointmentModel model = new AppointmentModel();
        new AppointmentController(view, model);
    }
}