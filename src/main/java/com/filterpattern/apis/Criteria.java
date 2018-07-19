package com.filterpattern.apis;

import java.util.List;

import com.filterpattern.entity.Person;


/**
 * com.apis [workset_idea_01]
 * Created by Richard on 2018/4/9
 *
 * @author Richard on 2018/4/9
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
