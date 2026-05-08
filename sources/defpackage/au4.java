package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class au4 implements af0 {
    public static final au4 a = new au4();

    @Override // defpackage.af0
    public final qne g() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // defpackage.af0
    public final ui8 getType() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // defpackage.af0
    public final mq5 h() {
        t52 t52VarD = b04.d(this);
        if (t52VarD != null) {
            if (lx4.f(t52VarD)) {
                t52VarD = null;
            }
            if (t52VarD != null) {
                return b04.c(t52VarD);
            }
        }
        return null;
    }

    @Override // defpackage.af0
    public final Map<n8a, up2<?>> i() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
