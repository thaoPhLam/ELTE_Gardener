package com.codecool.thao.garden.plants;

public class Cactus extends Plant {
    public Cactus(int size, String name) {
        super(size, name);
        this.growthLimit = 4;
    }

    @Override
    public void reactToWater() {
        this.size -= 1;
    }

    @Override
    public void reactToBroth() {
        this.size += 1;
    }

    @Override
    public void reactToFertilizer() {
        this.size += 1;
    }
}
