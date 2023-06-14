package study.java.self.app;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapApp {
    public static enum Level{
        FREE, PREMIUM, VIP
    }

    public static void main(String[] args) {
        Map<Level, String> map = new EnumMap<>(Level.class);

        map.put(Level.FREE, "Welcome in Free Mode");
        map.put(Level.PREMIUM, "Welcome in Premium Mode");
        map.put(Level.VIP, "Welcome in VIP Mode");

        for(var key : map.keySet()){
            System.out.println(map.get(key));
        }
    }
}
