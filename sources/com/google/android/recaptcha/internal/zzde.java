package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.o7d;
import defpackage.r7d;
import defpackage.xr3;
import java.util.Optional;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzde extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzdn zzb;
    final /* synthetic */ zziu zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzde(zzdn zzdnVar, zziu zziuVar, String str, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzdnVar;
        this.zzc = zziuVar;
        this.zzd = str;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzde(this.zzb, this.zzc, this.zzd, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzde) create((zzif) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws zzeg {
        try {
            if (this.zza != 0) {
                r7d.b(obj);
            } else {
                r7d.b(obj);
                zzdn zzdnVar = this.zzb;
                xr3 xr3VarZzE = zzdnVar.zzE(new Long(((Number) zzdnVar.zzu().get(1)).longValue()), Optional.empty());
                this.zza = 1;
                obj = xr3VarZzE.n1(this);
                g13 g13Var = g13.a;
                if (obj == g13Var) {
                    return g13Var;
                }
            }
            Object objB = ((o7d) obj).b();
            r7d.b(objB);
            objB.getClass();
            byte[] bArr = (byte[]) objB;
            zzamp zzampVarZzc = zzamp.zzc(zzaef.zzm(bArr, 0, bArr.length));
            this.zzb.zzF(this.zzc);
            return new o7d(zzdn.zzG(this.zzd, zzampVarZzc));
        } catch (Exception e) {
            throw zzdn.zzo(this.zzb, e);
        }
    }
}
