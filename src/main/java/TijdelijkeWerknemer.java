public  class TijdelijkeWerknemer extends Werknemer {


    private int aantalUren;
    private int uurloon;

    public TijdelijkeWerknemer(int id, String naam, int aantalUren, int uurloon) {
        super(id, naam);
        setAantalUren(aantalUren);
        setUurloon(uurloon);
    }


    public void setAantalUren(int aantalUren) {
        this.aantalUren = aantalUren;
    }

    public int getAantalUren() {
        return aantalUren;
    }

    public void setUurloon(int uurloon) {
        this.uurloon = uurloon;
    }

    public int getUurloon() {
        return uurloon;
    }

    public String toString() {
        return "Tijdelijke" + super.toString() + " en uurloon = " + uurloon + "]";
    }

    public int getSalaris() {
        return aantalUren * uurloon;
    }

    public boolean equals(Object otherObject) {

        if (otherObject == null) return false;

        if (!(otherObject instanceof TijdelijkeWerknemer)) return false;

        TijdelijkeWerknemer otherTijdelijkeWerknemer = (TijdelijkeWerknemer) otherObject;
        boolean areIdsEqual = this.getId() == otherTijdelijkeWerknemer.getId();
        boolean areNamesEqual = this.getNaam().equalsIgnoreCase(otherTijdelijkeWerknemer.getNaam());
        return areIdsEqual && areNamesEqual;
    }

    public int compareTo(Object otherObject) {
        Werkneembaar otherWerkneembaar = (Werkneembaar) otherObject;
        return this.getId() - otherWerkneembaar.getId();
    }
}