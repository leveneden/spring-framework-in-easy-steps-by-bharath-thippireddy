package org.example.dependencycheck;

import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class Prescription {
    private int id;
    private String patientName;
    private List<String> medicines;

    public int getId() {
        return id;
    }

    @Required
    public Prescription setId(int id) {
        this.id = id;
        return this;
    }

    public String getPatientName() {
        return patientName;
    }

    @Required
    public Prescription setPatientName(String patientName) {
        this.patientName = patientName;
        return this;
    }

    public List<String> getMedicines() {
        return medicines;
    }

    @Required
    public Prescription setMedicines(List<String> medicines) {
        this.medicines = medicines;
        return this;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "id=" + id +
                ", patientName='" + patientName + '\'' +
                ", medicines=" + medicines +
                '}';
    }
}
