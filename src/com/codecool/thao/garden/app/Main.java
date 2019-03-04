package com.codecool.thao.garden.app;

import com.codecool.thao.garden.Garden;
import com.codecool.thao.garden.plants.Bush;
import com.codecool.thao.garden.plants.Cactus;
import com.codecool.thao.garden.plants.Flower;

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();

        garden.seatPlant(new Bush(4, "B223"));
        garden.seatPlant(new Flower(3, "V102"));
        garden.seatPlant(new Cactus(2, "K15"));
        garden.seatPlant(new Cactus(1, "K18"));

        garden.sprinkle();
        /*
        garden.sprinkle(Substance.WATER);
        garden.sprinkle(Substance.BROTH);
        garden.sprinkle(Substance.NONE);
        garden.sprinkle(Substance.WATER);
        garden.sprinkle(Substance.FERTILIZER);
        garden.sprinkle(Substance.WATER);
*/
        garden.getSurvivors();
    }
}
