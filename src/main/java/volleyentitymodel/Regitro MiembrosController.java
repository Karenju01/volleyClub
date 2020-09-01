package volleyentitymodel;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Regitro MiembrosController {

    @RequestMapping("/regitro miembros")
    public String index() {
        return "Greetings from Regitro MiembrosController!";
    }

}
