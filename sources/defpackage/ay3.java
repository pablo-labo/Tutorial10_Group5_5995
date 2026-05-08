package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class ay3 implements Callable<j6g> {
    public final /* synthetic */ xx3 a;
    public final /* synthetic */ by3 b;

    public ay3(by3 by3Var, xx3 xx3Var) {
        this.b = by3Var;
        this.a = xx3Var;
    }

    @Override // java.util.concurrent.Callable
    public final j6g call() throws Throwable {
        by3 by3Var = this.b;
        xed xedVar = (xed) by3Var.a;
        xedVar.c();
        try {
            ((zx3) by3Var.b).j(this.a);
            xedVar.w();
            return j6g.a;
        } finally {
            xedVar.s();
        }
    }
}
