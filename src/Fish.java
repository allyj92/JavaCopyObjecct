public class Fish implements Prey,Predator{
    public void flee(){
        System.out.println("*The fish is fleeing*");
    };

    @Override
    public void hunt() {
        System.out.println("*The fish is hunting*");
    }

}
