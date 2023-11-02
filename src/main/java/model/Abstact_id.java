package model;

public abstract class Abstact_id {
    long id;

    public Abstact_id(long id) {
        this.id = id;
    }
    public Abstact_id() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
