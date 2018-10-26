package Streams;

import com.intellij.codeInsight.template.postfix.templates.SoutPostfixTemplate;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Iterator;

public class PathDemo {
    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("users/rohit");
        System.out.println(path); /// call toString method
        System.out.println(path.toUri());

        System.out.println(path.getName(1));

        Iterator it = FileSystems.getDefault().getRootDirectories().iterator();
        System.out.println("Root Directories (Drives in Windows)");
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
