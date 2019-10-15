package com.javainuse.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
@Getter
@AllArgsConstructor
public class JwtResponse implements Serializable {
	private final String jwttoken;
}