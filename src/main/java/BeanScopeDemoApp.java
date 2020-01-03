import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        //retreive bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        //check if they are same
        boolean result = (theCoach == alphaCoach);

        //print out the result
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location to theCoach: " + theCoach);
        System.out.println("\nMemory location to alphaCoach " + alphaCoach);

        //close the cotext
        context.close();
    }
}
