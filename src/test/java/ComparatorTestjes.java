import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ComparatorTestjes {

        @Test
        void eenAantalWerknemersSorterenOpSalaris() {

            Werkneembaar[] werkneembaren = getWerkneemBaren();

            Arrays.sort(werkneembaren, new WerknemerComparator());

            printWerkneembaren(werkneembaren);
        }

        private Werkneembaar[] getWerkneemBaren() {
            Werknemer v1 = new VasteWerknemer(1, "Sjoerd", 12);
            Werknemer v2 = new VasteWerknemer(3, "Dave", 15);
            Werknemer t1 = new TijdelijkeWerknemer(2, "Evan", 40, 250);
            Werknemer t2 = new TijdelijkeWerknemer(4, "Sam", 40, 250);

            return new Werkneembaar[]{v1, v2, t1, t2};
        }

        private void printWerkneembaren(Werkneembaar[] werkneemBaren) {
            for (Werkneembaar w : werkneemBaren) {
                System.out.println(w.getNaam() + " heeft ID " + w.getId());
            }
        }
    }

