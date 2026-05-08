package com.google.android.recaptcha.internal;

import defpackage.m6;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzaib {
    public static final /* synthetic */ int zza = 0;
    private static final zzaio zzb;

    static {
        int i = zzadt.zza;
        zzb = new zzaiq();
    }

    public static void zzA(int i, List list, zzajb zzajbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajbVar.zzy(i, list, z);
    }

    public static void zzB(int i, List list, zzajb zzajbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajbVar.zzA(i, list, z);
    }

    public static void zzC(int i, List list, zzajb zzajbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajbVar.zzC(i, list, z);
    }

    public static void zzD(int i, List list, zzajb zzajbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajbVar.zzE(i, list, z);
    }

    public static void zzE(int i, List list, zzajb zzajbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajbVar.zzJ(i, list, z);
    }

    public static void zzF(int i, List list, zzajb zzajbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajbVar.zzL(i, list, z);
    }

    public static boolean zzG(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @Deprecated
    public static int zza(int i, zzahl zzahlVar, zzahz zzahzVar) {
        int iZzx = zzaeo.zzx(i << 3);
        return ((zzadq) zzahlVar).zzv(zzahzVar) + iZzx + iZzx;
    }

    public static int zzb(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzagh)) {
            int iZzy = 0;
            while (i < size) {
                iZzy += zzaeo.zzy(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzy;
        }
        zzagh zzaghVar = (zzagh) list;
        int iZzy2 = 0;
        while (i < size) {
            iZzy2 += zzaeo.zzy(zzaghVar.zze(i));
            i++;
        }
        return iZzy2;
    }

    public static int zzc(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaeo.zzx(i << 3) + 4) * size;
    }

    public static int zzd(List list) {
        return list.size() * 4;
    }

    public static int zze(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaeo.zzx(i << 3) + 8) * size;
    }

    public static int zzf(List list) {
        return list.size() * 8;
    }

    public static int zzg(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzagh)) {
            int iZzy = 0;
            while (i < size) {
                iZzy += zzaeo.zzy(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzy;
        }
        zzagh zzaghVar = (zzagh) list;
        int iZzy2 = 0;
        while (i < size) {
            iZzy2 += zzaeo.zzy(zzaghVar.zze(i));
            i++;
        }
        return iZzy2;
    }

    public static int zzh(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzaha)) {
            int iZzy = 0;
            while (i < size) {
                iZzy += zzaeo.zzy(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzy;
        }
        zzaha zzahaVar = (zzaha) list;
        int iZzy2 = 0;
        while (i < size) {
            iZzy2 += zzaeo.zzy(zzahaVar.zze(i));
            i++;
        }
        return iZzy2;
    }

    public static int zzi(int i, Object obj, zzahz zzahzVar) {
        int i2 = i << 3;
        if (obj instanceof zzagw) {
            int iZzx = zzaeo.zzx(i2);
            int iZza = ((zzagw) obj).zza();
            return m6.a(iZza, iZza, iZzx);
        }
        int iZzx2 = zzaeo.zzx(i2);
        int iZzv = ((zzadq) obj).zzv(zzahzVar);
        return m6.a(iZzv, iZzv, iZzx2);
    }

    public static int zzj(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzagh)) {
            int iZzx = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzx += zzaeo.zzx((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iZzx;
        }
        zzagh zzaghVar = (zzagh) list;
        int iZzx2 = 0;
        while (i < size) {
            int iZze = zzaghVar.zze(i);
            iZzx2 += zzaeo.zzx((iZze >> 31) ^ (iZze + iZze));
            i++;
        }
        return iZzx2;
    }

    public static int zzk(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzaha)) {
            int iZzy = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzy += zzaeo.zzy((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iZzy;
        }
        zzaha zzahaVar = (zzaha) list;
        int iZzy2 = 0;
        while (i < size) {
            long jZze = zzahaVar.zze(i);
            iZzy2 += zzaeo.zzy((jZze >> 63) ^ (jZze + jZze));
            i++;
        }
        return iZzy2;
    }

    public static int zzl(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzagh)) {
            int iZzx = 0;
            while (i < size) {
                iZzx += zzaeo.zzx(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzx;
        }
        zzagh zzaghVar = (zzagh) list;
        int iZzx2 = 0;
        while (i < size) {
            iZzx2 += zzaeo.zzx(zzaghVar.zze(i));
            i++;
        }
        return iZzx2;
    }

    public static int zzm(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzaha)) {
            int iZzy = 0;
            while (i < size) {
                iZzy += zzaeo.zzy(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzy;
        }
        zzaha zzahaVar = (zzaha) list;
        int iZzy2 = 0;
        while (i < size) {
            iZzy2 += zzaeo.zzy(zzahaVar.zze(i));
            i++;
        }
        return iZzy2;
    }

    public static zzaio zzn() {
        return zzb;
    }

    public static Object zzo(Object obj, int i, List list, zzagk zzagkVar, Object obj2, zzaio zzaioVar) {
        if (zzagkVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzagkVar.zza(iIntValue)) {
                    obj2 = zzp(obj, i, iIntValue, obj2, zzaioVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int iIntValue2 = num.intValue();
            if (zzagkVar.zza(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = zzp(obj, i, iIntValue2, obj2, zzaioVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    public static Object zzp(Object obj, int i, int i2, Object obj2, zzaio zzaioVar) {
        if (obj2 == null) {
            obj2 = zzaioVar.zza(obj);
        }
        zzaioVar.zzh(obj2, i, i2);
        return obj2;
    }

    public static void zzq(zzafs zzafsVar, Object obj, Object obj2) {
        zzafw zzafwVar = ((zzagd) obj2).zza;
        if (zzafwVar.zza.isEmpty()) {
            return;
        }
        ((zzagd) obj).zzc().zzh(zzafwVar);
    }

    public static void zzr(zzaio zzaioVar, Object obj, Object obj2) {
        zzagg zzaggVar = (zzagg) obj;
        zzaip zzaipVarZze = zzaggVar.zzc;
        zzaip zzaipVar = ((zzagg) obj2).zzc;
        if (!zzaip.zzc().equals(zzaipVar)) {
            if (zzaip.zzc().equals(zzaipVarZze)) {
                zzaipVarZze = zzaip.zze(zzaipVarZze, zzaipVar);
            } else {
                zzaipVarZze.zzd(zzaipVar);
            }
        }
        zzaggVar.zzc = zzaipVarZze;
    }

    public static void zzs(int i, List list, zzajb zzajbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajbVar.zzc(i, list, z);
    }

    public static void zzt(int i, List list, zzajb zzajbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajbVar.zzg(i, list, z);
    }

    public static void zzu(int i, List list, zzajb zzajbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajbVar.zzj(i, list, z);
    }

    public static void zzv(int i, List list, zzajb zzajbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajbVar.zzl(i, list, z);
    }

    public static void zzw(int i, List list, zzajb zzajbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajbVar.zzn(i, list, z);
    }

    public static void zzx(int i, List list, zzajb zzajbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajbVar.zzp(i, list, z);
    }

    public static void zzy(int i, List list, zzajb zzajbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajbVar.zzs(i, list, z);
    }

    public static void zzz(int i, List list, zzajb zzajbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajbVar.zzu(i, list, z);
    }
}
