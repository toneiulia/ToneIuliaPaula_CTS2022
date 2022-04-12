package clase;

public class Calator implements ICalator {
    String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primireMesaj(String mesaj) {
        System.out.println(nume + ", ai primit mesajul: " + mesaj);
    }
}