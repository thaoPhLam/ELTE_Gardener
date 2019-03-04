package com.codecool.thao.garden;

import com.codecool.thao.garden.plants.Plant;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    private List<Plant> plants = new ArrayList<>();

    public void seatPlant(Plant plant) {
        plants.add(plant);
    }

    public void sprinkle(Substance substance) {
        for (Plant plant : plants) {
            if (plant.isAlive()) {
                plant.reactToSubstance(substance);
                plant.checkLife();
                System.out.println(plant);
            }
        }
        System.out.println();
    }

    public void sprinkle() {
        sprinkle(Substance.WATER);
        sprinkle(Substance.BROTH);
        sprinkle(Substance.NONE);
        sprinkle(Substance.WATER);
        sprinkle(Substance.FERTILIZER);
        sprinkle(Substance.WATER);
    }

    public void getSurvivors() {
        String survivor = "";
        for (Plant plant : plants) {
            if (plant.isAlive()) {
                survivor += plant.getName();
            }
        }
        System.out.println("Survivers: " + survivor);
    }
}
