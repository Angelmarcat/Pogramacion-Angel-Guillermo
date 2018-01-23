/***************************************************************
****Angel Guillermo  Martinez Cruz******************************
****TempertureConverter.java************************************
****This pogram conver's from fahrenheit to Celcius.************
***************************************************************/
public class TempertureConverter{
  public static void main(String[]args){
    final double FREEZING_POINT=32.0;
    final double CONVERSION_FACTOR=5.0/9.0;
    double fahrenheit=50;
    double Celcius=0;
    Celcius=CONVERSION_FACTOR*(fahrenheit-FREEZING_POINT);
    System.out.println(fahrenheit+ "de grees fahrenheit= "+Celcius +"degrees Celcius");
  }//end main
}//end TempertureConverter
  
