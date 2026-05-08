package com.google.android.recaptcha.internal;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzacq {
    public static final zzacq zza;
    public static final zzacq zzb;
    public static final zzacq zzc;
    private final zzaco zzd;

    static {
        new zzacq(new zzacr());
        new zzacq(new zzacv());
        zza = new zzacq(new zzacx());
        zzb = new zzacq(new zzacw());
        new zzacq(new zzacs());
        new zzacq(new zzacu());
        zzc = new zzacq(new zzact());
    }

    public zzacq(zzacy zzacyVar) {
        this.zzd = !zzrh.zzb() ? "The Android Project".equals(System.getProperty("java.vendor")) ? new zzacl(zzacyVar, null) : new zzacm(zzacyVar, null) : new zzacn(zzacyVar, null);
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zza(String str) {
        return this.zzd.zza(str);
    }
}
