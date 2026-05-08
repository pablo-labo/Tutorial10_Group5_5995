package com.google.android.recaptcha.internal;

import defpackage.bs4;
import defpackage.kc9;
import defpackage.l;
import defpackage.lu2;
import defpackage.t92;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzby extends zzax {
    private final List zza;
    private zzaef zzb;
    private final Map zzc = new LinkedHashMap();

    public zzby(List list) {
        this.zza = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzaly zzq(String str) {
        Map linkedHashMap;
        List list = (List) this.zzc.remove(str);
        zzaef zzaefVar = this.zzb;
        if (zzaefVar == null) {
            zzaefVar = null;
        }
        zzff zzffVar = new zzff(zzaefVar);
        if (list != null) {
            List<zzci> list2 = list;
            int iV = kc9.V(t92.r0(list2, 10));
            if (iV < 16) {
                iV = 16;
            }
            linkedHashMap = new LinkedHashMap(iV);
            for (zzci zzciVar : list2) {
                linkedHashMap.put(Integer.valueOf(zzciVar.zzb()), zzciVar);
            }
        } else {
            linkedHashMap = bs4.a;
        }
        zzamp zzampVarZzr = zzr(linkedHashMap, zzffVar, str);
        zzalx zzalxVarZza = zzaly.zza();
        zzalxVarZza.zza(str);
        zzalr zzalrVarZza = zzals.zza();
        zzalrVarZza.zza(zzampVarZzr);
        zzalrVarZza.zzb(zzaef.zzm(zzffVar.zzb(), 0, 12));
        zzalxVarZza.zzc(zzalrVarZza);
        return (zzaly) zzalxVarZza.zzq();
    }

    private final zzamp zzr(Map map, zzff zzffVar, String str) {
        zzamo zzamoVarZza = zzamp.zza();
        zzamoVarZza.zzd(str);
        List list = this.zza;
        ArrayList<zzcg> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((zzcg) obj).zzi()) {
                arrayList.add(obj);
            }
        }
        for (zzcg zzcgVar : arrayList) {
            if (!map.containsKey(Integer.valueOf(zzcgVar.zza()))) {
                int iZza = zzcgVar.zza();
                zzamt zzamtVarZza = zzamu.zza();
                zzamtVarZza.zzb(iZza);
                zzamtVarZza.zzd(13);
                zzamtVarZza.zzc(27);
                zzamoVarZza.zzb(zzs(zzffVar, new zzbz(iZza, (zzamu) zzamtVarZza.zzq())));
            }
        }
        Collection collectionValues = map.values();
        ArrayList arrayList2 = new ArrayList(t92.r0(collectionValues, 10));
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList2.add(zzs(zzffVar, (zzci) it.next()));
        }
        zzamoVarZza.zza(arrayList2);
        return (zzamp) zzamoVarZza.zzq();
    }

    private static final zzamn zzs(zzff zzffVar, zzci zzciVar) {
        zzaml zzamlVarZzb = zzamn.zzb();
        zzamlVarZzb.zzf(3);
        byte[] byteArray = BigInteger.valueOf(zzciVar.zzb()).toByteArray();
        zzaef zzaefVar = zzaef.zzb;
        zzamlVarZzb.zze(zzaef.zzm(byteArray, 0, byteArray.length));
        if (zzciVar instanceof zzca) {
            byte[] bArrZza = zzffVar.zza(((zzca) zzciVar).zza().zzy(), zzciVar.zzb());
            zzamlVarZzb.zzd(zzaef.zzm(bArrZza, 0, bArrZza.length));
        } else {
            if (!(zzciVar instanceof zzbz)) {
                l.g();
                return null;
            }
            byte[] bArrZza2 = zzffVar.zza(((zzbz) zzciVar).zza().zzy(), zzciVar.zzb());
            zzamlVarZzb.zzc(zzaef.zzm(bArrZza2, 0, bArrZza2.length));
        }
        return (zzamn) zzamlVarZzb.zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzax
    public final Object zzb(String str, lu2 lu2Var) {
        return zzq(str);
    }

    @Override // com.google.android.recaptcha.internal.zzax
    public final Object zzc(String str, lu2 lu2Var) {
        return new zziq(new zzbv(this, str, null));
    }

    @Override // com.google.android.recaptcha.internal.zzax
    public final Object zze(zzalo zzaloVar, lu2 lu2Var) {
        return new zziq(new zzbx(zzaloVar, this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzax
    public final void zzi(zzamh zzamhVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzcg) it.next()).zzh(zzamhVar);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzax
    public final int zzk() {
        return 35;
    }

    @Override // com.google.android.recaptcha.internal.zzax
    public final int zzl() {
        return 34;
    }

    public final Map zzo() {
        return this.zzc;
    }
}
