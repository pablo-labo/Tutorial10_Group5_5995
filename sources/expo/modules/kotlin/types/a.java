package expo.modules.kotlin.types;

import defpackage.fxf;
import defpackage.gg8;
import defpackage.gk0;
import defpackage.l5;
import defpackage.owf;
import defpackage.s23;
import defpackage.z92;
import defpackage.zf8;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import expo.modules.kotlin.types.ValueOrUndefined;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements owf<ValueOrUndefined<?>> {
    public final owf<?> a;

    public a(fxf fxfVar, zf8 zf8Var) {
        zf8Var.getClass();
        zf8 zf8Var2 = ((gg8) z92.O0(zf8Var.g())).b;
        if (zf8Var2 != null) {
            this.a = fxfVar.a(zf8Var2);
        } else {
            l5.q("The ValueOrUndefined type should contain the argument type.");
            throw null;
        }
    }

    @Override // defpackage.owf
    public final ValueOrUndefined<?> a(Object obj, gk0 gk0Var, boolean z) {
        return obj instanceof ValueOrUndefined.b ? ValueOrUndefined.b.a : new ValueOrUndefined.c(this.a.a(obj, gk0Var, false));
    }

    @Override // defpackage.owf
    public final boolean b() {
        return false;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return new ExpectedType(new SingleType(s23.k0, new ExpectedType[]{this.a.c()}));
    }
}
