package com.google.android.recaptcha.internal;

import defpackage.l5;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzoe {
    public static int zzc(int i, int i2) {
        if (i2 < 0) {
            l5.q("cannot store more than Integer.MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int iHighestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = iHighestOneBit + iHighestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    public abstract zzoe zzb(Object obj);
}
