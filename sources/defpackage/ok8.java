package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ok8 implements Function1<Throwable, j6g> {
    public final /* synthetic */ pk8 a;
    public final /* synthetic */ qw1 b;

    public ok8(pk8 pk8Var, qw1 qw1Var) {
        this.a = pk8Var;
        this.b = qw1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(Throwable th) {
        pk8 pk8Var = this.a;
        Object obj = pk8Var.a;
        qw1 qw1Var = this.b;
        synchronized (obj) {
            pk8Var.b.remove(qw1Var);
        }
        return j6g.a;
    }
}
