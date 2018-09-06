package examples3.third;


import java.util.List;

public class LottoMain {
    public static void main(String[] args){
        //45개 공을 생성한다.
        List<LottoBall> list = LottoBallFactory.createBalls();

        //로또 장치에 넣는다.
        LottoMachine machine = new NHLottoMachine();
        machine.put(list);

        //로또머신의 로또볼을 섞는다.
        machine.mix();

        //섞인 볼들 중에서 6개를 꺼낸다.
        List<LottoBall> result = machine.getBalls();
        for(LottoBall ball : result) {
            System.out.print(ball.getBallNm() + " ");
        }

        System.out.println();
    }
}
