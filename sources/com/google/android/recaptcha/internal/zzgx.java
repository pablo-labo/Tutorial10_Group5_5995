package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgx extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzhj zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgx(zzhj zzhjVar, String str, long j, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzhjVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzgx zzgxVar = new zzgx(this.zzb, this.zzc, this.zzd, lu2Var);
        zzgxVar.zze = obj;
        return zzgxVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgx) create((zzif) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws zzeg {
        zzif zzifVar;
        int i = this.zza;
        g13 g13Var = g13.a;
        try {
            if (i == 0) {
                r7d.b(obj);
                zzifVar = (zzif) this.zze;
                zzbf zzbfVar = this.zzb.zze;
                String str = this.zzc;
                long j = this.zzd;
                this.zze = zzifVar;
                this.zza = 1;
                obj = zzbfVar.zzb(str, j, this);
                if (obj != g13Var) {
                }
                return g13Var;
            }
            if (i != 1) {
                r7d.b(obj);
                return (zzaly) obj;
            }
            zzifVar = (zzif) this.zze;
            r7d.b(obj);
            this.zze = null;
            this.zza = 2;
            obj = ((zzip) obj).zza(zzifVar.zza(), this);
            if (obj == g13Var) {
                return g13Var;
            }
            return (zzaly) obj;
        } catch (zzeg e) {
            throw e;
        } catch (TimeoutCancellationException e2) {
            throw new zzeg(zzee.zzb, zzed.zzb, e2.getMessage(), null, 8, null);
        } catch (Exception e3) {
            throw new zzeg(zzee.zzb, zzed.zzaa, e3.getMessage(), null, 8, null);
        }
    }
}
