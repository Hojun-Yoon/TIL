package examples2.second;

public class Cards {
    String type;
    int number;
    public Cards(String type, int number) {
        this.type = type;
        this.number = number;
    }

    public String getType(){
        return type;
    }
    public int getNumber(){
        return this.number;
    }

    @Override
    public String toString() {
        String strNumber = number + "";
        if(number == 1) {
            strNumber = "A";
        }else if(number == 10){
            strNumber = "J";
        }else if(number == 11){
            strNumber = "Q";
        }else if(number ==12){
            strNumber = "K";
        }

        return type + " [ " + strNumber + " ] ";
    }
}