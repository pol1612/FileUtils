/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cat.uvic.teknos.m06.FileUtils;
import java.io.File;

public class FileUtils {
    public static boolean isValidDirectory(String path) {
        File file1 = new File(path);
        if(file1.exists()){
            return true;
        }else{
            return false;
        }
    }
}
