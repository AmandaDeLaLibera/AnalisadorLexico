/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PascalGenerator;

import java.io.File;

/**
 *
 * @author Edson
 */
public class Main {
    public static void gerarLexer(String path){
        File arquivo = new File(path);
       jflex.Main.generate(arquivo);
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path = "C:/Users/Edson/Documents/NetBeansProjects/ProjetoAnalisadorLexicoPascal/src/PascalGenerator/Pascal.lex";
        gerarLexer(path);
        // TODO code application logic here
    }
    
}
