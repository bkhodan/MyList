package car;

import java.util.ArrayList;

public class CarsInfo extends ArrayList<Cars> {

    public CarsInfo() {
        super();
        this.add(new Cars("Kia Sportage", "Crossover", 184, 2006));
        this.add(new Cars("Kia Seltos", "Crossover", 149, 2019));
        this.add(new Cars("Skoda Rapid", "Sedan", 125, 2012));
        this.add(new Cars("Mazda CX-5", "Crossover", 230, 2015));
        this.add(new Cars("Renault Kaptur", "Mini crossover", 149, 2016));
        this.add(new Cars("Kia Soul", "Sedan", 200, 2021));
        this.add(new Cars("Toyota RAV4", "Compact crossover", 306, 2016));
        this.add(new Cars("Mitsubishi Outlander", "Midsize crossover", 230 , 2001));
        this.add(new Cars("Toyota Land Cruiser Prado", "Midsize SUV", 249, 2012));
        this.add(new Cars("Skoda Kodiaq", "Midsize SUV", 150, 2016));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Cars inst : this) {
            sb.append(inst.toString()).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
