package prototype_pattern.practice;

/**
 * Shape
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    public abstract void draw();

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clone;
    }
}