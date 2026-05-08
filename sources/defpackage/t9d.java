package defpackage;

import android.content.ComponentName;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class t9d implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public t9d(q15 q15Var, qw1 qw1Var) {
        this.a = 0;
        this.b = q15Var;
        this.c = qw1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((qw1) this.c).D((q15) this.b, j6g.a);
                return;
            case 1:
                synchronized (((AtomicReference) this.b)) {
                    try {
                        try {
                            AtomicReference atomicReference = (AtomicReference) this.b;
                            i0i i0iVar = ((m4i) this.c).a;
                            wmi wmiVar = i0iVar.V;
                            zvh zvhVarO = i0iVar.o();
                            zvhVarO.k();
                            atomicReference.set(Double.valueOf(wmiVar.j(zvhVarO.c, djh.O)));
                        } finally {
                            ((AtomicReference) this.b).notify();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                y8i y8iVar = ((ibi) this.c).c;
                ComponentName componentName = (ComponentName) this.b;
                y8iVar.b();
                if (y8iVar.d != null) {
                    y8iVar.d = null;
                    y8iVar.zzr().c0.a(componentName, "Disconnected from device MeasurementService");
                    y8iVar.b();
                    y8iVar.s();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ t9d(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
