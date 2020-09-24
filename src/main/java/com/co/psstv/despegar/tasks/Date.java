package com.co.psstv.despegar.tasks;

import java.util.List;

import com.co.psstv.despegar.models.FlyDate;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class Date implements Task {

	List<FlyDate> flyDate;

	public Date(List<FlyDate> flyDate) {
		this.flyDate = flyDate;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

	}

}
