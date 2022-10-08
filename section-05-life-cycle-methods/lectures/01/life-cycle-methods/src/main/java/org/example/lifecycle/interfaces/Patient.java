package org.example.lifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {
    private int id;

    public int getId() {
        return id;
    }

    public Patient setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("All the world is a stage, and all the men and women merely players. They have their exits and their entrances.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("And one man in its time plays many parts.");
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }
}
