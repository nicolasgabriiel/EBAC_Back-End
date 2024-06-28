package dao;

import domain.Carro;

public class CarroDAO {


        public Carro cadastrar(Carro carro) {
            EntityManagerFactory entityManagerFactory =
                    Persistence.createEntityManagerFactory("ExemploJPA");
            EntityManager entityManager = entityManagerFactory.createEntityManager();

            entityManager.getTransaction().begin();
            entityManager.persist(aluno);
            entityManager.getTransaction().commit();

            entityManager.close();
            entityManagerFactory.close();


            return carro;
        }



}
