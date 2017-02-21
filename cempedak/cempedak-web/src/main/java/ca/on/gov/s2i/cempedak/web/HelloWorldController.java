package ca.on.gov.s2i.cempedak.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ca.on.gov.s2i.cempedak.Pager;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {
    static final Logger LOG = LoggerFactory.getLogger(HelloWorldController.class);

    /**
     * hello.
     * @param name
     * @param type
     * @param model
     * @return
     */
    @RequestMapping("/hello")
    //  throws DSFault
    public String hello(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
            @RequestParam(value = "type") String type,
            Model model) {
        LOG.info("You can do anything, but not everything.");
        LOG.debug("Believe those who are seeking the truth. Doubt those who find it.");
        model.addAttribute("name", name);
        
        String abc = "abc";
        // LOG.debug(abc.substring(0,100));

        return "helloworld";
    }

    /**
     * findAllCycleHighway.
     * @return
     */
    @RequestMapping(value = "/findAllCycleHighway", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Pager findAllCycleHighway() {
        Pager pager = new Pager();
        pager.setTitle("Survey response");
        LOG.debug("change 2");

        return pager;
    }

}