package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import defpackage.u63;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzmk extends c1f implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzmu zzc;
    final /* synthetic */ zzalo zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmk(zzmu zzmuVar, zzalo zzaloVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzc = zzmuVar;
        this.zzd = zzaloVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzmk zzmkVar = new zzmk(this.zzc, this.zzd, lu2Var);
        zzmkVar.zze = obj;
        return zzmkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzmk) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        zziu zziuVar;
        zziu zziuVar2;
        int i = this.zzb;
        g13 g13Var = g13.a;
        try {
        } catch (zzeg e) {
            this.zzc.zzy().h0(e);
        }
        if (i == 0) {
            r7d.b(obj);
            zziuVar = (zziu) this.zze;
            zzje zzjeVar = this.zzc.zzo;
            zzalo zzaloVar = this.zzd;
            this.zze = zziuVar;
            this.zza = zziuVar;
            this.zzb = 1;
            obj = zzjeVar.zzb(zzaloVar, this);
            if (obj != g13Var) {
                zziuVar2 = zziuVar;
            }
            return g13Var;
        }
        if (i != 1) {
            zziuVar = (zziu) this.zze;
            r7d.b(obj);
            zzmu zzmuVar = this.zzc;
            u63.Y(zzmuVar.zzp.zzb(), null, null, new zzmj(zzmuVar, zziuVar, (String) obj, null), 3);
            return j6g.a;
        }
        zziu zziuVar3 = (zziu) this.zza;
        zziu zziuVar4 = (zziu) this.zze;
        r7d.b(obj);
        zziuVar2 = zziuVar3;
        zziuVar = zziuVar4;
        this.zze = zziuVar;
        this.zza = null;
        this.zzb = 2;
        obj = ((zziq) obj).zza(zziuVar2, this);
        if (obj == g13Var) {
            return g13Var;
        }
        zzmu zzmuVar2 = this.zzc;
        u63.Y(zzmuVar2.zzp.zzb(), null, null, new zzmj(zzmuVar2, zziuVar, (String) obj, null), 3);
        return j6g.a;
    }
}
