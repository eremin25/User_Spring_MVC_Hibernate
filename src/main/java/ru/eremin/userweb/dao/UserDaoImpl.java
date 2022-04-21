package ru.eremin.userweb.dao;

import org.springframework.stereotype.Repository;
import ru.eremin.userweb.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("FROM User").getResultList();
    }

    @Override
    public User getUser(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void deleteUser(Long id) {
        entityManager.createQuery("DELETE FROM User where id= :id")
                .setParameter("id", id)
                .executeUpdate();
    }

    @Override
    public void editUser(User user) {
        entityManager.merge(user);
    }
}
