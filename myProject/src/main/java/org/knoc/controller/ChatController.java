package org.knoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChatController {

	@RequestMapping(value = "/chat", method = RequestMethod.GET)
	public ModelAndView viewChatPage() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("chatting/chat");
		

		return mav;
	}

}
