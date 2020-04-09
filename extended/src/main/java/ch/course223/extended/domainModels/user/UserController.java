package ch.course223.extended.domainModels.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

  private UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/bestEarning")
  public @ResponseBody
  ResponseEntity<User> getBestEarningUser() {
    return new ResponseEntity<User>(userService.getBestEarningUser(), HttpStatus.OK);
  }

  @GetMapping("/worstEarning")
  public @ResponseBody
  ResponseEntity<User> getWorstEarningUser() {
    return new ResponseEntity<User>(userService.getWorstEarningUser(), HttpStatus.OK);
  }

  @GetMapping("/evenEarnings")
  public @ResponseBody
  ResponseEntity<List<User>> allUsersWithEvenEarnings() {
    return new ResponseEntity<List<User>>(userService.allUsersWithEvenEarnings(), HttpStatus.OK);
  }

  @GetMapping("/oddEarnings")
  public @ResponseBody
  ResponseEntity<List<User>> allUsersWithOddEarnings() {
    return new ResponseEntity<List<User>>(userService.allUsersWithOddEarnings(), HttpStatus.OK);
  }

  @GetMapping("/moreThan/{min}")
  public @ResponseBody
  ResponseEntity<List<User>> allUsersEarningMoreThan(@PathVariable int min) {
    return new ResponseEntity<List<User>>(userService.allUsersEarningMoreThan(min), HttpStatus.OK);
  }

  @GetMapping("/lessThan/{max}")
  public @ResponseBody
  ResponseEntity<List<User>> allUsersEarningLessThan(@PathVariable int max) {
    return new ResponseEntity<List<User>>(userService.allUsersEarningLessThan(max), HttpStatus.OK);
  }

  @GetMapping("/earningBetween/{min}/{max}")
  public @ResponseBody
  ResponseEntity<List<User>> allUsersEarningBetween(@PathVariable int min, @PathVariable int max) {
    return new ResponseEntity<List<User>>(userService.allUsersEarningBetween(min, max), HttpStatus.OK);
  }

  @PostMapping({"/", ""})
  public @ResponseBody
  ResponseEntity<User> create(@RequestBody User user) {
    return new ResponseEntity<User>(userService.create(user), HttpStatus.CREATED);
  }

}
