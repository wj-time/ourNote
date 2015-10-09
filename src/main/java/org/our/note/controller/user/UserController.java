package org.our.note.controller.user; 

import java.util.ArrayList;
import java.util.List;

import org.our.note.model.user.User;
import org.our.note.service.user.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserServices userService;
	
	@RequestMapping(value="list",method=RequestMethod.GET)
	public String toDelete(Model model){
		List<User> list = new ArrayList<User>();
		list = userService.getAll();
		model.addAttribute("list", list);
		return "user/list";
	}
}
 