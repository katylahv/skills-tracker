package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {
    @RequestMapping(method ={RequestMethod.GET, RequestMethod.POST}, value ="skills")
    public String skillsTracker(@RequestParam String name,
                                @RequestParam String language,
                                @RequestParam String language2,
                                @RequestParam String language3){
        return "<h1>"+name+"</h1>" +
                "<h2>List of skills to learn:</h2>" +
                "<ol>1." + language + "</ol>" +
                "<ol>2."+language2+"</ol>" +
                "<ol>3."+language3+"</ol>";
    }
    @GetMapping("form")
    public String skillsForm(){
        return "<html>" +
                "<body>" +
                "<form action ='skills' method = 'post'>" +
                "<h3>Name:</h3>" +
                "<input type='text' name='name' method = 'post'>" +
                "<h3>Favorite Language:</h3>" +
                "<select name='language' method = 'post'>" +
                "<option value ='Java'>Java</option>" +
                "<option value ='JavaScript'>JavaScript</option>" +
                "<option value ='Python'>Python</option>" +
                "</select>"+
                "<h3>Second Favorite Language:</h3>" +
                "<select name='language2' method = 'post'>" +
                "<option value ='Java'>Java</option>" +
                "<option value ='JavaScript'>JavaScript</option>" +
                "<option value ='Python'>Python</option>" +
                "</select>"+
                "<h3>Third Favorite Language:</h3> " +
                "<select name='language3' method = 'post'>" +
                "<option value ='Java'>Java</option>" +
                "<option value ='JavaScript'>JavaScript</option>" +
                "<option value ='Python'>Python</option>" +
                "</select></br>"+
                "<input type = 'submit' value = 'Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
