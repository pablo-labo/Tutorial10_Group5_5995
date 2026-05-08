package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.a25;
import defpackage.b25;
import defpackage.c5g;
import defpackage.cn8;
import defpackage.h5;
import defpackage.k20;
import defpackage.l5;
import defpackage.mw8;
import defpackage.n71;
import defpackage.s40;
import defpackage.uf2;
import defpackage.uh1;
import defpackage.y15;
import defpackage.y8c;
import defpackage.yid;
import defpackage.z15;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final cn8<ScheduledExecutorService> a = new cn8<>(new y15());
    public static final cn8<ScheduledExecutorService> b = new cn8<>(new z15());
    public static final cn8<ScheduledExecutorService> c = new cn8<>(new a25());
    public static final cn8<ScheduledExecutorService> d = new cn8<>(new b25());

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<uf2<?>> getComponents() {
        y8c y8cVar = new y8c(n71.class, ScheduledExecutorService.class);
        y8c[] y8cVarArr = {new y8c(n71.class, ExecutorService.class), new y8c(n71.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(y8cVar);
        for (y8c y8cVar2 : y8cVarArr) {
            yid.b(y8cVar2, "Null interface");
        }
        Collections.addAll(hashSet, y8cVarArr);
        uf2 uf2Var = new uf2(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new s40(), hashSet3);
        y8c y8cVar3 = new y8c(uh1.class, ScheduledExecutorService.class);
        y8c[] y8cVarArr2 = {new y8c(uh1.class, ExecutorService.class), new y8c(uh1.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(y8cVar3);
        for (y8c y8cVar4 : y8cVarArr2) {
            yid.b(y8cVar4, "Null interface");
        }
        Collections.addAll(hashSet4, y8cVarArr2);
        uf2 uf2Var2 = new uf2(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new k20(9), hashSet6);
        y8c y8cVar5 = new y8c(mw8.class, ScheduledExecutorService.class);
        y8c[] y8cVarArr3 = {new y8c(mw8.class, ExecutorService.class), new y8c(mw8.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(y8cVar5);
        for (y8c y8cVar6 : y8cVarArr3) {
            yid.b(y8cVar6, "Null interface");
        }
        Collections.addAll(hashSet7, y8cVarArr3);
        uf2 uf2Var3 = new uf2(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new h5(12), hashSet9);
        uf2.a aVarA = uf2.a(new y8c(c5g.class, Executor.class));
        aVarA.f = new l5(12);
        return Arrays.asList(uf2Var, uf2Var2, uf2Var3, aVarA.b());
    }
}
