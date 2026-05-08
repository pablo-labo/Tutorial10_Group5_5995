package defpackage;

import expo.modules.kotlin.exception.IncorrectRefTypeException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.sharedobjects.SharedRef;

/* JADX INFO: loaded from: classes3.dex */
public final class sde<T extends SharedRef<?>> extends kka<T> {
    public final zf8 a;
    public final rde<T> b;
    public final d2f c;

    public sde(zf8 zf8Var) {
        zf8Var.getClass();
        this.a = zf8Var;
        this.b = new rde<>(zf8Var);
        this.c = new d2f(new la(this, 26));
    }

    @Override // defpackage.kka, defpackage.owf
    public final boolean b() {
        this.b.getClass();
        return false;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return this.b.c();
    }

    @Override // defpackage.kka
    public final Object d(Object obj, gk0 gk0Var, boolean z) throws IncorrectRefTypeException {
        SharedRef sharedRef = (SharedRef) this.b.d(obj, gk0Var, z);
        RefType reftype = sharedRef.c;
        if (reftype != 0) {
            zf8 zf8Var = (zf8) this.c.getValue();
            oe8 oe8VarA = zf8Var != null ? zf8Var.a() : null;
            yd8 yd8Var = oe8VarA instanceof yd8 ? (yd8) oe8VarA : null;
            if (yd8Var != null) {
                Class<?> cls = reftype.getClass();
                if (!jh2.q(yd8Var).isAssignableFrom(cls) && !jh2.p(yd8Var).isAssignableFrom(cls)) {
                    Class<?> cls2 = sharedRef.getClass();
                    zf8 zf8Var2 = this.a;
                    zf8Var2.getClass();
                    throw new IncorrectRefTypeException("Cannot convert received '" + cls2 + "' to the '" + zf8Var2 + "', because of the inner ref type mismatch", null);
                }
            }
        }
        return sharedRef;
    }
}
