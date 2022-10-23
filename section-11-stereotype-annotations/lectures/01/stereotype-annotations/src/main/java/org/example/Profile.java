package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Profile {
    @Value("Java Architect")
    private String title;
    @Value("Vivekananda Consulting")
    private String company;

    public String getTitle() {
        return title;
    }

    public Profile setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public Profile setCompany(String company) {
        this.company = company;
        return this;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "title='" + title + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
