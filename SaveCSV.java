import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SaveCSV {
    private String file;

    public SaveCSV(String file) {
        this.file = file;
    }

    public void saveFile(ArrayList<Toy> arrayToy) throws IOException {
        try (FileWriter writer = new FileWriter(file, false)) {
            writer.write("id;Название игрушки\n");
            for (Toy toy : arrayToy) {
                writer.write(String.format("%s;%s", toy.getId(), toy.getName()) + "\n");

            }
            writer.flush();
        }

    }
}
