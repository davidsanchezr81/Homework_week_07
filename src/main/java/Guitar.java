public class Guitar extends Instruments implements IPlay, ISell {

    int strings;


    public Guitar(String made, String colour, String type, int strings, int sellingprice, int buyingprice){
        super(made, colour,type, sellingprice,buyingprice);

        this.strings = strings;

    };

    public String sound() {
        return "Chiung, chiung";
    }

    public int getStrings(){return this.strings;}

    public int getSellingprice(){return this.sellingprice;}

    public int getBuyingprice(){return this.buyingprice;}
}
