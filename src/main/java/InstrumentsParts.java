public abstract class InstrumentsParts {

        String made;
        String type;
        double sellingprice;
        double buyingprice;

    public InstrumentsParts(String made, String type, double sellingprice, double buyingprice) {
        this.made = made;
        this.type = type;
        this.sellingprice = sellingprice;
        this.buyingprice = buyingprice;

    }

    public String getType(){
        return this.type;
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
        double markup = (sellingprice - buyingprice);
        return markup;
    }

}
