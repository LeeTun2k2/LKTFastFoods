use LKTFastFoods
go

-- Accounts
create procedure AddAccount @username varchar(40), @password varchar(40), @role bit, @active bit
as
	insert into Accounts values(@username, @password, @role, @active)
go

create procedure UpdateAccount @username varchar(40), @password varchar(40), @role bit, @active bit
as
	update Accounts 
	set Password = @password,
		Roles = @role,
		Active = @active
	where Username = @username
go

create procedure GetAllAccounts 
as 
	select * from Accounts
go

create procedure GetOneAccount @username varchar(40)
as 
	select * from Accounts
	where Username = @username
go



-- Clients
create procedure AddClient 
	@username varchar(40), 
	@name nvarchar(40),
	@birthdate date, 
	@gender bit, 
	@phoneNumber varchar(11), 
	@email varchar(40), 
	@address nvarchar(100)
as
	insert into Clients values(@username, @name, @birthdate, @gender, @phoneNumber, @email, @address)
go

create procedure UpdateClient 
	@username varchar(40), 
	@name nvarchar(40),
	@birthdate date, 
	@gender bit, 
	@phoneNumber varchar(11), 
	@email varchar(40), 
	@address nvarchar(100)
as
	update Clients 
	set Name = @name,
		BirthDate = @birthdate,
		Gender = @gender,
		PhoneNumber = @phoneNumber,
		Email = @email,
		Address = @address
	where Username = @username
go

create procedure DeleteClient @username varchar(40)
as
begin transaction
	delete from Clients
	where Username = @username
commit
go

create procedure GetAllClients 
as 
	select * from Clients
go

create procedure GetOneClient @username varchar(40)
as 
	select * from Clients
	where Username = @username
go



-- Managers
create procedure AddManager
	@username varchar(40), 
	@name nvarchar(40),
	@birthdate date, 
	@gender bit, 
	@phoneNumber varchar(11), 
	@email varchar(40), 
	@address nvarchar(100)
as
	insert into Managers values(@username, @name, @birthdate, @gender, @phoneNumber, @email, @address)
go

create procedure UpdateManager
	@username varchar(40), 
	@name nvarchar(40),
	@birthdate date, 
	@gender bit, 
	@phoneNumber varchar(11), 
	@email varchar(40), 
	@address nvarchar(100)
as
	update Managers 
	set Name = @name,
		BirthDate = @birthdate,
		Gender = @gender,
		PhoneNumber = @phoneNumber,
		Email = @email,
		Address = @address
	where Username = @username
go

create procedure DeleteManager @username varchar(40)
as
	delete from Managers
	where Username = @username
go

create procedure GetAllManagers 
as 
	select * from Managers
go

create procedure GetOneManager @username varchar(40)
as 
	select * from Managers
	where Username = @username
go



-- Vouchers
create procedure AddVoucher @startDate date, @endDate date, @discount int
as
	insert into Vouchers values(@startDate, @endDate, @discount)
go

create procedure UpdateVoucher @id int, @startDate date, @endDate date, @discount int
as
	update Vouchers 
	set Start_Date = @startDate,
		End_Date = @endDate,
		Discount = @discount
	where ID = @id
go

create procedure DeleteVoucher @id int
as
	delete from Vouchers
	where ID = @id
go

create procedure GetAllVouchers 
as 
	select * from Vouchers
go

create procedure GetOneVoucher @id int
as 
	select * from Vouchers
	where ID = @id
go



-- Products
create procedure AddProduct 
	@name nvarchar(40),
	@image varchar(200),
	@description nvarchar(40),
	@status bit,
	@importPrice int,
	@exportPrice int,
	@voucherID int
as
	insert into Products values(@name, @image, @description, 0, @status, @importPrice, @exportPrice, @voucherID)
go

create procedure UpdateProduct 
	@ID int,
	@name nvarchar(40),
	@image varchar(200),
	@description nvarchar(40),
	@status bit,
	@importPrice int,
	@exportPrice int,
	@voucherID int
as
	update Products 
	set Name = @name,
		Image = @image,
		Description = @description,
		Status = @status,
		Import_Price = @importPrice,
		Export_Price = @exportPrice,
		Voucher_ID = @voucherID
	where ID = @id
go

create procedure DeleteProduct @id int
as
begin transaction
	delete from Products
	where ID = @id
commit
go

create procedure GetAllProducts 
as 
	select * from Products
go

create procedure GetOneProduct @id int
as 
	select * from Products
	where ID = @id
go



-- Order_Info
create procedure AddOrder_Info 
	@productID int, 
	@orderID int, 
	@quantity int
as
	insert into Order_Info values(@productID, @orderID, @quantity, 0)
go

create procedure UpdateOrder_Info 
	@id int, 
	@productID int, 
	@orderID int, 
	@quantity int
as
	update Order_Info 
	set Product_ID = @productID,
		Order_ID = @orderID,
		Quantity = @quantity
	where ID = @id
go

create procedure DeleteOrder_Info @id int
as
	delete from Order_Info
	where ID = @id
go

create procedure GetAllOrder_Infos 
as 
	select * from Order_Info
go

create procedure GetOneOrder_Info @id int
as 
	select * from Order_Info
	where ID = @id
go



-- Payment_Method
create procedure AddPayment_Method @accountNumber varchar(40), @accountName varchar(40), @bankName varchar(40)
as
	insert into Payment_Methods values(@accountNumber, @accountName, @bankName)
go

create procedure UpdatePayment_Method @id int, @accountNumber varchar(40), @accountName varchar(40), @bankName varchar(40)
as
	update Payment_Methods 
	set AccountNumber = @accountNumber,
		AccountName = @accountName,
		BankName = @bankName
	where ID = @id
go

create procedure DeletePayment_Method @id int
as
begin transaction
	delete from Payment_Methods
	where ID = @id
commit
go

create procedure GetAllPayment_Methods
as 
	select * from Payment_Methods
go

create procedure GetOnePayment_Method @id int
as 
	select * from Payment_Methods
	where ID = @id
go



-- Payments
create procedure AddPayment @methodID int, @dateDone date, @amount int, @description nvarchar(100)
as
	insert into Payments values(@methodID, @dateDone, @amount, @description)
go

create procedure UpdatePayment @id int, @methodID int, @dateDone date, @amount int, @description nvarchar(100)
as
	update Payments 
	set Method_ID = @methodID,
		DateDone = @dateDone,
		Amount = @amount,
		Description = @description
	where ID = @id
go

create procedure DeletePayment @id int
as 
begin transaction
	delete from Payments
	where ID = @id
commit
go

create procedure GetAllPayments
as 
	select * from Payments
go

create procedure GetOnePayment @id int
as 
	select * from Payments
	where ID = @id
go


-- Orders
create procedure AddOrder @paymentID int, @amount int, @date date
as
	insert into Orders values(@paymentID, @amount, @date)
go

create procedure UpdateOrder @id int, @paymentID int, @amount int, @date date
as
	update Orders 
	set Payment_ID = @paymentID,
		Amount = @amount,
		Date = @date
	where ID = @id
go

create procedure DeleteOrder @id int
as
begin transaction
	delete from Orders
	where ID = @id
commit
go

create procedure GetAllOrders
as 
	select * from Orders
go

create procedure GetOneOrder @id int
as 
	select * from Orders
	where ID = @id
go



-- Assessments
create procedure AddAssessment @orderID int, @stars float, @comment nvarchar(200)
as
	insert into Assessments values(@orderID, @stars, @comment)
go

create procedure UpdateAssessment @id int, @orderID int, @stars float, @comment nvarchar(200)
as
	update Assessments 
	set Order_ID = @orderID,
		Stars = @stars,
		Comment = @comment
	where ID = @id
go

create procedure DeleteAssessment @id int
as
	delete from Assessments
	where ID = @id
go

create procedure GetAllAssessments
as 
	select * from Assessments
go

create procedure GetOneAssessment @id int
as 
	select * from Assessments
	where ID = @id
go

-- Order_History
create procedure AddOrder_History @clientID varchar(40), @orderID int
as
	insert into Order_History values(@clientID, @orderID)
go

create procedure UpdateOrder_History @id int, @clientID varchar(40), @orderID int
as
	update Order_History 
	set Client_ID = @clientID,
		Order_ID = @orderID
	where ID = @id
go

create procedure DeleteOrder_History @id int
as
	delete from Order_History
	where ID = @id
go

create procedure GetAllOrder_History
as 
	select * from Order_History
go

create procedure GetOneOrder_History @id int
as 
	select * from Order_History
	where ID = @id
go



-- Delete Account
create procedure DeleteAccount @username varchar(40)
as
begin transaction
	declare @roles bit
	set @roles = (select roles from Accounts where Username = @username)
	if @roles = 1
		exec DeleteManager @username
	else
		exec DeleteClient @username

	delete from Accounts
	where Username = @username
commit
go