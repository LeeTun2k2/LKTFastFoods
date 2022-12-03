sqlcmd -E -S localhost -i 1_Create_database.sql
sqlcmd -E -S localhost -i 2_Constraint.sql
sqlcmd -E -S localhost -i 3_Trigger.sql
sqlcmd -E -S localhost -i 4_Procedure.sql
sqlcmd -E -S localhost -i 5_Common_Procedure.sql
sqlcmd -E -S localhost -i 6_Initial_Data.sql