package Main.ForInterfaces;

public enum Conditions {
    COMMERCIAL("You need to make a deposit $5000"),
    INTERNATIONAL("You need to make an international deal"),
    INVESTMENT("You need to invest $1000");
    private String conditions;

    Conditions(String conditions) {
        this.conditions = conditions;
    }

    public String getConditions() {
        return conditions;
    }

    @Override
    public String toString() {
        return "Conditions{" +
                "conditions='" + conditions + '\'' +
                '}';
    }
}
