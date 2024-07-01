package noman.love.java.chapter3.examples;

public class TableGenerator {

    public static void main(String[] args) {
        String table = """
                            MasterDevSkills (PVT) LTD
                        403, Church St, Toronto, ON, CA.
                                CUSTOMER INVOICE
                +-----------------------+-----------------------+
                |INFO                   |CUSTOMER               |
                +-----------------------+-----------------------+
                |DATE: 2024-10-20       |XZY Distributors       |
                |TIME: 07:11:PM         |MOB: +880 1926586804   |
                |BILL NO: 12            |ADDRESS: NO 25, Main St|
                |INVOICE NO: 458-80-108 |reet, ON, CA           |
                +-----------------------+-----------------------+
                |               SELLING DETAILS                 |
                +-----------------+---------+------+------------+
                |ITEM             |PRICE ($)|   QTY|       VALUE|
                +-----------------+---------+------+------------+
                |Optical mouse    |   120.00|    20|     2400.00|
                |Gaming keyboard  |   550.00|    30|    16500.00|
                +-----------------+---------+------+------------+
                                              GROSS    18,900.00
                                       DISCOUNT(5%)       945.00
                                            PAYABLE     17955.60
                """;
        System.out.println(table);
    }
}
