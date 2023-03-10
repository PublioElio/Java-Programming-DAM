package addact_05;

/**
 * For each item you must know the code, description, price of purchase, sale
 * price and stock (number of units).
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Item {

    private String code;
    private String description;
    private double purchasePrice;
    private double sellPrice;
    private int stock;

    public Item(String code, String description, double purchasePrice,
            double sellPrice, int stock) {
        this.code = code;
        this.description = description;
        this.purchasePrice = purchasePrice < 0 ? 0 : purchasePrice;
        this.sellPrice = sellPrice <= purchasePrice
                ? purchasePrice + (purchasePrice * 0.1) : sellPrice;
        this.stock = stock < 0 ? 0 : stock;
    }

    public Item(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return ("---------------------------- ITEM ----------------------------"
                + "\nItem code: " + this.code
                + "\nDescription: " + this.description
                + "\nPurchase price: " + this.purchasePrice
                + "\nSale price: " + this.sellPrice
                + "\nStock: " + this.stock + "\n");
    }

    @Override
    public Item clone() {
        Item cloned = new Item(this.code, this.description,
                this.purchasePrice, this.sellPrice,
                this.stock);
        return (cloned);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice < 0 ? 0 : purchasePrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice <= purchasePrice
                ? purchasePrice + (purchasePrice * 0.1) : sellPrice;
    }

    public int getStock() {
        return stock;
    }

    public void increaseStock(int num) {
        this.stock += num;
    }

    public void decreaseStock(int num) {
        this.stock = num >= this.stock ? 0 : this.stock - num;
    }

}
