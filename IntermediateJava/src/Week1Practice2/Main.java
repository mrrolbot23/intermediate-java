package Week1Practice2;

class One {
    private int x = 10;

    private int t = 20;

    public One() {
        this.x = 15;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void func1() {
        System.out.println("Func1 from One");
    }

    @Override
    public String toString() {
        return "One{" +
                "x=" + x +
                ", t=" + t +
                '}';
    }
}

class Two extends One{
    private int y = 20;

    public Two() {
        super();
        this.y = 30;
    }

    public Two(int y) {
        super();
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void func1() {
        System.out.println("Func1 from Two.");
    }

    public void func2() {
        System.out.println("Func2 from Two");
    }

    @Override
    public String toString() {
        return super.toString() + "Two{" +
                "y=" + y +
                '}';
    }
}

class Three extends One {
    private int z = 30;

    public Three(int z) {
        super();
        this.z = z;
    }

    public Three() {
        super();
        this.z = 35;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void func3() {
        System.out.println("Func3 from Three");
    }

    public void func4() {
        System.out.println("Func4 from Three");
    }

    @Override
    public String toString() {
        return super.toString() + "Three{" +
                "z=" + z +
                '}';
    }
}

class Four extends One {
    private int w = 40;

    public Four() {
        super();
        this.w = 45;
    }

    public Four(int w) {
        super();
        this.w = w;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void func6() {
        System.out.println("Func6 from Four");
    }

    @Override
    public String toString() {
        return "Four{" +
                "w=" + w +
                '}';
    }
}

class Five extends Three {
    private int a = 50;

    public Five(int z, int a) {
        super(z);
        this.a = a;
    }

    public Five(int a) {
        super();
        this.a = a;
    }

    public Five() {
        super();
        this.a = 55;
    }

    public void func5() {
        System.out.println("Func5 from Five");
    }

    @Override
    public String toString() {
        return super.toString() + "Five{" +
                "a=" + a +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        One objOne = new One();
        objOne.func1(); //Func1 from One

        Two objTwo = new Two();
        objTwo.func1(); //Func1 from Two
        objTwo.func2(); //Func2 from Two
        System.out.println(objTwo);

        Five objFive = new Five();
        System.out.println(objFive);

        objFive.func1();

    }
}
