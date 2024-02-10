package toyproject.fishbread;

public class MakeFishBread {
    public static void main(String[] args) {
        FishBread fishbread = new RedBean();
        fishbread.make();

        fishbread = new Cream();
        fishbread.make();

        fishbread = new Strawberry();
        fishbread.make();
    }
}
class FishBread{
    void make(){
        System.out.println("기본 붕어빵 만들기");
    }
}

class RedBean extends FishBread{
    @Override
    void make() {
        System.out.println("팥 붕어빵");
    }
}
class Cream extends FishBread{
    @Override
    void make() {
        System.out.println("크림 붕어빵");
    }
}
class Strawberry extends FishBread{
    @Override
    void make() {
        System.out.println("딸기 붕어빵");
    }
}