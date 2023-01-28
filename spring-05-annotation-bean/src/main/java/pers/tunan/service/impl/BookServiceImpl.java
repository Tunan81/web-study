package pers.tunan.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pers.tunan.service.BookService;

/**
 * @author Tunan
 * @version 1.0
 */

//@Component
@Service
public class BookServiceImpl implements BookService {
    public void save() {
        System.out.println("book service save ...");
    }
}
