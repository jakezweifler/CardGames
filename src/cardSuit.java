public enum cardSuit {

    Spades ("S"),
    Hearts ("H"),
    Diamonds ("D"),
    Clubs ("C");



    private final String shorthand;
    cardSuit(String shorthand) {
        this.shorthand = shorthand;
    }

    public String getShorthand() {
        return shorthand;
    }


}
