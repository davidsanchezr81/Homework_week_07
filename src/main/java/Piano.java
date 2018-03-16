public class Piano extends Instruments implements IPlay,ISell {

    int pedal;


    public Piano(String made, String colour, String type, int pedal, double sellingprice, double buyingprice){
        super(made, colour,type, sellingprice,buyingprice);

        this.pedal = pedal;

    };

    public String sound() {return "Plong, Plong";}

    public int getPedal(){return this.pedal;}


}
