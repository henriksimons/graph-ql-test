package my;

public class Cup {

    private String size;
    private String liquid;

    public Cup(String size, String liquid) {
        this.size = size;
        this.liquid = liquid;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLiquid() {
        return liquid;
    }

    public void setLiquid(String liquid) {
        this.liquid = liquid;
    }
}
