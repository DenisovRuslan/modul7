abstract class Entity implements Fighter{
    protected int force;
    private String name;
    private int hp = 15;
    private boolean destroyed = false;

    public Entity(String name, int hp) {
        this.name = name;
        this.hp = hp;
        System.out.println("Monster " + name + " was created");
    }

    public Entity(String name) {
        this.name = name;
    }

    public Entity() {

    }

    public boolean isDestroyed() {
        return destroyed;
    }

    protected boolean damage(int dhp) {
        hp -= dhp;
        if (hp < 0) {
            destroyed = true;
            System.out.println(name + " was destroyed");
            return true;
        }
        return false;
    }

    public void attack(Entity entity) {

    }
}