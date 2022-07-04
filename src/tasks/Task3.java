package tasks;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
        public static String getEncryption(String str){
            Map<Character, Character> map = new HashMap<>();
            map.put('a','t');
            map.put('b','c');
            map.put('c','d');
            map.put('d','o');
            map.put('e','p');
            map.put('f','y');
            map.put('g','z');
            map.put('h','e');
            map.put('i','h');
            map.put('j','o');
            map.put('k','p');
            map.put('l','a');
            map.put('m','b');
            map.put('n','k');
            map.put('o','l');
            map.put('p','i');
            map.put('q','j');
            map.put('r','s');
            map.put('s','t');
            map.put('t','e');
            map.put('u','f');
            map.put('v','o');
            map.put('w','p');
            map.put('x','i');
            map.put('y','j');
            map.put('z','s');
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<str.length(); i++){
                sb.append(map.get(str.charAt(i)));
            }
            return sb.toString();
        }
}
