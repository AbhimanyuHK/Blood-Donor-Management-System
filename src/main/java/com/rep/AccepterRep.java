/**
 * 
 */
package com.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.models.Accepter;

/**
 * @author abhimanyu
 *
 */
@Repository
public interface AccepterRep extends JpaRepository<Accepter, Long> {

}
