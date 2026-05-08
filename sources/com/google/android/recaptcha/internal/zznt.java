package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zznt extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf = zzqk.zza(3, 1, 1073741823);
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzA() {
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public static /* synthetic */ Object zzg(zznt zzntVar, int i) {
        return zzntVar.zzA()[i];
    }

    public static /* synthetic */ Object zzi(zznt zzntVar) {
        Object obj = zzntVar.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    public static /* synthetic */ Object zzj(zznt zzntVar, int i) {
        return zzntVar.zzB()[i];
    }

    public static /* synthetic */ void zzn(zznt zzntVar, int i, Object obj) {
        zzntVar.zzB()[i] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzu() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv(Object obj) {
        if (zzq()) {
            return -1;
        }
        int iZzb = zzoc.zzb(obj);
        int iZzu = zzu();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int iZzc = zznu.zzc(obj2, iZzb & iZzu);
        if (iZzc != 0) {
            int i = ~iZzu;
            int i2 = iZzb & i;
            do {
                int i3 = iZzc - 1;
                int i4 = zzz()[i3];
                if ((i4 & i) == i2 && Objects.equals(obj, zzA()[i3])) {
                    return i3;
                }
                iZzc = i4 & iZzu;
            } while (iZzc != 0);
        }
        return -1;
    }

    private final int zzw(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objZzd = zznu.zzd(i2);
        if (i4 != 0) {
            zznu.zze(objZzd, i3 & i5, i4 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzz = zzz();
        for (int i6 = 0; i6 <= i; i6++) {
            int iZzc = zznu.zzc(obj, i6);
            while (iZzc != 0) {
                int i7 = iZzc - 1;
                int i8 = iArrZzz[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iZzc2 = zznu.zzc(objZzd, i10);
                zznu.zze(objZzd, i10, iZzc);
                iArrZzz[i7] = ((~i5) & i9) | (iZzc2 & i5);
                iZzc = i8 & i;
            }
        }
        this.zze = objZzd;
        zzy(i5);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzx(Object obj) {
        if (!zzq()) {
            int iZzu = zzu();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int iZzb = zznu.zzb(obj, null, iZzu, obj2, zzz(), zzA(), null);
            if (iZzb != -1) {
                Object obj3 = zzB()[iZzb];
                zzp(iZzb, iZzu);
                this.zzg--;
                zzo();
                return obj3;
            }
        }
        return zzd;
    }

    private final void zzy(int i) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.zzf & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzz() {
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzq()) {
            return;
        }
        zzo();
        Map mapZzl = zzl();
        if (mapZzl != null) {
            this.zzf = zzqk.zza(size(), 3, 1073741823);
            mapZzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzA(), 0, this.zzg, (Object) null);
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzz(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapZzl = zzl();
        return mapZzl != null ? mapZzl.containsKey(obj) : zzv(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsValue(obj);
        }
        for (int i = 0; i < this.zzg; i++) {
            if (Objects.equals(obj, zzB()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zznn zznnVar = new zznn(this, null);
        this.zzi = zznnVar;
        return zznnVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.get(obj);
        }
        int iZzv = zzv(obj);
        if (iZzv == -1) {
            return null;
        }
        return zzB()[iZzv];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zznp zznpVar = new zznp(this, null);
        this.zzh = zznpVar;
        return zznpVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        if (zzq()) {
            zzmz.zzg(zzq(), "Arrays already allocated");
            int i2 = this.zzf;
            int iMax = Math.max(i2 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = zznu.zzd(iMax2);
            zzy(iMax2 - 1);
            this.zza = new int[i2];
            this.zzb = new Object[i2];
            this.zzc = new Object[i2];
        }
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.put(obj, obj2);
        }
        int[] iArrZzz = zzz();
        Object[] objArrZzA = zzA();
        Object[] objArrZzB = zzB();
        int i3 = this.zzg;
        int i4 = i3 + 1;
        int iZzb = zzoc.zzb(obj);
        int iZzu = zzu();
        int i5 = iZzb & iZzu;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int iZzc = zznu.zzc(obj3, i5);
        if (iZzc == 0) {
            if (i4 > iZzu) {
                iZzu = zzw(iZzu, zznu.zza(iZzu), iZzb, i3);
            } else {
                Object obj4 = this.zze;
                Objects.requireNonNull(obj4);
                zznu.zze(obj4, i5, i4);
            }
            i = 1;
        } else {
            int i6 = ~iZzu;
            int i7 = iZzb & i6;
            int i8 = 0;
            while (true) {
                int i9 = iZzc - 1;
                int i10 = iArrZzz[i9];
                i = 1;
                int i11 = i10 & i6;
                if (i11 == i7 && Objects.equals(obj, objArrZzA[i9])) {
                    Object obj5 = objArrZzB[i9];
                    objArrZzB[i9] = obj2;
                    return obj5;
                }
                int i12 = i10 & iZzu;
                i8++;
                if (i12 != 0) {
                    iZzc = i12;
                } else {
                    if (i8 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzu() + 1, 1.0f);
                        int iZze = zze();
                        while (iZze >= 0) {
                            linkedHashMap.put(zzA()[iZze], zzB()[iZze]);
                            iZze = zzf(iZze);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzo();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i4 > iZzu) {
                        iZzu = zzw(iZzu, zznu.zza(iZzu), iZzb, i3);
                    } else {
                        iArrZzz[i9] = (i4 & iZzu) | i11;
                    }
                }
            }
        }
        int length = zzz().length;
        if (i4 > length) {
            int i13 = i;
            int iMin = Math.min(1073741823, (Math.max(i13, length >>> 1) + length) | i13);
            if (iMin != length) {
                this.zza = Arrays.copyOf(zzz(), iMin);
                this.zzb = Arrays.copyOf(zzA(), iMin);
                this.zzc = Arrays.copyOf(zzB(), iMin);
            }
        }
        zzz()[i3] = (~iZzu) & iZzb;
        zzA()[i3] = obj;
        zzB()[i3] = obj2;
        this.zzg = i4;
        zzo();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.remove(obj);
        }
        Object objZzx = zzx(obj);
        if (objZzx == zzd) {
            return null;
        }
        return objZzx;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapZzl = zzl();
        return mapZzl != null ? mapZzl.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zznr zznrVar = new zznr(this, null);
        this.zzj = zznrVar;
        return zznrVar;
    }

    public final int zze() {
        return isEmpty() ? -1 : 0;
    }

    public final int zzf(int i) {
        int i2 = i + 1;
        if (i2 < this.zzg) {
            return i2;
        }
        return -1;
    }

    public final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzo() {
        this.zzf += 32;
    }

    public final void zzp(int i, int i2) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzz = zzz();
        Object[] objArrZzA = zzA();
        Object[] objArrZzB = zzB();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrZzA[i] = null;
            objArrZzB[i] = null;
            iArrZzz[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = objArrZzA[i3];
        objArrZzA[i] = obj2;
        objArrZzB[i] = objArrZzB[i3];
        objArrZzA[i3] = null;
        objArrZzB[i3] = null;
        iArrZzz[i] = iArrZzz[i3];
        iArrZzz[i3] = 0;
        int iZzb = zzoc.zzb(obj2) & i2;
        int iZzc = zznu.zzc(obj, iZzb);
        if (iZzc == size) {
            zznu.zze(obj, iZzb, i4);
            return;
        }
        while (true) {
            int i5 = iZzc - 1;
            int i6 = iArrZzz[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArrZzz[i5] = ((~i2) & i6) | (i4 & i2);
                return;
            }
            iZzc = i7;
        }
    }

    public final boolean zzq() {
        return this.zze == null;
    }
}
