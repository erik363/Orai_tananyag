package numeric;

/**
 *
 * @author hallgato
 */
public class komplex {

  private static int N;

  private double re;
  private double im;

  /**
   * Empty constructor.
   */
  public komplex() {
    N++;
    re = 0;
    im = 0;
  }

  /**
   * Constructor which makes a komplex from a double number.
   *
   * @param r
   *   real part
   */
  public komplex(double r) {
      N++;
      re = r;
      im = 0;
    }

  /**
   * Constructor which makes a komplex from two double numbers.
   *
   * @param r
   *   real part
   * @param i
   *   imaginary part
   */
  public komplex(double r, double i) {
    N++;
    re = r;
    im = i;
  }

  /**
   * Copy constructor.
   *
   * @param z
   *   an existing komplex object
   */
  public komplex(komplex z) {
    N++;
    re = z.re;
    im = z.im;
  }

  /**
   * Print a komplex to the standard output.
   */
  public void print() {
    System.out.println(re + " " + im);
  }

  /**
   * Convert a komplex to a String.
   */
  @Override
  public String toString() {
    return re + " " + im;
  }

  /**
   * Getter method for the real part.
   *
   * @return
   *   The real part of the komplex object.
   */
  public double real() {
    return re;
  }

  /**
   * Getter method for the imaginary part.
   *
   * @return
   *   The imaginary part of the komplex object.
   */
  public double imag() {
    return im;
  }

  /**
   * Setter method for the real part.
   *
   * @param
   *   The new real part of the komplex object.
   */
  public void real(double r) {
    re = r;
  }

  /**
   * Setter method for the imaginary part.
   *
   * @param
   *   The new imaginary part of the komplex object.
   */
  public void imag(double i) {
    im = i;
  }

  /**
   * Number of komplex objects created.
   *
   * @return
   *   The number of komplex objects created so far.
   */
  public static int count() {
    return N;
  }
}
