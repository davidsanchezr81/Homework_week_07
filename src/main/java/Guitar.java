public class Guitar extends Instruments implements IPlay, ISell {

    int strings;


    public Guitar(String made, String colour, String type, int strings, double sellingprice, double buyingprice){
        super(made, colour,type, sellingprice,buyingprice);

        this.strings = strings;

    };

    public String sound() {
        return "Chiung, chiung";
    }

    public int getStrings(){return this.strings;}

//    public double getSellingprice(){return this.sellingprice;}
//
//    public double getBuyingprice(){return this.buyingprice;}



}
