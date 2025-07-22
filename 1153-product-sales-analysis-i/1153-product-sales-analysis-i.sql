# Write your MySQL query statement below
select product_name,year,price from Sales join Product where Sales.Product_id=Product.Product_id;