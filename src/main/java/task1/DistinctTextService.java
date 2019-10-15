package task1;

import java.nio.file.Path;
import java.util.Set;

public interface DistinctTextService {

     Set<String> getDistinctStringFromTextFile (Path path);
}
