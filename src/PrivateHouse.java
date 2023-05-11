public class PrivateHouse extends House {

  /*
  Создайте классы "Частный дом" и "Многоквартирный дом" - наследники класса "Дом".
  В методе toString() выводите в удобном виде всю известную информацию о доме.

   */
  public PrivateHouse(String address) {
    super(address);
  }

  @Override
  public String toString() {
    return "This is private house with address: " + getAddress();
  }

  @Override
  public String destruct() {
    return "You demolished a private house";
  }
}
