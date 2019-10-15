package task1.impl;

import org.junit.Test;
import task1.DistinctTextService;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class DistinctTextServiceImplTest {
    @Test
   public void getDistinctStringFromTextFile() {
        final Path path = Paths.get("src/test/resources/text/rocke-tech.txt");
        final DistinctTextService distinctTextService = new DistinctTextServiceImpl();
        final Set<String> distinctStringFromTextFile = distinctTextService.getDistinctStringFromTextFile(path);
        assertEquals(31, distinctStringFromTextFile.size());

    }

}