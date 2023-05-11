public abstract class House {

  /*
      В качестве аргумента конструктора принимайте адрес.
      Напишите для адреса сеттер и геттер.
   */
  private String address;

  public House(String address) {
    this.address = address;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public abstract String destruct();

  @Override
  public abstract String toString();
}
