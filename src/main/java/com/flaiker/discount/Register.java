package com.flaiker.discount;

import java.util.Map;

public class Register {
    public static float rabatt(String[][] artikel, Map<Character, Float> rabatt) {
        float applied = 0f;
        for (String[] art : artikel) {
            applied += rabatt.get(art[1].charAt(0)) / 100f * Float.parseFloat(art[2])
                    * Float.parseFloat(art[3]);
        }
        return applied;
    }
}
