package defpackage;

import androidx.fragment.app.g;
import defpackage.gs7;
import defpackage.ns7;
import defpackage.sp7;
import defpackage.ur7;
import defpackage.us7;
import defpackage.xj7;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a67 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a67(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        List<sjb> list;
        sjb sjbVar;
        String str;
        int i = this.a;
        Set setK = null;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                hee heeVar = (hee) obj2;
                u63.Y((e13) obj3, null, null, new q67(heeVar, null), 3).d0(new nm1(5, heeVar, (g4a) obj));
                break;
            case 1:
                u63.Y((e13) obj3, null, null, new xj7.b((mhg) obj2, (c88) obj, null), 3);
                break;
            case 2:
                wu5 wu5Var = (wu5) obj;
                vr7 vr7Var = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU = ((g) obj3).u();
                lr5VarU.getClass();
                j1h j1hVar = ((vsb) obj2).l;
                if (j1hVar != null && (list = j1hVar.c) != null && (sjbVar = list.get(0)) != null) {
                    setK = pi3.k(new us7.a(sjbVar.a, sjbVar.b));
                }
                vr7Var.a(lr5VarU, new gs7.g(new us7(setK), new c0c(wu5Var, 1)));
                break;
            case 3:
                vr7 vr7Var2 = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU2 = ((g) obj3).u();
                lr5VarU2.getClass();
                ns7.a aVar = new ns7.a(null, new kzb((wu5) obj, 2));
                m61 m61Var = (m61) z92.Q0(((svb) obj2).v);
                if (m61Var == null || (str = m61Var.a) == null) {
                    str = "";
                }
                vr7Var2.e(lr5VarU2, "ProfileUIPlatformDebugScreen", aVar, new ur7.c(str));
                break;
            case 4:
                vje.f((gu5) obj3, (g4a) obj, (Function1) obj2);
                break;
            default:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g((String) obj3, "refresh", null, null, 12));
                ((Function1) obj2).invoke(((jhf) ((g4a) obj).getValue()).a.b);
                break;
        }
        return j6g.a;
    }
}
