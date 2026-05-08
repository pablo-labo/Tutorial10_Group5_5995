package androidx.media3.session;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.session.j;
import androidx.media3.session.p;
import defpackage.aw5;
import defpackage.bg;
import defpackage.gdb;
import defpackage.sg9;
import defpackage.sj9;
import defpackage.tla;
import defpackage.u37;
import defpackage.v8e;
import defpackage.vjg;
import defpackage.x9e;
import defpackage.z3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Handler.Callback {
    public final HashMap V;
    public final p.b W;
    public int X;
    public p Y;
    public boolean Z;
    public final v a;
    public boolean a0;
    public final p.a b;
    public boolean b0;
    public final tla c;
    public final long c0;
    public final Handler d;
    public final int d0;
    public final sj9 e;
    public final Intent f;

    public static final class a {
        public final sg9 a;
        public boolean b;
        public boolean c;

        public a(sg9 sg9Var) {
            this.a = sg9Var;
        }
    }

    public final class b implements j.a, gdb.c {
        public final v a;
        public final r b;

        public b(v vVar, r rVar) {
            this.a = vVar;
            this.b = rVar;
        }

        @Override // androidx.media3.session.j.a
        public final void F() {
            this.a.f(this.b, false);
        }

        @Override // androidx.media3.session.j.a
        public final u37 G(v8e v8eVar) {
            int i;
            if (v8eVar.b.equals("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY")) {
                a aVar = (a) q.this.V.get(this.b);
                if (aVar != null) {
                    aVar.b = true;
                }
                i = 0;
            } else {
                i = -6;
            }
            return aw5.K1(new x9e(i));
        }

        @Override // gdb.c
        public final void o(gdb.b bVar) {
            if (bVar.a.a(4, 5, 14, 0)) {
                this.a.f(this.b, false);
            }
        }

        @Override // androidx.media3.session.j.a
        public final void x() {
            this.a.f(this.b, false);
        }
    }

    public q(v vVar, p.b bVar, d dVar) {
        this.a = vVar;
        this.W = bVar;
        this.b = dVar;
        this.c = new tla(vVar);
        Looper mainLooper = Looper.getMainLooper();
        String str = vjg.a;
        this.d = new Handler(mainLooper, this);
        this.e = new sj9(this, 0);
        this.f = new Intent(vVar, vVar.getClass());
        this.V = new HashMap();
        this.Z = false;
        this.b0 = true;
        this.c0 = 600000L;
        this.d0 = 3;
    }

    public final j a(r rVar) {
        a aVar = (a) this.V.get(rVar);
        if (aVar != null) {
            sg9 sg9Var = aVar.a;
            if (sg9Var.isDone()) {
                try {
                    return (j) aw5.J1(sg9Var);
                } catch (ExecutionException e) {
                    z3.q(e);
                }
            }
        }
        return null;
    }

    public final boolean b(boolean z) {
        boolean z2;
        ArrayList arrayListB = this.a.b();
        for (int i = 0; i < arrayListB.size(); i++) {
            j jVarA = a((r) arrayListB.get(i));
            if (jVarA != null && ((jVarA.W() || z) && (jVarA.b() == 3 || jVarA.b() == 2))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.b0;
        long j = this.c0;
        boolean z4 = z3 && j > 0;
        boolean z5 = this.a0;
        Handler handler = this.d;
        if (z5 && !z2 && z4) {
            handler.sendEmptyMessageDelayed(1, j);
        } else if (z2) {
            handler.removeMessages(1);
        }
        this.a0 = z2;
        return z2 || handler.hasMessages(1);
    }

    public final boolean c(r rVar) {
        j jVarA = a(rVar);
        if (jVarA != null && !jVarA.M().p()) {
            a aVar = (a) this.V.get(rVar);
            aVar.getClass();
            if (jVarA.b() != 1) {
                aVar.b = false;
                aVar.c = true;
                return true;
            }
            int i = this.d0;
            if (i == 1) {
                return !aVar.b;
            }
            if (i != 2) {
                if (i != 3) {
                    bg.h();
                    return false;
                }
                if (!aVar.b && aVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public final void d(r rVar, p pVar, boolean z) {
        MediaSession.Token tokenF = rVar.a.f();
        Notification notification = pVar.a;
        notification.extras.putParcelable("android.mediaSession", tokenF);
        this.Y = pVar;
        v vVar = this.a;
        if (!z) {
            this.c.a(null, 1001, notification);
            vVar.stopForeground(2);
            this.Z = false;
        } else {
            vVar.startForegroundService(this.f);
            String str = vjg.a;
            if (Build.VERSION.SDK_INT >= 29) {
                vjg.a.a(vVar, notification);
            } else {
                vVar.startForeground(1001, notification);
            }
            this.Z = true;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        v vVar = this.a;
        ArrayList arrayListB = vVar.b();
        for (int i = 0; i < arrayListB.size(); i++) {
            vVar.f((r) arrayListB.get(i), false);
        }
        return true;
    }
}
