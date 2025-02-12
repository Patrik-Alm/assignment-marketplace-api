package io.github.patrikalm.assignmentmarketplaceapi.repository;

import io.github.patrikalm.assignmentmarketplaceapi.entity.Advertisement;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdvertisementRepository extends CrudRepository {

    List<Advertisement> findAllAdvertisementsByUserEmail(String email);

    List<Advertisement> findAllAdvertisements();

    List<Advertisement> findAllAdvertisementsByUserId(String userId);

    List<Advertisement> findAllAdvertisementsBeforeDateEndDate();

    List<Advertisement> findAllAdvertisementsAfterDateEndDate();

    void deleteAllAdvertisementsAfterDateEndDate();




}
