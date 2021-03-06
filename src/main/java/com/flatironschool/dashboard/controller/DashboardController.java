package com.flatironschool.dashboard.controller;

import com.flatironschool.dashboard.model.Condenser;
import com.flatironschool.dashboard.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class DashboardController {
    @Autowired
    DashboardService dashboardService;

    @GetMapping("/condenser")
    public Iterable<Condenser> getAllCondensers() {
        return dashboardService.getAllCondensers();
    }

    @PostMapping("/condenser")
    public Condenser createCondenser(@RequestBody Condenser condenser) {
        return this.dashboardService.addCondenser(condenser);
    }
}
