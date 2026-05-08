package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class umb implements kf5 {
    public final BigInteger a;

    public umb(BigInteger bigInteger) {
        this.a = bigInteger;
    }

    @Override // defpackage.kf5
    public final int a() {
        return 1;
    }

    @Override // defpackage.kf5
    public final BigInteger b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof umb) {
            return this.a.equals(((umb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
