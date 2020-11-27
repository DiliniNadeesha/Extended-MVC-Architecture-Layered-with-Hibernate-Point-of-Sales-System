//package dao;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.List;
//
//class CrudUtilTest {
//
//    public static void main(String[] args) throws Exception {
//
////        ResultSet rst = CrudUtil.<ResultSet>execute("SELECT * FROM Customer WHERE id=?","C001");
////        System.out.println(rst.next());
////        System.out.println(rst.getString(1));
//
//        //============
//
//        //        List<String> params = new ArrayList<>();
////        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Customer");
////        System.out.println(rst.next());
//
//
////        List<String> params = new ArrayList<>();
////        params.add("C001");
////        params.add("Kasun");
////        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Customer WHERE id=? AND name=?", params);
////        System.out.println(rst.next());
//
//
////        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Customer WHERE id=?","C001");
////        System.out.println(rst.next());
//
//        ResultSet rst = CrudUtil.execute("SELECT * FROM Customer WHERE id=?", "C001");
//        System.out.println(rst.next());
//
//    }
//
//}