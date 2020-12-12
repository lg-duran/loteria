import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Programa {

    public static void main(String[] args) throws IOException {

         try {
             
            String path = "/home/keyla/lucas/lotofacil/d_lotfac.htm";

            File file = new File(path);

            FileReader fileReader = new FileReader(file);


            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String linha = "";

            String rownspan = "<td rowspan=";

            String terminoDaLinha = "<td rowspan=" + "\"" + "5" + "\"" + ">0,00</td>";
            

		    while (true) {

                if (linha != null) {

                    if (linha.contains(rownspan)) {

                        if (linha.contains(terminoDaLinha)) {

                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            linha = bufferedReader.readLine();
                            
                            

                        } 
                            
                        System.out.println(linha);
                       

                    }

                    

                } else                    
                    break;

			linha = bufferedReader.readLine();
        }

        
            bufferedReader.close();

        } catch (FileNotFoundException e) {            
            e.printStackTrace();
        }
        

    }


}