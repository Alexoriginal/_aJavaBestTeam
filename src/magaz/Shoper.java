package magaz;

/**
 * Created by java on 19.01.2018.
 */
public class Shoper {
    private String name;
    private  int shoperMoneyLimit;

    public Shoper() {
    }

    public Shoper(String name, int shopMoneyLimit) {
        this.name = name;
        this.shoperMoneyLimit = shopMoneyLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShoperMoneyLimit() {
        return shoperMoneyLimit;
    }

    public void setShoperMoneyLimit(int shoperMoneyLimit) {
        this.shoperMoneyLimit = shoperMoneyLimit;
    }
}
