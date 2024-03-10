class Bapak {
    int a;
    int b;
    void show_variabel() {
        System.out.println("Nilai a="+ a);
        System.out.println("Nilai b="+ b);
    }
}

class Anak extends Bapak {
    int c;
    @Override
    void show_variabel() {
        super.show_variabel();
        System.out.println("Nilai c="+ c);
    }
}

public class InheritExample {
    public static void main(String[] args) {
        Bapak objectBapak = new Bapak();
        Anak objectAnak = new Anak();
        objectBapak.a = 1;
        objectBapak.b = 1;
        System.out.println("Object Bapak (Superclass): ");

        objectBapak.show_variabel();
        objectAnak.c = 5;
        System.out.println("Object Anak (Superclass dari Bapak):");
        objectAnak.show_variabel();
    }
}
