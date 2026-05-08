package defpackage;

import com.datadog.android.rum.internal.RumFeature;
import defpackage.ha;
import java.time.Instant;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class xp implements ga {
    public static final xp b = new xp(0);
    public static final xp c = new xp(1);
    public static final xp d = new xp(2);
    public final /* synthetic */ int a;

    public /* synthetic */ xp(int i) {
        this.a = i;
    }

    @Override // defpackage.ga
    public final Object a(mb8 mb8Var, lb3 lb3Var) {
        switch (this.a) {
            case 0:
                throw ja.e(mb8Var, lb3Var, "Input type used in output position");
            case 1:
                mb8Var.getClass();
                lb3Var.getClass();
                Instant instantOfEpochMilli = Instant.ofEpochMilli(mb8Var.nextLong());
                instantOfEpochMilli.getClass();
                return instantOfEpochMilli;
            default:
                throw ja.e(mb8Var, lb3Var, "Input type used in output position");
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, Object obj) {
        switch (this.a) {
            case 0:
                wp wpVar = (wp) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                wpVar.getClass();
                hc8Var.u0(RumFeature.EVENT_ATTRIBUTES_PROPERTY);
                ha.g gVar = ha.a;
                ArrayList arrayList = wpVar.a;
                hc8Var.m();
                for (Object obj2 : arrayList) {
                    hc8Var.j();
                    vp.a.b(hc8Var, lb3Var, obj2);
                    hc8Var.t();
                }
                hc8Var.l();
                break;
            case 1:
                Instant instant = (Instant) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                instant.getClass();
                hc8Var.E(instant.toEpochMilli());
                break;
            default:
                hc8Var.getClass();
                lb3Var.getClass();
                ((o48) obj).getClass();
                hc8Var.u0("sectionId");
                ha.a.b(hc8Var, lb3Var, null);
                break;
        }
    }
}
