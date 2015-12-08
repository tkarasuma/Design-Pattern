import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Memento[] save_data = new Memento[100];
        Player player = new Player(0);
        System.out.println(String.format("セーブデータ %2d番", 0)+ player);
        save_data[0] =  player.createMemento();
        for (int i = 1; i < 100; i++) {

            player.play();
            save_data[i] =  player.createMemento();
            System.out.println(String.format("セーブデータ %2d番", i)+ player);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }

        while(true){
            String select = selectData();
            if (select.toUpperCase().equals("EXIT")){
                System.out.println("Thank you for playing !!");
                System.exit(0);
            }else{
                int num = Integer.parseInt(select);
                if (num>=0 && num <100){
                    player.restoreMemento(save_data[num]);
                    System.out.println("ロードデータ "+String.format("%2d番", num)+ player);
                }
            }
        }
    }
    public  static String selectData(){
        System.out.println("0から99までのセーブデータ番号か、exit を入力してください。");
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

}
