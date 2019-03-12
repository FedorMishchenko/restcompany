CREATE TABLE IF NOT EXISTS customer_rest (
  id         BIGINT AUTO_INCREMENT PRIMARY KEY,
  f_name VARCHAR(50)   NOT NULL,
  l_name  VARCHAR(100)  NOT NULL,
  address    VARCHAR(1000) NOT NULL,
  salary     DECIMAL       NOT NULL
);