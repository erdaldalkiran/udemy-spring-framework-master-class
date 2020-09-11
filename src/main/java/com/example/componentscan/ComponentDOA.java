package com.example.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDOA {
    public ComponentConnection getComponentConnection() {
        return componentConnection;
    }

    public void setComponentConnection(ComponentConnection componentConnection) {
        this.componentConnection = componentConnection;
    }

    @Autowired
    ComponentConnection componentConnection;
}
