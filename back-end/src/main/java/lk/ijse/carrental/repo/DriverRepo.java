package lk.ijse.carrental.repo;

import lk.ijse.carrental.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author sithum
 */
public interface DriverRepo extends JpaRepository<Driver, String> {
}
