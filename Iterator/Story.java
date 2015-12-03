public class Story implements  Aggregate {
    private  Sentence[] sentences ;
    private  int last = 0;

    public Story(int max) {
        this.sentences = new Sentence[max];
    }

    @Override
    public Iterator iterator() {
        return new SentenceIterator(this);
    }
    public Sentence getSentenceAt(int index){
        return sentences[index];
    }
    public  void appendSentence(Sentence sentence){
        sentences[last] = sentence;
        last++;
    }
    public int getLength(){
        return  last;
    }
}
