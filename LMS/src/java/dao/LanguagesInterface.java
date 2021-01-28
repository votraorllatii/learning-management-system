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
public interface LanguagesInterface {
    
    void addLanguage(Languages l);

    void updateLanguage(Languages l);

    void deleteLanguage(int id);

    Languages getLanguages(int languageId);

    List<Languages> findAll();
    
}
