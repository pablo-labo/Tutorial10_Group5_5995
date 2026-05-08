package com.google.android.recaptcha.internal;

import defpackage.l5;

/* JADX INFO: loaded from: classes2.dex */
public enum zzvq implements zzagi {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    private final int zzi;

    zzvq(int i) {
        this.zzi = i;
    }

    public static zzvq zzb(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA384;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i == 4) {
            return SHA512;
        }
        if (i != 5) {
            return null;
        }
        return SHA224;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzi);
    }

    @Override // com.google.android.recaptcha.internal.zzagi
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzi;
        }
        l5.q("Can't get the number of an unknown enum value.");
        return 0;
    }
}
