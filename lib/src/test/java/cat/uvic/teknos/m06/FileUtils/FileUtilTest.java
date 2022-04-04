/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cat.uvic.teknos.m06.FileUtils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FileUtilTest {
    @Test void someLibraryMethodReturnsTrue() {
        assertTrue(FileUtils.isValidDirectory("src/test/resources/test"), "someLibraryMethod should return 'true'");
        assertFalse(FileUtils.isValidDirectory("src/test/resources/pol"), "someLibraryMethod should return 'false'");    }

}
