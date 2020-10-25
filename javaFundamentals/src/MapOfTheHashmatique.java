import java.util.HashMap;
import java.util.Set;

public class MapOfTheHashmatique {

  public void retriveSongData() {
    HashMap<String, String> trackList = new HashMap<String, String>();
    trackList.put(
      "Bah Bah Blacksheep",
      "bah bah blacksheep have you any wool,yes sir yes sir three bags full"
    );
    trackList.put(
      "The Itsy Bitsy Spider",
      "the itsy bitsy spider went up the water spout"
    );
    trackList.put(
      "Do You Know the Muffin Man",
      "do you know the muffin man, the muffin man, the muffin man"
    );
    trackList.put(
      "Mary Had a Little Lamb",
      "Mary had a little lamb, whose fleece was white as snow."
    );

    String single = trackList.get("Bah Bah Blacksheep");
    System.out.println(single);

    Set<String> keys = trackList.keySet();
    for (String key : keys) {
      System.out.println(key);
      System.out.println(trackList.get(key));
    }
  }
}
