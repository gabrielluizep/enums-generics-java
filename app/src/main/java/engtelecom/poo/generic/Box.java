package engtelecom.poo.generic;

public class Box<T> {
  private T data;

  public void set(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

}
