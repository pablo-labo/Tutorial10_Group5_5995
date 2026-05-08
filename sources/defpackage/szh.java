package defpackage;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzfw;
import defpackage.coh;
import defpackage.doh;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class szh extends bei implements dgh {
    public final ht0 V;
    public final ht0 W;
    public final ht0 X;
    public final ht0 d;
    public final ht0 e;
    public final ht0 f;

    public szh(fei feiVar) {
        super(feiVar);
        this.d = new ht0();
        this.e = new ht0();
        this.f = new ht0();
        this.V = new ht0();
        this.X = new ht0();
        this.W = new ht0();
    }

    public static ht0 l(doh dohVar) {
        ht0 ht0Var = new ht0();
        for (eoh eohVar : dohVar.y()) {
            ht0Var.put(eohVar.r(), eohVar.s());
        }
        return ht0Var;
    }

    @Override // defpackage.dgh
    public final String c(String str, String str2) throws Throwable {
        b();
        v(str);
        Map map = (Map) this.d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // defpackage.bei
    public final boolean i() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final doh m(String str) {
        g();
        b();
        fib.f(str);
        v(str);
        return (doh) this.V.get(str);
    }

    public final doh n(String str, byte[] bArr) {
        if (bArr == null) {
            return doh.D();
        }
        try {
            doh dohVar = (doh) ((doh.a) nei.u(doh.C(), bArr)).m();
            zzr().c0.c("Parsed config. version, gmp_app_id", dohVar.u() ? Long.valueOf(dohVar.v()) : null, dohVar.w() ? dohVar.x() : null);
            return dohVar;
        } catch (zzfw e) {
            zzr().X.c("Unable to merge remote config. appId", ewh.l(str), e);
            return doh.D();
        } catch (RuntimeException e2) {
            zzr().X.c("Unable to merge remote config. appId", ewh.l(str), e2);
            return doh.D();
        }
    }

    public final void o(String str, doh.a aVar) {
        ht0 ht0Var = new ht0();
        ht0 ht0Var2 = new ht0();
        ht0 ht0Var3 = new ht0();
        for (int i = 0; i < ((doh) aVar.b).z(); i++) {
            coh.a aVarQ = ((doh) aVar.b).r(i).q();
            if (TextUtils.isEmpty(aVarQ.n())) {
                zzr().X.b("EventConfig contained null event name");
            } else {
                String strC0 = pyd.c0(aVarQ.n(), pg8.z0, pg8.A0);
                if (!TextUtils.isEmpty(strC0)) {
                    if (aVarQ.c) {
                        aVarQ.k();
                        aVarQ.c = false;
                    }
                    coh.s((coh) aVarQ.b, strC0);
                    if (aVar.c) {
                        aVar.k();
                        aVar.c = false;
                    }
                    doh.t((doh) aVar.b, i, (coh) aVarQ.m());
                }
                ht0Var.put(aVarQ.n(), Boolean.valueOf(((coh) aVarQ.b).t()));
                ht0Var2.put(aVarQ.n(), Boolean.valueOf(((coh) aVarQ.b).u()));
                if (((coh) aVarQ.b).v()) {
                    if (((coh) aVarQ.b).w() < 2 || ((coh) aVarQ.b).w() > 65535) {
                        zzr().X.c("Invalid sampling rate. Event name, sample rate", aVarQ.n(), Integer.valueOf(((coh) aVarQ.b).w()));
                    } else {
                        ht0Var3.put(aVarQ.n(), Integer.valueOf(((coh) aVarQ.b).w()));
                    }
                }
            }
        }
        this.e.put(str, ht0Var);
        this.f.put(str, ht0Var2);
        this.W.put(str, ht0Var3);
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0201 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(byte[] r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.szh.p(byte[], java.lang.String, java.lang.String):void");
    }

    public final boolean q(String str, String str2) {
        Boolean bool;
        b();
        v(str);
        if ("1".equals(c(str, "measurement.upload.blacklist_internal")) && yei.h0(str2)) {
            return true;
        }
        if ("1".equals(c(str, "measurement.upload.blacklist_public")) && yei.L(str2)) {
            return true;
        }
        Map map = (Map) this.e.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean r(String str, String str2) throws Throwable {
        Boolean bool;
        b();
        v(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        oci.a();
        if (this.a.V.k(null, djh.I0) && ("purchase".equals(str2) || "refund".equals(str2))) {
            return true;
        }
        Map map = (Map) this.f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final int s(String str, String str2) throws Throwable {
        Integer num;
        b();
        v(str);
        Map map = (Map) this.W.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean t(String str) {
        b();
        doh dohVarM = m(str);
        if (dohVarM == null) {
            return false;
        }
        return dohVarM.B();
    }

    public final long u(String str) throws Throwable {
        String strC = c(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(strC)) {
            return 0L;
        }
        try {
            return Long.parseLong(strC);
        } catch (NumberFormatException e) {
            this.zzr().X.c("Unable to parse timezone offset. appId", ewh.l(str), e);
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(java.lang.String r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.szh.v(java.lang.String):void");
    }
}
