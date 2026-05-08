package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import defpackage.tze;
import defpackage.xed;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class qf3 {
    public final Context a;
    public final String b;
    public final tze.c c;
    public final xed.e d;
    public final List<xed.b> e;
    public final boolean f;
    public final xed.d g;
    public final Executor h;
    public final Executor i;
    public final Intent j;
    public final boolean k;
    public final boolean l;
    public final Set<Integer> m;
    public final String n;
    public final File o;
    public final Callable<InputStream> p;
    public final List<Object> q;
    public final List<ak2> r;
    public final boolean s;
    public final aid t;
    public final v03 u;
    public boolean v;

    @SuppressLint({"LambdaLast"})
    public qf3(Context context, String str, tze.c cVar, xed.e eVar, List list, boolean z, xed.d dVar, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set set, String str2, File file, Callable callable, List list2, List list3, boolean z4, aid aidVar, v03 v03Var) {
        context.getClass();
        eVar.getClass();
        executor.getClass();
        executor2.getClass();
        list2.getClass();
        list3.getClass();
        this.a = context;
        this.b = str;
        this.c = cVar;
        this.d = eVar;
        this.e = list;
        this.f = z;
        this.g = dVar;
        this.h = executor;
        this.i = executor2;
        this.j = intent;
        this.k = z2;
        this.l = z3;
        this.m = set;
        this.n = str2;
        this.o = file;
        this.p = callable;
        this.q = list2;
        this.r = list3;
        this.s = z4;
        this.t = aidVar;
        this.u = v03Var;
        this.v = true;
    }
}
