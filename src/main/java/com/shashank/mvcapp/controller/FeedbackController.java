package com.shashank.mvcapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FeedbackController {

    // Show the form
    @GetMapping("/feedback")
    public String showForm() {
        return "feedbackForm";  // maps to feedbackForm.jsp
    }

    // Handle form submission
    @PostMapping("/submitFeedback")
    public String handleForm(
            @RequestParam("name") String name,
            @RequestParam("comments") String comments,
            Model model) {

        // Add values to be displayed on success page
        model.addAttribute("userName", name);
        model.addAttribute("userComments", comments);

        return "feedbackSuccess";  // maps to feedbackSuccess.jsp
    }
}
