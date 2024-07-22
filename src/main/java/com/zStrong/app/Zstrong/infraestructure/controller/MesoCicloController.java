package com.zStrong.app.Zstrong.infraestructure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Update;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.zStrong.app.Zstrong.core.model.MesoCiclo;
import com.zStrong.app.Zstrong.core.model.Routine;
import com.zStrong.app.Zstrong.infraestructure.controller.DTOs.MesoCicloDTO;
import com.zStrong.app.Zstrong.infraestructure.controller.DTOs.RoutineDTO;
import com.zStrong.app.Zstrong.infraestructure.controller.mappers.mesoCicloMapper;
import com.zStrong.app.Zstrong.infraestructure.controller.mappers.routineMapper;
import com.zStrong.app.Zstrong.service.serviceInterface.iexerciseService;
import com.zStrong.app.Zstrong.service.serviceInterface.imesocicloService;
import com.zStrong.app.Zstrong.service.serviceInterface.iroutineService;
import com.zStrong.app.Zstrong.service.serviceInterface.iserieService;

import lombok.RequiredArgsConstructor;


@CrossOrigin("*")
@RestController
@RequestMapping("/zstrong/api/v1")
@RequiredArgsConstructor
public class MesoCicloController {
    
    @Autowired
    private final imesocicloService imesocicloService;
    @Autowired
    private final iserieService iserieService;
    @Autowired
    private final iexerciseService iexerciseService;
    @Autowired
    private  final iroutineService iIroutineService;

    private final mesoCicloMapper mesoCicloMapper;
    private final routineMapper routineMapper;

     /*MesoCiclo ControllerPart*/
    @PostMapping("/saveMesoCiclo")
    public  ResponseEntity<MesoCiclo> saveMesoCiclo(@RequestBody MesoCicloDTO mesoCicloDTO){
        System.out.println("Entro A MesocCiclo");
        MesoCiclo mesoCiclo = mesoCicloMapper.tomesoCicloDTO(mesoCicloDTO);
        return ResponseEntity.ok(this.imesocicloService.saveMesoCiclo(mesoCiclo));
    }

    @PostMapping("/UpdateMesoCiclo")
    public  ResponseEntity<MesoCiclo> updateMesoCiclo(@RequestBody MesoCicloDTO mesoCicloDTO){
        System.out.println("Entro A MesocCiclo");
        MesoCiclo mesoCiclo = mesoCicloMapper.tomesoCicloDTO(mesoCicloDTO);
        return ResponseEntity.ok(this.imesocicloService.saveMesoCiclo(mesoCiclo));
    }

    @GetMapping("/listUserMesoCiclos")
    public ResponseEntity<List<MesoCiclo>> listUserMesoCiclos(@RequestParam @Validated String userId){
        return ResponseEntity.ok(this.imesocicloService.listMesoCiclosByUser(userId));
    }

    @DeleteMapping("/deleteMesoCiclo")
    public ResponseEntity<MesoCiclo> deleteMesoCiclo(@RequestBody MesoCicloDTO mesoCicloDTO){
        MesoCiclo mesoCiclo = mesoCicloMapper.tomesoCicloDTO(mesoCicloDTO);
        return ResponseEntity.ok(this.imesocicloService.delteMesoCiclo(mesoCiclo));
    }

    @PostMapping("/addRoutineToMesoCiclo")
    public ResponseEntity<MesoCiclo> addRoutineToMesoCiclo(@RequestBody MesoCicloDTO mesoCicloDTO, @RequestParam String routineId){
        MesoCiclo mesoCiclo = mesoCicloMapper.tomesoCicloDTO(mesoCicloDTO);
        return ResponseEntity.ok(this.imesocicloService.addRoutinetoMesoCiclo(mesoCiclo, routineId));
    }
    
    /*Exception Handler */
    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
 



    
}
