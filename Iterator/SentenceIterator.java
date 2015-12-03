public class SentenceIterator implements  Iterator {
    private  Story story;
    private  int index;

    public SentenceIterator(Story story) {
        this.story = story;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < story.getLength()){
            return  true;
        }else{
            return false;
        }
    }

    @Override
    public Object next() {
        return story.getSentenceAt(index++);
    }
}
