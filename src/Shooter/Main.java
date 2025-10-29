package src.Shooter;

public class Main {
  public static void main(String[] args) {

  }

  public static int getDamage (int speed, int armor, int distance){

    int damage = 0;

    damage = (speed / 10) - armor + (distance / 10);

    if (distance <= 3) {
      damage = speed / 10;
    } else if (distance > 3 && distance < 20) {
      damage = speed / 10;
    } else if (speed > 500 && distance > 20) {
      damage = ( speed / 10) - armor;
    } else {
      damage = (speed / 10) - armor + (distance / 10);
    }

    if (damage < 0) {
      return 0;
    }

    return damage;
  }

  public static boolean isDeadByBodyShot (int life, int damage){
    return false;
  }

  public static int getNumObjects (boolean[][] map){
    return 0;
  }

  public static boolean isHit (boolean [][] screen, int y, int x){
    return false;
  }

  public static boolean isHeadShot (boolean [][] screen, int y, int x){
    return false;
  }

  public static int[] getEnemyPosition (boolean[][] screen){
    return new int[]{0, 0};
  }

}
