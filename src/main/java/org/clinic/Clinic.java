package org.clinic;

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


}