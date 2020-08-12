create table Customer_Info(customer_id number(22) primary key,
	    customer_name varchar2(25),  
	    customer_email varchar2(25),   
	    mobile_No number(22),	
	   user_Name varchar2(25), 
	   password varchar2(25),
	   customer_address varchar2(25), 
	   state_name varchar2(25),  
	   customer_country varchar2(25),
	   pan_no varchar2(25), 
	   date_of_birth Date, 
	   account_no number(22)
	  );
	  
	  insert into customerInfo(customerId,name,email,mobileNo,userName,password,address,state_name,country,panNo,dob,accountNo)
	  values (customerId.nextval,'ram','ecs@gmail.com',5656565656,'rs679','password@22','21,lagar street','lucknow','United kingdom','BBUGT8596K',
	  '08-JUN-20',14523698523632); 

create sequence Customer_Info_seq increment by 1 start 1;	  

select * from customer_info;
delete from customer_info;

delete  from customer_info where name='ram';

create table Due_Diligence(customer_id number(22),
	    status varchar2(25)); 
		insert into Due_Diligence(customer_id,status) values (36,'APPROVED');
		insert into Due_Diligence(customer_id,status) values (37,'NON_APPROVED');
		insert into Due_Diligence(customer_id,status) values (38,'APPROVED');
		select * from Due_Diligence;	

drop table Due_Diligence;

{
  "accountNo": 0,
  "address": "",
  "country": "",
  "dob": "",
  "email": "",
  "mobileNo": 0,
  "name": "",
  "panNo": "",
  "passwrd": "",
  "state": "",
  "userName": ""
}
	  