package be.vinci.domain;

public interface User {
    String getLogin();

    void setLogin(String login);

    int getId();

    void setId(int id);

    String getPassword();

    void setPassword(String password);

    boolean checkPassword(String password);

    String hashPassword(String password);
}
