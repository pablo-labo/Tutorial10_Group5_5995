package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.internal.zzan;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzkq;
import com.google.android.gms.measurement.internal.zzn;
import com.google.android.gms.measurement.internal.zzw;
import defpackage.jph;
import defpackage.lph;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class h1i extends vvh {
    public final fei a;
    public Boolean b;
    public String c;

    public h1i(fei feiVar) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        fib.i(feiVar);
        this.a = feiVar;
        this.c = null;
    }

    @Override // defpackage.pvh
    public final void C(zzkq zzkqVar, zzn zznVar) {
        fib.i(zzkqVar);
        k1(zznVar);
        e(new s2i(this, zzkqVar, zznVar));
    }

    @Override // defpackage.pvh
    public final void E0(zzn zznVar) {
        h(zznVar.a, false);
        e(new g2i(this, zznVar));
    }

    @Override // defpackage.pvh
    public final void J(zzn zznVar) {
        k1(zznVar);
        e(new w2i(this, zznVar));
    }

    @Override // defpackage.pvh
    public final List<zzkq> K0(String str, String str2, boolean z, zzn zznVar) {
        k1(zznVar);
        fei feiVar = this.a;
        try {
            List<bfi> list = (List) feiVar.zzq().k(new s1i(this, zznVar, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (bfi bfiVar : list) {
                if (z || !yei.h0(bfiVar.c)) {
                    arrayList.add(new zzkq(bfiVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            feiVar.zzr().f.c("Failed to query user properties. appId", ewh.l(zznVar.a), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            feiVar.zzr().f.c("Failed to query user properties. appId", ewh.l(zznVar.a), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.pvh
    public final void N(zzn zznVar) {
        k1(zznVar);
        e(new jaf(2, this, zznVar));
    }

    @Override // defpackage.pvh
    public final void N0(zzao zzaoVar, zzn zznVar) {
        fib.i(zzaoVar);
        k1(zznVar);
        e(new d2i(this, zzaoVar, zznVar));
    }

    @Override // defpackage.pvh
    public final void X(final Bundle bundle, final zzn zznVar) {
        qgi.a();
        if (this.a.X.V.k(null, djh.N0)) {
            k1(zznVar);
            e(new Runnable(this, zznVar, bundle) { // from class: e1i
                public final h1i a;
                public final zzn b;
                public final Bundle c;

                {
                    this.a = this;
                    this.b = zznVar;
                    this.c = bundle;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzan zzanVar;
                    wgh wghVarZ = this.a.a.z();
                    String str = this.b.a;
                    wghVarZ.b();
                    wghVarZ.g();
                    i0i i0iVar = wghVarZ.a;
                    fib.f(str);
                    fib.f("dep");
                    TextUtils.isEmpty("");
                    Bundle bundle2 = this.c;
                    if (bundle2 == null || bundle2.isEmpty()) {
                        zzanVar = new zzan(new Bundle());
                    } else {
                        Bundle bundle3 = new Bundle(bundle2);
                        Iterator<String> it = bundle3.keySet().iterator();
                        while (it.hasNext()) {
                            String next = it.next();
                            if (next == null) {
                                ewh ewhVar = i0iVar.X;
                                i0i.i(ewhVar);
                                ewhVar.f.b("Param name can't be null");
                                it.remove();
                            } else {
                                yei yeiVar = i0iVar.a0;
                                i0i.c(yeiVar);
                                Object objS = yeiVar.s(bundle3.get(next), next);
                                if (objS == null) {
                                    ewh ewhVar2 = i0iVar.X;
                                    i0i.i(ewhVar2);
                                    jwh jwhVar = ewhVar2.X;
                                    bwh bwhVar = i0iVar.b0;
                                    i0i.c(bwhVar);
                                    jwhVar.a(bwhVar.o(next), "Param value can't be null");
                                    it.remove();
                                } else {
                                    yei yeiVar2 = i0iVar.a0;
                                    i0i.c(yeiVar2);
                                    yeiVar2.x(bundle3, next, objS);
                                }
                            }
                        }
                        zzanVar = new zzan(bundle3);
                    }
                    nei neiVarJ = wghVarZ.j();
                    jph.a aVarJ = jph.J();
                    if (aVarJ.c) {
                        aVarJ.k();
                        aVarJ.c = false;
                    }
                    jph.B(0L, (jph) aVarJ.b);
                    Bundle bundle4 = zzanVar.a;
                    for (String str2 : bundle4.keySet()) {
                        lph.a aVarN = lph.N();
                        aVarN.p(str2);
                        neiVarJ.C(aVarN, bundle4.get(str2));
                        aVarJ.p(aVarN);
                    }
                    byte[] bArrB = ((jph) aVarJ.m()).b();
                    wghVarZ.zzr().c0.c("Saving default event parameters, appId, data size", wghVarZ.d().l(str), Integer.valueOf(bArrB.length));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("parameters", bArrB);
                    try {
                        if (wghVarZ.m().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                            wghVarZ.zzr().f.a(ewh.l(str), "Failed to insert default event parameters (got -1). appId");
                        }
                    } catch (SQLiteException e) {
                        wghVarZ.zzr().f.c("Error storing default event parameters. appId", ewh.l(str), e);
                    }
                }
            });
        }
    }

    @Override // defpackage.pvh
    public final byte[] Y0(zzao zzaoVar, String str) {
        fib.f(str);
        fib.i(zzaoVar);
        h(str, true);
        fei feiVar = this.a;
        jwh jwhVar = feiVar.zzr().b0;
        i0i i0iVar = feiVar.X;
        bwh bwhVar = i0iVar.b0;
        i0i.c(bwhVar);
        String str2 = zzaoVar.a;
        jwhVar.a(bwhVar.l(str2), "Log and bundle. event");
        i0iVar.c0.getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        a0i a0iVarZzq = feiVar.zzq();
        j2i j2iVar = new j2i(this, zzaoVar, str);
        a0iVarZzq.g();
        c0i<?> c0iVar = new c0i<>(a0iVarZzq, (Callable) j2iVar, true);
        if (Thread.currentThread() == a0iVarZzq.c) {
            c0iVar.run();
        } else {
            a0iVarZzq.l(c0iVar);
        }
        try {
            byte[] bArr = (byte[]) c0iVar.get();
            if (bArr == null) {
                feiVar.zzr().f.a(ewh.l(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            i0iVar.c0.getClass();
            long jNanoTime2 = System.nanoTime() / 1000000;
            jwh jwhVar2 = feiVar.zzr().b0;
            bwh bwhVar2 = i0iVar.b0;
            i0i.c(bwhVar2);
            jwhVar2.d("Log and bundle processed. event, size, time_ms", bwhVar2.l(str2), Integer.valueOf(bArr.length), Long.valueOf(jNanoTime2 - jNanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            jwh jwhVar3 = feiVar.zzr().f;
            swh swhVarL = ewh.l(str);
            bwh bwhVar3 = i0iVar.b0;
            i0i.c(bwhVar3);
            jwhVar3.d("Failed to log and bundle. appId, event, error", swhVarL, bwhVar3.l(str2), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            jwh jwhVar32 = feiVar.zzr().f;
            swh swhVarL2 = ewh.l(str);
            bwh bwhVar32 = i0iVar.b0;
            i0i.c(bwhVar32);
            jwhVar32.d("Failed to log and bundle. appId, event, error", swhVarL2, bwhVar32.l(str2), e);
            return null;
        }
    }

    @VisibleForTesting
    public final void e(Runnable runnable) {
        fei feiVar = this.a;
        if (Thread.currentThread() == feiVar.zzq().c) {
            runnable.run();
        } else {
            feiVar.zzq().m(runnable);
        }
    }

    public final void h(String str, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        fei feiVar = this.a;
        if (zIsEmpty) {
            feiVar.zzr().f.b("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.b == null) {
                    this.b = Boolean.valueOf("com.google.android.gms".equals(this.c) || g5g.a(feiVar.X.a, Binder.getCallingUid()) || gb6.a(feiVar.X.a).b(Binder.getCallingUid()));
                }
                if (this.b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                feiVar.zzr().f.a(ewh.l(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.c == null) {
            Context context = feiVar.X.a;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = bb6.a;
            if (g5g.b(context, str, callingUid)) {
                this.c = str;
            }
        }
        if (str.equals(this.c)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    @Override // defpackage.pvh
    public final void k(zzw zzwVar, zzn zznVar) {
        fib.i(zzwVar);
        fib.i(zzwVar.c);
        k1(zznVar);
        zzw zzwVar2 = new zzw(zzwVar);
        zzwVar2.a = zznVar.a;
        e(new c3i(this, zzwVar2, zznVar));
    }

    public final void k1(zzn zznVar) {
        fib.i(zznVar);
        h(zznVar.a, false);
        yei yeiVar = this.a.X.a0;
        i0i.c(yeiVar);
        yeiVar.P(zznVar.b, zznVar.g0, zznVar.k0);
    }

    @Override // defpackage.pvh
    public final List<zzkq> p(String str, String str2, String str3, boolean z) {
        h(str, true);
        fei feiVar = this.a;
        try {
            List<bfi> list = (List) feiVar.zzq().k(new o1i(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (bfi bfiVar : list) {
                if (z || !yei.h0(bfiVar.c)) {
                    arrayList.add(new zzkq(bfiVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            feiVar.zzr().f.c("Failed to get user properties as. appId", ewh.l(str), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            feiVar.zzr().f.c("Failed to get user properties as. appId", ewh.l(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.pvh
    public final void x(long j, String str, String str2, String str3) {
        e(new v2i(this, str2, str3, str, j));
    }

    @Override // defpackage.pvh
    public final List<zzw> y(String str, String str2, String str3) {
        h(str, true);
        fei feiVar = this.a;
        try {
            return (List) feiVar.zzq().k(new w1i(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            feiVar.zzr().f.a(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pvh
    public final String y0(zzn zznVar) {
        k1(zznVar);
        fei feiVar = this.a;
        i0i i0iVar = feiVar.X;
        a0i a0iVar = i0iVar.Y;
        i0i.i(a0iVar);
        try {
            return (String) a0iVar.k(new m33(2, feiVar, zznVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ewh ewhVar = i0iVar.X;
            i0i.i(ewhVar);
            ewhVar.f.c("Failed to get app instance id. appId", ewh.l(zznVar.a), e);
            return null;
        }
    }

    @Override // defpackage.pvh
    public final List<zzw> z(String str, String str2, zzn zznVar) {
        k1(zznVar);
        fei feiVar = this.a;
        try {
            return (List) feiVar.zzq().k(new z1i(this, zznVar, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            feiVar.zzr().f.a(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }
}
