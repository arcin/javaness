public class ExpandableArray implements List {

  private static final int DEFAULT_SIZE = 10;
  private Integer currentLength, limit;
  private Integer[] intArray;

  public ExpandableArray () {
    this.limit = DEFAULT_SIZE;
    this.currentLength = 0;
    this.intArray = new Integer[limit];
  }


  public void add(Integer num){}
  public void add(int index, Integer element){}
  public void clear(){}
  public Boolean contains(Object member){return null;}
  public Integer get(int index){return null;}
  public Integer indexOf(Object member){return null;}
  public Boolean isEmpty(){return null;}
  public Integer remove(Object member){return null;}
  public Integer remove(int Index){return null;}
  public Integer size(){return null;}

}
