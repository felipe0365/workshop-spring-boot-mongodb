package br.com.compassuol.workshopmongo.resources;

import br.com.compassuol.workshopmongo.domain.User;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {
        User maria = new User("1", "maria brown", "maria@gmail.com");
        User alex = new User("2", "alex green", "alex@gmail.com");
        List<User> list = new ArrayList<User>();

        list.addAll(Arrays.asList(maria, alex));
        return ResponseEntity.ok().body(list);

    }
}
