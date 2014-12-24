public class ExpandableArray implements List {

  private static final int DEFAULT_SIZE = 10;
  private Integer currentLength, limit;
  private Integer[] intArray;

  public ExpandableArray () {
    this.limit = DEFAULT_SIZE;
    this.currentLength = 0;
    this.intArray = new Integer[this.limit];
  }


  public void add(Integer num){
    if (this.currentLength < this.limit) {
      intArray[this.currentLength] = num;
      this.currentLength += 1;
    } else {

      this.limit = this.limit * 2;
      Integer[] newArr = new Integer[this.limit];

      for (int i = 0; i < this.currentLength; i++){
        newArr[i] = this.intArray[i];
      }

      newArr[this.currentLength] = num;
      this.currentLength += 1;
      this.intArray = newArr;
    }

  }
  public void add(int index, Integer element){}

  public void clear(){
    this.currentLength = 0;
  }
  public boolean contains(Object member){
    for (int i = 0; i < this.currentLength; i++) {
      if (this.intArray[i].equals(member)) {
        return true;
      }
    }
    return false;
  }
  public Integer get(int index){
    if (index < this.currentLength && index > 0) {
      return this.intArray[index];
    }
    return null;
  }
  public Integer indexOf(Object member){
    for (int i = 0; i < this.currentLength; i++) {
      if (this.intArray[i].equals(member)) {
        return i;
      }
    }
    return null;
  }
  public Boolean isEmpty(){
    return this.currentLength.equals(0);
  }
  public Integer remove(Object member){
    Integer index = this.indexOf(member);
    return this.remove(index);
  }
  public Integer remove(int index){
    Integer num = this.get(index);
    for (int i = index; i < this.currentLength - 1; i++){
      this.intArray[i] = this.intArray[i + 1];
    }
    this.currentLength -= 1;
    return num;
  }
  public Integer size(){return null;}

}
