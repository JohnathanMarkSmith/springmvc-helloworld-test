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
 * Email:  john@johnathanmarksmith.com
 * <p/>
 * Comments:
 * <p/>
 * This is my basic controller for my web app.
 */


@Controller
@RequestMapping("/ask")
class IndexController
{

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView displayRequestPage()
    {
        logger.debug("made it to controller");

        /*

            Going to put my name in the model so it can be displayed on the page,
            this is also going to be used in the test to see if my name did make it
            to the page

        */

        Map<String, Object> model = new HashMap<String, Object>();
        model.put("user", "Johnathan Mark Smith");

        return new ModelAndView("helloworld", model);


    }


}
