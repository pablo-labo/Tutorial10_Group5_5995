package com.google.android.recaptcha.internal;

import android.os.Build;
import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import defpackage.u63;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzbl extends c1f implements Function2 {
    final /* synthetic */ zzbm zza;
    private /* synthetic */ Object zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbl(zzbm zzbmVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zza = zzbmVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzbl zzblVar = new zzbl(this.zza, lu2Var);
        zzblVar.zzb = obj;
        return zzblVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbl) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        r7d.b(obj);
        zziu zziuVar = (zziu) this.zzb;
        int i = Build.VERSION.SDK_INT;
        zzale zzaleVarZza = zzalf.zza();
        zzaleVarZza.zzw(zziuVar.zza().zzc());
        zzbm zzbmVar = this.zza;
        zzaleVarZza.zzf(zzbmVar.zza.getPackageName());
        zzaleVarZza.zzx(zzbmVar.zzb.zzd(zzbmVar.zza) + (-2) != 1 ? 4 : 3);
        zzaleVarZza.zzg("18.8.0");
        zzaleVarZza.zze(String.valueOf(i));
        zzaleVarZza.zzh(zziuVar.zza().zzb());
        zzaleVarZza.zzb(zzbmVar.zzb.zza(zzbmVar.zza));
        zzaleVarZza.zzc(zzes.zzc(zzbmVar.zza));
        zzaleVarZza.zza(zzes.zzb(zzbmVar.zza));
        zzaleVarZza.zzd(zzdo.zzb());
        byte[] bArrZzy = ((zzalf) zzaleVarZza.zzq()).zzy();
        String strZzi = zzqg.zzh().zzi(bArrZzy, 0, bArrZzy.length);
        zzamv zzamvVarZza = zzamy.zza();
        zzamw zzamwVarZza = zzamx.zza();
        zzamwVarZza.zzw(strZzi);
        zzamvVarZza.zza(u63.Z((zzamx) zzamwVarZza.zzq()));
        return zzch.zzb(zzbmVar, (zzamy) zzamvVarZza.zzq());
    }
}
