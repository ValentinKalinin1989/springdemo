import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(alphaCoach.getDailyWorkout());

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
