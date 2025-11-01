package san.TESTSPI.Shooter;

public class Main {
  public static void main(String[] args) {

  }

  public static int getDamage (int speed, int armor, int distance){

    int damage = 0; // Inicializa el daño
    // CASO 1: Disparo cercano (≤ 3 metros)
    // A corta distancia, el impacto ignora completamente la armadura
    if (distance <= 3) {
      damage = speed / 10;
    }
    // CASO 2: Bala rápida (> 500 m/s) a distancia media (< 20 metros)
    // La velocidad alta hace que penetre la armadura
    else if (distance < 20 && speed > 500) {
      damage = speed / 10;
    }
    // CASO 3: Bala rápida (> 500 m/s) a distancia larga (> 20 metros)
    // A mayor distancia, la armadura empieza a proteger
    else if (distance > 20 && speed > 500) {
      damage = (speed / 10) - armor;
    }
    // CASO 4: Todos los demás casos
    // Bala lenta o distancias intermedias: aplica fórmula completa
    // La distancia adicional aumenta el daño (energía cinética acumulada)
    else {
      damage = (speed / 10) - (armor + (distance / 10));
    }

    // PROTECCIÓN CONTRA DAÑO NEGATIVO:
    // Si la armadura es muy alta, el daño podría ser negativo
    // En ese caso, devolvemos 0 (sin daño)
    if (damage < 0) {
      return 0;
    }
    return damage;
  }

  public static boolean isDeadByBodyShot (int life, int damage){
  /*
    if ((life - damage) <=0) {
      return true;
    }
   */
    return (life - damage) <= 0;
  }

  public static int getNumObjects (boolean[][] map){

    int localizador = 0;
    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map[0].length; j++) {
        if (map[i][j]) {
          localizador++;
        }
      }
    }
    return localizador;
  }

  public static boolean isHit (boolean [][] screen, int y, int x){

    for (int i = 0; i < screen.length; i++) {
      for (int j = 0; j < screen[0].length; j++) {
        if (screen[y][x]) {
          return true;
        }
      }
    }
    return false;
  }

  public static boolean isHeadShot (boolean [][] screen, int y, int x){

    boolean [][] enemyMatrix = new boolean[5][3];
    for (int t = 0; t < 5; t++) {
      for (int j = 0; j < 3; j++) {
        enemyMatrix[t][j] = true;
      }

    for (int i = 0; i <= screen.length - 5; i++) {
      for (int j = 0; j <= screen[0].length - 3; j++) {
        if (screen[i][j])

        }
        }
      }
    }

    return false;
  }

  public static int[] getEnemyPosition (boolean[][] screen){
    return new int[]{0, 0};
  }

}
