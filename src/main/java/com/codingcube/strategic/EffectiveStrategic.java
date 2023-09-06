package com.codingcube.strategic;

import org.aspectj.lang.ProceedingJoinPoint;

import javax.servlet.http.HttpServletRequest;

/**
 * @author CodingCube<br>*
 * Effective Record Class*
 */
public abstract class EffectiveStrategic {
    public abstract Boolean effective(HttpServletRequest request, ProceedingJoinPoint joinPoint, Object result);
}
