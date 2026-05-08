package defpackage;

import defpackage.e47;
import java.util.List;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes.dex */
public interface m55 {
    int b(n55 n55Var, dhb dhbVar);

    boolean c(n55 n55Var);

    void d(long j, long j2);

    @SideEffectFree
    default m55 f() {
        return this;
    }

    default List<tme> i() {
        e47.b bVar = e47.b;
        return qyc.e;
    }

    void l(o55 o55Var);

    void release();
}
