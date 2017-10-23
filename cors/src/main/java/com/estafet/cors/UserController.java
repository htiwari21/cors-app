/**
 * 
 */
package com.estafet.cors;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private Map<Long, User> userMap = new HashMap<>();
    
   

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<User> get(@PathVariable long id) {
        User user = userMap.get(id);
        if(user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PostConstruct
    public void initDefaults(){
    	User admin = new User();
    	admin.setId(101);
    	admin.setName("Administrator");
    	userMap.put((long) 101,admin);
    	
    	User dev = new User();
    	dev.setId(102);
    	dev.setName("Developer");
    	userMap.put((long) 102,dev);
    }

}
