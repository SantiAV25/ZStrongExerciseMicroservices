package com.zStrong.app.Zstrong.infraestructure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zStrong.app.Zstrong.core.model.Exercise;
import com.zStrong.app.Zstrong.core.model.Routine;
import com.zStrong.app.Zstrong.core.model.Serie;
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
public class RoutineController {

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

       /*Routines ControlerPart*/
    @PostMapping("/saveRoutine")
    public ResponseEntity<Routine> saveRoutine(@RequestBody RoutineDTO routineDTO){
        Routine routine = routineMapper.toroutineDTO(routineDTO);
        return ResponseEntity.ok(this.iIroutineService.saveRoutine(routine));
    }

    @PostMapping("/updateRoutine")
    public ResponseEntity<Routine> updateRoutine(@RequestBody RoutineDTO routineDTO){
        Routine routine = routineMapper.toroutineDTO(routineDTO);
        return ResponseEntity.ok(this.iIroutineService.editRoutine(routine));
    }

    @GetMapping("/listUserRoutines")
    public ResponseEntity<List<Routine>> listUserRoutines(@RequestParam @Validated String userId){
        return ResponseEntity.ok(this.iIroutineService.listRoutinesByUser(userId));
    }

    @PostMapping("/addExerciseToRoutine")
    public ResponseEntity<Exercise> addExerciseToRoutine(@RequestParam @Validated String routineId,@RequestBody Exercise exercise){
        return ResponseEntity.ok(this.iexerciseService.saveExercise(routineId, exercise));
    }

    @PostMapping("/editExerciseToRoutine")
    public ResponseEntity<Exercise> editExerciseToRoutine(@RequestParam @Validated String routineId,@RequestBody Exercise exercise){
        return ResponseEntity.ok(this.iexerciseService.editExercise(routineId, exercise));
    }

    @PostMapping("/deleteExerciseToRoutine")
    public ResponseEntity<Exercise> deleteExerciseToRoutine(@RequestParam @Validated String routineId,@RequestBody Exercise exercise){
        return ResponseEntity.ok(this.iexerciseService.delteExercise(routineId, exercise));
    }

    @PostMapping("/addSeriesToExercise")
    public ResponseEntity<Exercise> addSeriesToExercise(@RequestParam @Validated String routineId,@RequestParam String exerciseId,@RequestBody Serie serie){
        System.out.println("Llego al controller");
        return ResponseEntity.ok(this.iexerciseService.addSeriesToExercise(routineId, exerciseId, serie));
    }

}
