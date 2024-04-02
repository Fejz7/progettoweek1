import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Menu menu = context.getBean(Menu.class);

        
        for (MenuItem item : menu.getItems()) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }
    }
}
