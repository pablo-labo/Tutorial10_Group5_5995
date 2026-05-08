package com.google.android.recaptcha.internal;

import defpackage.u40;
import defpackage.z3;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxl extends zzaaq {
    private final zzxi zza;
    private final zzxg zzb;
    private final zzxh zzc;
    private final zzxj zzd;

    public /* synthetic */ zzxl(zzxi zzxiVar, zzxg zzxgVar, zzxh zzxhVar, zzxj zzxjVar, zzxk zzxkVar) {
        this.zza = zzxiVar;
        this.zzb = zzxgVar;
        this.zzc = zzxhVar;
        this.zzd = zzxjVar;
    }

    public static zzxf zza() {
        return new zzxf(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzxl)) {
            return false;
        }
        zzxl zzxlVar = (zzxl) obj;
        return zzxlVar.zza == this.zza && zzxlVar.zzb == this.zzb && zzxlVar.zzc == this.zzc && zzxlVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzxl.class, this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final String toString() {
        zzxg zzxgVar = this.zzb;
        zzxi zzxiVar = this.zza;
        zzxh zzxhVar = this.zzc;
        String string = this.zzd.toString();
        String string2 = zzxhVar.toString();
        return z3.n(u40.f("ECDSA Parameters (variant: ", string, ", hashType: ", string2, ", encoding: "), zzxiVar.toString(), ", curve: ", zzxgVar.toString(), ")");
    }

    public final zzxg zzb() {
        return this.zzb;
    }

    public final zzxh zzc() {
        return this.zzc;
    }

    public final zzxi zzd() {
        return this.zza;
    }

    public final zzxj zze() {
        return this.zzd;
    }

    public final boolean zzf() {
        return this.zzd != zzxj.zzd;
    }
}
