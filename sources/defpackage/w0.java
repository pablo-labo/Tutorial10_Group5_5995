package defpackage;

import defpackage.x0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements Function1<bj8, mge> {
    public final /* synthetic */ x0.a a;

    public w0(x0.a aVar) {
        this.a = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final mge invoke(bj8 bj8Var) {
        x0 x0Var = x0.this;
        bj8Var.y0(x0Var);
        return x0Var.b.invoke();
    }
}
