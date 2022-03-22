public class Zombie extends Monster {

    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }

    public void growl() {
        System.out.println("Raaaauuughhhh");
    }

    @Override
    public void attack() {
        Monster zombie = new Monster() {
            @Override
            public void attack(Monster monster) {

            }

            @Override
            public void attack() {

            }
        };
        zombie.damage(getForce());
        growl();
    }


    @Override
    public void attack(Monster monster) {

    }

}