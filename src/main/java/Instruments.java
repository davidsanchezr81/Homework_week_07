public abstract class Instruments implements ISell{

    String made;
    String colour;
    String type;
    double sellingprice;
    double buyingprice;
    private InstType instType;

    public Instruments(String made, String colour, String type, double sellingprice, double buyingprice, InstType instType) {
    this.made = made;
    this.colour = colour;
    this.type = type;
    this.sellingprice = sellingprice;
    this.buyingprice = buyingprice;
    this.instType = instType;

    }

    public String getType(){
        return this.type;
    }

    public String getColour(){
        return this.colour;
    }

    public String getMade(){
        return this.made;
    }

    public double getSellingprice(){
        return this.sellingprice;
    }

    public double getBuyingprice(){
        return this.buyingprice;
    }

    public String getInstType(){
        return this.instType.getType();
    }

    public double calculateMarkup(){
        double markup = (sellingprice - buyingprice);
        return markup;
    }
}
