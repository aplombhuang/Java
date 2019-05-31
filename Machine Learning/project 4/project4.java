
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Aplomb Huang, Paige Fuller, Aaron Kim AI project #4
 */
public class project4 {

    static ArrayList<String> tokenList = new ArrayList<String>();

    public static void main(String[] args) throws FileNotFoundException {

        //String[] token = new String[2];

        Scanner readFile = new Scanner(new File("sentences.txt"));
        
        //Boolean to make sure parameters fit the finalized tokens
        boolean okay = true; 
        
        while (readFile.hasNext()) {
            Stemmer s = new Stemmer();
            String token = readFile.next();
            okay = true;
           
            //Section to ensure no numerics
            if (token.contains("1") || token.contains("2"))
                okay = false;
            else if (token.contains("3")||token.contains("4"))
                okay = false;
            else if (token.contains("5")||token.contains("6"))
                okay = false;
            else if (token.contains("7")||token.contains("8"))
                okay = false;
            else if (token.contains("9")||token.contains("0"))
                okay = false;
            else {
                
                //remove characters
                token = token.replace("\,", " ");
                token = token.replace("\.", " ");
                token = token.replace("\"", " ");
                token = token.replace("\(", " ");
                token = token.replace("\)", " ");
                token = token.replace("'s", " ");
                token = token.trim();
                token = token.toLowerCase();
            }
            
            //Giant hard coded section to remove numerics
            if (token.compareTo("a")==0)
                okay=false;
            if (token.compareTo("able")==0)
                okay=false;
            if (token.compareTo("about")==0)
                okay=false;
            if (token.compareTo("across")==0)
                okay=false;
            if (token.compareTo("after")==0)
                okay=false;
            if (token.compareTo("all")==0)
                okay=false;
            if (token.compareTo("almost")==0)
                okay=false;
            if (token.compareTo("also")==0)
                okay=false;
            if (token.compareTo("am")==0)
                okay=false;
            if (token.compareTo("among")==0)
                okay=false;
            if (token.compareTo("an")==0)
                okay=false;
            if (token.compareTo("and")==0)
                okay=false;
            if (token.compareTo("any")==0)
                okay=false;
            if (token.compareTo("are")==0)
                okay=false;
            if (token.compareTo("as")==0)
                okay=false;
            if (token.compareTo("at")==0)
                okay=false;
            if (token.compareTo("be")==0)
                okay=false;
            if (token.compareTo("because")==0)
                okay=false;
            if (token.compareTo("been")==0)
                okay=false;
            if (token.compareTo("but")==0)
                okay=false;
            if (token.compareTo("by")==0)
                okay=false;
            if (token.compareTo("can")==0)
                okay=false;
            if (token.compareTo("cannot")==0)
                okay=false;
            if (token.compareTo("could")==0)
                okay=false;
            if (token.compareTo("dear")==0)
                okay=false;
            if (token.compareTo("did")==0)
                okay=false;
            if (token.compareTo("do")==0)
                okay=false;
            if (token.compareTo("does")==0)
                okay=false;
            if (token.compareTo("either")==0)
                okay=false;
            if (token.compareTo("else")==0)
                okay=false;
            if (token.compareTo("ever")==0)
                okay=false;
            if (token.compareTo("every")==0)
                okay=false;
            if (token.compareTo("for")==0)
                okay=false;
            if (token.compareTo("from")==0)
                okay=false;
            if (token.compareTo("get")==0)
                okay=false;
            if (token.compareTo("got")==0)
                okay=false;
            if (token.compareTo("had")==0)
                okay=false;
            if (token.compareTo("has")==0)
                okay=false;
            if (token.compareTo("have")==0)
                okay=false;
            if (token.compareTo("he")==0)
                okay=false;
            if (token.compareTo("her")==0)
                okay=false;
            if (token.compareTo("hers")==0)
                okay=false;
            if (token.compareTo("him")==0)
                okay=false;
            if (token.compareTo("his")==0)
                okay=false;
            if (token.compareTo("how")==0)
                okay=false;
            if (token.compareTo("however")==0)
                okay=false;
            if (token.compareTo("i")==0)
                okay=false;
            if (token.compareTo("if")==0)
                okay=false;
            if (token.compareTo("in")==0)
                okay=false;
            if (token.compareTo("into")==0)
                okay=false;
            if (token.compareTo("is")==0)
                okay=false;
            if (token.compareTo("it")==0)
                okay=false;
            if (token.compareTo("its")==0)
                okay=false;
            if (token.compareTo("just")==0)
                okay=false;
            if (token.compareTo("least")==0)
                okay=false;
            if (token.compareTo("let")==0)
                okay=false;
            if (token.compareTo("like")==0)
                okay=false;
            if (token.compareTo("likely")==0)
                okay=false;
            if (token.compareTo("may")==0)
                okay=false;
            if (token.compareTo("me")==0)
                okay=false;
            if (token.compareTo("might")==0)
                okay=false;
            if (token.compareTo("most")==0)
                okay=false;
            if (token.compareTo("must")==0)
                okay=false;
            if (token.compareTo("my")==0)
                okay=false;
            if (token.compareTo("neither")==0)
                okay=false;
            if (token.compareTo("no")==0)
                okay=false;
            if (token.compareTo("nor")==0)
                okay=false;
            if (token.compareTo("not")==0)
                okay=false;
            if (token.compareTo("of")==0)
                okay=false;
            if (token.compareTo("off")==0)
                okay=false;
            if (token.compareTo("often")==0)
                okay=false;
            if (token.compareTo("on")==0)
                okay=false;
            if (token.compareTo("only")==0)
                okay=false;
            if (token.compareTo("or")==0)
                okay=false;
            if (token.compareTo("other")==0)
                okay=false;
            if (token.compareTo("our")==0)
                okay=false;
            if (token.compareTo("own")==0)
                okay=false;
            if (token.compareTo("rather")==0)
                okay=false;
            if (token.compareTo("said")==0)
                okay=false;
            if (token.compareTo("say")==0)
                okay=false;
            if (token.compareTo("says")==0)
                okay=false;
            if (token.compareTo("she")==0)
                okay=false;
            if (token.compareTo("should")==0)
                okay=false;
            if (token.compareTo("since")==0)
                okay=false;
            if (token.compareTo("so")==0)
                okay=false;
            if (token.compareTo("some")==0)
                okay=false;
            if (token.compareTo("than")==0)
                okay=false;
            if (token.compareTo("that")==0)
                okay=false;
            if (token.compareTo("the")==0)
                okay=false;
            if (token.compareTo("their")==0)
                okay=false;
            if (token.compareTo("them")==0)
                okay=false;
            if (token.compareTo("then")==0)
                okay=false;
            if (token.compareTo("there")==0)
                okay=false;
            if (token.compareTo("these")==0)
                okay=false;
            if (token.compareTo("they")==0)
                okay=false;
            if (token.compareTo("this")==0)
                okay=false;
            if (token.compareTo("tis")==0)
                okay=false;
            if (token.compareTo("to")==0)
                okay=false;
            if (token.compareTo("too")==0)
                okay=false;
            if (token.compareTo("twas")==0)
                okay=false;
            if (token.compareTo("us")==0)
                okay=false;
            if (token.compareTo("wants")==0)
                okay=false;
            if (token.compareTo("was")==0)
                okay=false;
            if (token.compareTo("we")==0)
                okay=false;
            if (token.compareTo("were")==0)
                okay=false;
            if (token.compareTo("what")==0)
                okay=false;
            if (token.compareTo("when")==0)
                okay=false;
            if (token.compareTo("where")==0)
                okay=false;
            if (token.compareTo("which")==0)
                okay=false;
            if (token.compareTo("while")==0)
                okay=false;
            if (token.compareTo("who")==0)
                okay=false;
            if (token.compareTo("whom")==0)
                okay=false;
            if (token.compareTo("why")==0)
                okay=false;
            if (token.compareTo("will")==0)
                okay=false;
            if (token.compareTo("with")==0)
                okay=false;
            if (token.compareTo("would")==0)
                okay=false;
            if (token.compareTo("yet")==0)
                okay=false;
            if (token.compareTo("you")==0)
                okay=false;
            if (token.compareTo("your")==0)
                okay=false;
            
            //Stemming process
            if(okay){
                s.add(token.toCharArray(),token.length());
                s.stem();
                token = s.toString();
            }
   
            //to make sure there are no duplicates
            if (tokenList.contains(token))
                okay = false;
            
            //Finalizing tokens
            if (okay)
                tokenList.add(token);
            

        }
        //System.out.println(i);
        System.out.println(tokenList.size());
        System.out.println(tokenList);
        readFile.close();
        
        Scanner readFile2 = new Scanner(new File("sentences.txt"));
        
        
        //intializing TDMatrix
        int[][] tdm = new int[46][tokenList.size()];
        int i = 0;
        int j = 0;
       
        while (i<46){
            j=0;
            while (j < tokenList.size()){
                tdm[i][j]=0;
                j++;
            }
            i++;
        }
        
        String str;
        i=0;
        while (readFile2.hasNextLine()) {
            str=readFile2.nextLine();
            
            j=0;
            while (j<tokenList.size()){
                while ((str.contains(tokenList.get(j)))){
                    tdm[i][j]++;
                    str = str.replaceFirst(tokenList.get(j), "***");
                }
                j++;
            }
            
            i++;
        }
        
        i=0;
        while (i<46){
            j=0;
            while (j<tokenList.size()){
                System.out.print(tdm[i][j] + " ");
                j++;
            }
            System.out.println("");
            i++;
        }
        
        readFile.close();
    }
}
