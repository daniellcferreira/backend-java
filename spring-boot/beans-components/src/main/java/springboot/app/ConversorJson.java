package springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.google.gson.Gson;

@Component
public class ConversorJson {
    
    @Autowired
    private Gson gson;

    public ViaCepReponse converter(String json) {
        ViaCepReponse reponse = gson.fromJson(json,ViaCepReponse.class);

        return reponse;
    }
}
