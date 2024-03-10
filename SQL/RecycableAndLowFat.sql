SELECT product_id FROM Products
WHERE low_fats IN ('Y') AND recyclable IN ('Y');

SELECT product_id FROM Products
WHERE low_fats = 'Y' AND recyclable = 'Y';
