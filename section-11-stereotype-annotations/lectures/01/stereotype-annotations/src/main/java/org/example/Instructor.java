package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Instructor {

    @Value("14")
    private int id;
    @Value("Bharath Thippireddy")
    private String name;
    private Profile profile;
    @Value("#{topics}")
    private List<String> topics;

    public int getId() {
        return id;
    }

    public Instructor setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Instructor setName(String name) {
        this.name = name;
        return this;
    }

    public Profile getProfile() {
        return profile;
    }

    @Autowired
    public Instructor setProfile(@Qualifier("profile") Profile profile) {
        this.profile = profile;
        return this;
    }

    public List<String> getTopics() {
        return topics;
    }

    public Instructor setTopics(List<String> topics) {
        this.topics = topics;
        return this;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", profile=" + profile +
                ", topics=" + topics +
                '}';
    }
}
