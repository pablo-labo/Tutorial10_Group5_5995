package com.google.android.recaptcha.internal;

import defpackage.l5;

/* JADX INFO: loaded from: classes2.dex */
public enum zzwj implements zzagi {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    WITH_ID_REQUIREMENT(5),
    UNRECOGNIZED(-1);

    private final int zzi;

    zzwj(int i) {
        this.zzi = i;
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
