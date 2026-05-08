package defpackage;

import defpackage.ere;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class rt0 extends up2<List<? extends up2<?>>> {
    public final Function1<xx9, ui8> b;

    /* JADX WARN: Multi-variable type inference failed */
    public rt0(List<? extends up2<?>> list, Function1<? super xx9, ? extends ui8> function1) {
        super(list);
        this.b = function1;
    }

    @Override // defpackage.up2
    public final ui8 a(xx9 xx9Var) {
        xx9Var.getClass();
        ui8 ui8VarInvoke = this.b.invoke(xx9Var);
        if (!ei8.z(ui8VarInvoke) && !ei8.G(ui8VarInvoke) && !ei8.C(ui8VarInvoke, ere.a.W.a) && !ei8.C(ui8VarInvoke, ere.a.X.a) && !ei8.C(ui8VarInvoke, ere.a.Y.a)) {
            ei8.C(ui8VarInvoke, ere.a.Z.a);
        }
        return ui8VarInvoke;
    }
}
