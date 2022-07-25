package com.webtech.main.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.management.relation.Role;

public class Users {
	private int id;
	private String name;
	private String username;
	private String password;
	private Collection<Role> role=new ArrayList<>();
}
