package Java.Eksperiment;

public class LosningValuta {
    private final float kurs;

    public LosningValuta(float kurs) {
        this.kurs = kurs;
    }

    public float tilNok(float sum) {
        return sum * kurs;
    }

    public float fraNok(float sum) {
        return sum / kurs;
    }
}
