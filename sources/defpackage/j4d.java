package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import com.bumptech.glide.c;
import defpackage.fp2;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j4d implements ComponentCallbacks2, xv8 {
    public static final n4d Z;
    public final a V;
    public final fp2 W;
    public final CopyOnWriteArrayList<i4d<Object>> X;
    public final n4d Y;
    public final com.bumptech.glide.a a;
    public final Context b;
    public final lv8 c;
    public final r4d d;
    public final l4d e;
    public final baf f;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            j4d j4dVar = j4d.this;
            j4dVar.c.c(j4dVar);
        }
    }

    public class b implements fp2.a {
        public final r4d a;

        public b(r4d r4dVar) {
            this.a = r4dVar;
        }

        @Override // fp2.a
        public final void a(boolean z) {
            if (z) {
                synchronized (j4d.this) {
                    r4d r4dVar = this.a;
                    for (n3d n3dVar : xjg.e(r4dVar.a)) {
                        if (!n3dVar.b() && !n3dVar.g()) {
                            n3dVar.clear();
                            if (r4dVar.c) {
                                r4dVar.b.add(n3dVar);
                            } else {
                                n3dVar.k();
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        n4d n4dVarE = new n4d().e(Bitmap.class);
        n4dVarE.b0 = true;
        Z = n4dVarE;
        new n4d().e(v86.class).b0 = true;
    }

    public j4d(com.bumptech.glide.a aVar, lv8 lv8Var, l4d l4dVar, Context context) {
        n4d n4dVar;
        r4d r4dVar = new r4d();
        gp2 gp2Var = aVar.f;
        this.f = new baf();
        a aVar2 = new a();
        this.V = aVar2;
        this.a = aVar;
        this.c = lv8Var;
        this.e = l4dVar;
        this.d = r4dVar;
        this.b = context;
        Context applicationContext = context.getApplicationContext();
        b bVar = new b(r4dVar);
        ((mm3) gp2Var).getClass();
        boolean z = ot2.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        fp2 lm3Var = z ? new lm3(applicationContext, bVar) : new gma();
        this.W = lm3Var;
        synchronized (aVar.V) {
            if (aVar.V.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            aVar.V.add(this);
        }
        char[] cArr = xjg.a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            lv8Var.c(this);
        } else {
            xjg.f().post(aVar2);
        }
        lv8Var.c(lm3Var);
        this.X = new CopyOnWriteArrayList<>(aVar.c.d);
        c cVar = aVar.c;
        synchronized (cVar) {
            try {
                if (cVar.i == null) {
                    ((com.bumptech.glide.b) cVar.c).getClass();
                    n4d n4dVar2 = new n4d();
                    n4dVar2.b0 = true;
                    cVar.i = n4dVar2;
                }
                n4dVar = cVar.i;
            } finally {
            }
        }
        synchronized (this) {
            n4d n4dVarClone = n4dVar.clone();
            if (n4dVarClone.b0 && !n4dVarClone.c0) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            n4dVarClone.c0 = true;
            n4dVarClone.b0 = true;
            this.Y = n4dVarClone;
        }
    }

    @Override // defpackage.xv8
    public final synchronized void f() {
        k();
        this.f.f();
    }

    public final void h(y9f<?> y9fVar) {
        if (y9fVar == null) {
            return;
        }
        boolean zL = l(y9fVar);
        n3d n3dVarA = y9fVar.a();
        if (zL) {
            return;
        }
        com.bumptech.glide.a aVar = this.a;
        synchronized (aVar.V) {
            try {
                Iterator it = aVar.V.iterator();
                while (it.hasNext()) {
                    if (((j4d) it.next()).l(y9fVar)) {
                        return;
                    }
                }
                if (n3dVarA != null) {
                    y9fVar.c(null);
                    n3dVarA.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void i() {
        try {
            Iterator it = xjg.e(this.f.a).iterator();
            while (it.hasNext()) {
                h((y9f) it.next());
            }
            this.f.a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j() {
        r4d r4dVar = this.d;
        r4dVar.c = true;
        for (n3d n3dVar : xjg.e(r4dVar.a)) {
            if (n3dVar.isRunning()) {
                n3dVar.c();
                r4dVar.b.add(n3dVar);
            }
        }
    }

    public final synchronized void k() {
        r4d r4dVar = this.d;
        r4dVar.c = false;
        for (n3d n3dVar : xjg.e(r4dVar.a)) {
            if (!n3dVar.b() && !n3dVar.isRunning()) {
                n3dVar.k();
            }
        }
        r4dVar.b.clear();
    }

    public final synchronized boolean l(y9f<?> y9fVar) {
        n3d n3dVarA = y9fVar.a();
        if (n3dVarA == null) {
            return true;
        }
        if (!this.d.a(n3dVarA)) {
            return false;
        }
        this.f.a.remove(y9fVar);
        y9fVar.c(null);
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // defpackage.xv8
    public final synchronized void onDestroy() {
        this.f.onDestroy();
        i();
        r4d r4dVar = this.d;
        Iterator it = xjg.e(r4dVar.a).iterator();
        while (it.hasNext()) {
            r4dVar.a((n3d) it.next());
        }
        r4dVar.b.clear();
        this.c.d(this);
        this.c.d(this.W);
        xjg.f().removeCallbacks(this.V);
        com.bumptech.glide.a aVar = this.a;
        synchronized (aVar.V) {
            if (!aVar.V.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            aVar.V.remove(this);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // defpackage.xv8
    public final synchronized void onStop() {
        this.f.onStop();
        j();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.d + ", treeNode=" + this.e + "}";
    }
}
