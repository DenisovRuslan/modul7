public abstract class Monster extends Entity {

    private int hp;
    boolean destroyed;

    public Monster(String name, int hp) {
        super(name, hp);
        System.out.println("Monster " + name + " was created");
    }

    public Monster() {
        super();
    }

    protected int getForce() {
        return super.force;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    protected boolean damage(int dhp) {
        hp -= dhp;
        if (hp < 0) {
            destroyed = true;
            System.out.println("Monster " + super.getClass().getName() + " was destroyed");
            return true;
        }
        return false;
    }


    public abstract void attack(Monster monster);
}