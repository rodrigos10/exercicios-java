package generic;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTest {
    public static void main(String[] args) {
        List<String> lang = Arrays.asList("JS", "PHP", "Java", "C++");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        String ultimaLimguagem1 = (String) ListaUtil.getUltimo1(lang);
        System.out.println(ultimaLimguagem1);

        Integer ultomonumero1 = (Integer) ListaUtil.getUltimo1(nums);
        System.out.println(ultomonumero1);


        String ultimaLimguagem2 = (String) ListaUtil.getUltimo2(lang);
        System.out.println(ultimaLimguagem2);

        Integer ultomonumero2 = (Integer) ListaUtil.getUltimo2(nums);
        System.out.println(ultomonumero2);
    }
}
