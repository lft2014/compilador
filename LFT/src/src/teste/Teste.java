package teste;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import portugol.lexer.*;
import portugol.node.*;
import portugol.parser.Parser;
import portugol.parser.ParserException;

/**
 * Classe de testes
 * @author Gilcley Silva
 *              and 
 *         Jessica silveira
 */
public class Teste {

    public void iniciar() throws FileNotFoundException, IOException {
        //carrega o arquivo
        File f = new File("C:\\Users\\Eraldo\\Documents\\NetBeansProjects\\teste2\\src\\arquivos_teste\\t.txt");
        Reader arq_teste;
        try {
            arq_teste = new FileReader(f);
            MyLexer lexer = new MyLexer(new PushbackReader(arq_teste));
            Parser parser = new Parser(lexer);
            Start tree = parser.parse();
            do {
                Token token = lexer.next();
                String nome = token.getClass().getSimpleName();
                if (!nome.equals("EOF")) {
                    nome = nome.substring(1, nome.length());
                }
                if (token instanceof TBlanks) {
                    //System.out.print(token.getText());
                } else {
                    System.out.print(nome + "\n");
                }
                //caso seja o final do arquivo ele para
                if (token instanceof EOF) {
                    break;
                }
            } while (true);
        } catch (LexerException ex) {
            System.out.println(" ERRO lexico !!!");
         } catch (ParserException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

