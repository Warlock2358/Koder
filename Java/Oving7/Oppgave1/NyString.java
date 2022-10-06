package Java.Oving7.Oppgave1;

public final class NyString {
    private final String tekst;

    public NyString(String ord) {
        this.tekst = ord;
    }

    public String forkort() {
        String forkortet = "";
        String[] ord = tekst.split(" ");

        for (int i = 0; i < ord.length; i++) {
            forkortet += ord[i].charAt(0);
        }
        forkortet = forkortet.substring(0, 1).toUpperCase() + forkortet.substring(1);
        return forkortet;
    }

    public String fjernTegn(char t) {
        String nyTekst = this.tekst;

        while (nyTekst.indexOf(t) != -1) {
            nyTekst = nyTekst.substring(0, nyTekst.indexOf(t)) + nyTekst.substring(nyTekst.indexOf(t) + 1);
        }
        return nyTekst;
    }
}
