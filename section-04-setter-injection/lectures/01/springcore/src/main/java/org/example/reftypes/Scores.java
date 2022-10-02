package org.example.reftypes;

public class Scores {
    private Double math;
    private Double physics;
    private Double chemistry;

    public Double getMath() {
        return math;
    }

    public Scores setMath(Double math) {
        this.math = math;
        return this;
    }

    public Double getPhysics() {
        return physics;
    }

    public Scores setPhysics(Double physics) {
        this.physics = physics;
        return this;
    }

    public Double getChemistry() {
        return chemistry;
    }

    public Scores setChemistry(Double chemistry) {
        this.chemistry = chemistry;
        return this;
    }

    @Override
    public String toString() {
        return "Scores{" +
                "math=" + math +
                ", physics=" + physics +
                ", chemistry=" + chemistry +
                '}';
    }
}
