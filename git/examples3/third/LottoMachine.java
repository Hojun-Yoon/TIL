package examples3.third;

import java.util.List;

public interface LottoMachine {
    // 공 45개를 집어넣는다.
    public void put(List<LottoBall> balls);
    // 공을 섞는다.
    public void mix();
    // 뽑는다.(6개의 공을)
    public List<LottoBall> getBalls();
}
