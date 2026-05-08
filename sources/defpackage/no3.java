package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class no3 extends p15 implements Executor {
    public static final no3 c = new no3();
    public static final y03 d;

    static {
        q6g q6gVar = q6g.c;
        int i = e3f.a;
        if (64 >= i) {
            i = 64;
        }
        d = q6gVar.E1(wea.k(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // defpackage.y03
    public final y03 E1(int i) {
        return q6g.c.E1(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        v1(vr4.a, runnable);
    }

    @Override // defpackage.y03
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // defpackage.y03
    public final void v1(v03 v03Var, Runnable runnable) {
        d.v1(v03Var, runnable);
    }

    @Override // defpackage.y03
    public final void w1(v03 v03Var, Runnable runnable) {
        d.w1(v03Var, runnable);
    }
}
