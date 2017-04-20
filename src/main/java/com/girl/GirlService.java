package com.girl;

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

}
