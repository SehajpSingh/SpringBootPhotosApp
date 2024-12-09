package com.springBoot.test.photoz_clone.repository;

import com.springBoot.test.photoz_clone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotozRepository extends CrudRepository<Photo, Integer> {

}
