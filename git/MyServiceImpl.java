package examples3.third;

public class MyServiceImpl implements MyService{
    MyService service;
    private MyDao dao;

    MyServiceImpl(MyDao dao){
        this.dao = dao;
    }

    @Override
    public void hi() {

    }
}
