package testpk;

import java.io.File;

public class Test3 {

	public static void main(String[] args) {
		boolean delFiles = delFiles("E:\\test");
		System.out.println(delFiles);
	}
	
    public static boolean delFiles(String path) {
        boolean result = false;
        File file = new File(path);
        // ÅÐ¶ÏÄ¿Â¼
        if (file.isDirectory()) {
            File[] childrenFiles = file.listFiles();
            for (File childFile : childrenFiles) {
                result = delFiles(childFile.getPath());
                if (!result) {
                    return result;
                }
            }
        }
        // É¾³ý ÎÄ¼þ¡¢¿ÕÄ¿Â¼
        result = file.delete();
        return result;
    }
}
