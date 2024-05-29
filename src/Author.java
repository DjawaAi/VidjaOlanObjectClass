import java.util.Objects;

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

    @Override
    // public String toString() {
    //   return "Author{" +
    //         "firstName='" + firstName + '\'' +
    //       ", patronymic='" + patronymic + '\'' +
    //     ", surname='" + surname + '\'' +
    //   '}';
    //}

    public String toString() {
        return "Имя: " + this.firstName + ", Отчество: " + this.patronymic + ", Фамилия: " + this.surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(patronymic, author.patronymic) && Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, patronymic, surname);
    }
}
