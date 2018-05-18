/**
 * 
 */
package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.models.Donor;
import com.rep.DonorRepn;

/**
 * @author abhimanyu
 *
 */
@RestController
public class DonorRegistration {

	@Autowired
	private DonorRepn donorRepn;

	@RequestMapping(value = "/")
	String index() {
		return "Blood Donor Management System is ready.!";

	}

	@RequestMapping(value = "/donor", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Donor> signUpDonor(@RequestBody Donor donor, UriComponentsBuilder ucBuilder) {

		ObjectMapper mapper = new ObjectMapper();
		Donor d = mapper.convertValue(donor, Donor.class);
		donorRepn.save(d);

		HttpHeaders headers = new HttpHeaders();
		// headers.setLocation(ucBuilder.path("/donor/{id}").buildAndExpand(d.getId()));
		return new ResponseEntity<Donor>(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/donors")
	public Donor getdonor(@RequestParam("id") long id) {

		Donor donor = new ObjectMapper().convertValue(donorRepn.getOne(id), Donor.class);

		return donor;

	}
}
