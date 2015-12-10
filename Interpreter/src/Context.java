import java.util.*;

public class Context {
    private Iterator<String> iterator;
    private String currentToken;
    public Context(String str) {
        List<String> list = Arrays.asList(str.split("[\\s]+"));
        iterator = list.iterator();
        next();
    }
    public String next() {
        if (iterator.hasNext()) {
            currentToken = iterator.next();
        } else {
            currentToken = null;
        }
        return currentToken;
    }
    public String current(){
        return currentToken;
    }
    public void skip(String token) throws ParseException {
        if (!token.equals(currentToken)) {
            throw new ParseException("ParseException: " + token + " を期待しましたが、" + currentToken + "が見つかりました。");
        }
        next();
    }
    public int getCount() throws ParseException {
        int count;
        try {
            count = Integer.parseInt(currentToken);
        } catch (NumberFormatException e) {
            throw new ParseException("ParseException: 整数ではありません。\n" + e);
        }
        return count;
    }
}
