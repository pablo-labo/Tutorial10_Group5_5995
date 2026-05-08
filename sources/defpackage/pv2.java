package defpackage;

import com.datadog.android.ndk.internal.NdkCrashLog;
import defpackage.ha;
import defpackage.jv2;
import defpackage.mb8;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pv2 implements ga<jv2.e> {
    public static final pv2 a = new pv2();
    public static final List<String> b = u63.a0("required", NdkCrashLog.TIMESTAMP_KEY_NAME);

    @Override // defpackage.ga
    public final jv2.e a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        Boolean bool = null;
        Date date = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                bool = (Boolean) ha.f.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    if (bool != null) {
                        return new jv2.e(date, bool.booleanValue());
                    }
                    mh2.q(mb8Var, "required");
                    throw null;
                }
                ga gaVarE = lb3Var.e(qg3.a);
                ha.g gVar = ha.a;
                if (gaVarE instanceof nma) {
                    r6.g("The adapter is already nullable");
                    return null;
                }
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = gaVarE.a(mb8Var, lb3Var);
                }
                date = (Date) objA;
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, jv2.e eVar) {
        jv2.e eVar2 = eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        eVar2.getClass();
        hc8Var.u0("required");
        ha.f.b(hc8Var, lb3Var, Boolean.valueOf(eVar2.a));
        hc8Var.u0(NdkCrashLog.TIMESTAMP_KEY_NAME);
        ga gaVarE = lb3Var.e(qg3.a);
        if (gaVarE instanceof nma) {
            r6.g("The adapter is already nullable");
            return;
        }
        Date date = eVar2.b;
        if (date == null) {
            hc8Var.H1();
        } else {
            gaVarE.b(hc8Var, lb3Var, date);
        }
    }
}
