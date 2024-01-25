/*
 * A COMMON CLASS TO GET FILE PATH
 */

package AssessmentDay8.files;

import java.io.File;

public class GetFile {
    static String filePath() {
        return new File("AssessmentDay8/files/test.txt").getAbsolutePath();
    }
}
