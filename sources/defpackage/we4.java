package defpackage;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public final class we4 implements AlgorithmParameterSpec {
    public ue4 a;
    public ye4 b;
    public BigInteger c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof we4)) {
            return false;
        }
        we4 we4Var = (we4) obj;
        return this.a.f(we4Var.a) && this.b.b(we4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }
}
