package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.internal.zzw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class y8i extends m0i {
    public final pdi V;
    public final ArrayList W;
    public final jai X;
    public final ibi c;
    public pvh d;
    public volatile Boolean e;
    public final w8i f;

    public y8i(i0i i0iVar) {
        super(i0iVar);
        this.W = new ArrayList();
        this.V = new pdi(i0iVar.c0);
        this.c = new ibi(this);
        this.f = new w8i(this, i0iVar);
        this.X = new jai(this, i0iVar);
    }

    @Override // defpackage.m0i
    public final boolean m() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzn n(boolean r36) {
        /*
            Method dump skipped, instruction units count: 695
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y8i.n(boolean):com.google.android.gms.measurement.internal.zzn");
    }

    public final void o(zzw zzwVar) {
        boolean zO;
        b();
        k();
        i0i i0iVar = this.a;
        awd awdVar = i0iVar.f;
        xvh xvhVarL = i0iVar.l();
        xvhVarL.e();
        byte[] bArrT = yei.T(zzwVar);
        if (bArrT.length > 131072) {
            xvhVarL.zzr().V.b("Conditional user property too long for local database. Sending directly to service");
            zO = false;
        } else {
            zO = xvhVarL.o(2, bArrT);
        }
        p(new bbi(this, zO, new zzw(zzwVar), n(true), zzwVar));
    }

    public final void p(Runnable runnable) {
        b();
        if (r()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.W;
        if (arrayList.size() >= 1000) {
            zzr().f.b("Discarding data. Max runnable queue size reached");
            return;
        }
        arrayList.add(runnable);
        this.X.b(60000L);
        s();
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0268 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x02c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x02c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x02c4 A[SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @com.google.android.gms.common.util.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(defpackage.pvh r29, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r30, com.google.android.gms.measurement.internal.zzn r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y8i.q(pvh, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable, com.google.android.gms.measurement.internal.zzn):void");
    }

    public final boolean r() {
        b();
        k();
        return this.d != null;
    }

    public final void s() {
        b();
        k();
        if (r()) {
            return;
        }
        if (v()) {
            ibi ibiVar = this.c;
            ibiVar.c.b();
            Context context = ibiVar.c.a.a;
            synchronized (ibiVar) {
                try {
                    if (ibiVar.a) {
                        ibiVar.c.zzr().c0.b("Connection attempt already in progress");
                        return;
                    }
                    if (ibiVar.b != null && (ibiVar.b.q0() || ibiVar.b.o0())) {
                        ibiVar.c.zzr().c0.b("Already awaiting connection attempt");
                        return;
                    }
                    ibiVar.b = new gwh(context, Looper.getMainLooper(), ka6.n0(context), oa6.b, 93, ibiVar, ibiVar, null);
                    ibiVar.c.zzr().c0.b("Connecting to remote service");
                    ibiVar.a = true;
                    ibiVar.b.c();
                    return;
                } finally {
                }
            }
        }
        if (this.a.V.s()) {
            return;
        }
        i0i i0iVar = this.a;
        awd awdVar = i0iVar.f;
        List<ResolveInfo> listQueryIntentServices = i0iVar.a.getPackageManager().queryIntentServices(new Intent().setClassName(this.a.a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
            zzr().f.b("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(this.a.a, "com.google.android.gms.measurement.AppMeasurementService"));
        ibi ibiVar2 = this.c;
        ibiVar2.c.b();
        Context context2 = ibiVar2.c.a.a;
        zo2 zo2VarB = zo2.b();
        synchronized (ibiVar2) {
            try {
                boolean z = ibiVar2.a;
                y8i y8iVar = ibiVar2.c;
                if (z) {
                    y8iVar.zzr().c0.b("Connection attempt already in progress");
                    return;
                }
                y8iVar.zzr().c0.b("Using local app measurement service");
                ibiVar2.a = true;
                zo2VarB.a(context2, intent, ibiVar2.c.c, 129);
            } finally {
            }
        }
    }

    public final void t() {
        b();
        k();
        ibi ibiVar = this.c;
        if (ibiVar.b != null && (ibiVar.b.o0() || ibiVar.b.q0())) {
            ibiVar.b.x0();
        }
        ibiVar.b = null;
        try {
            zo2.b().c(this.a.a, this.c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.d = null;
    }

    public final void u() {
        b();
        pdi pdiVar = this.V;
        pdiVar.a.getClass();
        pdiVar.b = SystemClock.elapsedRealtime();
        this.f.b(djh.J.a(null).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v() {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y8i.v():boolean");
    }

    public final void w() {
        b();
        jwh jwhVar = zzr().c0;
        ArrayList arrayList = this.W;
        jwhVar.a(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (Exception e) {
                zzr().f.a(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.X.c();
    }
}
