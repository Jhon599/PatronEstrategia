public class Mute implements ISound{
    @Override
    public void makeSound(){
        System.out.println("Sin sonido ...");
    }
    @Override
    public String toString(){
        return "MuteSound {}";
    }
}
