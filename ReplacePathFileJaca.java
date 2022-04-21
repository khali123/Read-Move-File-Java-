package proje;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ReplacePathFileJaca {
	public static void main(String[] args) throws IOException {
		
		File source = new File("C:\\Users\\kml\\Desktop\\espagnol\\Recibí carga inicial.pdf");
		Path path = Paths.get("C:\\Users\\kml\\Desktop\\espagnol\\generales\\");

		Path dest = Files.createDirectories(path);

		File deste = new File("C:\\Users\\kml\\Desktop\\espagnol\\generales\\",source.getName());
		boolean isMoved = source.renameTo(deste);

		if (source.mkdirs()) {
			System.out.println("Directory is created!");
		} else {
			System.out.println("Failed to create directory!");
		}

	}
}
