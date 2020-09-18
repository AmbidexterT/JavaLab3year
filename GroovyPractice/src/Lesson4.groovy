import groovy.sql.Sql
String str = new File("connect.txt").text
String []strArr = str.split(" ")
def login = strArr[0];
def passwd =  strArr[1];
def sql = Sql.newInstance("jdbc:mysql://localhost/new?serverTimezone=Europe/Moscow&useSSL=false", login, passwd, "com.mysql.cj.jdbc.Driver")
def list = []
sql.query('SELECT * FROM employer') {resultSet ->
    while (resultSet.next()) {
        def id = resultSet.getInt('id')
        def name = resultSet.getString('name')
        def email = resultSet.getString('email')
        def position = resultSet.getString('employer_position')
        list.add(new FirstClass(id, name, email, position))
    }
}
println list