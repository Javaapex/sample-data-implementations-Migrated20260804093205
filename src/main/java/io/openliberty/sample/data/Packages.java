package io.openliberty.sample.data;

import jakarta.data.repository.BasicRepository;
import jakarta.data.repository.Repository;

@Repository
public interface Packages extends BasicRepository<Package, Integer> {

}
