package SINGLETON;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private Tapucom tapucom;

    @Autowired
    private Tapucom tapucom2;

    @GetMapping("/get-data")
    public String getBroker() {
        tapucom.setName("Kutluhan Palalıoğlu");
        tapucom2.setName("Kutluhan Palalıoğlu 2");
        tapucom.setName("Kutluhan Palalıoğlu 3");

        return String.format("first broker = %s\nsecond broker = %s", tapucom.getName(), tapucom2.getName());

    }


}


