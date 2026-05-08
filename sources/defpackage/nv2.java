package defpackage;

import com.datadog.android.ndk.internal.NdkCrashLog;
import defpackage.ha;
import defpackage.jv2;
import defpackage.mb8;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nv2 implements ga<jv2.c> {
    public static final nv2 a = new nv2();
    public static final List<String> b = u63.a0("primary", "reason", NdkCrashLog.TIMESTAMP_KEY_NAME);

    @Override // defpackage.ga
    public final jv2.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        Object objA2;
        mb8Var.getClass();
        lb3Var.getClass();
        Boolean boolA = null;
        r29 r29Var = null;
        Date date = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 != 0) {
                mb8.a aVar = mb8.a.Y;
                if (iD1 == 1) {
                    ha.g gVar = ha.a;
                    s29 s29Var = s29.a;
                    if (mb8Var.peek() == aVar) {
                        mb8Var.I();
                        objA2 = null;
                    } else {
                        objA2 = s29Var.a(mb8Var, lb3Var);
                    }
                    r29Var = (r29) objA2;
                } else {
                    if (iD1 != 2) {
                        return new jv2.c(boolA, r29Var, date);
                    }
                    ga gaVarE = lb3Var.e(qg3.a);
                    ha.g gVar2 = ha.a;
                    if (gaVarE instanceof nma) {
                        r6.g("The adapter is already nullable");
                        return null;
                    }
                    if (mb8Var.peek() == aVar) {
                        mb8Var.I();
                        objA = null;
                    } else {
                        objA = gaVarE.a(mb8Var, lb3Var);
                    }
                    date = (Date) objA;
                }
            } else {
                boolA = ha.l.a(mb8Var, lb3Var);
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, jv2.c cVar) {
        jv2.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("primary");
        ha.l.b(hc8Var, lb3Var, cVar2.a);
        hc8Var.u0("reason");
        s29 s29Var = s29.a;
        r29 r29Var = cVar2.b;
        if (r29Var == null) {
            hc8Var.H1();
        } else {
            s29Var.b(hc8Var, lb3Var, r29Var);
        }
        hc8Var.u0(NdkCrashLog.TIMESTAMP_KEY_NAME);
        ga gaVarE = lb3Var.e(qg3.a);
        if (gaVarE instanceof nma) {
            r6.g("The adapter is already nullable");
            return;
        }
        Date date = cVar2.c;
        if (date == null) {
            hc8Var.H1();
        } else {
            gaVarE.b(hc8Var, lb3Var, date);
        }
    }
}
