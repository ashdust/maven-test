import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sophie on 16-9-6.
 */
@Controller
@RequestMapping("/")
public class MainController {
    @ResponseBody
    @RequestMapping("/")
    public String main(){
        return "Hi";
    }
}
