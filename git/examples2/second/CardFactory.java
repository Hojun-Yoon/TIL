package examples2.second;

import java.util.ArrayList;
import java.util.List;

public class CardFactory {

    private CardFactory(){
    }

    public static List<Cards> createCard(){
        List<Cards> cards = new ArrayList<>();
        String[] types = new String[]{"클로버", "하트", "다이아", "스페이드"};

        for(String type : types) {
            for(int i=1; i<=13; i++) {
                Cards card = new Cards(type, i);
                cards.add(card);
            } //for
        } // for type
        return cards;
    } // createCard
}
