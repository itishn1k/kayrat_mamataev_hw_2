import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println(ageAndTemperature( 18,25));
        System.out.println(ageAndTemperature( 60,-40));
        System.out.println(ageAndTemperature( 60,-40));
        System.out.println(ageAndTemperature( 8,-5));
        System.out.println(ageAndTemperature( 13,10));
        System.out.println("дз на сообразительность");
        System.out.println(ageAndTemperature(getRandomNumber(), 90));
    }
    public static String ageAndTemperature (int age, int temperature) {
        String a = String.valueOf(age) + ": лет, "; // String.valueOf помогает отобразить значение переменной
        String t = String.valueOf(temperature) + ": грудусов температура, это значит-";//так же вывод доп информации

        if (age>=20 && age<=45 && temperature>=-20 && temperature>=30){
           return a + t + canGo();
        }
        else if (age<20&&temperature>=0&&temperature<=28){
          return a + t +  canGo();
        }
        else if (age>45&&temperature<=-10&&temperature<=25){
          return  a + t + canGo();
        }
        else return a + t + stayHome();
    }
    public static String canGo(){return " Можно идти гулять. ";}
  public static String stayHome(){return " Оставайтесь дома. ";}

    public static int getRandomNumber(){
    Random random = new Random();//переменная рандомного значения
            int x = random.nextInt(100);//bound диапазон от 0 до 100
        return x;
    }

}