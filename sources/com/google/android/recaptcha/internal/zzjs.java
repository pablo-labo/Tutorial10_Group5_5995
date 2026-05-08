package com.google.android.recaptcha.internal;

import defpackage.b0;
import defpackage.e13;
import defpackage.f13;
import defpackage.g13;
import defpackage.j6g;
import defpackage.l5;
import defpackage.lu2;
import defpackage.u63;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjs implements zzjn {
    private final e13 zza;
    private final zzkd zzb;
    private final zzlw zzc;
    private final Map zzd;

    public zzjs(e13 e13Var, zzkd zzkdVar, zzlw zzlwVar, Map map) {
        this.zza = e13Var;
        this.zzb = zzkdVar;
        this.zzc = zzlwVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzjs zzjsVar, zzanv zzanvVar, zzkb zzkbVar) throws zzeu {
        zznb zznbVarZzb = zznb.zzb();
        int iZza = zzkbVar.zza();
        zzkw zzkwVar = (zzkw) zzjsVar.zzd.get(Integer.valueOf(zzanvVar.zza()));
        if (zzkwVar == null) {
            b0.n(5, 2, null);
            return;
        }
        int iZzb = zzanvVar.zzb();
        zzanu[] zzanuVarArr = (zzanu[]) zzanvVar.zzd().toArray(new zzanu[0]);
        zzkwVar.zza(iZzb, zzkbVar, (zzanu[]) Arrays.copyOf(zzanuVarArr, zzanuVarArr.length));
        if (iZza == zzkbVar.zza()) {
            zzkbVar.zzh(zzkbVar.zza() + 1);
        }
        zznbVarZzb.zzf();
        long jZza = zznbVarZzb.zza(TimeUnit.MICROSECONDS);
        int i = zzej.zza;
        int iZze = zzanvVar.zze();
        if (iZze != 1) {
            zzej.zza(iZze - 2, jZza);
        } else {
            l5.q("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzkb zzkbVar, lu2 lu2Var) {
        Object objD = f13.d(new zzjp(zzkbVar, list, this, null), lu2Var);
        return objD == g13.a ? objD : j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzkb zzkbVar, lu2 lu2Var) {
        Object objD = f13.d(new zzjq(exc, zzkbVar, this, null), lu2Var);
        return objD == g13.a ? objD : j6g.a;
    }

    @Override // com.google.android.recaptcha.internal.zzjn
    public final void zza(String str) {
        u63.Y(this.zza, null, null, new zzjr(new zzkb(this.zzb), this, str, null), 3);
    }
}
