package dev.kbekind.springbootvalidation.controller;


import dev.kbekind.springbootvalidation.model.DTO.RegisterDTO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController {



    @GetMapping("/")
    public String getMappingHomeFromIndex(Model model) {
        return "home";
    }


    @GetMapping("/home")
    public String getMappingHome(Model model) {
        return "home";
    }


    @GetMapping("/register")
    public String getMappingRegister(Model model) {
        RegisterDTO registerDTO = new RegisterDTO();
        model.addAttribute("registerDTO", registerDTO);
        return "register";
    }


    @PostMapping("/register")
    public String postMappingRegister(@ModelAttribute @Valid RegisterDTO registerDTO, Errors errors, Model model){

        if (errors.hasErrors()) {
            return "register";
        }


        return "redirect:../home";
    }




}
