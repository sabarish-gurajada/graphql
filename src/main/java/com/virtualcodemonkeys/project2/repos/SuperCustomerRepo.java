package com.virtualcodemonkeys.project2.repos;

import com.virtualcodemonkeys.project2.models.SuperCustomer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Slf4j
public class SuperCustomerRepo {

    private List<SuperCustomer> theCharacters = new ArrayList<SuperCustomer>();

    public SuperCustomerRepo(){ seedCharacters(); }

    private void seedCharacters(){
        SuperCustomer c1 = SuperCustomer.builder()
		 .id("Cust0123")
                 .sortcode(123456)
                 .accno(12345678)
                 .title("Mr")
                 .fname("Sabarish")
                 .sname("Gurajada")
                 .abalance(1000)
                 .cbalance(1000)
                 .postcode("WAXXXX")
                 .dob(130889)
                 .custtype("Personal")
                 .mandate("Yes")
		 .build();


	SuperCustomer c2 = SuperCustomer.builder()
		 .id("Cust0126")
                 .sortcode(123466)
                 .accno(100008)
                 .title("Mr")
                 .fname("David")
                 .sname("Thompson")
                 .abalance(44000)
                 .cbalance(43000)
                 .postcode("MWAXXXX")
                 .dob(230169)
                 .custtype("Personal")
                 .mandate("Yes")
                 .build();
        this.theCharacters.add(c1);
        this.theCharacters.add(c2);
    }

    public List<SuperCustomer> getCharacters(){
        return this.theCharacters;
    }
    

    public SuperCustomer getCharacterById(String id){
        List<SuperCustomer> matched = this.theCharacters.stream()
                .filter(c->c.getId().equalsIgnoreCase(id))
                .collect(Collectors.toList());

        if( matched.size() > 0){
            return matched.get(0);
        }else{
            return null;
        }
    }
/*
    public SuperCustomer addCharacter(String name, Integer age){
        SuperCustomer newChar = SuperCustomer.builder()
                .custid(custid)
		.sortcode(sortcode)
		.accno(accno)
		.title(title)
		.fname(fname)
		.sname(sname)
		.abalance(abalance)
		.cbalance(cbalance)
		.postcode(postcode)
		.dob(dob)
		.custtype(custtype)
		.mandate(mandate)
                .build();
        log.info("> Mutation.addCharacter( "+ name + " )");
        this.theCharacters.add(newChar);
        return newChar;
    }
  */  
}
