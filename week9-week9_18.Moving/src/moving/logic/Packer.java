/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author Anku
 */
public class Packer {

    private int boxesVolume;
    private List<Box> listOfBoxes;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
        this.listOfBoxes = new ArrayList<Box>();
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<Box>();
        for (Thing thing : things) {
            Box box = new Box(boxesVolume);
            box.addThing(thing);
            boxes.add(box);
        }

        return boxes;

    }

}
