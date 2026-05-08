package defpackage;

import androidx.fragment.app.g;
import defpackage.b5a;
import defpackage.ns7;
import defpackage.rh3;
import defpackage.ude;
import defpackage.ur7;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v6a implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v6a(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                g3a<b5a> g3aVar = ((e8a) obj3).a0;
                String str = ie7.c0;
                g3aVar.k(new b5a.d(n7g.a(str, n7g.a(str, ((vde) obj2).f))));
                ((ude) obj).m(ude.c.e.a);
                break;
            case 1:
                rh3.c cVar = (rh3.c) obj3;
                xu5 xu5Var = (xu5) obj2;
                xu5 xu5Var2 = (xu5) obj;
                boolean z = cVar.e;
                Map<String, Object> map = cVar.d;
                String str2 = cVar.c;
                String str3 = cVar.f;
                String str4 = cVar.b;
                if (z) {
                    xu5Var.j(str4, str3, str2, map);
                } else {
                    xu5Var2.j(str4, str3, str2, map);
                }
                break;
            case 2:
                vr7 vr7Var = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU = ((g) obj3).u();
                lr5VarU.getClass();
                ns7.f fVar = new ns7.f(null, new h0c((wu5) obj, 1));
                it9 it9Var = (it9) z92.Q0(((svb) obj2).k);
                vr7Var.e(lr5VarU, "ProfileUIPlatformDebugScreen", fVar, new ur7.c(it9Var != null ? it9Var.a : ""));
                break;
            default:
                gu5 gu5Var = (gu5) obj;
                b4g.q((String) obj3, (String) obj2);
                if (gu5Var != null) {
                    gu5Var.invoke();
                }
                break;
        }
        return j6g.a;
    }
}
