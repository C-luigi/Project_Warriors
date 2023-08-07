public abstract class Character {
    protected String name = "billy";
    protected int healthPoints = 5;
    protected int strongPoints = 8;

    public Character() {
    }

    public Character(String name) {
        this.name = name;
    }

    public Character(String name, int healthPoints, int strongPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.strongPoints = strongPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getStrongPoints() {
        return strongPoints;
    }

    public void setStrongPoints(int strongPoints) {
        this.strongPoints = strongPoints;
    }

    public String toString() {
        return "Character:" + '\n' +
                "Name : " + name + '\n' +
                "HealthPoints = " + healthPoints +  '\n' +
                "StrongPoints = " + strongPoints;
    }
}