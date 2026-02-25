package org.example;

import org.example.model.*;
import org.example.model.enums.*;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(250, PaintColor.WHITE);
        Bed bed = new Bed("Modern", 4, 60, 2, 1);
        Lamp lamp = new Lamp(LampType.NEON, true, 8);
        Wardrobe wardrobe = new Wardrobe(200, 220, 85.5);
        Carpet carpet = new Carpet(300, 400, PaintColor.RED);

        Bedroom bedroom = new Bedroom(
                "Master Bedroom",
                wall1, wall2, wall3, wall4,
                ceiling, bed, lamp, wardrobe, carpet
        );

        bedroom.getLamp().turnOn();
        bedroom.getBed().make();
        bedroom.getCarpet().lying();
        bedroom.getWardrobe().add();
        bedroom.getCeiling().create();
        bedroom.getWall1().create();
    }
}