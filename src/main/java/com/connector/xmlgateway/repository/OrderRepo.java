package com.connector.xmlgateway.repository;

import com.connector.xmlgateway.entity.Order;
import com.connector.xmlgateway.model.response.BackgroundCheckResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@EnableJpaRepositories("com.connector.xmlgateway.repository.*")
@Repository
public interface OrderRepo extends JpaRepository<Order,Integer > {
}
