/*
 * Code challenge for Globant
 */
package com.globant;

/**
 *
 * @author jaya
 */
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class UserDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    UserDao() {
        if (emf == null) {
            emf = javax.persistence.Persistence.createEntityManagerFactory("globant");
            em = emf.createEntityManager();
        }
    }

    public List<User> findAllUsers() {
        TypedQuery<User> query = em.createQuery("SELECT o FROM User o ORDER BY o.id", User.class);
        return query.getResultList();
    }

    public List<User> findUsersByParameters(final Map<String, Object> paramMap) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<User> cq = cb.createQuery(User.class);
        Root<User> user = cq.from(User.class);
        //Constructing list of parameters
        List<Predicate> predicates = new ArrayList<>();
        for (Map.Entry<String, Object> entry : paramMap.entrySet()) {
            predicates.add(cb.equal(user.get(entry.getKey()), entry.getValue()));
        }
        cq.select(user).where(predicates.toArray(new Predicate[]{}));
        //execute query and do something with result
        return em.createQuery(cq).getResultList();
    }

    public User findUserByIdAndPassword(final String userId, final String password) {
        TypedQuery<User> query = em.createQuery("SELECT o FROM User o where o.userId = :userId and o.password = :password", User.class);
        return query.setParameter("userId", userId).setParameter("password", password).getSingleResult();
    }
    
    public boolean isDatabaseConnectionAlive() {
        boolean result = false;
        try {
            em.createNativeQuery("SELECT count(*) FROM User").getSingleResult();
            result = true;
        } catch(Exception ex) {
            if (ex.getCause().equals(SQLException.class)) {
                result = false;
            }
        }
        return result;
    }
    

}
