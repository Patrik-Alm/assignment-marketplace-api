package io.github.patrikalm.assignmentmarketplaceapi.repository;

import io.github.patrikalm.assignmentmarketplaceapi.entity.Advertisement;
import org.springframework.data.repository.CrudRepository;

public interface AdvertisementRepository extends CrudRepository {

    List<Advertisement>
}
