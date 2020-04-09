package ch.course223.extended.salaryOperations;

import ch.course223.extended.domainModels.user.User;

import java.util.List;
import java.util.Optional;

@FunctionalInterface
public interface SalaryOperationSingleResult {
  Optional<User> executeSalaryOperation(List<User> users);
}
