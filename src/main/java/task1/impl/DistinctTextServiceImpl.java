package task1.impl;

import lombok.SneakyThrows;
import task1.DistinctTextService;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctTextServiceImpl implements DistinctTextService {
    @SneakyThrows
    public Set<String> getDistinctStringFromTextFile(Path path) {

         return  Files.readAllLines(path).stream()
                    .map(word-> word.replaceAll("[^a-zA-Z ]", "")
                    .toLowerCase().split("\\s+")).flatMap(Arrays::stream)
                    .collect(Collectors.toSet());
    }
}

