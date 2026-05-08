package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class z86 {
    public final bre a;
    public final Handler b;
    public final ArrayList c;
    public final j4d d;
    public final bh1 e;
    public boolean f;
    public boolean g;
    public t3d<Bitmap> h;
    public a i;
    public boolean j;
    public a k;
    public Bitmap l;
    public prf<Bitmap> m;
    public a n;
    public int o;
    public int p;
    public int q;

    public static class a extends wb3<Bitmap> {
        public Bitmap V;
        public final Handler d;
        public final int e;
        public final long f;

        public a(Handler handler, int i, long j) {
            this.d = handler;
            this.e = i;
            this.f = j;
        }

        @Override // defpackage.y9f
        public final void d(Object obj) {
            this.V = (Bitmap) obj;
            Handler handler = this.d;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f);
        }

        @Override // defpackage.y9f
        public final void g() {
            this.V = null;
        }
    }

    public interface b {
        void a();
    }

    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            z86 z86Var = z86.this;
            if (i == 1) {
                z86Var.b((a) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            z86Var.d.h((a) message.obj);
            return false;
        }
    }

    public z86(com.bumptech.glide.a aVar, bre breVar, int i, int i2, o6g o6gVar, Bitmap bitmap) {
        bh1 bh1Var = aVar.a;
        com.bumptech.glide.c cVar = aVar.c;
        Context baseContext = cVar.getBaseContext();
        beb.e(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        j4d j4dVarB = com.bumptech.glide.a.a(baseContext).e.b(baseContext);
        Context baseContext2 = cVar.getBaseContext();
        beb.e(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        j4d j4dVarB2 = com.bumptech.glide.a.a(baseContext2).e.b(baseContext2);
        j4dVarB2.getClass();
        t3d<Bitmap> t3dVarR = new t3d(j4dVarB2.a, j4dVarB2, j4dVarB2.b).c(j4d.Z).c(((n4d) ((n4d) new n4d().f(d64.a).p()).m()).i(i, i2));
        this.c = new ArrayList();
        this.d = j4dVarB;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.e = bh1Var;
        this.b = handler;
        this.h = t3dVarR;
        this.a = breVar;
        c(o6gVar, bitmap);
    }

    public final void a() {
        int i;
        if (!this.f || this.g) {
            return;
        }
        a aVar = this.n;
        if (aVar != null) {
            this.n = null;
            b(aVar);
            return;
        }
        this.g = true;
        bre breVar = this.a;
        b96 b96Var = breVar.l;
        int i2 = b96Var.c;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) ((i2 <= 0 || (i = breVar.k) < 0) ? 0 : (i < 0 || i >= i2) ? -1 : ((y86) b96Var.e.get(i)).i));
        breVar.a();
        this.k = new a(this.b, breVar.k, jUptimeMillis);
        this.h.c((n4d) new n4d().l(new nna(Double.valueOf(Math.random())))).w(breVar).v(this.k);
    }

    public final void b(a aVar) {
        this.g = false;
        boolean z = this.j;
        Handler handler = this.b;
        if (z) {
            handler.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f) {
            this.n = aVar;
            return;
        }
        if (aVar.V != null) {
            Bitmap bitmap = this.l;
            if (bitmap != null) {
                this.e.d(bitmap);
                this.l = null;
            }
            a aVar2 = this.i;
            this.i = aVar;
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b) arrayList.get(size)).a();
            }
            if (aVar2 != null) {
                handler.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(prf<Bitmap> prfVar, Bitmap bitmap) {
        beb.e(prfVar, "Argument must not be null");
        this.m = prfVar;
        beb.e(bitmap, "Argument must not be null");
        this.l = bitmap;
        this.h = this.h.c(new n4d().n(prfVar));
        this.o = xjg.c(bitmap);
        this.p = bitmap.getWidth();
        this.q = bitmap.getHeight();
    }
}
