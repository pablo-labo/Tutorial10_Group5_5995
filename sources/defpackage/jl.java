package defpackage;

import com.datadog.android.ndk.internal.NdkCrashLog;
import defpackage.ha;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jl implements ga {
    public static final jl b = new jl(0);
    public static final jl c = new jl(1);
    public static final jl d = new jl(2);
    public final /* synthetic */ int a;

    public /* synthetic */ jl(int i) {
        this.a = i;
    }

    @Override // defpackage.ga
    public final Object a(mb8 mb8Var, lb3 lb3Var) {
        switch (this.a) {
            case 0:
                throw ja.e(mb8Var, lb3Var, "Input type used in output position");
            case 1:
                throw ja.e(mb8Var, lb3Var, "Input type used in output position");
            default:
                throw ja.e(mb8Var, lb3Var, "Input type used in output position");
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, Object obj) {
        switch (this.a) {
            case 0:
                il ilVar = (il) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                ilVar.getClass();
                hc8Var.u0("resumeId");
                ha.a.b(hc8Var, lb3Var, ilVar.a);
                hc8Var.u0("associations");
                List<tj> list = ilVar.b;
                list.getClass();
                hc8Var.m();
                for (Object obj2 : list) {
                    hc8Var.j();
                    uj.a.b(hc8Var, lb3Var, obj2);
                    hc8Var.t();
                }
                hc8Var.l();
                return;
            case 1:
                hc8Var.getClass();
                lb3Var.getClass();
                ((bf2) obj).getClass();
                hc8Var.u0("nameFormat");
                throw null;
            default:
                wnf wnfVar = (wnf) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                wnfVar.getClass();
                hc8Var.u0(NdkCrashLog.TIMESTAMP_KEY_NAME);
                ha.g gVar = ha.a;
                f.a(hc8Var, wnfVar.a);
                return;
        }
    }
}
