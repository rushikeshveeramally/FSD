package june3;

public abstract class Implementation implements Run,Win{
    @Override
    public void m1() {
        System.out.println("i am method 1 from interface Run");
    }

    public void m2(){
        System.out.println("i am method 2 from interface Win");
    }

    public static void main(String[] args) {
        //Implementation




    }
}
