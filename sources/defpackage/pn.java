package defpackage;

import com.apollographql.apollo.exception.JsonDataException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pn implements ga {
    public static final pn b = new pn(0);
    public final /* synthetic */ int a;

    public /* synthetic */ pn(int i) {
        this.a = i;
    }

    @Override // defpackage.ga
    public final Object a(mb8 mb8Var, lb3 lb3Var) {
        switch (this.a) {
            case 0:
                throw ja.e(mb8Var, lb3Var, "Input type used in output position");
            default:
                mb8Var.getClass();
                lb3Var.getClass();
                if (!(mb8Var instanceof tb9)) {
                    r6.g("UnsafeAdapter only supports MapJsonReader");
                    return null;
                }
                tb9 tb9Var = (tb9) mb8Var;
                Object obj = tb9Var.d;
                if (obj == null) {
                    throw new JsonDataException("Expected a non-null value at path ".concat(tb9Var.p()), null);
                }
                tb9Var.a();
                return obj;
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, Object obj) {
        switch (this.a) {
            case 0:
                on onVar = (on) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                onVar.getClass();
                hc8Var.u0("resumeId");
                ha.a.b(hc8Var, lb3Var, onVar.a);
                hc8Var.u0("links");
                List<wk> list = onVar.b;
                list.getClass();
                hc8Var.m();
                for (Object obj2 : list) {
                    hc8Var.j();
                    wk wkVar = (wk) obj2;
                    wkVar.getClass();
                    hc8Var.u0("link");
                    ha.a.b(hc8Var, lb3Var, wkVar.a);
                    hc8Var.t();
                }
                hc8Var.l();
                break;
            default:
                hc8Var.getClass();
                lb3Var.getClass();
                if (hc8Var instanceof ub9) {
                    ((ub9) hc8Var).p(obj);
                } else {
                    r6.g("UnsafeAdapter only supports MapJsonWriter");
                }
                break;
        }
    }
}
