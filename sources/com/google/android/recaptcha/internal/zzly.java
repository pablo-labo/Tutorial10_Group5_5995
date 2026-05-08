package com.google.android.recaptcha.internal;

import defpackage.b0;
import defpackage.z92;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzly implements zzlw {
    private final zzlx zza;

    public zzly(zzlx zzlxVar, zzlv zzlvVar) {
        this.zza = zzlxVar;
    }

    private final zzanp zzb(String str, List list) throws zzeu {
        if (str.length() == 0) {
            b0.n(3, 17, null);
            return null;
        }
        try {
            zzlu zzluVar = new zzlu(this.zza.zza(z92.A1(list)), 255L, zzlu.zza);
            StringBuilder sb = new StringBuilder(str.length());
            for (int i = 0; i < str.length(); i++) {
                sb.append((char) (str.charAt(i) ^ ((int) zzluVar.zza())));
            }
            return zzanp.zzb(zzqg.zzh().zzj(sb.toString()));
        } catch (Exception e) {
            b0.n(3, 18, e);
            return null;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzlw
    public final zzanp zza(zzanr zzanrVar) throws zzeu {
        zznb zznbVarZzb = zznb.zzb();
        zzanp zzanpVarZzb = zzb(zzanrVar.zzd(), zzanrVar.zze());
        zznbVarZzb.zzf();
        long jZza = zznbVarZzb.zza(TimeUnit.MICROSECONDS);
        int i = zzej.zza;
        zzej.zza(zzek.zza.zza(), jZza);
        return zzanpVarZzb;
    }
}
