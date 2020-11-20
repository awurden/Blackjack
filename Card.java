
package Package;

public class Card {
    private Boolean cardVisible;
    private Boolean aceHighFlag;
    private String cardID;
    private String cardIcon;
    private int cardValue;
    private int x;
    private int y;
    
    public Card(boolean cardVisible, String cardID){
        this.cardVisible=cardVisible;
        this.aceHighFlag=true;
        if(cardVisible==true){
            cardIcon=cardID;
        } else {
            cardIcon="b1fv.png";
        }
        
        x=Integer.parseInt(cardID.substring(1,cardID.indexOf(".")));
        x=x%13;
        if(x==1) y=0;       //Card is an ace
        else if(x<=10) y=1; //Card is a number card
        else y=2;           //Card is a Jack, Queen, or King
        
        switch(x){
            case 0:
                cardValue=11;
                break;
            case 1:
                cardValue=x;
                break;
            case 2:
                cardValue=10;
                break;
        }        
    }
}
