package defpackage;

import defpackage.kv8;

/* JADX INFO: loaded from: classes.dex */
public final class npg {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [lpg, yv8] */
    public static final mpg a(final n1 n1Var, kv8 kv8Var) {
        if (kv8Var.b().compareTo(kv8.b.a) <= 0) {
            b0.v("Cannot configure ", n1Var, " to disposeComposition at Lifecycle ON_DESTROY: ", kv8Var, "is already destroyed");
            return null;
        }
        ?? r0 = new uv8() { // from class: lpg
            @Override // defpackage.uv8
            public final void G(zv8 zv8Var, kv8.a aVar) {
                if (aVar == kv8.a.ON_DESTROY) {
                    n1Var.e();
                }
            }
        };
        kv8Var.a(r0);
        return new mpg(kv8Var, r0);
    }
}
