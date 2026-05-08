package com.google.android.recaptcha.internal;

import defpackage.z92;
import defpackage.zve;
import io.jsonwebtoken.JwtParser;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjt {
    private Set zza;
    private Set zzb;
    private Long zzc;
    private int zzd;

    private static final boolean zzc(String str, Set set) {
        Iterator it = zve.j0(str, new char[]{JwtParser.SEPARATOR_CHAR}).iterator();
        String strConcat = "";
        while (it.hasNext()) {
            String strConcat2 = strConcat.concat(String.valueOf((String) it.next()));
            if (set.contains(strConcat2)) {
                return true;
            }
            strConcat = strConcat2.concat(".");
        }
        return false;
    }

    public final void zza(zzalc zzalcVar) {
        this.zza = z92.E1(zzalcVar.zza().zzc());
        this.zzb = z92.E1(zzalcVar.zzb().zzc());
    }

    public final boolean zzb(String str) {
        Set set = this.zza;
        if (set == null || this.zzb == null) {
            if (this.zzc == null) {
                this.zzc = Long.valueOf(System.currentTimeMillis());
            }
            this.zzd++;
            return true;
        }
        if (set.isEmpty()) {
            return true;
        }
        Set set2 = this.zzb;
        set2.getClass();
        if (zzc(str, set2)) {
            return false;
        }
        return zzc(str, set);
    }
}
