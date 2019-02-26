public enum cardValue {

    Ace("A", 14),
    Two("2", 2),
    Three("3", 3),
    Four("4", 4),
    Five("5", 5),
    Six("6", 6),
    Seven("7", 7),
    Eight("8", 8),
    Nine("9", 9),
    Ten("10", 10),
    Jack("J", 11),
    Queen("Q", 12),
    King("K", 13);


    private final String shorthand;
    private final int value;

    cardValue(String shorthand, int value) {
        this.shorthand = shorthand;
        this.value = value;
    }

    public int getCardValue() {
        return this.value;
    }

    public String getShorthand() {
        return this.shorthand;
    }

}
