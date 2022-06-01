package animalshelter;

public class Animal {
  private String type;
  private String name;

  public Animal(String type, String name) {
    this.type = type;
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public String getName() {
    return name;
  }
}
