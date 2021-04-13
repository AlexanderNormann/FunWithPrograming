package animal;

public class Animal {
  private String name;
  private int nrOfLegs;
  private boolean isMammal;

  public  Animal (String name, int nrOfLegs, boolean isMammal){
    this.name = name;
    this.nrOfLegs = nrOfLegs;
    this.isMammal = isMammal;
  }

  public void makeSound(){

  }
  public String toString(){

    return "navn: " + name + " antal ben: " + nrOfLegs + " er et pattedyr: "+ isMammal;
  }
  }

