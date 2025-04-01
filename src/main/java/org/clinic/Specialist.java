package org.clinic;
class Specialist {

    private int id;
    private String name;
    private String specialization;
    private String experience;
    private boolean isAvailable;

    public Specialist(int id, String name, String specialization, String experience, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
        this.isAvailable = isAvailable;
    }

    public String getName() {
        return name;
    }

}