package org.clinic;
import java.util.Date;

class Appointment{
    private Clinic clinic;
    private Specialist specialist;
    private Patient patient;
    private Date date;
    private String reason;
    private String description;

    public Appointment(Clinic clinic, Specialist specialist, Patient patient, Date date, String reason, String description) {
        this.clinic = clinic;
        this.specialist = specialist;
        this.patient = patient;
        this.date = date;
        this.reason = reason;
        this.description = description;
    }


    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    public void setSpecialist(Specialist specialist) {
        this.specialist = specialist;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "clinic=" + clinic.getName() +
                ", specialist=" + specialist.getName() +
                ", patient=" + patient.getName() +
                ", date=" + date +
                ", reason='" + reason + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}