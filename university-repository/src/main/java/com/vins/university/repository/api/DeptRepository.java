package com.vins.university.repository.api;

import com.vins.university.model.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by kisa on 8/14/2016.
 */
@Repository
public interface DeptRepository extends JpaRepository<Dept, Long>
{

}
