package com.google.android.recaptcha.internal;

import android.content.ContentValues;
import defpackage.c1f;
import defpackage.e13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import defpackage.z92;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzij extends c1f implements Function2 {
    final /* synthetic */ zzik zza;
    final /* synthetic */ zzann zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzij(zzik zzikVar, zzann zzannVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zza = zzikVar;
        this.zzb = zzannVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzij(this.zza, this.zzb, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzij) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        r7d.b(obj);
        zzann zzannVar = this.zzb;
        zzik zzikVar = this.zza;
        synchronized (zzig.class) {
            try {
                if (zzikVar.zzc != null) {
                    byte[] bArrZzy = zzannVar.zzy();
                    zzie zzieVar = new zzie(zzqg.zzg().zzi(bArrZzy, 0, bArrZzy.length), System.currentTimeMillis(), 0);
                    zzid zzidVar = zzikVar.zzc;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("ss", zzieVar.zzc());
                    contentValues.put("ts", Long.valueOf(zzieVar.zzb()));
                    zzidVar.getWritableDatabase().insert("ce", null, contentValues);
                    int iZzb = zzikVar.zzc.zzb() - 500;
                    if (iZzb > 0) {
                        zzikVar.zzc.zza(z92.q1(zzikVar.zzc.zzd(), iZzb));
                    }
                    if (zzikVar.zzc.zzb() >= 20) {
                        zzikVar.zzg();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j6g.a;
    }
}
