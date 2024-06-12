package ZYUR._24_09_06;

import java.util.Optional;

/**
 * 1 Создайте метод, который принимает объект и возвращает его строковое представление.
 * Используйте Optional для предотвращения NullPointerException, если переданный объект равен null.
 * 2 Создайте метод, который возвращает Optional для строки. Если строка начинается
 * с буквы "A", верните её значение, иначе верните Optional.empty().
 * 3 Создайте метод, который принимает Optional и возвращает его значение, или
 * строку "Default", если значение отсутствует.
 * 4 Создайте метод, который принимает два Optional и возвращает их сумму.
 * Если хотя бы одно из значений отсутствует, верните Optional.empty().
 * 5 Создайте метод, который принимает Optional для строки и возвращает Optional для длины этой строки.
 * Если входная строка null, бросьте IllegalArgumentException.
 */
public class OptionalTask {
    public static void main(String[] args) {
//        System.out.println(getString(null));
//        System.out.println(getOptionalForString("ok kak dela", "o"));
//        System.out.println(getOptionalForString(null, "o"));
//        System.out.println(getIfPresentOfDefault(Optional.of("ok")));
//        System.out.println(getIfPresentOfDefault(Optional.empty()));
//        System.out.println(sumOfOptional(Optional.empty(), Optional.empty()));
//        System.out.println(sumOfOptional(Optional.empty(), Optional.of(1)));
//        System.out.println(sumOfOptional(Optional.of(1), Optional.of(1)));
//        System.out.println(getLEnght(Optional.of("a")));


        System.out.println(getLenght2(Optional.of("ok")));
    }

    public static <T> String getString(T subject) {
        Optional<T> optionalSubject = Optional.ofNullable(subject);
        if (optionalSubject.isPresent()) {
            return optionalSubject.get().toString();
        }
        return "null";
    }


    public static Optional<String> getOptionalForString(String line, String letter) {
        Optional<String> op = Optional.ofNullable(line);
        if (op.isPresent() && line.startsWith(letter)) {
            return op;
        }
        return Optional.empty();

//        return op.isPresent() && line.startsWith(letter) ? op : Optional.empty(); korotkiy variant
    }

    public static String getIfPresentOfDefault(Optional<String> opStr) {
        return opStr.orElse("Default"); // verni sllovo ili default
    }


    /**
     * Создайте метод, который принимает два Optional и возвращает их сумму.
     * * Если хотя бы одно из значений отсутствует, верните Optional.empty().
     */
    public static Optional<Integer> sumOfOptional(Optional<Integer> opOne, Optional<Integer> opTwo) {
        if (opOne.isEmpty() || opTwo.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(opOne.get() + opTwo.get());
    }


    /**
     * 5 Создайте метод, который принимает Optional для строки и возвращает Optional для длины этой строки.
     * * Если входная строка null, бросьте IllegalArgumentException.
     */
    public static Optional<Integer> getLEnght(Optional<String> op) {
        return Optional.of(op.orElseThrow(() -> new IllegalArgumentException("error")).length());
//        if (op.isEmpty()) {
//            throw new IllegalArgumentException("error");
//        }
//        return Optional.of(op.get().length());
    }

    public static Optional<Integer> getLenght2(Optional<String> op) {
        return op.map(l -> l.length());
    }

    /**
     * Используйте потоковые функции:
     * 2 Создайте метод, который принимает Optional и возвращает true,
     * если значение присутствует и является положительным числом, иначе false.
     */
    public static boolean checkPositive(Optional<Integer> op) {
        Optional<Integer> afterCheck = op.filter(p -> p > 0);
        return afterCheck.isPresent();    // ili tak     op.filter(p -> p > 0).isPresent();
    }

    /**
     * 3 Создайте метод, который принимает два списка строк и возвращает их объединение.
     * Сначала метод берёт очередное значение из первой очереди.
     * Если оно null, то берёт значение из второго списка.
     * Если значение второго списка null, то берётся значение по умолчанию.
     */

}

