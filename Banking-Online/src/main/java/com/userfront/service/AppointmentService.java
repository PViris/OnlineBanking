package com.userfront.service;

import java.util.List;

import com.userfront.domain.Appointment;
/**
 * @author punit.gautam
 *
 */
public interface AppointmentService {
    
	Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

    Appointment findAppointment(Long id);

    void confirmAppointment(Long id);
}
