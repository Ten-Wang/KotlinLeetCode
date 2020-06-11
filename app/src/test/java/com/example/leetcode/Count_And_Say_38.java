package com.example.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Count_And_Say_38 {
    StringBuilder[] records = new StringBuilder[31];
    public String countAndSay(int n) {
        if (n == 1) {
            records[1] = new StringBuilder("1");
            return "1";
        }
        StringBuilder temp;
        if (records[n - 1] == null) {
            temp = new StringBuilder(countAndSay(n - 1));
        } else {
            temp = records[n - 1];
        }
        char num = temp.charAt(0);
        int count = 1;
        StringBuilder result = new StringBuilder("");
        for (int i = 1; i < temp.length(); i++) {
            if (temp.charAt(i) == num) {
                count++; // some number
            } else {
                result.append(count).append(num);
                num = temp.charAt(i);
                count = 1;
            }
        }
        result.append(count).append(num);
        records[n] = result;
        return result.toString();
    }

//1.     1
//2.     11
//3.     21
//4.     1211
//5.     111221
    @Test
    public void exam1() {
        assertEquals(countAndSay(1), "1");
        assertEquals(countAndSay(2), "11");
        assertEquals(countAndSay(3), "21");
        assertEquals(countAndSay(4), "1211");
        assertEquals(countAndSay(5), "111221");
        assertEquals(countAndSay(23), "111312211312111322212321121113121112131112132112311321322112111312212321121113122112131112131221121321132132211231131122211331121321232221121113122113121113222123112221221321132132211231131122211331121321232221123113112221131112311332111213122112311311123112112322211211131221131211132221232112111312211322111312211213211312111322211231131122111213122112311311221132211221121332211213211321322113311213212312311211131122211213211331121321123123211231131122211211131221131112311332211213211321223112111311222112132113213221123123211231132132211231131122211311123113322112111312211312111322212321121113122123211231131122113221123113221113122112132113213211121332212311322113212221");
    }
}
