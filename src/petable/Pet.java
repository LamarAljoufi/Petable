/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petable;

public interface Pet {

    void createPet() throws Exception;

    void updatePet(int petId, String name, int age, String gender, boolean healthStatus);

  
}
