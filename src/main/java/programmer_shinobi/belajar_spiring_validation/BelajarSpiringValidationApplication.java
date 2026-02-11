package programmer_shinobi.belajar_spiring_validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import programmer_shinobi.belajar_spiring_validation.properties.DatabaseProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		DatabaseProperties.class
})
public class BelajarSpiringValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelajarSpiringValidationApplication.class, args);
	}

}
