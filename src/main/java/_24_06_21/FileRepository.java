package _24_06_21;

import _24_06_21.infarces.Repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileRepository implements Repository {
    private final Path filePath;

    public FileRepository(String fileName) {
        this.filePath = Paths.get(fileName);
    }

    @Override
    public List<String> readAll() {
        try {
            return Files.readAllLines(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void writeAll(List<String> lines) {

    }
}
