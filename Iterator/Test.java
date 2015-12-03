import java.io.*;

public class Test {
    public static void main(String[] args) {
        Story story = new Story(10);
        try {
            BufferedReader  reader = new BufferedReader(new FileReader(new File(".\\out\\production\\untitled\\input.txt")));
            String str;
            while ((str=reader.readLine()) != null){
                story.appendSentence(new Sentence(str));
            }
            reader.close();
        } catch (FileNotFoundException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }

        int  line_number =0;

        Iterator iterator = story.iterator();
        while (iterator.hasNext()){
            Sentence sentence = (Sentence) iterator.next();
            System.out.print(String.format("%02d", ++line_number) + "  ");
            System.out.println(sentence.getText());
        }
    }
}
