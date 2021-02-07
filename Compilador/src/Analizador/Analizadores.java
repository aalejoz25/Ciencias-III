package Analizador;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Analizadores {
    public static void main(String[] args) throws Exception {
        String path= "../Compilador/src/Analizador/Lexico.flex";
        String path1= "../Compilador/src/Analizador/LexicoCup.flex";
        String[] pathSintaxis= {"-parser","Sintaxis","../Compilador/src/Analizador/Sintaxis.cup"};
        generarAnalizador(path, path1, pathSintaxis);        
    }
    public static void generarAnalizador(String path, String path1, String[] pathSintaxis) throws IOException, Exception {
        File arc; 
        arc = new File(path);
        JFlex.Main.generate(arc);
        arc = new File(path1);
        JFlex.Main.generate(arc);
        java_cup.Main.main(pathSintaxis);
        Path pathSymbol = Paths.get("../Compilador/src/Analizador/sym.java");
        if (Files.exists(pathSymbol)) {
            Files.delete(pathSymbol);
        }
        Files.move(
        Paths.get("../Compilador/sym.java"), 
        Paths.get("../Compilador/src/Analizador/sym.java")
        );
        Path pathSintaxis1 = Paths.get("../Compilador/src/Analizador/Sintaxis.java");
        if (Files.exists(pathSintaxis1)) {
            Files.delete(pathSintaxis1);
        }
        Files.move(
                Paths.get("../Compilador/Sintaxis.java"), 
                Paths.get("../Compilador/src/Analizador/Sintaxis.java")
        );        
    }
}
