# Core Java
In this repo, I have added basic concepts of Core Java. It is organized according to the topics.

# MVC
For maintaining mvc, the classes and packages are organized in following directories and sub directories:
    
    
    
    src
      ->com.model
                    -> Class and pojo
      ->com.service
                    -> Interface, Implementation Class
      ->com.view
                    -> Main method

# JDBC
Remember to add the mysql jar file.

### Pattern for JDBC: 
1. Register driver
   Class.forName("com.mysql.cj.jdbc.Driver")
2. GetConnection
   Connection con = getConnection("url","username","password")


    url[jdbc:mysql://localhost/3306/testdb]

       where 3306 is default port
   
             testdb is database name

4. Insert or Select or Update or Delete


##### Insert
1. Write SQL
2. Create statement ->  Statement stm = con.createStatement();
3. Execute statement  -> stm.execute(sql)
4. close database -> con.close()

##### Select
1. Write SQL
2. Create statement ->  Statement stm = con.createStatement();
3. Execute statement  -> ResultSet rs = stm.executeQuery(sql)

##### Update/Delete
1. Write SQL
2. Create statement ->  Statement stm = con.createStatement();
3. Execute statement  -> stm.execute(sql)
   

