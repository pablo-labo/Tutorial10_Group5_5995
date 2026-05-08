package io.opentracing.util;

import defpackage.doe;
import defpackage.eoe;
import defpackage.np5;
import defpackage.ppf;
import defpackage.qka;
import defpackage.rka;
import defpackage.uka;
import defpackage.xka;

/* JADX INFO: loaded from: classes3.dex */
public final class GlobalTracer implements ppf {
    public static final GlobalTracer a = new GlobalTracer();
    public static volatile xka b = xka.a;

    public static boolean isRegistered() {
        return false;
    }

    @Override // defpackage.ppf
    public final doe activeSpan() {
        b.getClass();
        return qka.a;
    }

    @Override // defpackage.ppf
    public final ppf.a buildSpan(String str) {
        b.getClass();
        return rka.a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b.getClass();
    }

    @Override // defpackage.ppf
    public final <C> eoe extract(np5<C> np5Var, C c) {
        b.getClass();
        return uka.a;
    }

    @Override // defpackage.ppf
    public final <C> void inject(eoe eoeVar, np5<C> np5Var, C c) {
        b.getClass();
    }

    public final String toString() {
        return "GlobalTracer{" + b + '}';
    }
}
