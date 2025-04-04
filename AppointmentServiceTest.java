package com.petgrooming.services;

import com.petgrooming.models.Appointment;
import java.util.ArrayList;
import java.util.List;

public class AppointmentService {
    private List<Appointment> appointments = new ArrayList<>();

    public boolean bookAppointment(Appointment appointment) {
        if (appointment == null || appointment.getDate().isEmpty()) {
            return false; // Invalid appointment
        }
        appointments.add(appointment);
        return true;
    }

    public int getTotalAppointments() {
        return appointments.size();
    }
}

package com.petgrooming.tests;

import com.petgrooming.models.Appointment;
import com.petgrooming.services.AppointmentService;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppointmentServiceTest {
    private AppointmentService service;

    @Before
    public void setup() {
        service = new AppointmentService();
    }

    @Test
    public void testBookValidAppointment() {
        Appointment appt = new Appointment("2025-04-05", "Grooming", null);
        boolean result = service.bookAppointment(appt);
        assertTrue(result);
    }

    @Test
    public void testBookInvalidAppointment() {
        Appointment appt = new Appointment("", "Grooming", null); // Missing date
        boolean result = service.bookAppointment(appt);
        assertFalse(result);
    }

    @Test
    public void testAppointmentCount() {
        service.bookAppointment(new Appointment("2025-04-05", "Grooming", null));
        service.bookAppointment(new Appointment("2025-04-06", "Haircut", null));
        assertEquals(2, service.getTotalAppointments());
    }
}
