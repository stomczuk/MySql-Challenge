public class MysqlQueries {

    public static void main(String[] args) {

        String query1 = "CREATE TABLE student(id INT, firstname VARCHAR(32), lastname VARCHAR(32), " +
                "contact VARCHAR(30), marks INT)";

        String query2 = "INSERT INTO student VALUES(1, 'John', 'Smith', '55555555', 4);\n" +
                "\tINSERT INTO student VALUES(2, 'Bob', 'Smith', '3333333', 2);\n" +
                "\tINSERT INTO student VALUES(3, 'Adam', 'Kowalski', '22222222', 4);\n" +
                "\tINSERT INTO student VALUES(4, 'Sebastian', 'Kowalski', '555555511115', 5);\n" +
                "\tINSERT INTO student VALUES(5, 'John', 'Kowalski', '55555555', 4)";

        String query3 = "Select * From student";

        String query4 = "Select * From student Where firstname='John'";

    }
}
