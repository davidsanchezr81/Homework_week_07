public abstract class Instruments implements ISell{

    String made;
    String colour;
    String type;
    double sellingprice;
    double buyingprice;

    public Instruments(String made, String colour, String type, double sellingprice, double buyingprice) {
    this.made = made;
    this.colour = colour;
    this.type = type;
    this.sellingprice = sellingprice;
    this.buyingprice = buyingprice;

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

    public double calculateMarkup(){
        double markup = (sellingprice - buyingprice)/buyingprice;
        return markup;
    }
}
