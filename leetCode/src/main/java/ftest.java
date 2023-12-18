import java.util.Arrays;
import java.util.List;

/**
 * @author Shiwen Li CN116237626
 * @create 2022-03-10 10:30
 * @note
 */
public class ftest {
 public static void main(String[] args) {

  List<String> names = Arrays.asList("Tianjin City", "Hainan Province", "Zhejiang Province", "Ningxia", "Gansu Province",
          "Hunan Province", "Shaanxi Province", "Beijing City", "Fujian Province", "Guangxi", "Xinjiang",
          "Jilin Province", "Guangdong Province", "Guizhou Province", "Jiangsu Province", "Chongqing City",
          "Yunnan Province", "Liaoning Province", "Nei Monggol", "Shanxi Province", "Henan Province", "Tibet",
          "Hubei Province", "Anhui Province", "Hong Kong", "Qinghai Province", "Heilongjiang Province", "Shanghai City",
          "Hebei Province", "Jiangxi Province", "Sichuan Province", "Shandong Province");

  System.out.println(names.size());

  names.forEach(System.out::print);

  System.out.println();
  names.stream().map(s -> {
   int provinceIndex = s.indexOf(" Province");
   if (provinceIndex > 0) {
    s = s.substring(0, provinceIndex - 1);
   } else {
    int cityIndex = s.indexOf(" City");
    if (cityIndex > 0 ){
     s = s.substring(0, cityIndex-1);
    }
   }
   return s;
  }).forEach(System.out::print);



 }

}
