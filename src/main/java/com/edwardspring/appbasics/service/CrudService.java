package com.edwardspring.appbasics.service;

import com.edwardspring.appbasics.model.PatchModel;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author Edward Abattam
 * @version 0.1.0
 * @apiNote Service to provide crud functionalities to be implemented
 * @since 0.1.0
 */
public interface CrudService<D> {
    /**
     * Method to save entity
     *
     * @param dto
     * @return {@link D}
     */
    D save(D dto);

    /**
     * Method to update entity
     *
     * @param dto
     * @return
     */
    D update(D dto);

    /**
     * Method to create partial update on entity
     *
     * @param id
     * @param model
     * @return
     */
    D patch(Long id, PatchModel model);

    /**
     * Method to find all
     *
     * @param pageable
     * @return {@link Page}
     */
    Page<D> findAll(Pageable pageable);

    /**
     * Method to find one entity
     *
     * @param id
     * @return
     */
    Optional<D> findOne(Long id);

    /**
     * Method to delete entity
     *
     * @param id
     */
    void delete(Long id);
}
