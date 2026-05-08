package com.google.android.recaptcha.internal;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.b0;
import defpackage.t92;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkc {
    private final zzka zza;
    private final Map zzb = new LinkedHashMap();
    private final Set zzc = new LinkedHashSet();

    public zzkc(zzka zzkaVar) {
        this.zza = zzkaVar;
    }

    private final List zzh(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(zza((zzanu) it.next()));
        }
        return arrayList;
    }

    public final Object zza(zzanu zzanuVar) throws zzeu {
        int iZzn = zzanuVar.zzn();
        int i = iZzn - 1;
        if (iZzn == 0) {
            throw null;
        }
        switch (i) {
            case 0:
                return this.zzb.get(Integer.valueOf(zzanuVar.zzc()));
            case 1:
                return Boolean.valueOf(zzanuVar.zzl());
            case 2:
                byte[] bArrZzp = zzanuVar.zzh().zzp();
                if (bArrZzp.length == 1) {
                    return Byte.valueOf(bArrZzp[0]);
                }
                b0.n(4, 6, null);
                return null;
            case 3:
                String strZzj = zzanuVar.zzj();
                if (strZzj.length() == 1) {
                    return Character.valueOf(strZzj.charAt(0));
                }
                b0.n(4, 6, null);
                return null;
            case 4:
                int iZzd = zzanuVar.zzd();
                if (iZzd >= -32768 && iZzd <= 32767) {
                    return Short.valueOf((short) iZzd);
                }
                b0.n(4, 6, null);
                return null;
            case 5:
                return Integer.valueOf(zzanuVar.zze());
            case 6:
            case 8:
                b0.n(4, 6, null);
                return null;
            case 7:
                return Long.valueOf(zzanuVar.zzg());
            case DatadogLogGenerator.CRASH /* 9 */:
                return Float.valueOf(zzanuVar.zzb());
            case 10:
                return Double.valueOf(zzanuVar.zza());
            case 11:
                return zzanuVar.zzk();
            default:
                b0.n(4, 5, null);
            case 12:
                return null;
        }
    }

    public final Object zzb(int i) {
        return this.zzb.remove(Integer.valueOf(i));
    }

    public final void zzc() {
        this.zzb.clear();
    }

    public final void zzd(int i, Object obj) {
        zze(173, obj);
        this.zzc.add(173);
    }

    public final void zze(int i, Object obj) {
        this.zzb.put(Integer.valueOf(i), obj);
    }

    public final Class[] zzf(List list) {
        List listZzh = zzh(list);
        ArrayList arrayList = new ArrayList(t92.r0(listZzh, 10));
        Iterator it = listZzh.iterator();
        while (it.hasNext()) {
            arrayList.add(this.zza.zza(it.next()));
        }
        return (Class[]) arrayList.toArray(new Class[0]);
    }

    public final Object[] zzg(List list) {
        return zzh(list).toArray(new Object[0]);
    }
}
