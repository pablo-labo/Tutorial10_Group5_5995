package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.g13;
import defpackage.g61;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.o7d;
import defpackage.r7d;
import defpackage.u63;
import defpackage.xr3;
import defpackage.zr4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzbd extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzbf zzb;
    final /* synthetic */ zzif zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzalo zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbd(zzbf zzbfVar, zzif zzifVar, long j, zzalo zzaloVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzbfVar;
        this.zzc = zzifVar;
        this.zzd = j;
        this.zze = zzaloVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzbd zzbdVar = new zzbd(this.zzb, this.zzc, this.zzd, this.zze, lu2Var);
        zzbdVar.zzf = obj;
        return zzbdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbd) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws zzeg {
        int i = this.zza;
        r7d.b(obj);
        if (i == 0) {
            e13 e13Var = (e13) this.zzf;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(u63.l(e13Var, null, new zzbc(this.zzc, (zzax) it.next(), this.zzd, this.zze, null), 3));
            }
            xr3[] xr3VarArr = (xr3[]) arrayList.toArray(new xr3[0]);
            xr3[] xr3VarArr2 = (xr3[]) Arrays.copyOf(xr3VarArr, xr3VarArr.length);
            this.zza = 1;
            obj = xr3VarArr2.length == 0 ? zr4.a : new g61(xr3VarArr2).a(this);
            g13 g13Var = g13.a;
            if (obj == g13Var) {
                return g13Var;
            }
        }
        List list = (List) obj;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!(((o7d) it2.next()).b() instanceof o7d.a)) {
                    return j6g.a;
                }
            }
        }
        throw new zzeg(zzee.zzb, zzed.zzY, null, null, 12, null);
    }
}
