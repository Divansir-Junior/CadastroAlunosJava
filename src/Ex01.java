import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("LISTAS ");
        
        int n = sc.nextInt();
        List <String> list = new ArrayList<>();
        
        for(int i = 1 ; i <= n ; i++) {
        	System.out.print("Digite o #" +i + " Nome:");
        	String add = sc.next();
        	
        	System.out.print("ID : ");
        	String id = sc.next();
        	
        	System.out.print("Salary:");
        	String salario = sc.next();
        	
        	list.add(add);
        	list.add(id);
        	list.add(salario);
        	
        }
        
        System.out.println("EMPLOYER:" + list);
        
        System.out.println("--------------------");
        System.out.println("LISTA:");
        for (String x :  list) {
        	System.out.println(x);
        }
        
        List <String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
        	System.out.println(x);
        }
        
        System.out.println("--------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
        System.out.println(name);
        
        
            
        
     
        
        
        
        
        
        
    }

    
}
