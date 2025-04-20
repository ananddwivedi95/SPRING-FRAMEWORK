package flipkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import flipkart.OrderTable;

@Repository
public interface FlipkartOrderRepository extends JpaRepository<OrderTable, Integer> {
}