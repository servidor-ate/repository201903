package pe.royalsystems.springerp.erpspringsalud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages={"pe.royalsystems.springerp"})
@EnableConfigurationProperties
@EnableScheduling
@EnableCaching
public class ErpSpringSaludApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErpSpringSaludApplication.class, args);
	}
}


