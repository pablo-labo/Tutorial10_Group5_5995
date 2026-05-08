package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class i03 implements Function1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ i03(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                sl8 sl8Var = (sl8) obj;
                nif nifVarD = ((lu8) obj2).d();
                if (nifVarD != null) {
                    nifVarD.c = sl8Var;
                }
                return j6g.a;
            case 1:
                ((ArrayList) obj2).get(((Number) obj).intValue());
                return null;
            default:
                ui8 ui8Var = (ui8) obj;
                ui8Var.getClass();
                return ((Function1) obj2).invoke(ui8Var).toString();
        }
    }
}
