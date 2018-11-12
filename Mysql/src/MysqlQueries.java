public class MysqlQueries {

    public static void main(String[] args) {

        String query1 = "CREATE TABLE student(id INT, firstname VARCHAR(32), lastname VARCHAR(32), " +
                "contact VARCHAR(30), marks INT)";

        String query2 = "INSERT INTO student VALUES(1, 'John', 'Smith', '55555555', 4);\n" +
                "\tINSERT INTO student VALUES(2, 'Bob', 'Smith', '3333333', 2);\n" +
                "\tINSERT INTO student VALUES(3, 'Adam', 'Kowalski', '22222222', 4);\n" +
                "\tINSERT INTO student VALUES(4, 'Sebastian', 'Kowalski', '555555511115', 5);\n" +
                "\tINSERT INTO student VALUES(5, 'John', 'Kowalski', '55555555', 4)";

        String query3 = "SELECT * FROM student";

        String query4 = "SELECT * FROM student Where firstname='John'";

        String query5 = "SELECT * FROM student where firstname='John' AND lastname='Smith'";

        String query6 = "SELECT * FROM student where firstname='John' OR lastname='Smith'";

        String query7 = "SELECT * FROM student where firstname LIKE 'J%'";

        String query8 = "SELECT * FROM student where marks BETWEEN 2 AND 5";

        String query9 = "SELECT concat ( firstname,' ',lastname) from student";

        String query10 = "UPDATE student set firstname='123' where id=2;";

        String query11 = "DELETE FROM student where id=2;";


    }
}
