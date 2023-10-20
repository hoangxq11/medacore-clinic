package com.medacore.demo.repository;

import com.medacore.demo.model.HolidaySchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HolidayScheduleRepository extends JpaRepository<HolidaySchedule, Integer> {
}
