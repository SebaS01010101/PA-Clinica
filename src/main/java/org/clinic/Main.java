package org.clinic;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws Exception {
        // Formato para fechas
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        // Crear entidades base
        Clinic clinic = new Clinic("Clínica Moderna", "Av. Tecnológica 789");
        Specialist doctor = new Specialist(1, "Dra. Ana Torres",
                "Dermatología", "8 años", true);
        Patient patient = new Patient(1001, "Jorge Martínez", "555-1122");

        // Crear citas usando Date (con hora incluida)
        Date date1 = sdf.parse("15/07/2024 09:30");
        Date date2 = sdf.parse("17/07/2024 16:00");

        Appointment cita1 = new Appointment(
                clinic,
                doctor,
                patient,
                date1,
                "Revisión de lunares",
                "Control anual de manchas cutáneas"
        );

        Appointment cita2 = new Appointment(
                clinic,
                doctor,
                patient,
                date2,
                "Seguimiento tratamiento",
                "Evaluación respuesta a medicación"
        );

        // Mostrar citas
        System.out.println("=== Sistema de Citas Médicas ===");
        System.out.println(cita1);
        System.out.println(cita2);
    }


}