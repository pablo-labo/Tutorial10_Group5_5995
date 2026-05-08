package com.google.android.recaptcha.internal;

import defpackage.w40;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaem extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzaem(long j, long j2, int i, Throwable th) {
        Locale locale = Locale.US;
        StringBuilder sbI = w40.i(j, "Pos: ", ", limit: ");
        sbI.append(j2);
        sbI.append(", len: ");
        sbI.append(i);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbI.toString()), th);
    }

    public zzaem() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzaem(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
