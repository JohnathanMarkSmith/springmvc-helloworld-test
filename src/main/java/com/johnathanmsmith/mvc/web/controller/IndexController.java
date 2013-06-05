package com.johnathanmsmith.mvc.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Date:   6/5/13 / 7:58 AM
 * Author: Johnathan Mark Smith
 * Email:  johnathansmith1969@gmail.com
 * <p/>
 * Comments:
 *
 *    This is my basic controller for my web app.
 */


@Controller
@RequestMapping("/ask")
class IndexController
{

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView displayRequestPage()
    {
        /*
           I am going to display the helloworld.jsp page now :)
         */
        logger.debug("made it to controller");

        Map<String, Object> model = new HashMap<String, Object>();
        model.put("user", "Johnathan Mark Smith");

        return new ModelAndView("helloworld", model);


    }


}
