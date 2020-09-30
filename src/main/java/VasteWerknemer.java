public class VasteWerknemer extends Werknemer {


    private int salarisSchaal;
    private int randomInt;

    public VasteWerknemer(int id, String naam, int salarisSchaal) {
        super(id, naam);
        setSalarisSchaal(salarisSchaal);
    }


    public void setSalarisSchaal(int salarisSchaal) {
        this.salarisSchaal = salarisSchaal;
    }

    public int getSalarisSchaal() {
        return salarisSchaal;
    }

    public String toString() {
        return "Vaste" + super.toString() + " en salarisSchaal = " + salarisSchaal + "]";
    }

    public int getSalaris() {
        return salarisSchaal * 1000;
    }


    public boolean equals(Object otherObject) {
        if (otherObject == null) return false;
        if (!(otherObject instanceof VasteWerknemer)) return false;
        VasteWerknemer otherVW = (VasteWerknemer) otherObject;
        return this.getId() == otherVW.getId();

    }

    public int compareTo(Object otherObject) {
        Werkneembaar otherWerkneembaar = (Werkneembaar) otherObject;
        return this.getId() - otherWerkneembaar.getId();
    }

    }





