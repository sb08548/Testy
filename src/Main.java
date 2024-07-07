public class Main {
    public static void main(String[] args) {
    Piesek rafal = new Piesek();

    rafal.setName("Rafalek");
    rafal.setRasa("Maltanczyk");
    rafal.setColor("Biały");


        System.out.println("Mój pies " + rafal.getName() + ", jest rasy " + rafal.getRasa() + ", jest " + rafal.getColor() + "." );

    rafal.setColor("czarny");
        System.out.println("Mój pies " + rafal.getName() + ", jest rasy " + rafal.getRasa() + ", jest " + rafal.getColor() + "." );

    }
    }