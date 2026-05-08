package defpackage;

import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ypa extends mj8 implements Function1<f71, j6g> {
    final /* synthetic */ dqa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypa(dqa dqaVar) {
        super(1);
        this.this$0 = dqaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(f71 f71Var) {
        wpa wpaVarPrevious;
        f71 f71Var2 = f71Var;
        f71Var2.getClass();
        dqa dqaVar = this.this$0;
        wpa wpaVar = dqaVar.c;
        if (wpaVar == null) {
            zs0<wpa> zs0Var = dqaVar.b;
            ListIterator<wpa> listIterator = zs0Var.listIterator(zs0Var.a());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    wpaVarPrevious = null;
                    break;
                }
                wpaVarPrevious = listIterator.previous();
                if (wpaVarPrevious.a) {
                    break;
                }
            }
            wpaVar = wpaVarPrevious;
        }
        if (wpaVar != null) {
            wpaVar.c(f71Var2);
        }
        return j6g.a;
    }
}
