package defpackage;

import expo.modules.kotlin.exception.NullArgumentException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kka<Type> implements owf<Type> {
    @Override // defpackage.owf
    public final Type a(Object obj, gk0 gk0Var, boolean z) throws NullArgumentException {
        if (obj != null) {
            return d(obj, gk0Var, z);
        }
        throw new NullArgumentException();
    }

    @Override // defpackage.owf
    public boolean b() {
        return true;
    }

    public abstract Type d(Object obj, gk0 gk0Var, boolean z);
}
