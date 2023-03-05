public class Netto{
    private float cenaBrutto, stawkaPodatku;
    
    public float getCenaBrutto() {
        return cenaBrutto;
    }

    public void setCenaBrutto(float cenaBrutto) {
        this.cenaBrutto = cenaBrutto;
    }

    public float getStawkaPodatku() {
        return stawkaPodatku;
    }

    public void setStawkaPodatku(float stawkaPodatku) {
        this.stawkaPodatku = stawkaPodatku;
    }

    public float obliczNetto (float cenaBrutto, float stawkaPodatku) {
        return cenaBrutto - stawkaPodatku;
    }
    public static void main(String[] args) {
        Netto n1 = new Netto();
        System.out.println(n1.obliczNetto(14.7f, 1.8f));
    }
}