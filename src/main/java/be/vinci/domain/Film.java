package be.vinci.domain;

public interface Film {
    int getId();

    void setId(int id);

    String getTitle();

    void setTitle(String title);

    int getDuration();

    void setDuration(int duration);

    long getBudget();

    void setBudget(long budget);

    String getLink();

    void setLink(String link);
}
