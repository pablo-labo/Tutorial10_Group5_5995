package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class la0 implements ComponentCallbacks2 {
    public final WeakReference<xqc> a;
    public Context b;
    public boolean c;

    public la0(xqc xqcVar) {
        this.a = new WeakReference<>(xqcVar);
    }

    public final synchronized void a() {
        try {
            if (this.c) {
                return;
            }
            this.c = true;
            Context context = this.b;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            this.a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (this.a.get() == null) {
            a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i) {
        qn9 qn9VarD;
        try {
            xqc xqcVar = this.a.get();
            if (xqcVar == null) {
                a();
            } else if (i >= 40) {
                qn9 qn9VarD2 = xqcVar.d();
                if (qn9VarD2 != null) {
                    qn9VarD2.clear();
                }
            } else if (i >= 10 && (qn9VarD = xqcVar.d()) != null) {
                qn9VarD.d(qn9VarD.a() / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
