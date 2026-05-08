package com.google.android.gms.internal.play_billing;

import defpackage.w40;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzen extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzen(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbI = w40.i(j, "Pos: ", ", limit: ");
        sbI.append(j2);
        sbI.append(", len: ");
        sbI.append(i);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbI.toString()), indexOutOfBoundsException);
    }

    public zzen(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
