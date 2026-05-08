package com.google.android.recaptcha.internal;

import defpackage.l5;

/* JADX INFO: loaded from: classes2.dex */
public enum zzvs implements zzagi {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);

    private final int zzh;

    zzvs(int i) {
        this.zzh = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzh);
    }

    @Override // com.google.android.recaptcha.internal.zzagi
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzh;
        }
        l5.q("Can't get the number of an unknown enum value.");
        return 0;
    }
}
