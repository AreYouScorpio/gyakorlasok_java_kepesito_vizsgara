package settlers;

public class Settler {

    static final int PRICE_PER_TON = 500;

    private long id;
    private String nameOfSettler;
    private long amountOfTobacco;
    private long expectedIncome;

    public Settler(String nameOfSettler, long amountOfTobacco) {
        this.nameOfSettler = nameOfSettler;
        this.amountOfTobacco = amountOfTobacco;
        this.expectedIncome = this.amountOfTobacco * PRICE_PER_TON;
    }

    public Settler(long id, String nameOfSettler, long amountOfTobacco, long expectedIncome) {
        this.id = id;
        this.nameOfSettler = nameOfSettler;
        this.amountOfTobacco = amountOfTobacco;
        this.expectedIncome = expectedIncome;
    }

    public long getId() {
        return id;
    }

    public String getNameOfSettler() {
        return nameOfSettler;
    }

    public long getAmountOfTobacco() {
        return amountOfTobacco;
    }

    public long getExpectedIncome() {
        return expectedIncome;
    }
}
