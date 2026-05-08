package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes3.dex */
public interface fie extends Closeable, Flushable {
    void I1(zn1 zn1Var, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    kmf g();
}
