public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct() {
        builder.makeFoundation("土台");
        builder.makePillar("柱");
        builder.makeCover("覆い");
    }
}
