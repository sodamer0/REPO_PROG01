public class ValidadorDNI {

  public static boolean validar(int numDni, char letra) {
    // Verificar que el número esté en el rango válido
    if (numDni < 0 || numDni > 99999999) {
      return false;
    }

    int resto = numDni % 23;
    char letraMayus = Character.toUpperCase(letra);

    switch (resto) {
      case 0:  return letraMayus == 'T';
      case 1:  return letraMayus == 'R';
      case 2:  return letraMayus == 'W';
      case 3:  return letraMayus == 'A';
      case 4:  return letraMayus == 'G';
      case 5:  return letraMayus == 'M';
      case 6:  return letraMayus == 'Y';
      case 7:  return letraMayus == 'F';
      case 8:  return letraMayus == 'P';
      case 9:  return letraMayus == 'D';
      case 10: return letraMayus == 'X';
      case 11: return letraMayus == 'B';
      case 12: return letraMayus == 'N';
      case 13: return letraMayus == 'J';
      case 14: return letraMayus == 'Z';
      case 15: return letraMayus == 'S';
      case 16: return letraMayus == 'Q';
      case 17: return letraMayus == 'V';
      case 18: return letraMayus == 'H';
      case 19: return letraMayus == 'L';
      case 20: return letraMayus == 'C';
      case 21: return letraMayus == 'K';
      case 22: return letraMayus == 'E';
      default: return false; // Esto no debería ocurrir si el resto es %23
    }
  }
}