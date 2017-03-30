/**
 * 
 */
package com.vishalkukreja.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vishalkukreja.springbootdemo.domain.Login;
import com.vishalkukreja.springbootdemo.service.LoginService;
import com.vishalkukreja.springbootdemo.vo.Message;

@RestController
public class LoginController {

	@Autowired
	LoginService service;

	@RequestMapping(value = "/logincheck", method = RequestMethod.POST)
	public Message authenticateLogin(@RequestBody Login login) {
		Message msg = new Message();
		Login output = service.checkLoginDetails(login);

		if (null != output) {
			msg.setMessage("Login successful! Welcome " + output.getEmpId());
			msg.setMessageCode(HttpStatus.OK.toString());
		} else {
			msg.setMessage("Login failed!");
			msg.setMessageCode(HttpStatus.FORBIDDEN.toString());
		}
		return msg;
	}
}
