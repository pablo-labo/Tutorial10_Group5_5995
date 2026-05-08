package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class gb2 extends mj8 implements Function1<da2, fe0> {
    public static final gb2 a = new gb2(1);

    @Override // kotlin.jvm.functions.Function1
    public final fe0 invoke(da2 da2Var) {
        long jA = da2.a(da2Var.a, ya2.x);
        return new fe0(da2.d(jA), da2.h(jA), da2.g(jA), da2.e(jA));
    }
}
