package money;

class Franc extends Money {
    Franc(int amount) {
        this.amount = amount;
    }

    @Override
    String currency() {
        return "CHF";
    }

    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
