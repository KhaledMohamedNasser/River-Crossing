package command;

public class CharacterOff implements Command {
    Character charcter =new Charcter();

    @Override
    public void excute() {
        charcter.charcterOffBoat();
    }

    @Override
    public void unexcute() {
        charcter.charcterOnBoat();
    }
}
