package com.girl.service;

import com.girl.repository.GirlRepository;
import com.girl.domain.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by corning on 2017/4/20.
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo() {

        Girl girlA = new Girl("A", 11);
        girlRepository.save(girlA);


        Girl girlB = new Girl("B", 20);
        girlRepository.save(girlB);

    }


    public String  getAge(Integer id) {
        Girl girl = girlRepository.findOne(id);
        Integer age = girl.getAge();
        if (age < 10) {
            return "你还在上小学吧";
        } else if (age > 10 && age < 16) {
            return "你可能在上初中";
        }
    }

}
