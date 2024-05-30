package springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.google.gson.Gson;

import springboot.app.ConversorJson;


@SpringBootApplication
public class BeansComponentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeansComponentsApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(ConversorJson conversorJson) throws Exception {
		return args -> {
			String json = "{\"cep\": \"01001-000\",\"logradouro\": \"Praça da Sé\",\"localidade\": \"São Paulo\"}";
			ViaCepReponse reponse = conversor.converter(json);
			System.out.println("Dados do cep: " + response);
		};
	}

}
