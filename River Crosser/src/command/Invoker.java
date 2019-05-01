package command;

import rivercrosserInterfaces.ICrosser;

import java.awt.image.BufferedImage;

public class Invoker implements ICrosser {
    Command command;
    Charcter farmer=new Farmer();
    Charcter animal=new Animal();

    public void setCommand(Command command){
        this.command=command
    }

    @Override
    public boolean canSail() {
        return false;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public int getEatingRank() {
        return 0;
    }

    @Override
    public BufferedImage[] getImages() {
        return new BufferedImage[0];
    }

    @Override
    public ICrosser makeCopy() {
        return null;
    }

    @Override
    public void setLabelToBeShown(String label) {

    }

    @Override
    public String getLabelToBeShown() {
        return null;
    }
}
