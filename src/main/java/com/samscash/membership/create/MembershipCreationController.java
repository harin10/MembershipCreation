package com.samscash.membership.create;


import com.samscash.membership.create.dto.CreateRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MembershipCreationController {

    @RequestMapping(value = "/membership", method = RequestMethod.POST)
    public ResponseEntity<Object> createMembership(@RequestBody List<CreateRequest> requests) {

        return new ResponseEntity<>("Test", HttpStatus.OK);
    }

}
