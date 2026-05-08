package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class z4 implements Function1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ z4(Object obj, int i) {
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
                ((a5) obj2).n(ui8Var);
                return j6g.a;
            default:
                ((List) obj2).get(((Number) obj).intValue());
                return null;
        }
    }
}
