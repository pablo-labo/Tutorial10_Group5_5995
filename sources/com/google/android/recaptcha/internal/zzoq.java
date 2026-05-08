package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzoq<E> extends zzof<E> implements Set<E> {
    private transient zzoi zza;

    public static int zzg(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            zzmz.zzd(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzoq zzk(Collection collection) {
        if ((collection instanceof zzoq) && !(collection instanceof SortedSet)) {
            zzoq zzoqVar = (zzoq) collection;
            if (!zzoqVar.zze()) {
                return zzoqVar;
            }
        }
        Object[] array = collection.toArray();
        return zzn(array.length, array);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzoq zzn(int i, Object... objArr) {
        if (i == 0) {
            return zzpk.zza;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzpm(obj);
        }
        int iZzg = zzg(i);
        Object[] objArr2 = new Object[iZzg];
        int i2 = iZzg - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            zzpc.zza(obj2, i5);
            int iHashCode = obj2.hashCode();
            int iZza = zzoc.zza(iHashCode);
            while (true) {
                int i6 = iZza & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iZza++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzpm(obj4);
        }
        if (zzg(i4) < iZzg / 2) {
            return zzn(i4, objArr);
        }
        if (zzo(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new zzpk(objArr, i3, objArr2, i2, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzo(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzoq) && zzm() && ((zzoq) obj).zzm() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzpl.zza(this);
    }

    @Override // com.google.android.recaptcha.internal.zzof, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzpn iterator();

    public final zzoi zzh() {
        zzoi zzoiVar = this.zza;
        if (zzoiVar != null) {
            return zzoiVar;
        }
        zzoi zzoiVarZzi = zzi();
        this.zza = zzoiVarZzi;
        return zzoiVarZzi;
    }

    public zzoi zzi() {
        Object[] array = toArray();
        int i = zzoi.zzd;
        return zzoi.zzh(array, array.length);
    }

    public boolean zzm() {
        return false;
    }
}
