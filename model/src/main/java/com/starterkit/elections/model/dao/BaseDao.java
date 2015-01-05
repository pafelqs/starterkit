package com.starterkit.elections.model.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class BaseDao<T> {

	private final Class<T> entityType;

	@SuppressWarnings("unchecked")
	public BaseDao() {
		this.entityType = ((Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0]);
	}

	@PersistenceContext
	private EntityManager entityManager;

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public T findById(Long id) {
		return entityManager.find(entityType, id);
	}

	public void save(T type) {
		entityManager.persist(type);
	}

	public void update(T type) {
		entityManager.merge(type);
	}

	public void delete(T type) {
		entityManager.remove(entityManager.contains(type) ? type
				: entityManager.merge(type));
	}

	public List<T> getList() {
		return entityManager.createQuery("from " + entityType.getName(),
				entityType).getResultList();
	}
}
