package examples3.third;

public class MyMain {

    public static void main(String[] args){
        MyDao dao = new MyDaoImpl();
        MyService service = new MyServiceImpl(dao);
        MyController controller = new MyController(service);
    }
}
