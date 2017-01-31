package com.journaldev.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.journaldev.spring.hb.model.FUser;
import com.journaldev.spring.service.UserService;

@Controller
@RequestMapping("/fuser")
public class UserController {
	
	private UserService userService;

	/**
	 * @param userService the userService to set
	 */
	@Autowired(required=true)
	@Qualifier(value="userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	//User -----------------------------------------------------------------------------------
		@RequestMapping(value = "/users", method = RequestMethod.GET)
		public String listUsers(Model model) {
			model.addAttribute("user", new FUser());
			model.addAttribute("listUsers", this.userService.listUsers());
			return "user";
		}
		
		//For add and update user both
		@RequestMapping(value= "/user/add", method = RequestMethod.POST)
		public String addUser(@ModelAttribute("user") FUser p){
			if(p.getId() == 0){
				//new person, add it
				this.userService.addUser(p);
			}else{
				//existing person, call update
				this.userService.updateUser(p);
			}
			return "redirect:/fuser/users";
		}
		
		@RequestMapping("/user/remove/{id}")
	    public String removeUser(@PathVariable("id") int id){
			
	        this.userService.removeUser(id);
	        return "redirect:/fuser/users";
	    }
	 
	    @RequestMapping("user/edit/{id}")
	    public String editUser(@PathVariable("id") int id, Model model){
	        model.addAttribute("user", this.userService.getUsereById(id));
	        model.addAttribute("listUsers", this.userService.listUsers());
	        return "user";
	    }

}
