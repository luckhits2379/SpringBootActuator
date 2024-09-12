package com.ng.springboot.actuator.beans;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Component
public class Student {

	private int id;
	private String name;

}
