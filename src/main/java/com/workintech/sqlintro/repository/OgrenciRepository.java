package com.workintech.sqlintro.repository;

import com.workintech.sqlintro.entity.Ogrenci;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OgrenciRepository extends JpaRepository<Ogrenci, Long> {

    String QUESTION_1 = "select * from ogrenci";
    @Query(value = QUESTION_1, nativeQuery = true)
    List<Ogrenci> findAll();

    String QUESTION_2 = "select * from ogrenci where cinsiyet='K'";
    @Query(value = QUESTION_2, nativeQuery = true)
    List<Ogrenci> findGirls();

    String QUESTION_3 = "select distinct sinif from ogrenci";
    @Query(value = QUESTION_3, nativeQuery = true)
    List<String> findAllClasses();

    String QUESTION_4 = "select * from ogrenci where sinif = '10A' and cinsiyet = 'K'";
    @Query(value = QUESTION_4, nativeQuery = true)
    List<Ogrenci> find10AGirls();

    String QUESTION_5 = "select * from ogrenci where cinsiyet='K' and ogrno>5 and ogrno<10";
    @Query(value = QUESTION_5, nativeQuery = true)
    List<Ogrenci> findGirlsWithOgrno();

    String QUESTION_6 = "select * from ogrenci order by ad";
    @Query(value = QUESTION_6, nativeQuery = true)
    List<Ogrenci> findStudentsAlphabetically();

    String QUESTION_7 = "select * from ogrenci where sinif = '10A' order by ogrno desc";
    @Query(value = QUESTION_7, nativeQuery = true)
    List<Ogrenci> find10AStudentsByOgrNo();

    String QUESTION_8 = "select * from ogrenci order by dtarih desc limit 1";
    @Query(value = QUESTION_8, nativeQuery = true)
    Ogrenci findYoungestStudent();

    String QUESTION_9 = "select * from ogrenci order by dtarih asc limit 1";
    @Query(value = QUESTION_9, nativeQuery = true)
    Ogrenci findElderStudent();

    String QUESTION_10 = "select * from ogrenci where ad ilike '_e%'";
    @Query(value = QUESTION_10, nativeQuery = true)
    List<Ogrenci> findStudentsSecondLetterOfN();

}