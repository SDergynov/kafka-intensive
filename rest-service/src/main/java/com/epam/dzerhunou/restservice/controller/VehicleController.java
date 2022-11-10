package com.epam.dzerhunou.restservice.controller;

import com.epam.dzerhunou.restservice.model.Vehicle;
import com.epam.dzerhunou.restservice.model.VehicleSignal;
import com.epam.dzerhunou.restservice.service.VehicleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/vehicle")
@Slf4j
public class VehicleController {
    private final VehicleService vehicleService;

    @PostMapping("/{id}/signal")
    public ResponseEntity<Vehicle> createVehicleSignal(
            @Valid @ModelAttribute VehicleSignal vehicleSignal,
            @PathVariable Long id
    ) {
        Vehicle vehicle = vehicleService.createSignal(id);
        return new ResponseEntity<>(vehicle, HttpStatus.OK);
    }
}
