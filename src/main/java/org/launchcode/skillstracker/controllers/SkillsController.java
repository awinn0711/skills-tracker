package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody

public class SkillsController {
    @GetMapping
    public String skillsList() {
        String html =
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                        "<li>Java</li>" +
                        "<li>JavaScript</li>" +
                        "<li>Python</li>";

        return html;
    }

    //create form at /form
    @GetMapping("/form")
    public String skillsForm() {
        String html =
                "<form method = 'post' action = '/form/results'/>" +
                        "<label for = 'nameSelect'>Name: </label>" +
                        "<input type = 'text' name = 'name' id = 'nameSelect'/>" +
                        "<br>" +
                        "<label for = 'firstOption'>My favorite language:</label>" +
                        "<select name = 'firstOption' id = 'firstOption'>" +
                        "<option value = 'java'>Java</option>" +
                        "<option value = 'javascript'>JavaScript</option>" +
                        "<option value = 'python'>Python</option>" +
                        "</select>" +
                        "<br>" +
                        "<label for = 'secondOption'>My second favorite language:</label>" +
                        "<select name = 'secondOption' id = 'secondOption'>" +
                        "<option value = 'java'>Java</option>" +
                        "<option value = 'javascript'>JavaScript</option>" +
                        "<option value = 'python'>Python</option>" +
                        "</select>" +
                        "<br>" +
                        "<label for = 'thirdOption'>My third favorite language:</label>" +
                        "<select name = 'thirdOption' id = 'thirdOption'>" +
                        "<option value = 'java'>Java</option>" +
                        "<option value = 'javascript'>JavaScript</option>" +
                        "<option value = 'python'>Python</option>" +
                        "</select>" +
                        "<br>" +
                        "<input type = 'submit' value = 'submit'/>";

        return html;
    }

    //responds to post requests from /form
    @PostMapping(value = "form/results")
    public String formResults(@RequestParam String name, @RequestParam String firstOption,
                              @RequestParam String secondOption, @RequestParam String thirdOption) {
        String html =
                "<h1>" + name + "</h1>" +
                "<ol>" +
                        "<li>" + firstOption + "</li>" +
                        "<li>" + secondOption + "</li>" +
                        "<li>" + thirdOption + "</li>" +
                        "</ol>";

        return html;
    }
}
