package defpackage;

import com.datadog.android.ndk.internal.NdkCrashLog;
import defpackage.d36;
import defpackage.ha;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j36 implements ga<d36.e> {
    public static final j36 a = new j36();
    public static final List<String> b = u63.a0("uid", NdkCrashLog.TIMESTAMP_KEY_NAME, "criteria");

    @Override // defpackage.ga
    public final d36.e a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        Object objA = null;
        d36.a aVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                objA = ha.g.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 2) {
                    break;
                }
                f36 f36Var = f36.a;
                ha.g gVar = ha.a;
                aVar = (d36.a) new ena(f36Var, false).a(mb8Var, lb3Var);
            }
        }
        if (str == null) {
            mh2.q(mb8Var, "uid");
            throw null;
        }
        if (objA == null) {
            mh2.q(mb8Var, NdkCrashLog.TIMESTAMP_KEY_NAME);
            throw null;
        }
        if (aVar != null) {
            return new d36.e(str, objA, aVar);
        }
        mh2.q(mb8Var, "criteria");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, d36.e eVar) {
        d36.e eVar2 = eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        eVar2.getClass();
        hc8Var.u0("uid");
        ha.a.b(hc8Var, lb3Var, eVar2.a);
        hc8Var.u0(NdkCrashLog.TIMESTAMP_KEY_NAME);
        ha.g gVar = ha.a;
        f.a(hc8Var, eVar2.b);
        hc8Var.u0("criteria");
        f36 f36Var = f36.a;
        d36.a aVar = eVar2.c;
        hc8Var.j();
        f36Var.b(hc8Var, lb3Var, aVar);
        hc8Var.t();
    }
}
