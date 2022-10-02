package org.example.reftypes;

public class Student {
    private Scores scores;

    public Scores getScores() {
        return scores;
    }

    public Student setScores(Scores scores) {
        this.scores = scores;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "scores=" + scores +
                '}';
    }
}
