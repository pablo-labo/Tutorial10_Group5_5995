package defpackage;

import defpackage.ha;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xn implements ga {
    public static final xn b = new xn(0);
    public static final xn c = new xn(1);
    public final /* synthetic */ int a;

    public /* synthetic */ xn(int i) {
        this.a = i;
    }

    @Override // defpackage.ga
    public final Object a(mb8 mb8Var, lb3 lb3Var) {
        switch (this.a) {
            case 0:
                throw ja.e(mb8Var, lb3Var, "Input type used in output position");
            default:
                throw ja.e(mb8Var, lb3Var, "Input type used in output position");
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, Object obj) {
        switch (this.a) {
            case 0:
                wn wnVar = (wn) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                wnVar.getClass();
                hc8Var.u0("resumeId");
                ha.a.b(hc8Var, lb3Var, wnVar.a);
                hc8Var.u0("military");
                List<yn> list = wnVar.b;
                list.getClass();
                hc8Var.m();
                for (Object obj2 : list) {
                    hc8Var.j();
                    zn.a.b(hc8Var, lb3Var, obj2);
                    hc8Var.t();
                }
                hc8Var.l();
                break;
            default:
                uxc uxcVar = (uxc) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                uxcVar.getClass();
                hc8Var.u0("platform");
                hc8Var.T0(yab.ANDROID.a());
                hc8Var.u0("credentialType");
                hc8Var.T0(z63.FIREBASE.a());
                hc8Var.u0("appName");
                e77 e77Var = uxcVar.a;
                e77Var.getClass();
                hc8Var.T0(e77Var.a());
                hc8Var.u0("pushToken");
                ha.g gVar = ha.a;
                gVar.b(hc8Var, lb3Var, uxcVar.b);
                hc8Var.u0("clientVersion");
                gVar.b(hc8Var, lb3Var, uxcVar.c);
                hc8Var.u0("deviceId");
                gVar.b(hc8Var, lb3Var, uxcVar.d);
                hc8Var.u0("deviceType");
                hc8Var.T0(uxcVar.e.a());
                break;
        }
    }
}
