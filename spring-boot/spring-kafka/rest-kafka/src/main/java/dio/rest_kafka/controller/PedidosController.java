package dio.rest_kafka.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidosController {

    public ResponseEntity<String> SalvarProduto() {
        return ResponseEntity.ok("Sucesso");
    }
}
