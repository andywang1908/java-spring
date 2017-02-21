package ca.on.gov.s2i.cempedak.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ca.on.gov.s2i.cempedak.Pager;

@Controller
public class SimpleController {
    /**
     * findAllCycleHighway.
     * @return
     */
    @RequestMapping(value = "/simple", method = RequestMethod.GET, produces = "application/json")
    //  throws DSFault
    public @ResponseBody Pager findAllCycleHighway() {
        Pager pager = new Pager();
        pager.setTitle("Survey response");

        System.out.println(pager + ":::1");

        //return result;
        return pager;
    }

}