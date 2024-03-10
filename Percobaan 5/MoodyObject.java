public class MoodyObject {
    protected String getMood() {
        return "moody";
    }

    public void speak() {
        System.out.println("I am " + getMood());
    }
}

public class SadObject extends MoodyObject {
    protected String getMood() {
        return "sad";
    }

    public void cry() {
        System.out.println("Hoo hoo");
    }
}

public class HappyObject extends MoodyObject {
    protected String getMood() {
        return "happy";
    }

    public void laugh() {
        System.out.println("Hahaha");
    }
}

public class MoodyTest {
    public static void main(String[] args) {
        MoodyObject m = new MoodyObject();
        m.speak();

        m = new HappyObject();
        m.speak();
        ((HappyObject) m).laugh();

        m = new SadObject();
        m.speak();
        ((SadObject) m).cry();
    }
}
