package ejerciciospoo_15_02_2024;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DirectorioSelector {
    public static String seleccionarDirectorio() {
        JFileChooser chooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        chooser.setDialogTitle("Selecciona un directorio:");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            return chooser.getSelectedFile().getAbsolutePath();
        } else {
            return null;
        }
    }
    public static void guardarEnArchivo(String path, String textoPersonalizado) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("avionesArchivo.txt"))) {
            writer.write(textoPersonalizado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
