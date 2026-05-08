package defpackage;

import com.datadog.android.ndk.internal.NdkCrashLog;
import defpackage.ha;
import defpackage.ynf;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bof implements ga<ynf.b> {
    public static final bof a = new bof();
    public static final List<String> b = u63.a0("jobKey", "jobSeekerAccountKey", NdkCrashLog.TIMESTAMP_KEY_NAME);

    @Override // defpackage.ga
    public final ynf.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String str2 = null;
        Object objA = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                str2 = (String) ha.a.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 2) {
                    break;
                }
                objA = ha.g.a(mb8Var, lb3Var);
            }
        }
        if (str == null) {
            mh2.q(mb8Var, "jobKey");
            throw null;
        }
        if (str2 == null) {
            mh2.q(mb8Var, "jobSeekerAccountKey");
            throw null;
        }
        if (objA != null) {
            return new ynf.b(objA, str, str2);
        }
        mh2.q(mb8Var, NdkCrashLog.TIMESTAMP_KEY_NAME);
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ynf.b bVar) {
        ynf.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("jobKey");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, bVar2.a);
        hc8Var.u0("jobSeekerAccountKey");
        gVar.b(hc8Var, lb3Var, bVar2.b);
        hc8Var.u0(NdkCrashLog.TIMESTAMP_KEY_NAME);
        ha.g gVar2 = ha.a;
        f.a(hc8Var, bVar2.c);
    }
}
