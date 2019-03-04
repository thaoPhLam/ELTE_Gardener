package com.codecool.thao.garden.plants;

import com.codecool.thao.garden.Substance;

public abstract class Plant {
    protected int size;
    protected int growthLimit;
    protected boolean alive = true;
    protected String name;

    public Plant(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return alive;
    }

    public void checkLife() {
        if (this.size == 0 || this.size >= growthLimit) {
            die();
        }
    }

    public void die() {
        this.alive = false;
        System.out.println(name + " died!");
    }

    public void reactToSubstance(Substance substance) {
        if (substance.equals(Substance.WATER)) {
            reactToWater();
        } else if (substance.equals(Substance.BROTH)) {
            reactToBroth();
        } else if (substance.equals(Substance.FERTILIZER)) {
            reactToFertilizer();
        } else {
            reactToNone();
        }
    }

    public abstract void reactToWater();
    public abstract void reactToBroth();
    public abstract void reactToFertilizer();

    public void reactToNone() {
        this.size -= 1;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", alive=" + alive +
                '}';
    }
}
