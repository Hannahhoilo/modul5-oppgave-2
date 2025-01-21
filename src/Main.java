public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Book newBook = new Book();
        newBook.setSomeGenre(Genre.FANTASY);

        // gi verdier ved setter
        newBook.setTitle("Harry Potter");
        newBook.setAuthor("J.K. Rowling");
        newBook.setNumberOfPages(300);
        newBook.setSomeGenre(newBook.getSomeGenre());

        // Opprett et annet Book-objekt med andre verdier
        Book anotherBook = new Book();
        anotherBook.setTitle("Lord of the Rings");
        anotherBook.setAuthor("J.R.R Tolkien");
        anotherBook.setNumberOfPages(400);
        anotherBook.setSomeGenre(Genre.FANTASY);
        anotherBook.printBookDetails();

        newBook.printBookDetails();
    }
}
/*
* Oppgave 1: Innkapsling

Lag en klasse Book som i første omgang skal ha 3 instansvariabler: Title, Author og NumberOfPages.
Lag en metode i Book som skriver ut (System.out.println) tilstanden til objektet – altså verdiene til de ulike instansvariablene.
Lag gettere og settere for alle instansvariablene i Book. Sørg for å gi alle instansvariablene private access.
Opprett et Book-objekt i main-metoden. Sett verdier for alle instansvariablene i objektet ved hjelp av setter-metodene.
Test at objektet du lagde i e) har verdiene du forventer.
Lag en enum Genre med verdiene (CRIME, ACTION, FANTASY, CLASSIC og OTHER). Lag enumen i en egen fil: Høyreklikk på src-mappen din-> new ->Java Class -> Velg Enum (og gi den riktig navn).
Legg til en instansvariabel i Book slik at vi har informasjon om hvilken sjanger en bok tilhører.
Forsøk å opprette en ny bok i main-metoden for å se om sjanger også fungerer.*/