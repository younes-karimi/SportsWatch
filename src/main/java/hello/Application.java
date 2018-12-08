package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class Application {

    @Autowired
    private TeamRepository teamRepository;


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    public void run(String... args) {

        List<Team> teams =  new ArrayList<>();

        teams.add(new Team("Washington Wizards", "WAS"));
        teams.add(new Team("Miami Heat", "MIA"));
        teams.add(new Team("Los Angeles Clippers", "LAC"));

        teamRepository.saveAll(teams);
    }
}