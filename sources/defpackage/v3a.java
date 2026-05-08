package defpackage;

import defpackage.gf8;
import defpackage.tf8;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v3a extends x3a implements gf8 {
    @Override // defpackage.qf8
    public final tf8.a c() {
        return ((gf8) getReflected()).c();
    }

    @Override // defpackage.iv1
    public final ud8 computeReflected() {
        return fwc.a.e(this);
    }

    @Override // defpackage.df8
    public final gf8.a e() {
        return ((gf8) getReflected()).e();
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((w3a) this).get(obj);
    }
}
