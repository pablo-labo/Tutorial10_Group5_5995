package com.facebook.cache.disk;

import defpackage.g95;
import defpackage.ot1;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public interface b {

    public interface a {
        long a();

        long b();

        String getId();
    }

    /* JADX INFO: renamed from: com.facebook.cache.disk.b$b, reason: collision with other inner class name */
    public interface InterfaceC0126b {
    }

    void a();

    void b();

    boolean c(String str, ot1 ot1Var);

    InterfaceC0126b d(Object obj, String str);

    long e(a aVar);

    g95 f(Object obj, String str);

    Collection<a> g();

    boolean isExternal();

    long remove(String str);
}
