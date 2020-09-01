package volleyentitymodel;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MiembrosController {

    @RequestMapping("/miembros")
    public String index() {
        return "Greetings from MiembrosController!";
    }

}
