package _24_06_21.infarces;

import java.util.List;

/**
 * Работа с файлом (Repository)**
 * - Класс `FileRepository` для работы с текстовым файлом:
 * - Чтение данных из файла.
 * - Запись данных в файл.
 * - Обновление и удаление данных в файле.
 */
public interface Repository {
    List<String> readAll();

    void writeAll(List<String> lines);

}
