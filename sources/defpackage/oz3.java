package defpackage;

import defpackage.cfe;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class oz3 implements Function1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ oz3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ui8 ui8Var = (ui8) obj;
                ui8Var.getClass();
                return ((pz3) obj2).X(ui8Var);
            case 1:
                cfe.a.C0106a c0106a = (cfe.a.C0106a) obj;
                c0106a.getClass();
                c0106a.a((String) obj2, zib.b, zib.c);
                return j6g.a;
            case 2:
                j5c j5cVar = (j5c) obj;
                j5cVar.getClass();
                return y5c.a(j5cVar, ((gxf) obj2).a.d);
            case 3:
                ui8 ui8Var2 = (ui8) obj2;
                ((xx9) obj).getClass();
                return ui8Var2;
            default:
                ((List) obj2).get(((Number) obj).intValue());
                return null;
        }
    }
}
