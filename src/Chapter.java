public class Chapter {
    private String title;
    private int numberOfPages;
    private int readingTime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getReadingTime() {
        return readingTime;
    }

    public void setReadingTime(int readingTime) {
        this.readingTime = readingTime;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", readingTime=" + readingTime +
                '}';
    }
}
/*
* Lag en klasse Chapter som holder på informasjon om

Tittel på kapittelet
Antall sider
Antatt lesetid
Utvid Book-klassen slik at den har en ArrayList som inneholder informasjon om alle kapitlene i boka.
*/
