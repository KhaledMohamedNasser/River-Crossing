package command;
//Reciever
public class Character {
    private boolean charcterOn;

    /**
     * this method used to put characters on boat`
     */
    public void charcterOnBoat()
    {
        this.charcterOn=true;
    }

    /**
     * this method used to get Character out off boat
     */
    public void charcterOffBoat()
    {
        this.charcterOn=false;
    }
}
