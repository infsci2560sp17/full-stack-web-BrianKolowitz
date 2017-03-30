package edu.infsci2560;

import edu.infsci2560.models.Customer;
import edu.infsci2560.models.Dvd;
import edu.infsci2560.models.Dvd.WorkoutType;
import edu.infsci2560.models.Rating;
import edu.infsci2560.models.RatingPk;
import edu.infsci2560.repositories.CustomerRepository;
import edu.infsci2560.repositories.DvdRepository;
import edu.infsci2560.repositories.RatingRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"edu.infsci2560.storage"})
@ComponentScan({"edu.infsci2560"})
public class FullStackWebApplication {

    private static final Logger log = LoggerFactory.getLogger(FullStackWebApplication.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(FullStackWebApplication.class, args);

        DvdRepository dvdRepo = ctx.getBean(DvdRepository.class);
        dvdRepo.save(new Dvd(1L, "P90X", WorkoutType.CrossTrain));
        dvdRepo.save(new Dvd(2L, "Insanity", WorkoutType.Cardio));
        dvdRepo.save(new Dvd(3L, "Body Beast", WorkoutType.Strength));
        
        CustomerRepository customerRepo = ctx.getBean(CustomerRepository.class);
        customerRepo.save(new Customer(1L, "Bill", "Smith"));
        customerRepo.save(new Customer(2L, "Jane", "Doe"));
        customerRepo.save(new Customer(3L, "Dr", "K"));
        
        RatingRepository ratingRepo = ctx.getBean(RatingRepository.class);
        ratingRepo.save(new Rating(new RatingPk(1L, 1L), 3));
        ratingRepo.save(new Rating(new RatingPk(2L, 1L), 2));
        ratingRepo.save(new Rating(new RatingPk(1L, 2L), 4));
    }


//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//
//        };
//    }
//    @Bean
//    public CommandLineRunner databaseDemo(CustomerRepository repository) {
//        return (args) -> {
//            // save a couple of customers
//            repository.save(new Customer("Jack", "Bauer"));
//            repository.save(new Customer("Chloe", "O'Brian"));
//            repository.save(new Customer("Kim", "Bauer"));
//            repository.save(new Customer("David", "Palmer"));
//            repository.save(new Customer("Michelle", "Dessler"));
//            repository.save(new Customer("Billy", "Bean"));
//
//            // fetch all customers
//            log.info("[Database Demo] Customers found with findAll():");
//            log.info("[Database Demo] -------------------------------");
//            for (Customer customer : repository.findAll()) {
//                log.info("[Database Demo] " + customer.toString());
//            }
//            log.info("");
//
//            // fetch an individual customer by ID
//            Customer customer = repository.findOne(1L);
//            log.info("[Database Demo] Customer found with findOne(1L):");
//            log.info("[Database Demo] --------------------------------");
//            log.info("[Database Demo] " + customer.toString());
//
//            // fetch customers by last name
//            log.info("[Database Demo] Customer found with findByLastName('Bauer'):");
//            log.info("[Database Demo] --------------------------------------------");
//            for (Customer bauer : repository.findByLastName("Bauer")) {
//                log.info("[Database Demo] " + bauer.toString());
//            }
//        };
//    }
}
