package com.google.android.gms.internal.fido;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdl extends IOException {
    public zzdl(Exception exc) {
        super("Error in decoding CborValue from bytes", exc);
    }
}
