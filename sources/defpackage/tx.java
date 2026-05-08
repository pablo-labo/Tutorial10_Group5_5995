package defpackage;

import com.datadog.android.ndk.internal.NdkCrashLog;
import defpackage.ha;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tx implements ga {
    public static final tx b = new tx(0);
    public static final tx c = new tx(1);
    public static final tx d = new tx(2);
    public static final tx e = new tx(3);
    public final /* synthetic */ int a;

    public /* synthetic */ tx(int i) {
        this.a = i;
    }

    @Override // defpackage.ga
    public final Object a(mb8 mb8Var, lb3 lb3Var) {
        switch (this.a) {
            case 0:
                throw ja.e(mb8Var, lb3Var, "Input type used in output position");
            case 1:
                throw ja.e(mb8Var, lb3Var, "Input type used in output position");
            case 2:
                throw ja.e(mb8Var, lb3Var, "Input type used in output position");
            default:
                throw ja.e(mb8Var, lb3Var, "Input type used in output position");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, Object obj) {
        switch (this.a) {
            case 0:
                sx sxVar = (sx) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                sxVar.getClass();
                hc8Var.u0("userInteraction");
                ha.g gVar = ha.a;
                e0g e0gVar = sxVar.a;
                hc8Var.j();
                f0g.a.b(hc8Var, lb3Var, e0gVar);
                hc8Var.t();
                hc8Var.u0(NdkCrashLog.TIMESTAMP_KEY_NAME);
                lb3Var.e(nmf.a).b(hc8Var, lb3Var, sxVar.b);
                return;
            case 1:
                hc8Var.getClass();
                lb3Var.getClass();
                ((nw2) obj).getClass();
                hc8Var.u0("participantRole");
                throw null;
            case 2:
                hw3 hw3Var = (hw3) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                hw3Var.getClass();
                hc8Var.u0("resumeId");
                ha.g gVar2 = ha.a;
                gVar2.b(hc8Var, lb3Var, hw3Var.a);
                hc8Var.u0("patentIds");
                List<String> list = hw3Var.b;
                list.getClass();
                hc8Var.m();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    gVar2.b(hc8Var, lb3Var, it.next());
                }
                hc8Var.l();
                return;
            default:
                ucg ucgVar = (ucg) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                ucgVar.getClass();
                hc8Var.u0("resumeId");
                ha.a.b(hc8Var, lb3Var, ucgVar.a);
                hc8Var.u0("links");
                List<jag> list2 = ucgVar.b;
                list2.getClass();
                hc8Var.m();
                for (Object obj2 : list2) {
                    hc8Var.j();
                    kag.a.b(hc8Var, lb3Var, obj2);
                    hc8Var.t();
                }
                hc8Var.l();
                return;
        }
    }
}
