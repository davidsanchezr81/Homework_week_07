public abstract class InstrumentsParts {

        String made;
        String type;
        int sellingprice;
        int buyingprice;

    public InstrumentsParts(String made, String type, int sellingprice, int buyingprice) {
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

    public int calculateMarkup(){
        int markup = (sellingprice - buyingprice);
        return markup;
    }

}
