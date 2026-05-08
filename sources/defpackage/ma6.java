package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.internal.BasePendingResult;
import defpackage.vf0;
import defpackage.w72;
import java.util.Collection;
import java.util.Collections;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import vf0.d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ma6<O extends vf0.d> {
    public final Context a;
    public final String b;
    public final vf0 c;
    public final vf0.d d;
    public final vg0 e;
    public final Looper f;
    public final int g;

    @NotOnlyInitialized
    public final cah h;
    public final yid i;
    public final qa6 j;

    public static class a {
        public static final a c = new a(new yid(), Looper.getMainLooper());
        public final yid a;
        public final Looper b;

        public a(yid yidVar, Looper looper) {
            this.a = yidVar;
            this.b = looper;
        }
    }

    public ma6() {
        throw null;
    }

    public ma6(Context context, HiddenActivity hiddenActivity, vf0 vf0Var, vf0.d dVar, a aVar) {
        fib.j(context, "Null context is not permitted.");
        fib.j(vf0Var, "Api must not be null.");
        fib.j(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        fib.j(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.b = attributionTag;
        this.c = vf0Var;
        this.d = dVar;
        this.f = aVar.b;
        vg0 vg0Var = new vg0(vf0Var, dVar, attributionTag);
        this.e = vg0Var;
        this.h = new cah(this);
        qa6 qa6VarF = qa6.f(applicationContext);
        this.j = qa6VarF;
        this.g = qa6VarF.W.getAndIncrement();
        this.i = aVar.a;
        if (hiddenActivity != null && Looper.myLooper() == Looper.getMainLooper()) {
            vv8 fragment = nv8.getFragment((Activity) hiddenActivity);
            k9h k9hVar = (k9h) fragment.h(k9h.class, "ConnectionlessLifecycleHelper");
            k9hVar = k9hVar == null ? new k9h(fragment, qa6VarF, na6.d) : k9hVar;
            k9hVar.e.add(vg0Var);
            qa6VarF.a(k9hVar);
        }
        och ochVar = qa6VarF.c0;
        ochVar.sendMessage(ochVar.obtainMessage(7, this));
    }

    public final w72.a c() {
        GoogleSignInAccount googleSignInAccountS;
        GoogleSignInAccount googleSignInAccountS2;
        w72.a aVar = new w72.a();
        vf0.d dVar = this.d;
        boolean z = dVar instanceof vf0.d.b;
        Account accountN = null;
        if (z && (googleSignInAccountS2 = ((vf0.d.b) dVar).s()) != null) {
            String str = googleSignInAccountS2.d;
            if (str != null) {
                accountN = new Account(str, "com.google");
            }
        } else if (dVar instanceof vf0.d.a) {
            accountN = ((vf0.d.a) dVar).N();
        }
        aVar.a = accountN;
        Collection collectionS0 = (!z || (googleSignInAccountS = ((vf0.d.b) dVar).s()) == null) ? Collections.EMPTY_SET : googleSignInAccountS.s0();
        if (aVar.b == null) {
            aVar.b = new ot0(0);
        }
        aVar.b.addAll(collectionS0);
        Context context = this.a;
        aVar.d = context.getClass().getName();
        aVar.c = context.getPackageName();
        return aVar;
    }

    public final void d(int i, ieh iehVar) {
        boolean z = true;
        if (!iehVar.i && !((Boolean) BasePendingResult.j.get()).booleanValue()) {
            z = false;
        }
        iehVar.i = z;
        qa6 qa6Var = this.j;
        qa6Var.getClass();
        mah mahVar = new mah(new bbh(i, iehVar), qa6Var.X.get(), this);
        och ochVar = qa6Var.c0;
        ochVar.sendMessage(ochVar.obtainMessage(4, mahVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.tasks.Task e(int r14, defpackage.rah r15) {
        /*
            r13 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            yid r1 = r13.i
            qa6 r3 = r13.j
            och r10 = r3.c0
            int r4 = r15.c
            if (r4 == 0) goto L7d
            vg0 r5 = r13.e
            boolean r2 = r3.b()
            if (r2 != 0) goto L18
            goto L53
        L18:
            pfd r2 = defpackage.pfd.a()
            com.google.android.gms.common.internal.RootTelemetryConfiguration r2 = r2.a
            r6 = 1
            if (r2 == 0) goto L55
            boolean r7 = r2.b
            if (r7 == 0) goto L53
            boolean r2 = r2.c
            java.util.concurrent.ConcurrentHashMap r7 = r3.Y
            java.lang.Object r7 = r7.get(r5)
            y9h r7 = (defpackage.y9h) r7
            if (r7 == 0) goto L51
            vf0$f r8 = r7.b
            boolean r9 = r8 instanceof defpackage.g91
            if (r9 == 0) goto L53
            g91 r8 = (defpackage.g91) r8
            com.google.android.gms.common.internal.zzj r9 = r8.v
            if (r9 == 0) goto L51
            boolean r9 = r8.q0()
            if (r9 != 0) goto L51
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r2 = defpackage.kah.a(r7, r8, r4)
            if (r2 == 0) goto L53
            int r8 = r7.p
            int r8 = r8 + r6
            r7.p = r8
            boolean r6 = r2.c
            goto L55
        L51:
            r6 = r2
            goto L55
        L53:
            r2 = 0
            goto L6c
        L55:
            kah r2 = new kah
            r7 = 0
            if (r6 == 0) goto L60
            long r11 = java.lang.System.currentTimeMillis()
            goto L61
        L60:
            r11 = r7
        L61:
            if (r6 == 0) goto L67
            long r7 = android.os.SystemClock.elapsedRealtime()
        L67:
            r8 = r7
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r8)
        L6c:
            if (r2 == 0) goto L7d
            com.google.android.gms.tasks.Task r4 = r0.getTask()
            r10.getClass()
            u9h r5 = new u9h
            r5.<init>()
            r4.addOnCompleteListener(r5, r2)
        L7d:
            lbh r2 = new lbh
            r2.<init>(r14, r15, r0, r1)
            java.util.concurrent.atomic.AtomicInteger r14 = r3.X
            mah r15 = new mah
            int r14 = r14.get()
            r15.<init>(r2, r14, r13)
            r13 = 4
            android.os.Message r13 = r10.obtainMessage(r13, r15)
            r10.sendMessage(r13)
            com.google.android.gms.tasks.Task r13 = r0.getTask()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ma6.e(int, rah):com.google.android.gms.tasks.Task");
    }
}
