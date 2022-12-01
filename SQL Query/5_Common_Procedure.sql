use LKTFastFood
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
