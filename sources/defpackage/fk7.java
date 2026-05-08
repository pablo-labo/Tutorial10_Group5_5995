package defpackage;

import androidx.fragment.app.g;
import defpackage.jq7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fk7 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fk7(int i, Object obj, Object obj2, Object obj3) {
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
                g gVar = (g) obj3;
                iba ibaVar = (iba) obj2;
                c88 c88Var = (c88) obj;
                if (gVar != null) {
                    Function1<lx5, j6g> function1 = c05.a;
                    c05.b("MyJobs/Applied/CTA", new hp0(c88Var, 7));
                    rq7 rq7Var = (rq7) cr8.p(rq7.class);
                    lr5 lr5VarU = gVar.u();
                    lr5VarU.getClass();
                    rq7Var.f(lr5VarU, ibaVar, new jq7.l((String) null, new hq7(c88Var.a, 2), 3), "MyJobs/Applied/CTA");
                }
                return j6g.a;
            case 1:
                return new p1b((xu5) ((g4a) obj3).getValue(), (Function1) ((g4a) obj2).getValue(), ((Number) ((gu5) obj).invoke()).intValue());
            default:
                gu5 gu5Var = (gu5) obj2;
                g4a g4aVar = (g4a) obj;
                if (((Boolean) ((gu5) obj3).invoke()).booleanValue()) {
                    g4aVar.setValue(Boolean.TRUE);
                } else {
                    gu5Var.invoke();
                }
                return j6g.a;
        }
    }
}
