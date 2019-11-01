/*
this is the coin class
it is the blueprint for the coin
*/
public class Coin{
  //declares the attributes of a coin(instance variables)
  private int face;

  private final int HEADS = 0; //constants defining heads and tails
  private final int TAILS = 1;
/*
  The coin construtor that defnines when the coing object is made.
  When a new coin is made it is flipped
*/
  public Coin(){
    flip();
  }
//this is the portion of the code where you define behaivores of the coin

/*
The accessor method for the face variable (A getter)

*/
public int getFace(){
  return face;
}
//theis mutator/modifier method for the face variable (a setter)

public void setFace(int newFace){
face = newFace;
}

//this method randomly chooses a face for the coin to have
  public void flip(){

    face = (int) (math.Random()*2);

  }
  public boolean isHeads(){
    return face = 0;
  }
//prints out information about the current state of the coin
  public String toString(){
    String result = "";
    if (face == HEADS){
      result = "HEADS";
    } else{
      result = "TAILS";
    }
    return result;
  }


}
