public enum cardSuite {

    Spades ("S"),
    Hearts ("H"),
    Diamonds ("D"),
    Clubs ("C");



    private final String shorthand;
    cardSuite(String shorthand) {
        this.shorthand = shorthand;
    }

    public String getShorthand() {
        return shorthand;
    }


}
