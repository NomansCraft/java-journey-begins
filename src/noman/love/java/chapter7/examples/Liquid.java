package noman.love.java.chapter7.examples;

import java.util.ArrayList;

public class Liquid {
    public void swirl(boolean clockwise) {
        System.out.println("Swirl liquid.");
    }


    public static void main(String[] args) {
        Liquid genericLiquid = new Liquid();
        Liquid milk = new Milk();
        Liquid coffee = new Coffee();

        Cup cup = new Cup();
        cup.addLiquid(genericLiquid);
        cup.addLiquid(milk);
        cup.addLiquid(coffee);
        cup.mix();
    }
}

class Coffee extends Liquid {
    @Override
    public void swirl(boolean clockwise) {
        System.out.println("Swirl coffee.");
    }
}

class Milk extends Liquid {
    @Override
    public void swirl(boolean clockwise) {
        System.out.println("Swirl milk.");
    }
}

class Cup {
    public ArrayList<Liquid> liquids = new ArrayList<>();

    public void addLiquid(Liquid liquid) {
        liquids.add(liquid);
    }

    public void mix() {
        for (Liquid liquid : liquids) {{
            liquid.swirl(true);
        }}
    }
}

