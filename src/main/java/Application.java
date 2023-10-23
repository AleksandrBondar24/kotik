import animals.Kotik;

public class Application {
    public static void main(String[] args) {
        final Kotik kotik = new Kotik("Puma", "Мяу", 6, 5);
        final Kotik kot = new Kotik();
        kot.setName("Tom");
        kot.setVoice("Мяу мяу");
        kot.setSatiety(8);
        kot.setWeight(3);

        for (String action : kotik.liveAnotherDay()) {
            System.out.println(action);
        }

        System.out.println(kot.getName());
        System.out.println(kot.getWeight());
        System.out.println(compareVoice(kot, kotik));
        System.out.println(Kotik.getCount());
    }

    public static boolean compareVoice(Kotik kot, Kotik kotik) {
        return kot.getVoice().equals(kotik.getVoice());
    }
}