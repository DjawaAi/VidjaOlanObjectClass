public class Maain {

    public static void main(String[] jhgf) {
        Author Автор = new Author("Ричард", "Девид", "Бах");
        Book Книга = new Book("Иллюзии", "Ричард Бах", 2021);

        System.out.println("Автор.getFirstName() = " + Автор.getFirstName());
        System.out.println("Автор.getPatronymic() = " + Автор.getPatronymic());
        System.out.println("Автор.getSurname() = " + Автор.getSurname());
        System.out.println("Книга.getName() = " + Книга.getName());
        System.out.println("Книга.getAuthor() = " + Книга.getAuthor());
        System.out.println("Книга.getYearPublication() = " + Книга.getYearPublication());

        Книга.setYearPublication(1999);
        System.out.println("Книга.getYearPublication() = " + Книга.getYearPublication());

        System.out.println();

        Author Автор1 = new Author("Блоссий", "Эмилий", "Драконций");
        Book Книга1 = new Book("Мифологические поэмы", "Э. Б. Драконций", 2001);

        System.out.println("Автор1.getFirstName() = " + Автор1.getFirstName());
        System.out.println("Автор1.getPatronymic() = " + Автор1.getPatronymic());
        System.out.println("Автор1.getSurname() = " + Автор1.getSurname());
        System.out.println("Книга1.getName() = " + Книга1.getName());
        System.out.println("Книга1.getAuthor() = " + Книга1.getAuthor());
        System.out.println("Книга1.getYearPublication() = " + Книга1.getYearPublication());

        Книга1.setYearPublication(1987);
        System.out.println("Книга1.getYearPublication() = " + Книга1.getYearPublication());
    }

}
