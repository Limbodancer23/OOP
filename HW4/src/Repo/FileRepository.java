package Repo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class  FileRepository <K,V> {
    List list;
    private String name;

    public FileRepository(){
        this.name = this.getClass().getSimpleName() + ".txt";
        this.list = new ArrayList<>();
    }

    public void addToFile(K id, V value){
        try {
            FileWriter fw = new FileWriter(name, false);
            Map<K, V> map1 = new HashMap<>();
            map1.put(id, value);
            list.add(map1);
            fw.write(list.toString());
            fw.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void updateValue(K id,V value){
        try {
            BufferedReader fr = new BufferedReader(new FileReader(name));
            StringBuilder sb = new StringBuilder();
            Map<K,V> map = new HashMap<>();
            list.clear();
            String line;
            while ((line = fr.readLine()) != null){sb.append(line);}
            String str = sb.substring(1,sb.length()-1);
            for (String st: str.split(", ")) {
                if (st.contains(id.toString()+ "=")) continue;
                map.put(id, value);
                list.add(map);
                list.add(st);
            }
            fr.close();
            FileWriter fw = new FileWriter(name, false);
            fw.write(list.toString());
            fw.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void removeValue(K id){
        try {
            BufferedReader fr = new BufferedReader(new FileReader(name));
            StringBuilder sb = new StringBuilder();
            list.clear();
            String line;
            while ((line = fr.readLine()) != null){sb.append(line);}
            String str = sb.substring(1,sb.length()-1);
            for (String st: str.split(", "))
            {if (st.contains(id.toString()+ "=")) continue;
                list.add(st);
            }
            fr.close();
            FileWriter fw = new FileWriter(name, false);
            fw.write(list.toString());
            fw.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void getValue(K id){
        try {
            BufferedReader fr = new BufferedReader(new FileReader(name));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = fr.readLine()) != null){sb.append(line);}
            String str = sb.substring(1,sb.length()-1);
            for (String st: str.split(", ")) {
                if (st.contains(id.toString()+ "=")) {
                    String a = st.substring(1,st.length()-1);
                    for (String el: a.split("=")){
                        if (!Objects.equals(el, id.toString())) System.out.println(el);
                    }
                }
                fr.close();
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void put(K id, V value){
        Map<K, V> map = new HashMap<>();
        map.put(id, value);
        list.add(map);
    }

    @Override
    public String toString() {
        return "FileRepository{" +
                "list=" + list +
                ", name='" + name + '\'' +
                '}';
    }
}
