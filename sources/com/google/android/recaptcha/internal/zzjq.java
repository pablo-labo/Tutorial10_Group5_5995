package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.f13;
import defpackage.fwc;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import java.util.Arrays;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzjq extends c1f implements Function2 {
    final /* synthetic */ Exception zza;
    final /* synthetic */ zzkb zzb;
    final /* synthetic */ zzjs zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjq(Exception exc, zzkb zzkbVar, zzjs zzjsVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zza = exc;
        this.zzb = zzkbVar;
        this.zzc = zzjsVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzjq zzjqVar = new zzjq(this.zza, this.zzb, this.zzc, lu2Var);
        zzjqVar.zzd = obj;
        return zzjqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzjq) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        zzamt zzamtVarZza;
        r7d.b(obj);
        e13 e13Var = (e13) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzeu) {
            zzamtVarZza = ((zzeu) exc).zza();
            zzamtVarZza.zza(this.zzb.zza());
        } else {
            zzkb zzkbVar = this.zzb;
            zzamt zzamtVarZza2 = zzamu.zza();
            zzamtVarZza2.zza(zzkbVar.zza());
            zzamtVarZza2.zzd(2);
            zzamtVarZza2.zzc(2);
            zzamtVarZza = zzamtVarZza2;
        }
        zzamu zzamuVar = (zzamu) zzamtVarZza.zzq();
        zzamuVar.zzg();
        zzamuVar.zze();
        fwc.a.b(exc.getClass()).r();
        exc.getMessage();
        zzkb zzkbVar2 = this.zzb;
        zzel zzelVarZzb = zzkbVar2.zzb();
        zzel zzelVar = zzkbVar2.zza;
        if (zzelVar == null) {
            zzelVar = null;
        }
        zzaks zzaksVarZza = zzin.zza(zzelVarZzb, zzelVar);
        String strZze = zzkbVar2.zze();
        if (strZze.length() == 0) {
            strZze = "recaptcha.m.Main.rge";
        }
        if (f13.e(e13Var)) {
            zzjs zzjsVar = this.zzc;
            zzqg zzqgVarZzh = zzqg.zzh();
            byte[] bArrZzy = zzamuVar.zzy();
            String strZzi = zzqgVarZzh.zzi(bArrZzy, 0, bArrZzy.length);
            zzqg zzqgVarZzh2 = zzqg.zzh();
            byte[] bArrZzy2 = zzaksVarZza.zzy();
            zzjsVar.zzb.zze().zzb(strZze, (String[]) Arrays.copyOf(new String[]{strZzi, zzqgVarZzh2.zzi(bArrZzy2, 0, bArrZzy2.length)}, 2));
        }
        return j6g.a;
    }
}
