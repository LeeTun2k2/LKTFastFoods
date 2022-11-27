use LKTFastFood
go

-- Product.Amount
create trigger triggerCalculateProductAmount on Products 
after insert, update as
begin
	declare @discount int
	set @discount = (select Vouchers.Discount from inserted, Vouchers where Vouchers.ID = inserted.Voucher_ID)
	
	update Products
	set Amount = Export_Price * @discount / 100
end
go

-- Order_info.Amount
create trigger triggerCalculateOrder_InfoAmount on Order_Info
after insert, update as
begin
	declare @amount int
	set @amount = (select Products.Amount from inserted, Products where Products.ID = inserted.Product_ID)

	update Order_Info
	set Amount = Quantity * @amount
end
go

-- Reseed
create trigger Reseed_Order_History on Order_History 
after delete as
	declare @max int
	set @max = (select max(ID) from Order_History)
	begin
		DBCC CHECKIDENT ('Courses', RESEED, @max);
	end
go

create trigger Reseed_Menu on Menu 
after delete as
	declare @max int
	set @max = (select max(ID) from Menu)
	begin
		DBCC CHECKIDENT ('Courses', RESEED, @max);
	end
go

create trigger Reseed_Products on Products 
after delete as
	declare @max int
	set @max = (select max(ID) from Products)
	begin
		DBCC CHECKIDENT ('Courses', RESEED, @max);
	end
go

create trigger Reseed_Order_Info on Order_Info 
after delete as
	declare @max int
	set @max = (select max(ID) from Order_Info)
	begin
		DBCC CHECKIDENT ('Courses', RESEED, @max);
	end
go

create trigger Reseed_Orders on Orders
after delete as
	declare @max int
	set @max = (select max(ID) from Orders)
	begin
		DBCC CHECKIDENT ('Courses', RESEED, @max);
	end
go

create trigger Reseed_Assessments on Assessments 
after delete as
	declare @max int
	set @max = (select max(ID) from Assessments)
	begin
		DBCC CHECKIDENT ('Courses', RESEED, @max);
	end
go

create trigger Reseed_Vouchers on Vouchers 
after delete as
	declare @max int
	set @max = (select max(ID) from Vouchers)
	begin
		DBCC CHECKIDENT ('Courses', RESEED, @max);
	end
go

create trigger Reseed_Payment_Methods on Payment_Methods 
after delete as
	declare @max int
	set @max = (select max(ID) from Payment_Methods)
	begin
		DBCC CHECKIDENT ('Courses', RESEED, @max);
	end
go

create trigger Reseed_Payments on Payments
after delete as
	declare @max int
	set @max = (select max(ID) from Payments)
	begin
		DBCC CHECKIDENT ('Courses', RESEED, @max);
	end
go
