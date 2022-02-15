package com.example.EjercicioBS2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

    @Autowired
    @Qualifier("bean1")
    PersonaService p1;

    @Autowired
    @Qualifier("bean2")
    PersonaService p2;

    @Autowired
    @Qualifier("bean3")
    PersonaService p3;

    @GetMapping("/controlador/bean/{bean}")
    public String getBeans(@PathVariable String bean) {

        switch (bean) {
            case "bean1":
                return p1.toString();
            case "bean2":
                return p2.toString();
            case "bean3":
                return p3.toString();
        }
        return "";
    }
}
