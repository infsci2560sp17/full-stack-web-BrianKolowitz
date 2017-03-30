/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.repositories;

import edu.infsci2560.models.Rating;
import edu.infsci2560.models.RatingPk;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author kolobj
 */
public interface RatingRepository extends PagingAndSortingRepository<Rating, RatingPk> {
    Page<Rating> findByRatingPkDvdId(Long dvdId, Pageable pageable);
}
