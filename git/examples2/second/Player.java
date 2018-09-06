package examples2.second;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    public List<Cards> cardList;

    public Player(String name) {
        this.name = name;
        this.cardList = new ArrayList<>();
    }

    public void clear(){
        cardList.clear();
    }

    public void addCard(Cards card) {
        this.cardList.add(card);
    }

    public List<Cards> getCards(){
        return cardList;
    }

    public String getName() {
        return name;
    }
}
