package examples3.third;

public class LottoBall {
    //로또 볼 저장
    private int num = 0;

    //로또 값 집어넣기(숫자)
    LottoBall(int num) {

        this.num = num;
    }

    public int getBallNm() {
        return num;
    }
}
