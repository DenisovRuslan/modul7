public interface Fighter {
    public int damage = 0;

    abstract void attack();

    void attack(Entity victim);
}