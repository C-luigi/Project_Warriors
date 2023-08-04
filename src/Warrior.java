public class Warrior {
    protected String origin = "Warrior";
    protected String name;
    protected int healthPoints;
    protected int strongPoints;

    public Warrior(String name, int healthPoints, int strongPoints) {
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

    @Override
    public String toString() {
        return "Warrior:" + '\n' +
                "Name : " + name + '\n' +
                "HealthPoints = " + healthPoints +  '\n' +
                "StrongPoints = " + strongPoints+  '\n';
    }

}