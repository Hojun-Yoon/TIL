package examples3.third;

import java.util.ArrayList;
import java.util.List;

public class LottoBallFactory {
    private LottoBallFactory() {
    }
    public static List<LottoBall> createBalls() {
        List<LottoBall> list= new ArrayList<>();
        for(int i = 1; i <= 45; i++) {
            LottoBall ball = new LottoBall(i);
            list.add(ball);
        }
        return list;
    }
}
