package com.google.android.recaptcha.internal;

import defpackage.akb;

/* JADX INFO: loaded from: classes2.dex */
final class zzsr extends zzqw {
    private final String zza;
    private final zzwj zzb;

    public /* synthetic */ zzsr(String str, zzwj zzwjVar, zzss zzssVar) {
        this.zza = str;
        this.zzb = zzwjVar;
    }

    public final String toString() {
        String str = this.zza;
        int iOrdinal = this.zzb.ordinal();
        return akb.k("(typeUrl=", str, ", outputPrefixType=", iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }
}
