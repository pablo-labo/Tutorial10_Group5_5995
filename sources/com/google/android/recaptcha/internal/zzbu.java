package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.ex7;
import defpackage.g13;
import defpackage.j6g;
import defpackage.ka2;
import defpackage.lu2;
import defpackage.o7d;
import defpackage.r7d;
import defpackage.u63;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzbu extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzby zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zziu zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbu(zzby zzbyVar, String str, zziu zziuVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzbyVar;
        this.zzc = str;
        this.zzd = zziuVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzbu zzbuVar = new zzbu(this.zzb, this.zzc, this.zzd, lu2Var);
        zzbuVar.zze = obj;
        return zzbuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbu) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        r7d.b(obj);
        if (i == 0) {
            e13 e13Var = (e13) this.zze;
            ArrayList arrayList = new ArrayList();
            zzby zzbyVar = this.zzb;
            String str = this.zzc;
            zzbyVar.zzo().put(str, arrayList);
            ArrayList arrayList2 = new ArrayList();
            List list = zzbyVar.zza;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzcg) obj2).zzi()) {
                    arrayList3.add(obj2);
                }
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(u63.Y(e13Var, null, null, new zzbt(this.zzd, (zzcg) it.next(), str, arrayList, null), 3));
            }
            ex7[] ex7VarArr = (ex7[]) arrayList2.toArray(new ex7[0]);
            ex7[] ex7VarArr2 = (ex7[]) Arrays.copyOf(ex7VarArr, ex7VarArr.length);
            this.zza = 1;
            Object objA = ka2.A(ex7VarArr2, this);
            g13 g13Var = g13.a;
            if (objA == g13Var) {
                return g13Var;
            }
        }
        return new o7d(this.zzb.zzq(this.zzc));
    }
}
