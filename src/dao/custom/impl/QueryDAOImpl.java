package dao.custom.impl;

import dao.custom.QueryDAO;
import entity.CustomEntity;
import org.hibernate.Session;
import org.hibernate.transform.Transformers;

public class QueryDAOImpl implements QueryDAO {

    private Session session;

    @Override
    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public CustomEntity getOrderDetail(String orderId) throws Exception {
        //Here use Native SQL
        return (CustomEntity) session.createNativeQuery("SELECT  o.id, AS orderId, c.name AS customerName, o.date FROM `Order` o\n" +
                "INNER JOIN Customer c on o.customerId = c.id\n" + "WHERE o.id=?", orderId)
                .setResultTransformer(Transformers.aliasToBean(CustomEntity.class)).uniqueResult();
    }

    @Override
    public CustomEntity getOrderDetail2(String orderId) throws Exception {
        //ON use JPQL, WITH Use HQL
        //SQL use ON
        //Here use HQL
        return (CustomEntity) session.createQuery("SELECT NEW entity.CustomEntity(C.id, C.name, O.id)"+
                " FROM Order O INNER JOIN O.customer C WHERE O.id=:id")
                .setParameter("id", orderId).uniqueResult();
    }
}
