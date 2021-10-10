package my;

public class Cup {

    private String size;
    private String liquid;

    public Cup(Builder builder) {
        this.size = builder.size;
        this.liquid = builder.liquid;
    }

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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String size;
        private String liquid;

        public Builder withSize(String size) {
            this.size = size;
            return this;
        }

        public Builder withLiquid(String liquid) {
            this.liquid = liquid;
            return this;
        }

        public Cup build() {
            return new Cup(this);
        }
    }
}
