package defpackage;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class eg3 implements ga {
    public static final eg3 b = new eg3(0);
    public static final eg3 c = new eg3(1);
    public final /* synthetic */ int a;

    public /* synthetic */ eg3(int i) {
        this.a = i;
    }

    @Override // defpackage.ga
    public final Object a(mb8 mb8Var, lb3 lb3Var) {
        switch (this.a) {
            case 0:
                mb8Var.getClass();
                lb3Var.getClass();
                String strI0 = mb8Var.I0();
                strI0.getClass();
                return new Date(OffsetDateTime.parse(strI0).toInstant().toEpochMilli());
            default:
                throw ja.e(mb8Var, lb3Var, "Input type used in output position");
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, Object obj) {
        switch (this.a) {
            case 0:
                Date date = (Date) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                date.getClass();
                String string = Instant.ofEpochMilli(date.getTime()).toString();
                string.getClass();
                hc8Var.T0(string);
                break;
            default:
                zdg zdgVar = (zdg) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                zdgVar.getClass();
                hc8Var.u0("resumeId");
                ha.a.b(hc8Var, lb3Var, zdgVar.a);
                hc8Var.u0("skills");
                List<seg> list = zdgVar.b;
                list.getClass();
                hc8Var.m();
                for (Object obj2 : list) {
                    hc8Var.j();
                    teg.a.b(hc8Var, lb3Var, obj2);
                    hc8Var.t();
                }
                hc8Var.l();
                break;
        }
    }
}
