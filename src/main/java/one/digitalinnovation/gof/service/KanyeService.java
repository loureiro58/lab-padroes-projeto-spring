package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "kanye", url = "https://api.kanye.rest/")
public interface KanyeService {
    @GetMapping()
    String recuperarFraseDia();
}
