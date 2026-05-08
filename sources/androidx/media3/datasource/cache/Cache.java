package androidx.media3.datasource.cache;

import defpackage.au1;
import defpackage.bt2;
import defpackage.mfe;
import defpackage.nm3;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface Cache {

    public static class CacheException extends IOException {
    }

    public interface a {
        void a(c cVar, mfe mfeVar);

        void c(au1 au1Var);

        void d(c cVar, mfe mfeVar, mfe mfeVar2);
    }

    nm3 a(String str);

    void b(au1 au1Var);

    mfe c(long j, String str, long j2);

    void d(File file, long j);

    mfe e(long j, String str, long j2);

    void f(String str, bt2 bt2Var);

    File g(long j, String str, long j2);
}
