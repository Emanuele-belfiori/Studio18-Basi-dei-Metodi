public class Main {
    public static void main(String[] args) {
        System.out.println("Metodi");

        /*
        * METODI O FUNZIONI:
        *
        * - Cosa sono i metodi
        *
        * - Creiamo un semplice metodo void
        *
        * - Parametri dei metodi
        *
        * - Il return
         */
/*---------------------------------------------------------------------------------------------------*/

        // COSA SONO I METODI:
        /*
        Chiamati metodi o funzioni= di base i metodi sono delle funzioni, dei blocchi di codice
        che ci permettono di scrivere del codice e richiamarlo ogni volta che ne abbiamo bisogno.
        Questo sarà possibile solo inserendo il nome che avremmo assegnato al codice in questione.
        Sono chiamati così perché ogni funzione che scriviamo dentro una classe "public class Main"
        viene definita metodo (Questo richiama il costrutto di java della programmazione a oggetti).
         */

        // COSA SONO I PARAMETRI:
        /*
        I parametri= sono dei dati in entrata, dei dati che noi passiamo volta per volta alla funzione
         */



/*----------------------------------------------------------------------------------------------------*/

        // CREIAMO UN METODO:

        // Richiamo metodo faiPasta:
        faiPasta(); // Richiamo la funzione e ritornerà a stampa quello che c'è al suo interno.
        faiPasta();
        faiPasta(); // Posso richiamarlo più volte e darà sempre lo stesso risultato.

        // Richiamo metodo cucinaPranzo:
        cucinaPranzo("arrosto"); /* Funzione dove passeremo il tipo di dato specifico ad esempio
                                         oggi vogliamo cucinare arrosto e lo inseriremo a modo stringa. */

        // Richiamo metodo addizione:
        addizione(15, 8, 72); /* Inserisco i parametri */

        // Richiamo metodo addizione2:

        int totaleAddizione = addizione2(18, 27, 42); /* Creiamo una variabile per conservare i nostri
                                                               valori per riutilizzarli anche in futuro, poi
                                                               mettiamo = e dopo richiamiamo il metodo
                                                               addizione 2 e inseriamo i parametri */
        System.out.println("Il risultato dell'addizione è= " + totaleAddizione); // Stampiamo il risultato

        //Come potremmo riutilizzare il nostro metodo addizione2? Vediamolo di seguito
        int provaMetodo = addizione2(5, 4, 1); /* Creiamo un'altra variabile che contenga, sempre
                                                           richiamando il nostro metodo, ma con valori nuovi */
        System.out.println("Il nuovo valore dell'addizione è= " + provaMetodo); // Mandiamo a stampa


    } /* QUESTO METODO VA CREATO FUORI DA: ( public static void main(String[] args) { ) ---> PER POI
    RICHIAMARLO BASTERÀ TORNARE ALL'INTERNO DI: ( public static void main(String[] args) { ) */

    // Void = void (vuoto) è legato al valore di ritorno, void è una funzione che esegue delle cose
    //        ma non ritorna alcun valore al programma.
    // Static = bisogna richiamarlo nel main perché

    // METODO FAIPASTA:
    static void faiPasta(){ // essendo in un contesto: STATIC VOID MAIN---> dobbiamo richiamare static
        System.out.println("METODO FAIPASTA:");

        System.out.println("sto cucinando la pasta\n"); // Ritorno di stampa nel richiamo del metodo fuori nel Main
    }

    // METODO CUCINAPRANZO:
    static void cucinaPranzo(String cibo) { /* (cibo)= parametro che sto passando alla funzione, quindi
                                                       chiamo la funzione cucinaPranzo e in quel momento
                                                       dirò che tipo di cibo cucinare passandogli un
                                                       parametro, naturalmente prima del parametro dovremo
                                                       inserire il tipo di dato in questo caso avremo una
                                                       stringa */
        System.out.println("METODO CUCINAPRANZO:");
        System.out.println("sto cucinando " + cibo + "\n");// Stampo il tipo di cibo passato come parametro
    }

    // METODO ADDIZIONE:
    static void addizione (int a, int b, int c){ // Creiamo un metodo con più variabili
        System.out.println("METODO ADDIZIONE:");
        int risulatato= a + b;// Creo la variabile risultato e al suo interno faro svolgere l'addizione
        System.out.println("Calcoliamo l'operazione= " + risulatato+" risultato " +
                "dell'addizione\n"); // Metto in stampa il risultato richiamando la variabile
    }

    // Metodo Addizione con return:
    static int addizione2 (int d, int e, int f)  { /* Cambiamo la seconda voce del metodo dalla classica void
                                                      e mettiamo int così da far capire al programma che ci
                                                      deve tornare un intero */
        System.out.println("Metodo Addizione con return:");
        int risultato2 = d + e + f; // Creo variabile per fare l'operazione desiderata
        return risultato2; /* Il return= fa ritornare un valore al di fuori del metodo, senza utilizzare
                                         la stampa che verrà invece utilizzata nel Main*/
    }
}