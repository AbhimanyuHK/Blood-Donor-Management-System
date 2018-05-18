/**
 * 
 */
package com.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.models.Donor;

/**
 * @author abhimanyu
 *
 */
@Repository
public interface DonorRepn extends JpaRepository<Donor, Long> {

}
