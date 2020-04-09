package ch.course223.extended.salaryOperations;

import ch.course223.extended.domainModels.user.User;
import ch.course223.extended.salaryOperations.SalaryOperationMultipleResult;
import ch.course223.extended.salaryOperations.SalaryOperationSingleResult;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SalaryOperationHandler {

  SalaryOperationSingleResult bestEarningUser = (List<User> users) -> users.stream().sorted(Comparator.comparing(User::getSalary).reversed()).findFirst();
  SalaryOperationSingleResult worstEarningUser = (List<User> users) -> users.stream().sorted(Comparator.comparing(User::getSalary)).findFirst();

  SalaryOperationMultipleResult allUsersEarningMoreThan = (List<User> users) -> users.stream().filter(user -> user.getSalary() > 2000).collect(Collectors.toList());
  SalaryOperationMultipleResult allUsersEarningLessThan = (List<User> users) -> users.stream().filter(user -> user.getSalary() < 2000).collect(Collectors.toList());

  SalaryOperationMultipleResult allUsersEarningBetween2000And3000 = (List<User> users) -> users.stream().filter(user -> user.getSalary() > 2000 && user.getSalary() < 3000).collect(Collectors.toList());

  SalaryOperationMultipleResult allUsersWithEvenEarnings = (List<User> users) -> users.stream().filter(user -> user.getSalary() % 2 == 0).collect(Collectors.toList());
  SalaryOperationMultipleResult allUsersWithOddEarnings = (List<User> users) -> users.stream().filter(user -> user.getSalary() % 2 != 0).collect(Collectors.toList());


  // SalaryOperation add =(int x, int y) -> (x + y);
  // SalaryOperation subtract = (int x, int y) -> (x - y);
  // SalaryOperation multiply = (int x, int y) -> (x * y);

  // public int getResult (int x, int y, SalaryOperation salaryOperation) {
  //   return salaryOperation.executeNumericalOperation(x, y);
  // }

  // calculator.getResult(2, 3, add); -> 5
  // calculator.getResult(2, 3, multiply); -> 6


  // SalaryHandler returnHighestSalary = (List<Integer> salaries) -> salaries.stream().sorted(Comparator.comparingInt(salaries).findFirst())

  // returns sorted salaries
  //MathematicalOperation sortedSalaries = (List<Integer> salaries) -> salaries.stream().sorted().collect(Collectors.toList());
  // List<Integer> test = sortedSalaries.assessSalaries();


  // return highest salary
  //MathematicalOperation highestSalary = (List<Integer> salaries) -> salaries.stream().sorted().findFirst();


  // sorted List ASC
  // public List<Integer> assessSalary (List<Integer> salaries, MathematicalOperation mathematicalOperation) {
  //   return mathematicalOperation.assessSalaries(salaries);
  // }


}
