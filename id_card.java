package office;

import java.time.LocalDate;

/**
 *
 * @author hallgato
 */
public class id_card {

  private static int serial = 0;    // last issued serial number

  private int       id_card_number; // 0 means an invalid/empty document, >=1 is valid
  private String    owner_name;     // owner name (UTF8 encoding)
  private LocalDate date_of_birth;  // owner date of birth (format: YYYY-MM-DD)
  private LocalDate valid_from;     // validity starts on this day (format: YYYY-MM-DD)
  private LocalDate valid_until;    // document is valid until the end of this day (format: YYYY-MM-DD)
  private int       issuer_id;      // issuer office id

  /**
   * The empty constructor.
   *
   * This constructor is intentionally made private to prevent creating an
   * id_card without a name and birth date.
   */
  private id_card() {
  }

  /**
   * Constructor with owner name and birth date.
   *
   * @param name
   *   ID card owner's name
   * @param birthdate
   *   ID card owner's date of birth
   */
  public id_card(String name, LocalDate birthdate) {
  }

  /**
   * Convert an id_card object to a String.
   */
  @Override
  public String toString() {
    return "valami";   
  }
}
