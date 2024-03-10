public class Parent {
    String parentName;
    
    Parent() {
        System.out.println("Konstruktor parent");
    }
    
    Parent(String parentName) {
        this.parentName = parentName;
        System.out.println("Konstruktor parent");
    }
}

class Baby extends Parent {
    String babyName;
    
    Baby(String babyName) {
        super(); // Memanggil konstruktor parent tanpa parameter
        this.babyName = babyName;
        System.out.println("Konstruktor Baby");
        System.out.println(babyName);
    }

    public void Cry() {
        System.out.println("Owek owek");
    }
}
