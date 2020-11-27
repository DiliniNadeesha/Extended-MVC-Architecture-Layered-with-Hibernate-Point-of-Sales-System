import db.HibernateUtil;
import org.hibernate.Session;

public class HibernateUtilTest {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        System.out.println(session);
        session.close();
    }
}
