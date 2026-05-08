package defpackage;

import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class nl5 extends e.c implements sl5 {
    public Function1<? super xm5, j6g> d0;
    public ym5 e0;

    public nl5() {
        throw null;
    }

    @Override // defpackage.sl5
    public final void X(ym5 ym5Var) {
        if (wl7.b(this.e0, ym5Var)) {
            return;
        }
        this.e0 = ym5Var;
        this.d0.invoke(ym5Var);
    }
}
