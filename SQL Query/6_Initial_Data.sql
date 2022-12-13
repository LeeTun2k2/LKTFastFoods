use LKTFastFoods
go

-- Accounts
exec AddAccount 'null', '123456@Aa', 0, 0
go
exec AddAccount 'admin', '123456@Aa', 1, 1
exec AddAccount 'client', '123456@Aa', 0, 1
go

-- Clients
exec AddClient 'null', N'null', '1-1-1', 1, '0', 'null@null.null', N'null'
go
exec AddClient 'client', N'Lê Quang Tùng', '10-7-2002', 0, '0961121321', 'letung109922@gmail.com', N'Gia Lai'
go

-- Managers
exec AddManager'null', N'null', '1-1-1', 1, '0', 'null@null.null', N'null'
go
exec AddManager'admin', N'Lê Quang Tùng', '10-07-2002', 0, '0961121321', 'letung109922@gmail.com', N'Gia Lai'
go

-- Vouchers
exec AddVoucher '01-01-0001', '01-02-0001', 0
go
exec AddVoucher '11-23-2022', '11-24-2022', 50
exec AddVoucher '12-01-2022', '12-31-2022', 15
exec AddVoucher '12-01-2022', '12-31-2022', 20
go

-- Products
exec AddProduct 'Combo 1', 'https://dscnnwjxnwl3f.cloudfront.net/media/catalog/product/cache/584039753b87a8d227764e04fc461e3e/c/h/chickenset-534x374px_friedchicken-set_2.png', 'Combo gà rán Fried, Khoai tây chiên, Pepsi', 1, 50000, 100000, 2
exec AddProduct 'Combo 2', 'https://dscnnwjxnwl3f.cloudfront.net/media/catalog/product/cache/584039753b87a8d227764e04fc461e3e/c/h/chickenset-534x374px_cheese-set_5.png', 'Combo gà rán Phomai, Khoai tây chiên, Pepsi', 1, 50000, 100000, 2
exec AddProduct 'Combo 3', 'https://dscnnwjxnwl3f.cloudfront.net/media/catalog/product/cache/584039753b87a8d227764e04fc461e3e/c/h/chickenset-534x374px_hs-set_1.png', 'Combo gà rán Sốt cay, Khoai tây chiên, Pepsi', 1, 50000, 100000, 2
exec AddProduct 'Combo 4', 'https://dscnnwjxnwl3f.cloudfront.net/media/catalog/product/cache/584039753b87a8d227764e04fc461e3e/c/h/chickenset-534x374px_grilled-set.png', 'Combo gà rán Grilled, Khoai tây chiên, Pepsi', 1, 50000, 100000, 2


exec AddProduct 'Gà rán 1', 'https://dscnnwjxnwl3f.cloudfront.net/media/catalog/product/cache/584039753b87a8d227764e04fc461e3e/c/h/chicken-534x374px_fried-1_1.png', 'Gà rán Fried', 1, 15000, 40000, 3
exec AddProduct 'Gà rán 2', 'https://dscnnwjxnwl3f.cloudfront.net/media/catalog/product/cache/584039753b87a8d227764e04fc461e3e/5/3/534x374px_cheese-1.png', 'Gà rán Phomai', 1, 15000, 40000, 3
exec AddProduct 'Gà rán 3', 'https://dscnnwjxnwl3f.cloudfront.net/media/catalog/product/cache/584039753b87a8d227764e04fc461e3e/5/3/534x374px_hs-1.png', 'Gà rán Sốt cay', 1, 15000, 40000, 3
exec AddProduct 'Gà rán 4', 'https://dscnnwjxnwl3f.cloudfront.net/media/catalog/product/cache/584039753b87a8d227764e04fc461e3e/c/h/chicken-534x374px_grilled-1_1.png', 'Gà rán Grilled', 1, 15000, 40000, 3

exec AddProduct 'Giải khát 1', 'https://dscnnwjxnwl3f.cloudfront.net/media/catalog/product/cache/584039753b87a8d227764e04fc461e3e/d/r/drink-534x374px_mirinda_1.png', 'Pepsi', 1, 7000, 15000, 2
exec AddProduct 'Giải khát 2', 'https://dscnnwjxnwl3f.cloudfront.net/media/catalog/product/cache/584039753b87a8d227764e04fc461e3e/d/r/drink-534x374px_pepsi_1.png', '7UP', 1, 7000, 15000, 2
exec AddProduct 'Giải khát 3', 'https://dscnnwjxnwl3f.cloudfront.net/media/catalog/product/cache/584039753b87a8d227764e04fc461e3e/d/r/drink-534x374px_mirinda.png', 'Coca', 1, 7000, 15000, 2
exec AddProduct 'Giải khát 4', 'https://dscnnwjxnwl3f.cloudfront.net/media/catalog/product/cache/584039753b87a8d227764e04fc461e3e/d/r/drink-534x374px_fruittea.png', 'Gontee', 1, 7000, 15000, 2
go

-- Payment_Method
exec AddPayment_Method '0', 'null', 'null'
go
exec AddPayment_Method '31251256346236', 'Le Quang Tung', 'BIDV'
go

-- Payments
exec AddPayment 0, '01-01-0001', 0, N'null'
go
exec AddPayment 1, '01-01-2022', 100, N'Chuyển tiền'
go
-- Orders
exec AddOrder 0, 0, '1-1-1'
go
exec AddOrder 1, 100, '12-01-2022'
go

-- Order_Info
exec AddOrder_Info 0, 0, 0
go
exec AddOrder_Info 1, 1, 100
go

-- Assessments
exec AddAssessment 0, 5, N'Ngon'
go
exec AddAssessment 1, 4, N'Tạm'
go

-- Order_History
exec AddOrder_History 'null', 0
go
exec AddOrder_History 'client', 1
go
