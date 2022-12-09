use LKTFastFoods
go

-- Product.Amount
create trigger triggerCalculateProductAmount on Products 
after insert, update as
begin
	declare @discount int
	set @discount = (select Vouchers.Discount from inserted, Vouchers where Vouchers.ID = inserted.Voucher_ID)
	
	update Products
	set Amount = Export_Price * (100 - @discount) / 100
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