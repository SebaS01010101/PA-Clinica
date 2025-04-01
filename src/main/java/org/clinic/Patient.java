package org.clinic;
class Patient{
    private int id;
    private String name;
    private String numberPhone;

    public Patient(int id, String name, String numberPhone) {
        this.id = id;
        this.name = name;
        this.numberPhone = numberPhone;
    }

    public String getName() {
        return name;
    }

}