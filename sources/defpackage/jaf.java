package defpackage;

import com.google.android.gms.measurement.internal.zzn;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class jaf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public jaf(qq2 qq2Var, Callable callable) {
        this.a = 0;
        this.b = qq2Var;
        this.c = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qq2 qq2Var = (qq2) this.b;
                oaf oafVar = (oaf) qq2Var.a;
                try {
                    if (oafVar.g(((Callable) this.c).call())) {
                        return;
                    } else {
                        throw new IllegalStateException("Cannot set the result of a completed task.");
                    }
                } catch (CancellationException unused) {
                    if (oafVar.f()) {
                        return;
                    }
                    r6.g("Cannot cancel a completed task.");
                    return;
                } catch (Exception e) {
                    qq2Var.e(e);
                    return;
                }
            case 1:
                ybe ybeVar = ((k0g) this.c).d;
                loc locVar = (loc) this.b;
                ybeVar.getClass();
                ybeVar.c.a();
                int i = locVar.a;
                ybeVar.a.put(i, locVar);
                ybeVar.b.put(i, true);
                return;
            case 2:
                fei feiVar = ((h1i) this.c).a;
                feiVar.F();
                zzn zznVar = (zzn) this.b;
                feiVar.zzq().b();
                feiVar.D();
                fib.f(zznVar.a);
                feiVar.w(zznVar);
                return;
            default:
                synchronized (((AtomicReference) this.b)) {
                    try {
                        try {
                            AtomicReference atomicReference = (AtomicReference) this.b;
                            i0i i0iVar = ((m4i) this.c).a;
                            wmi wmiVar = i0iVar.V;
                            zvh zvhVarO = i0iVar.o();
                            zvhVarO.k();
                            atomicReference.set(Integer.valueOf(wmiVar.i(zvhVarO.c, djh.N)));
                        } finally {
                            ((AtomicReference) this.b).notify();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public /* synthetic */ jaf(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
