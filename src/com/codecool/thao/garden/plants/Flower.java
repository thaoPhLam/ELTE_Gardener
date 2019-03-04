package com.codecool.thao.garden.plants;

public class Flower extends Plant {
    public Flower(int size, String name) {
        super(size, name);
        this.growthLimit = 6;
    }

    @Override
    public void reactToWater() {
        this.size += 3;
    }

    @Override
    public void reactToBroth() {
        this.size -= 1;
    }

    @Override
    public void reactToFertilizer() {
        this.size -= 1;
    }
}
