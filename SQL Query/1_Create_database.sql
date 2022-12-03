create database LKTFastFood
go
use LKTFastFood
go

-- Accounts
create table Accounts(
	Username varchar(40) primary key,
	Password varchar(40) not null,
	Roles bit not null,
	Active bit not null
)
go

-- Clients
create table Clients(
	Username varchar(40) primary key references Accounts(Username),
	Name nvarchar(40) not null,
	BirthDate date,
	Gender bit not null,
	PhoneNumber varchar(11),
	Email varchar(40),
	Address nvarchar(100)
)
go

-- Managers
create table Managers(
	Username varchar(40) primary key references Accounts(Username),
	Name nvarchar(40) not null,
	BirthDate date,
	Gender bit not null,
	PhoneNumber varchar(11),
	Email varchar(40),
	Address nvarchar(100)
)
go

-- Vouchers
create table Vouchers(
	ID int identity(0,1) primary key,
	Start_Date date not null,
	End_Date date not null,
	Discount int not null
)
go

-- Products
create table Products(
	ID int identity(0,1) primary key,
	Name nvarchar(40) not null,
	Image image,
	Description nvarchar(100),
	Amount int not null,
	Status bit not null,
	Import_Price int not null,
	Export_Price int not null,
	Voucher_ID int references Vouchers(ID)
)
go

-- Payment_Method
create table Payment_Methods(
	ID int identity(0,1) primary key,
	AccountNumber varchar(40) not null,
	AccountName varchar(40) not null,
	BankName varchar(40) not null
)
go

-- Payments
create table Payments(
	ID int identity(0,1) primary key,
	Method_ID int references Payment_Methods(ID),
	DateDone date not null,
	Amount int not null,
	Description nvarchar(100)
)
go

-- Orders
create table Orders(
	ID int identity(0,1) primary key,
	Payment_ID int references Payments(ID),
	Amount int not null,
	Date date not null
)
go

-- Order_Info
create table Order_Info (
	ID int identity(0,1) primary key,
	Product_ID int, 
	Order_ID int,
	Quantity int not null,
	Amount int not null,
	foreign key(Product_ID) references Products(ID),
	foreign key(Order_ID) references Orders(ID)
)
go

-- Assessments
create table Assessments (
	ID int identity(0,1) primary key,
	Order_ID int references Orders(ID),
	Stars float not null,
	Comment nvarchar(200)
)
go 

-- Order_History
create table Order_History (
	ID int identity(0,1) primary key,
	Client_ID varchar(40),
	Order_ID int,
	foreign key(Client_ID) references Clients(Username),
	foreign key(Order_ID) references Orders(ID)
)
go