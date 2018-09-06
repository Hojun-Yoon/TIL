package examples2.second;

import java.util.ArrayList;
import java.util.List;

public class CardgameMain {
    public static void main(String[] args){
        List<Cards> cards = CardFactory.createCard();
        //먼저 카드가 필요할 것.
        //'딜러'라는 객체
        Dealer dealer = new Dealer("딜러");
        dealer.setCards(cards);

        //'플레이어'라는 객체(딜러는 포함되지 않음)
        List<Player> playerList = new ArrayList<Player>();
        playerList.add(new Player("홍길동"));
        playerList.add(new Player("고길동"));
        playerList.add(new Player("강길동"));

        dealer.setPlayerList(playerList);


        // 게임이 초기화되는 과정(카드가 순서대로 뽑히기 위한 idx)
        dealer.newGame();

        // 딜러가 섞는 과정
        dealer.mix();

        // 나눠줘야 하는 경우
        for(int i = 0; i < 5; i++) {
            for(Player player : playerList) {
                player.addCard(dealer.getCard());
            }
        }

        dealer.result();

    }
}
