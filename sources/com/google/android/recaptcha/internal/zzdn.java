package com.google.android.recaptcha.internal;

import android.app.Application;
import defpackage.be4;
import defpackage.lu2;
import defpackage.oa6;
import defpackage.pg8;
import defpackage.t92;
import defpackage.u63;
import defpackage.wd4;
import defpackage.xr3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdn extends zzax {
    public List zza;
    public xr3 zzb;
    private final Application zzc;
    private final zzdx zzd;
    private final zzdo zze;
    private zzd zzf;
    private final HashMap zzg = new HashMap();
    private final zzes zzh = new zzes(oa6.b);
    private zzalo zzi;
    private final zzfa zzj;
    private final zzdw zzk;

    public zzdn(Application application, zzfa zzfaVar, zzdx zzdxVar, zzdw zzdwVar, zzdc zzdcVar, zzdo zzdoVar) {
        this.zzc = application;
        this.zzj = zzfaVar;
        this.zzd = zzdxVar;
        this.zzk = zzdwVar;
        this.zze = zzdoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzD(defpackage.lu2 r11) throws com.google.android.recaptcha.internal.zzeg {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.recaptcha.internal.zzdd
            if (r0 == 0) goto L13
            r0 = r11
            com.google.android.recaptcha.internal.zzdd r0 = (com.google.android.recaptcha.internal.zzdd) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdd r0 = new com.google.android.recaptcha.internal.zzdd
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.zza
            int r1 = r0.zzc
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.r7d.b(r11)     // Catch: java.lang.Exception -> L6b
            goto L42
        L26:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r10)
            return r2
        L2c:
            defpackage.r7d.b(r11)
            java.util.Optional r11 = java.util.Optional.empty()     // Catch: java.lang.Exception -> L6b
            xr3 r10 = r10.zzE(r2, r11)     // Catch: java.lang.Exception -> L6b
            r0.zzc = r3     // Catch: java.lang.Exception -> L6b
            java.lang.Object r11 = r10.n1(r0)     // Catch: java.lang.Exception -> L6b
            g13 r10 = defpackage.g13.a
            if (r11 != r10) goto L42
            return r10
        L42:
            o7d r11 = (defpackage.o7d) r11     // Catch: java.lang.Exception -> L6b
            java.lang.Object r10 = r11.b()     // Catch: java.lang.Exception -> L6b
            defpackage.r7d.b(r10)     // Catch: java.lang.Exception -> L6b
            boolean r11 = r10 instanceof java.util.List     // Catch: java.lang.Exception -> L6b
            if (r11 == 0) goto L52
            r2 = r10
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Exception -> L6b
        L52:
            if (r2 == 0) goto L5c
            int r10 = r2.size()
            r11 = 2
            if (r10 < r11) goto L5c
            return r2
        L5c:
            com.google.android.recaptcha.internal.zzeg r3 = new com.google.android.recaptcha.internal.zzeg
            com.google.android.recaptcha.internal.zzee r4 = com.google.android.recaptcha.internal.zzee.zzb
            com.google.android.recaptcha.internal.zzed r5 = com.google.android.recaptcha.internal.zzed.zzaX
            r8 = 12
            r9 = 0
            r6 = 0
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L6b:
            r0 = move-exception
            r10 = r0
            com.google.android.recaptcha.internal.zzeg r0 = new com.google.android.recaptcha.internal.zzeg
            com.google.android.recaptcha.internal.zzee r1 = com.google.android.recaptcha.internal.zzee.zzb
            com.google.android.recaptcha.internal.zzed r2 = com.google.android.recaptcha.internal.zzed.zzaX
            java.lang.String r3 = r10.getMessage()
            r5 = 8
            r6 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdn.zzD(lu2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xr3 zzE(Long l, Optional optional) {
        return u63.l(this.zzj.zzc(), null, new zzdh(l, this, optional, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzF(zziu zziuVar) {
        ArrayList arrayList;
        Object next;
        Object next2;
        Object obj = this.zzg.get(314);
        List list = obj instanceof List ? (List) obj : null;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(t92.r0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(zzaji.zze((byte[]) it.next()));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : arrayList) {
                Long lValueOf = Long.valueOf(((zzaji) obj2).zzb());
                Object arrayList2 = linkedHashMap.get(lValueOf);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(lValueOf, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            for (List list3 : linkedHashMap.values()) {
                Iterator it2 = list3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((zzaji) next).zzh() == 3) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                zzaji zzajiVar = (zzaji) next;
                Iterator it3 = list3.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (((zzaji) next2).zzh() == 4) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                zzaji zzajiVar2 = (zzaji) next2;
                if (zzajiVar != null && zzajiVar2 != null) {
                    int iZzg = zzajiVar.zzg() - 2;
                    int i = iZzg != 1 ? iZzg != 2 ? 2 : 46 : 47;
                    zzakg zzakgVarZzd = zzakj.zzd();
                    zzakgVarZzd.zzA(i);
                    zzakgVarZzd.zzd(zzia.zza);
                    zzakgVarZzd.zzy(zziuVar.zzc());
                    zzakgVarZzd.zzg(zziuVar.zza().zzb());
                    zzakgVarZzd.zzB(zziuVar.zza().zzd());
                    zzakgVarZzd.zzw(zzajiVar.zza());
                    int iZzi = zzajiVar2.zzi() - 2;
                    zzakgVarZzd.zzC(iZzi != 1 ? iZzi != 2 ? 2 : 4 : 3);
                    long jZzc = zzajiVar.zzc();
                    zzakgVarZzd.zzx(zzaje.zzd(zzaje.zzc(jZzc / 1000000000, (int) (jZzc % 1000000000))));
                    zzakgVarZzd.zze(wd4.f(pg8.U(zzajiVar2.zzc() - zzajiVar.zzc(), be4.NANOSECONDS)));
                    zziuVar.zzd(zzakgVarZzd, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zzaly zzG(String str, zzamp zzampVar) {
        zzalx zzalxVarZza = zzaly.zza();
        zzalxVarZza.zza(str);
        zzalv zzalvVarZza = zzalw.zza();
        zzalvVarZza.zza(zzampVar);
        zzalxVarZza.zzd(zzalvVarZza);
        return (zzaly) zzalxVarZza.zzq();
    }

    public static final /* synthetic */ zzeg zzo(zzdn zzdnVar, Exception exc) {
        zzeg zzegVar = exc instanceof zzeg ? (zzeg) exc : null;
        return zzegVar == null ? new zzeg(zzee.zzb, zzed.zzaZ, exc.getMessage(), null, 8, null) : zzegVar;
    }

    public static final /* synthetic */ Object zzs(zzdn zzdnVar, zzalo zzaloVar, lu2 lu2Var) {
        return new zziq(new zzdk(zzdnVar, zzaloVar, null));
    }

    public static final /* synthetic */ void zzx(zzdn zzdnVar, zzir zzirVar) {
        HashMap map = zzdnVar.zzg;
        Application application = zzdnVar.zzc;
        map.put(120, application);
        map.put(416, "18.8.0");
        map.put(518, zzirVar.zzb());
        map.put(620, zzdo.zzb());
        map.put(722, zzirVar.zzc());
        zzes zzesVar = zzdnVar.zzh;
        map.put(824, Integer.valueOf(zzesVar.zzd(application) - 2));
        map.put(926, application.getPackageName());
        map.put(1028, Boolean.valueOf(zzesVar.zza(application)));
        map.put(1130, Boolean.valueOf(zzes.zzc(application)));
        map.put(1232, zzes.zzb(application));
    }

    public static final /* synthetic */ void zzy(zzdn zzdnVar, zzalu zzaluVar) throws zzeg {
        try {
            zzd zzdVarZza = zzdnVar.zze.zza();
            zzdnVar.zzf = zzdVarZza;
            zzd zzdVar = null;
            if (zzdVarZza == null) {
                zzdVarZza = null;
            }
            zzdVarZza.zzd(zzaluVar.zza().zzp());
            zzd zzdVar2 = zzdnVar.zzf;
            if (zzdVar2 != null) {
                zzdVar = zzdVar2;
            }
            zzdVar.zzc();
        } catch (Exception e) {
            throw new zzeg(zzee.zzb, zzed.zzaW, e.getMessage(), null, 8, null);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzax
    public final zzane zza() {
        zzand zzandVarZza = zzane.zza();
        zzandVarZza.zze(zzdo.zzb());
        return (zzane) zzandVarZza.zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzax
    public final Object zzb(String str, lu2 lu2Var) {
        zzamo zzamoVarZza = zzamp.zza();
        zzamoVarZza.zzd(str);
        return zzG(str, (zzamp) zzamoVarZza.zzq());
    }

    @Override // com.google.android.recaptcha.internal.zzax
    public final Object zzc(String str, lu2 lu2Var) {
        return new zziq(new zzdf(this, str, null));
    }

    @Override // com.google.android.recaptcha.internal.zzax
    public final Object zze(zzalo zzaloVar, lu2 lu2Var) {
        return new zziq(new zzdg(this, zzaloVar, null));
    }

    @Override // com.google.android.recaptcha.internal.zzax
    public final int zzk() {
        return 44;
    }

    @Override // com.google.android.recaptcha.internal.zzax
    public final int zzl() {
        return 43;
    }

    public final List zzu() {
        List list = this.zza;
        if (list != null) {
            return list;
        }
        return null;
    }

    public final xr3 zzw() {
        xr3 xr3Var = this.zzb;
        if (xr3Var != null) {
            return xr3Var;
        }
        return null;
    }
}
