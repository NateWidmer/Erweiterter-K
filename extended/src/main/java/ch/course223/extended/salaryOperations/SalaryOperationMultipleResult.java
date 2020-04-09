package ch.course223.extended.salaryOperations;

import ch.course223.extended.domainModels.user.User;

import java.util.List;

@FunctionalInterface
public interface SalaryOperationMultipleResult {
  List<User> executeSalaryOperation(List<User> users);

}
