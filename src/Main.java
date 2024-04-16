public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Уильем", "Шекспир");
        Book book1 = new Book(1623, "Гамлет", author1);
        Author author2 = new Author("Джордж", "Мартин");
        Book book2 = new Book(1996, "Игра престолов", author2);
        book2.setYear(1997);
        book2.setYear(1996); //Правильный год, измененый по принуждению предидущего задания :)
        System.out.println(book1);
        System.out.println(book2.equals(book2));
        System.out.println(book2);

    }
}