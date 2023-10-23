package animals;

import java.util.Random;

public class Kotik {
    private static int count;
    private static final int METHODS = 5;
    private String name;
    private String voice;
    private int satiety;
    private int weight;

    public Kotik(String name, String voice, int satiety, int weight) {
        count++;
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
    }

    public Kotik() {
        count++;
    }

    private boolean play() {
        if (this.satiety > 0) {
            this.satiety--;
            System.out.println("Котик играет");
            return true;
        }
        printAskToEat();
        return false;
    }

    private boolean sleep() {
        if (this.satiety > 0) {
            this.satiety--;
            System.out.println("Котик спит");
            return true;
        }
        printAskToEat();
        return false;
    }

    private boolean wash() {
        if (this.satiety > 0) {
            this.satiety--;
            System.out.println("Котик умывается");
            return true;
        }
        printAskToEat();
        return false;
    }

    private boolean walk() {
        if (this.satiety > 0) {
            this.satiety--;
            System.out.println("Котик гуляет");
            return true;
        }
        printAskToEat();
        return false;
    }

    private boolean hunt() {
        if (this.satiety > 0) {
            this.satiety--;
            System.out.println("Котик охотится");
            return true;
        }
        printAskToEat();
        return false;
    }

    private void printAskToEat() {
        System.out.println("Котик просит есть");
    }

    private void eat(int amountSatiety) {
        this.satiety = this.satiety + amountSatiety;
        System.out.println("Покормили котика");
    }

    private void eat(int amountSatiety, String foodName) {
        this.satiety = this.satiety + amountSatiety;
        System.out.println("Покормили кормом " + foodName);
    }

    private void eat() {
        eat(2, "Sheba");
    }

    public String[] liveAnotherDay() {
        final String[] oneDayCat = new String[24];
        for (int i = 0; i < 24; i++) {
            int number = new Random().nextInt(METHODS) + 1;
            switch (number) {
                case 1:
                    if (play()) {
                        oneDayCat[i] = i + " - играл";
                    } else {
                        eat();
                        oneDayCat[i] = i + " - ел";
                    }
                    break;
                case 2:
                    if (sleep()) {
                        oneDayCat[i] = i + " - спал";
                    } else {
                        eat(2);
                        oneDayCat[i] = i + " - ел";
                    }
                    break;
                case 3:
                    if (wash()) {
                        oneDayCat[i] = i + " - умывался";
                    } else {
                        eat(4, "KiteKat");
                        oneDayCat[i] = i + " - ел";
                    }
                    break;
                case 4:
                    if (walk()) {
                        oneDayCat[i] = i + " - гулял";
                    } else {
                        eat(1);
                        oneDayCat[i] = i + " - ел";
                    }
                    break;
                case 5:
                    if (hunt()) {
                        oneDayCat[i] = i + " - охотился";
                    } else {
                        eat();
                        oneDayCat[i] = i + " - ел";
                    }
                    break;
            }
        }
        return oneDayCat;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public String getVoice() {
        return voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
