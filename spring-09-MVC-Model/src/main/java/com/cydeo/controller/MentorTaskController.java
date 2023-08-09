package com.cydeo.controller;

import com.cydeo.model.GenderTask;
import com.cydeo.model.MentorTask;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MentorTaskController {

    @RequestMapping("/task")
    public String getTask(Model model) {


        MentorTask mentor1 = new MentorTask("Aytu", "Kerim", 25, GenderTask.MALE);
        model.addAttribute("info1", mentor1);

        MentorTask mentor2 = new MentorTask("Nacibe", "Tursun", 28, GenderTask.FEMALE);
        model.addAttribute("info2", mentor2);

        MentorTask mentor3 = new MentorTask("Hayringul", "Abdul", 57, GenderTask.FEMALE);
        model.addAttribute("info3", mentor3);

            //        Another Solution
//        List<Mentor> mentorList = new ArrayList<> ();
//        mentorList. add (new Mentor ( firstName: "Mike", lastName: "Smith", age: 45, Gender .MALE));
//        mentorList. add (new Mentor (firstName: "Tom", lastName: "Hanks" , age: 65, Gender .MALE)) ;
//        mentorList.add (new Mentor ( firstName: "Anox", lastName: "Bryan", age: 25, Gender . FEMALE)) ;

        return "/task/task";
    }


}
