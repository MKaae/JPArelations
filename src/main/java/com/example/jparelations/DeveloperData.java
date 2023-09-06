package com.example.jparelations;

import com.example.jparelations.entity.Address;
import com.example.jparelations.entity.Citizen;
import com.example.jparelations.entity.Town;
import com.example.jparelations.repositories.AddressRepository;
import com.example.jparelations.repositories.TownRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeveloperData implements ApplicationRunner {
    private final AddressRepository addressRepository;
    private AddressService addressService;
    private TownRepository townRepository;

    public DeveloperData(AddressRepository addressRepository, AddressService addressService, TownRepository townRepository){
        this.addressRepository = addressRepository;
        this.addressService = addressService;
        this.townRepository = townRepository;
    }
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Town t1 = new Town("Lyngby","2800", "Borgmester Olsen", 119);
        townRepository.save(t1);
        Address a1 = new Address("Lyngbyvej 1", "2800", "Lyngby");
        Citizen citizen1 = new Citizen("Kurt", "Wonnegut", "a@b.dk","123");
        Citizen citizen2 = new Citizen("Hanne", "Wonnegut", "h@b.dk", "234");
        a1.addCitizen(citizen1);
        a1.addCitizen(citizen2);
        citizen1.setTown(t1);
        citizen2.setTown(t1);
        addressRepository.save(a1);

        System.out.println("------- Select statements starts here ------------");
        //Address address_1 = addressRepository.findById(a1.getId()).get();
        //System.out.println(address_1.getStreet());
        //System.out.println("Press Enter to continue");
        //System.in.read();  //This will block so you have time to read the DEBUG statements
        //System.out.println("Citizens: "+address_1.getCitizens().size());
        addressService.printFullAddressInfo(1,true);

    }
}
