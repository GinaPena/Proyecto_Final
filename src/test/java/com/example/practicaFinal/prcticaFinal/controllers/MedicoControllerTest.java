package com.example.practicaFinal.prcticaFinal.controllers;


import com.example.practicaFinal.prcticaFinal.Service.MedicoService;
import com.example.practicaFinal.prcticaFinal.controller.MedicosController;
import com.example.practicaFinal.prcticaFinal.domain.Medico;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MedicoControllerTest {
    private MockMvc mockMvc;
    private MedicosController medicosController;

    @Mock
    private MedicoService medicoService;

    public MedicoControllerTest() {
    }

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        Medico medico = new Medico();
        medico.setIdMedico(9L);
        medico.setNombre("Montse");
        medico.setEspecial(4L);
        medico.setEstado("HABILITADO");

        Mockito.when(medicoService.findOne(9L)).thenReturn(medico);

        medicosController = new MedicosController(medicoService);

        mockMvc = MockMvcBuilders.standaloneSetup(medicosController).build();


    }

  //    @Test
   //public void testListAll_0args() {
     //   System.out.println("listAll");
       // List<Medico> listAll = medicosController.listAll();
        //assertEquals(2, listAll.size());
    //}

    //@Test
    //public void testGetMedicos_isError404WhenRolIsNotFound() throws Exception {
      //  System.out.println("getMedicos");
       // final long id = 2;

        //mockMvc.perform(get("/Medicos/" + id)
          //      .accept(MediaType.APPLICATION_JSON))
            //    .andExpect(status().isNotFound())
              //  .andExpect(content().string(""));
    //}

  //  @Test
//    public void testDeleteMedico() {
//        System.out.println("deleteMedico");
//        Long id = null;
//        medicosController instance = new medicosController();
//        ResponseEntity<Medicos> expResult = null;
//        ResponseEntity<Medicos> result = instance.deleteMedicos(idMedico);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
