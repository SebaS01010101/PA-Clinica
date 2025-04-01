package org.clinic;

import java.util.Date;
import java.util.List;

class Clinic{
    private String name;
    private String adress;
    private List<Appointment> appointments;
    public Clinic(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    //method delete appointment
    public void deleteAppointment(Appointment appointment) {
        appointments.remove(appointment);
    }

    //method add appointment
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    //method modify appointment
    public void modifyAppointment(Appointment appointment, String reason, String description) {
        appointment.setDate(new Date());
        appointment.setReason(reason);
        appointment.setDescription(description);
    }

}