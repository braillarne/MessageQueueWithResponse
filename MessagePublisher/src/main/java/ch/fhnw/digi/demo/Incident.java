package ch.fhnw.digi.demo;

public class Incident {

    private int id;
    private String description;
    private int price;
    private boolean validation1;
    private boolean validation2;
    private Level level;

    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isValidation1() {
        return validation1;
    }

    public void setValidation1(boolean validation1) {
        this.validation1 = validation1;
    }

    public boolean isValidation2() {
        return validation2;
    }

    public void setValidation2(boolean validation2) {
        this.validation2 = validation2;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
