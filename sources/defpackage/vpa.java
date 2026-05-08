package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class vpa {
    public boolean a;
    public final go1 b = h22.a(-2, 4, eo1.a);
    public final uqe c;

    public vpa(e13 e13Var, boolean z, Function2 function2, ejb ejbVar) {
        this.a = z;
        this.c = u63.Y(e13Var, null, null, new upa(ejbVar, function2, this, null), 3);
    }

    public final void a() {
        this.b.n(new CancellationException("onBack cancelled"), true);
        this.c.h(null);
    }
}
