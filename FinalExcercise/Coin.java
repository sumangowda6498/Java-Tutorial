package FinalExcercise;

import java.util.Random;

public class Coin {
    private  String side;
    public static String HEAD="head";
    public  static  String TAIL="tail";

    public String getSide(){
        return side;
    }

    public void setSide(String side){
        this.side=side;
    }

    public String flip(){
        if(new Random().nextBoolean()){
            setSide(HEAD);
        }else {
            setSide(TAIL);
        }
        return getSide();
    }

}
