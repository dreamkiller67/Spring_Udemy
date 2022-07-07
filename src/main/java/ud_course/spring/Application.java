package ud_course.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);

        BinarySearchImpl bs = new BinarySearchImpl();
         int result = bs.BinarySearch(new int[] {12,20,6},3);
         System.out.print(result);
    }

}
