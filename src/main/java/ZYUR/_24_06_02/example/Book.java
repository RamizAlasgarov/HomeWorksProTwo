package ZYUR._24_06_02.example;

import java.util.Objects;



    /**
     * Создайте класс книга с полями Название, Автор, ISBN.
     *  * На полке стоят книги в алфавитном порядке по автору,
     */
    public class Book implements Comparable<Book>{
        private final String name;
        private final String author;
        private final String ISBN;

        public Book(String name, String author, String isbn) {
            this.name = name;
            this.author = author;
            ISBN = isbn;
        }

        public String getName() {
            return name;
        }

        public String getAuthor() {
            return author;
        }

        public String getISBN() {
            return ISBN;
        }

        @Override
        public String toString() {
            return "Books{" +
                    "name='" + name + '\'' +
                    ", author='" + author + '\'' +
                    ", ISBN='" + ISBN + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return Objects.equals(name, book.name) && Objects.equals(author, book.author) && Objects.equals(ISBN, book.ISBN);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, author, ISBN);
        }

        /**
         * затем по названию, затем по ISBN.
         *  * Напишите два метода поиска книг на полке – линейный и бинарный.
         *  * Создайте метод, который замерит время выполнения обоих методов поиска
         * @param o the object to be compared.
         * @return
         */
        @Override
        public int compareTo(Book o) {
            int res = this.author.compareTo(o.author);
            if(res != 0){return res;}
            res = this.name.compareTo(o.name);
            if(res !=0){return res;}
            return this.ISBN.compareTo(o.ISBN);
        }
    }


