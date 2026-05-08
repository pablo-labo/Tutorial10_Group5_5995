package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class bve extends BigInteger {
    private String cachedString;

    @Override // java.math.BigInteger
    public final String toString() {
        if (this.cachedString == null) {
            this.cachedString = super.toString();
        }
        return this.cachedString;
    }
}
