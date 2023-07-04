package com.rcoolone.onlineshopping.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.lang.module.ResolvedModule;

@AllArgsConstructor
@Builder
@Data
public class User {
    String name;
    String email;
}
