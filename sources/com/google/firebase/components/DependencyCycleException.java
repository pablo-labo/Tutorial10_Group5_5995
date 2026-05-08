package com.google.firebase.components;

import defpackage.uf2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DependencyCycleException extends DependencyException {
    private final List<uf2<?>> componentsInCycle;

    public DependencyCycleException(ArrayList arrayList) {
        super("Dependency cycle detected: " + Arrays.toString(arrayList.toArray()));
        this.componentsInCycle = arrayList;
    }
}
