import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Mascota m = new Mascota();
        Persona p = new Persona();
        ArrayList<InterfazDecirHola> l = new ArrayList<>();
        l.add(m);
        l.add(p);

        for (InterfazDecirHola e : l) {
            f1(e);
        }

    }

    private static void f1(InterfazDecirHola a) {
        System.out.println(a.decirHola());

    }
}
