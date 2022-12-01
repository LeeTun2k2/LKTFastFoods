use LKTFastFood
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
go

-- Products
exec AddProduct N'null',null, null, 0, 0, 0, 0
go
exec AddProduct N'Pepsi vị chanh không calo','null', N'Bung cùng rap việt', 1, 5, 10, 1
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