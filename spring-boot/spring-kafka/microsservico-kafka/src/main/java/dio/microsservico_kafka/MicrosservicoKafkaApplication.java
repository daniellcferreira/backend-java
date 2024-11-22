package dio.microsservico_kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class MicrosservicoKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrosservicoKafkaApplication.class, args);
	}

}
