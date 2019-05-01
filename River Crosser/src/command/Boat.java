package command;
//singleton Class cuz we don't need to create 2 instance
public class Boat {
    private static Boat boat;
    private Boat(){

    }
    public static Boat getInstance()
    {
        if(boat==null)
        {
            boat=new Boat();
            return boat;
        }
        return boat;
    }
    // Other implementations
}
