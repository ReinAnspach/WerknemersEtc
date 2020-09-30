public abstract class Werknemer implements Werkneembaar, Comparable {
        private int id;
        private String naam;

        public Werknemer(int id, String naam) {
            setId(id);
            setNaam(naam);
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setNaam(String naam) {
            this.naam = naam;
        }

        public String getNaam() {
            return naam;
        }

        @Override
        public String toString() {
            return "Werknemer[id = " + getId() + " naam = " + getNaam();
        }

        public abstract int getSalaris();

        public boolean equals(Object otherObject){
            if(otherObject == null) return false;
            if( !(otherObject instanceof Werknemer)) return false;
            Werknemer otherWerknemer = (Werknemer)otherObject;
            return this.getId() == otherWerknemer.getId() ;
        }
    }

