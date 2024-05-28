public class Author {
    private String firstName;
    private String patronymic;
    private String surname;

    public Author (String firstName, String patronymic, String surname) {
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.surname = surname;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public String getSurname() {
        return this.surname;
    }
}
