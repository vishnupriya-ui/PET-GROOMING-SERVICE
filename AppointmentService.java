package com.petgrooming.services;

import com.petgrooming.models.Appointment;

public interface AppointmentService {
    void bookAppointment(Appointment appointment);
    void cancelAppointment(int appointmentId);
}
package com.petgrooming.services;

import com.petgrooming.models.Appointment;

public class AppointmentServiceImpl implements AppointmentService {
    @Override
    public void bookAppointment(Appointment appointment) {
        System.out.println("Booking appointment for " + appointment.getCustomer().getName());
    }

    @Override
    public void cancelAppointment(int appointmentId) {
        System.out.println("Canceling appointment ID: " + appointmentId);
    }
}
package com.petgrooming.dao;

import com.petgrooming.models.Appointment;
import java.util.ArrayList;
import java.util.List;

public class AppointmentDAO {
    private List<Appointment> appointments = new ArrayList<>();

    public void save(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Appointment saved!");
    }

    public List<Appointment> getAllAppointments() {
        return appointments;
    }
}
