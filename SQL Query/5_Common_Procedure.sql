use LKTFastFoods
go

create procedure CreateUser
	@username varchar(40), 
	@password varchar(40),
	@name nvarchar(40), 
	@birthDate date,
	@gender bit,
	@phoneNumber varchar(11), 
	@email varchar(40), 
	@address nvarchar(100)
as
	exec AddAccount @username, @password, 0, 1
	exec AddClient @username, @name, @birthDate, @gender, @phoneNumber, @email, @address
go

create procedure CreateManager
	@username varchar(40), 
	@password varchar(40),
	@name nvarchar(40), 
	@birthDate date,
	@gender bit,
	@phoneNumber varchar(11), 
	@email varchar(40), 
	@address nvarchar(100)
as
	exec AddAccount @username, @password, 0, 1
	exec AddManager @username, @name, @birthDate, @gender, @phoneNumber, @email, @address
go

create procedure LoadAllProductInMenu
as
	select Products.ID, Name, Image, Description, Amount, Export_Price, Discount 
	from Products inner join Vouchers on Products.Voucher_ID = Vouchers.ID
go
select * from Order_History

create procedure LoadPersonalHistory @client varchar(40)
as
	select Order_History.Order_ID, Name, Order_Info.Amount, Quantity from Order_History
	inner join Order_Info on Order_History.Order_ID = Order_Info.Order_ID
	inner join Products on Order_Info.Product_ID = Products.ID
	where Order_History.Client_ID = @client
go

create procedure GetMaxPaymentMethodID
as
	select max(ID) as maxID from Payment_Methods
go

create procedure GetMaxPaymentID
as
	select max(ID) as maxID from Payments
go

create procedure GetMaxOrderID
as
	select max(ID) as maxID from Orders
go

