public class StringManipulator {

  public String trimAndConcat(String a, String b) {
    return a.trim() + b.trim();
  }

  public Integer getIndexOrNull(String a, char b) {
    int index = a.indexOf(b);
    if (index < 0) {
      return null;
    } else {
      return index;
    }
  }

  public Integer getIndexOrNull(String a, String b) {
    int index = a.indexOf(b);
    if (index < 0) {
      return null;
    } else {
      return index;
    }
  }

  public String concatSubstring(String a, int b, int c, String d) {
    return a.substring(b,c)+ d;
  }
}
