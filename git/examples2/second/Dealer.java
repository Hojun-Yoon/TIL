package examples2.second;

import java.util.Collections;
import java.util.List;

public class Dealer {

    private String name;
    private List<Player> playerList;
    private List<Cards> cardList;
    private int index = 0;
    //초기화
    private int sum[] = {0, 0, 0};
    private int sIndex = 0;

    public Dealer(String name) {
        this.name = name;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public void setCards(List<Cards> cardList) {
        this.cardList = cardList;
    }
    public void newGame(){
        index = 0;
        for(Player player : playerList) {
            player.clear();
        }
    }
    public Cards getCard(){
        return cardList.get(index++);
    }
    public void mix(){
        Collections.shuffle(cardList);
    }

    public void result(){
        //플레이어들로부터 카드들을 구해서 가장 높은 사람을 출력

        for(Player player : playerList) {
            System.out.println(player.getCards());
            for(Cards card : player.cardList) {
                sum[sIndex] += card.number;
            } //for card
            sIndex++;
        } // for player
        if(sum[0] > sum[1]) {
            if(sum[0] > sum[2]) {
                //playerList.get(0) 자체는 객체이고, 실행시키기 위해서 메소드가 필요
                System.out.println(playerList.get(0).getName() + "님이 이겼습니다.");
            }else{
                System.out.println(playerList.get(2).getName() + "님이 이겼습니다.");
            }
        }else{
            if(sum[1] < sum[2]){
                System.out.println(playerList.get(2).getName() + "님이 이겼습니다.");
            }else{
                System.out.println(playerList.get(1).getName() + "님이 이겼습니다.");
            }
        }
    }
}
