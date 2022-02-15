package org.launchcode.controllers;

import org.launchcode.models.JobData;
import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping("search")
public class SearchController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String search(Model model) {
        model.addAttribute("columns", ListController.columnChoices);

        return "search";
    }

    // TODO #1 - Create handler to process search request and display results
    @RequestMapping(value = "results")
    public String search(Model model, @RequestParam String searchType, @RequestParam String searchTerm) {


        ArrayList<HashMap<String, String>> jobsFound;


        if (searchType.equals("all")) {
            jobsFound = JobData.findByValue(searchTerm);

        } else {
            jobsFound = JobData.findByColumnAndValue(searchType, searchTerm);
            model.addAttribute("selectedColumn", searchType);
        }


        model.addAttribute("columns", ListController.columnChoices);
        model.addAttribute("jobsFound", jobsFound);


        return "search";


    }
}


