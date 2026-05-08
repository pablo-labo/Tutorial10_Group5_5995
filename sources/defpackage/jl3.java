package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import androidx.media3.session.j;
import androidx.media3.session.k;
import androidx.media3.session.m;
import androidx.media3.session.z;
import defpackage.e75;
import defpackage.gdb;
import defpackage.lz8;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jl3 implements lz8.a, e75.e, m.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jl3(int i, PendingIntent pendingIntent) {
        this.a = 5;
        this.b = pendingIntent;
    }

    @Override // androidx.media3.session.m.a
    public void f(k kVar) {
        PendingIntent pendingIntent = (PendingIntent) this.b;
        if (!kVar.o0() || Objects.equals(kVar.q, pendingIntent)) {
            return;
        }
        kVar.q = pendingIntent;
        j jVarZ0 = kVar.Z0();
        jVarZ0.getClass();
        ka2.q(Looper.myLooper() == jVarZ0.e.getLooper());
        jVarZ0.d.getClass();
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                ((gdb.c) obj).h0((oj9) obj2);
                break;
            case 2:
            default:
                ((gdb.c) obj).h0(((z) obj2).z);
                break;
            case 3:
                ((gdb.c) obj).p0(((k) obj2).y);
                break;
        }
    }

    @Override // defpackage.wg3
    public Object j(Object obj, ka6 ka6Var) {
        return ((e75.b[]) this.b)[ka6Var.U0()].j(null, ka6Var);
    }

    public /* synthetic */ jl3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
