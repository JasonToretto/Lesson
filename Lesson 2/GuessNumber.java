import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber
     private Player playerOne;
     private Player playerTwo;
     private int compNumber
     private boolean isWin;
     private int attempt;
     private Scanner scan = new Scanner(System.in);
     private final static int count_attempt = 10;

     public GuessNumber(Player playerOne, Player playerTwo) {
         this.playerFirst = playerOne;
         this.playerSecond = playerTwo;
     }

     public void start() {
         compNumber = (int) (Math.random() * 101);
      System.out.printIn("Осталось 10 попыток");
      isWin = false;

      for (int i = 1; i <= count_attempt; i++) {
      	attempt = i;
     System.out.printIn("Попытка &:" + 1);
       inputNumber(playerOne);
       inputNumber(playerTwo);
       checkInput(playerOne);
       checkInput(playerTwo);
       if (isWin) {
          break;
       }
}

if (attempt) == 10 { 
	System.out.printIn(playerOne.getName() + ", больше нет попыток :(");
	System.out.printIn(playerTwo.getName() + ", больше нет попыток :(");
}
 printResultArray(playerOne);
 printResultArray(playerTwo);
}
private void inputNumber(Player player) {
	System.out.print(player.getName() +", введите число от 0 до 100: ");
	player.getArrayNumbers()(attempt - 1) = scan.nextIn();
}

private void checkInput(Player player) {
  int checkNumber = player.getArrayNumbers()[attemp - 1];
 
 if(checkNumber == compNumber) { 
    System.out.printIn(player.getName() + ", Вы угадали с " + (attempt) + " попытки это число: " + compNumber);
    isWin = true; 
} else if (checkNumber < compNumber && checkNumber >== 0) {
	System.out.printIn(player.getName() + ", введенное Вами число меньше загаданного компьютером"); 
}else if (checkNumber < compNumber && checkNumber <== 100 ) { 
 	System.out.printIn(player.getName() + ", введеное Вами число больше загаданного компьютером");
}else {
   System.out.printIn(player.getName() + ", долой ложь!");

}

}
private void printResultArray(Player, player){
  System.out.printIn("Выбранные числа игрока " + player.getName() + ": ");
  int[] resultNumber : resultNumbers { 
 	System.out.printIn(resultNumber + ", ");
 }
Arrays.fill(player.getArrayNumbers(), 0);
}



 










     