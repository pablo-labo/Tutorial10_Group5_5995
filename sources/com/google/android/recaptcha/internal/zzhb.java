package com.google.android.recaptcha.internal;

import android.app.Application;
import defpackage.c1f;
import defpackage.e13;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzhb extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzhj zzb;
    final /* synthetic */ zziu zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhb(zzhj zzhjVar, zziu zziuVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzhjVar;
        this.zzc = zziuVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzhb(this.zzb, this.zzc, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhb) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        zzhb zzhbVar;
        int i = this.zza;
        g13 g13Var = g13.a;
        r7d.b(obj);
        if (i == 0) {
            zzhj zzhjVar = this.zzb;
            zzew zzewVar = zzew.zza;
            String str = zzhjVar.zza;
            String packageName = zzhjVar.zzd.getPackageName();
            String strZzb = this.zzc.zza().zzb();
            zzfq zzfqVar = zzhjVar.zzg;
            zzes zzesVar = zzhjVar.zzi;
            Application application = zzhjVar.zzd;
            this.zza = 1;
            zzhbVar = this;
            obj = zzewVar.zza(str, packageName, strZzb, zzfqVar, zzesVar, application, zzhbVar);
            if (obj != g13Var) {
            }
        }
        if (i != 1) {
            return obj;
        }
        zzhbVar = this;
        zzhj zzhjVar2 = zzhbVar.zzb;
        zzane zzaneVarZza = zzhjVar2.zze.zza();
        zzand zzandVar = (zzand) ((zzane) obj).zzC();
        zzandVar.zzn(zzaneVarZza);
        zzane zzaneVar = (zzane) zzandVar.zzq();
        zzjl zzjlVar = zzhjVar2.zzb;
        String strZzb2 = zzhjVar2.zzc.zzb();
        zzhbVar.zza = 2;
        Object objZza = zzjlVar.zza(strZzb2, zzaneVar, zzhbVar);
        return objZza == g13Var ? g13Var : objZza;
    }
}
