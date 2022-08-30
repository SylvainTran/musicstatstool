package com.example.musicstatstool;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {
    @DeclareParents(value="com.example.musicstatstool.Recorder+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
