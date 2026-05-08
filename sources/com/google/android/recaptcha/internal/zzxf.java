package com.google.android.recaptcha.internal;

import defpackage.l6;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxf {
    private zzxi zza = null;
    private zzxg zzb = null;
    private zzxh zzc = null;
    private zzxj zzd = zzxj.zzd;

    private zzxf() {
    }

    public final zzxf zza(zzxg zzxgVar) {
        this.zzb = zzxgVar;
        return this;
    }

    public final zzxf zzb(zzxh zzxhVar) {
        this.zzc = zzxhVar;
        return this;
    }

    public final zzxf zzc(zzxi zzxiVar) {
        this.zza = zzxiVar;
        return this;
    }

    public final zzxf zzd(zzxj zzxjVar) {
        this.zzd = zzxjVar;
        return this;
    }

    public final zzxl zze() throws GeneralSecurityException {
        zzxi zzxiVar = this.zza;
        if (zzxiVar == null) {
            l6.m("signature encoding is not set");
            return null;
        }
        zzxg zzxgVar = this.zzb;
        if (zzxgVar == null) {
            l6.m("EC curve type is not set");
            return null;
        }
        zzxh zzxhVar = this.zzc;
        if (zzxhVar == null) {
            l6.m("hash type is not set");
            return null;
        }
        zzxj zzxjVar = this.zzd;
        if (zzxjVar == null) {
            l6.m("variant is not set");
            return null;
        }
        if (zzxgVar == zzxg.zza && zzxhVar != zzxh.zza) {
            l6.m("NIST_P256 requires SHA256");
            return null;
        }
        if (zzxgVar == zzxg.zzb && zzxhVar != zzxh.zzb && zzxhVar != zzxh.zzc) {
            l6.m("NIST_P384 requires SHA384 or SHA512");
            return null;
        }
        if (zzxgVar != zzxg.zzc || zzxhVar == zzxh.zzc) {
            return new zzxl(zzxiVar, zzxgVar, zzxhVar, zzxjVar, null);
        }
        l6.m("NIST_P521 requires SHA512");
        return null;
    }

    public /* synthetic */ zzxf(zzxk zzxkVar) {
    }
}
