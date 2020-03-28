package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kisa on 8/21/2016.
 */
public class Koshka {
    final Logger logger = LoggerFactory.getLogger(Koshka.class);

    private Kisa kisa;
    private String color;

    public Koshka() {
        logger.info("Created Koshka");
    }

    public void setKisa(Kisa kisa) {
        this.kisa = kisa;
        logger.info("Added reference to kisa");
    }

    public Kisa getKisa() {
        return kisa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
