package com.carpediem.randy.daggerproject.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by randy on 15-9-18.
 */
@Scope @Retention(RetentionPolicy.RUNTIME)
public @interface IComputer {
}
