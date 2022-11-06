public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<String, String> myHashMap = new MyHashMap<>();
        myHashMap.put("Ukraine", "Kyiv");
        myHashMap.put("Germany", "Berlin");
        myHashMap.put("Poland", "Warsaw");
        myHashMap.put("Czech Republic", "Prague");
        myHashMap.put("putin", "huilo");

        System.out.println("My HashMapList: " + myHashMap);

        System.out.println("My HashMap Size = " + myHashMap.size());

        System.out.println("Key = Ukraine , Value = " + myHashMap.get("Ukraine"));
        System.out.println("Key = putin , Value = " + myHashMap.get("putin"));

        myHashMap.remove("putin");
        System.out.println("My HashMap after remove putin = " + myHashMap);

        myHashMap.clear();
        System.out.println("My HashMap after cleaning = " + myHashMap);
    }
}
