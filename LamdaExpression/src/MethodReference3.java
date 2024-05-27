
import java.util.function.BiFunction;  
class Arithmetic{  
public static int add(int a, int b){  
return a+b;  
} 

public static float add(int a, float b){  
return a+b;  
}  
public static float add(float a, float b){  
return a+b;  
}  
}  
public class MethodReference3 {  
public static void main(String[] args) {  
BiFunction<Integer, Integer, Integer>adder = Arithmetic::add; 
//BiFunction<Integer, Integer, Integer>adder = new Arithmetic()::add; 
BiFunction<Integer, Float, Float>adder2 = Arithmetic::add;  
BiFunction<Float, Float, Float>adder3 = Arithmetic::add;  
int result = adder.apply(10, 20);  
float result2 = adder2.apply(10, 20.0f);  
float result3 = adder3.apply(10.0f, 20.0f); 
System.out.println(result);  
System.out.println(result2);  
System.out.println(result3);  
}  
}  