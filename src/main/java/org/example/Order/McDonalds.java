package org.example.Order;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class McDonalds {
    Map<String,Item> menu = new HashMap<>();

    public McDonalds() {
        File file = new File("mcdonalds.txt");
        FileReader fr;
            try {
                fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String line = br.readLine();
                while (line!=null){
                    String[] token = line.split(",");
                    Item item = new Item(token[0],
                            token[1],
                            Integer.parseInt(token[2]),
                            Integer.parseInt(token[3])
                    );
                    menu.put(item.id,item);
                    line = br.readLine();
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

    }
    public void showMenu(){
        //把menu的資料都先拿出來
        Set<Map.Entry<String, Item>> entries = menu.entrySet();
        for (Map.Entry<String, Item> entry : entries) {
            System.out.println(entry.getValue());
        }

    }


    public static void main(String[] args) {
        McDonalds mcDonalds = new McDonalds();
        mcDonalds.showMenu();
    }
}

class Item {
    String id;
    String name;
    int calories;

    @Override
    public String toString() {
        return id + "," + name + "," + calories + "," + price;
    }

    int price;

    public Item(String id, String name, int calories, int price) {
        this.id = id;
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}