public class ApartmentHouse extends House {

  /*
  Создайте классы "Частный дом" и "Многоквартирный дом" - наследники класса "Дом".
  В методе toString() выводите в удобном виде всю известную информацию о доме.
  При создании многоквартирного дома дополнительно принимайте в конструкторе
  целое число - количество подъездов.
   */
  private int numberOfEntrances;

  public ApartmentHouse(String address, int numberOfEntrance) {
    super(address);
    this.numberOfEntrances = numberOfEntrance;
  }

  public void setNumberOfEntrances(int numberOfEntrances) {
    this.numberOfEntrances = numberOfEntrances;
  }

  public int getNumberOfEntrances() {
    return numberOfEntrances;
  }

  @Override
  public String toString() {
    return "This is private house with address: " + getAddress()+" with "+getNumberOfEntrances()+
        "entrances";
  }
}
