public abstract class Instruments implements ISell{

    String made;
    String colour;
    String type;
    int sellingprice;
    int buyingprice;

    public Instruments(String made, String colour, String type, int sellingprice, int buyingprice) {
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

    public int calculateMarkup(){
        int markup = (sellingprice - buyingprice);
        return markup;
    }




}
