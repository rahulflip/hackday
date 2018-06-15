package com.service;


import java.sql.SQLException;

public interface DefaultDeliveryServiceManager {
    Integer assignOrdersBydDefaultMethod(Integer dhId) throws SQLException;
}
