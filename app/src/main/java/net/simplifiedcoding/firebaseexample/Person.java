package net.simplifiedcoding.firebaseexample;

/**
 * Created by Belal on 2/23/2016.
 */
public class Person {

    private String name;
    private String Pic;
    private String op;

    public Person() {

    }

   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  public String getPic() {
        return Pic;
    }

    public void setPic(String address) {
        this.Pic = Pic;
    }

    public void setoption(String text) {this.op = text;}

    public String getoption() {return op;}
}

