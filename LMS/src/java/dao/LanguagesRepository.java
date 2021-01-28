/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Languages;

/**
 *
 * @author VotraOrllati
 */
public class LanguagesRepository extends EntMngClass implements LanguagesInterface {

    @Override
    public void addLanguage(Languages l) {
        try {
            em.getTransaction().begin();
            em.persist(l);
            em.getTransaction().commit();
        } catch (Throwable thro) {
            if (thro.getMessage().contains("2627")) {
                //throw new EmployeesException("Data already exists!");
            } else {
                //throw new EmployeesException("Create : "+thro.getClass()+" - "+thro.getMessage());
            }
        }
    }

    @Override
    public void updateLanguage(Languages l) {
        try {
            em.getTransaction().begin();
            em.merge(l);
            em.getTransaction().commit();
        } catch (Throwable thro) {
            if (thro.getMessage().contains("2627")) {
                //throw new EmployeesException("Data already exists!");
            } else {
                //throw new EmployeesException("Create : "+thro.getClass()+" - "+thro.getMessage());
            }
        }
    }

    @Override
    public void deleteLanguage(int id) {
        try {
            em.getTransaction().begin();
            Languages l = getLanguages(id);
            em.remove(l);
            em.getTransaction().commit();
        } catch (Throwable thro) {
            if (thro.getMessage().contains("2627")) {
                //throw new EmployeesException("Data already exists!");
            } else {
                //throw new EmployeesException("Create : "+thro.getClass()+" - "+thro.getMessage());
            }
        }
    }

    @Override
    public Languages getLanguages(int languageId) {
        return em.find(Languages.class, languageId);
    }

    @Override
    public List<Languages> findAll() {
        return em.createNamedQuery("Languages.findAll").getResultList();
    }

}
