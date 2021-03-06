package br.edu.unibratec.psc.model.dao;

import javax.persistence.EntityManager;

import br.edu.unibratec.psc.model.entity.EntityInterface;

public interface InterfaceDAO<T extends EntityInterface> {
	
	public void defineEntityClass(Class<T> pClasseEntidade ) ;
	public Class<T> getEntityClass();
	
	public void insert(T pEntidade);
	public void insert(T pEntidade, EntityManager pEntityManager, boolean pFecharEntityManager);
	
	public void update(T pEntidade);
	public void update(T pEntidade, EntityManager pEntityManager, boolean pFecharEntityManager);
	
	public void deleteObject(T pEntidade);
	public void deleteObject(Class<T> pClasse, T pEntidade);
	public void deleteObject(Class<T> pClasse, T pEntidade, EntityManager pEntityManager, boolean pFecharEntityManager);
	
	public void deleteByPrimaryKey(Class<T> pClasse, Object pChavePrimaria);
	public void deleteByPrimaryKey(Class<T> pClasse, Object pChavePrimaria, EntityManager pEntityManager, boolean pFecharEntityManager);
	
	public T selectByPrimaryKey(Class<T> pClasse, Object pPrimaryKey);
	public T selectByPrimaryKey(Class<T> pClass, Object pPrimaryKey, EntityManager pEntityManager, boolean pCloseEntityManager);
	
	public T selectByEntity(Class<T> pClass, T pEntity);
	public T selectByEntity(Class<T> pClass, T pEntity, EntityManager pEntityManager, boolean pCloseEntityManager);
	
}
