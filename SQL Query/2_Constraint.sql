use LKTFastFood
go

alter table Accounts
add constraint checkPassword check (
		Password like '%[0-9]%' and 
		Password like '%[A-Z]%' collate Latin1_General_BIN2 and 
		Password like '%[!@#$%^&*()-_+=.,;:~]%' and 
		len(Password) >= 8
	);
go

alter table Managers
add constraint checkManagerAge check (Age > 0),
	constraint checkManagerPhoneNumber check (patindex('%[^0-9]%', PhoneNumber) = 0),
	constraint checkManagerEmail check (
		Email like '%_@__%.__%' and 
		Email not like '% %' and 
		patindex('%[^a-z,0-9,@,.,]%', Email) = 0
	);
go

alter table Clients
add constraint checkClientAge check (Age > 0),
	constraint checkClientPhoneNumber check (patindex('%[^0-9]%', PhoneNumber) = 0),
	constraint checkClientEmail check (
		Email like '%_@__%.__%' and 
		Email not like '% %' and 
		patindex('%[^a-z,0-9,@,.,]%', Email) = 0
	);
go

alter table Products
add constraint checkProductAmount check (Amount >= 0),
	constraint checkImport_Price check (Import_Price >= 0),
	constraint checkExport_Price check (Export_Price >= 0);
go

alter table Orders
add constraint checkOrderAmount check (Amount >= 0);
go

alter table Order_Info
add constraint checkOrder_InfoAmount check (Amount >= 0),
	constraint checkOrder_InfoQuantity check (Quantity >= 0);
go

alter table Assessments
add constraint checkAssessmentStars check (0 <= Stars and Stars <= 5);
go

alter table Vouchers
add constraint checkVoucherDiscount check (0 <= Discount and Discount <= 100),
	constraint checkVoucherDate check (Start_Date < End_Date);
go

alter table Payment_Methods
add constraint checkAccountNumber check (patindex('%[^0-9]%', AccountNumber) = 0);
go