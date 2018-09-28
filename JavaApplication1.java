package main;

import numeric.komplex;
import office.id_card;

/**
 * Our first Java application.
 *
 * @author hallgato
 */
public class JavaApplication1 {

  /**
   * @param args
   *   The command line arguments.
   */
  public static void main(String[] args) {

    komplex a = new komplex();
    System.out.println("a = " + a);

    komplex b = new komplex(22.0);
    System.out.println("b = " + b);

    komplex c = new komplex(22.0, 33.0);
    c.real(44.0);
    System.out.println("c = " + c);

    komplex d = new komplex(c);
    System.out.println("d = " + d);

    //id_card card = new id_card();
    //System.out.println(card);
  }

}
