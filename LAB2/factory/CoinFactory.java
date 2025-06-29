package Lab2.factory;

public class CoinFactory {
    public static Coin getCoin(CoinType type) {
        switch (type) {
            case COPPER:
                return new CopperCoin();
            case GOLD:
                return new GoldCoin();
            default:
                throw new IllegalArgumentException("Unknown coin type");
        }
    }
}
