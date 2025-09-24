//DESAFIO 1.4 AULA 3
package br.ifsp.contacts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ifsp.contacts.model.Address;
import br.ifsp.contacts.repository.AddressRepository;
import br.ifsp.contacts.repository.ContactRepository;

@RestController
@RequestMapping("/api/addresses")
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private ContactRepository contactRepository;

    @PostMapping
    public Address addAddress(@RequestBody Address address) {
        return addressRepository.save(address);
    }

    @GetMapping
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }
}