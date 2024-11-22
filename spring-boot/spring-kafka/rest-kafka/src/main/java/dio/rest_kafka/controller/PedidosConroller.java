package dio.rest_kafka.controller;

import dio.rest_kafka.data.PedidoData;
import dio.rest_kafka.service.RegistroEventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PedidosConroller {

    private final RegistroEventoService eventoService;

    @PostMapping(path = "/api/salva-pedido")
    public ResponseEntity<String>  SalvarPedido(@RequestBody PedidoData pedido) {
        eventoService.adicionarEvento("SalvarPedido", pedido);
        return ResponseEntity.ok("Sucesso");
    }

}
