package staticfactory;

public abstract class Operation {
    int former;
    int latter;

    public abstract int operate();

    public int getResult(int former, int latter) {
        this.former = former;
        this.latter = latter;
        return operate();
    }
}
