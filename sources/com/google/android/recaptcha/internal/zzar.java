package com.google.android.recaptcha.internal;

import defpackage.g7;
import defpackage.m6;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzar {
    public int zza = 1;
    private Object zzb;
    private long zzc;
    private double zzd;
    private zzv zze;
    private List zzf;
    private zzaj zzg;

    private zzar() {
    }

    public static zzar zze(Object obj) {
        zzar zzarVar = new zzar();
        int[] iArr = {1867107722, 219499797, 1647318768, 791628709, 1929020072, -436492773, 156903819, 1390543437, 216220853};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iB = m6.b((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        zzarVar.zzr();
        zzarVar.zza = (i8 % 216220853) ^ iB;
        zzarVar.zzb = obj;
        return zzarVar;
    }

    public static zzar zzf(long j) {
        zzar zzarVar = new zzar();
        int[] iArr = {1539942439, 1535257185, 1094537855, 446310416, 545003193, -1960816486, 411522957, 1143565421, 981914693};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iB = m6.b((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        zzarVar.zzr();
        zzarVar.zza = (i8 % 981914693) ^ iB;
        zzarVar.zzc = j;
        return zzarVar;
    }

    public static zzar zzg(double d) {
        zzar zzarVar = new zzar();
        int[] iArr = {978587665, 1228171534, 1025392329, 1075859846, 983056097, -1399000571, 190113083, 1723578341, 672563970};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iB = m6.b((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        zzarVar.zzr();
        zzarVar.zza = (i8 % 672563970) ^ iB;
        zzarVar.zzd = d;
        return zzarVar;
    }

    public static zzar zzh(zzv zzvVar) {
        zzar zzarVar = new zzar();
        int[] iArr = {1910210050, 1342515460, 1453014483, 168034308, 1540440520, -994065400, 318322042, 817572761, 14933990};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iB = m6.b((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        zzarVar.zzr();
        zzarVar.zza = (i8 % 14933990) ^ iB;
        zzarVar.zze = zzvVar;
        return zzarVar;
    }

    public static zzar zzi(List list) {
        zzar zzarVar = new zzar();
        int[] iArr = {379366797, 35537464, 1403037965, -2078358863, -1757307767, -386763992, 522971726, 1554725062, 997276125};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iB = m6.b((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        zzarVar.zzr();
        zzarVar.zza = (i8 % 997276125) ^ iB;
        zzarVar.zzf = list;
        return zzarVar;
    }

    public static zzar zzj(zzaj zzajVar) {
        zzar zzarVar = new zzar();
        int[] iArr = {2021303708, 824774792, 51514445, 1009340548, 257220717, 1682859529, 597010431, 1024027583, 198628789};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iB = m6.b((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        zzarVar.zzr();
        zzarVar.zza = (i8 % 198628789) ^ iB;
        zzarVar.zzg = zzajVar;
        return zzarVar;
    }

    public static zzar zzk(Object obj) {
        if (obj instanceof Long) {
            return zzf(((Long) obj).longValue());
        }
        if (obj instanceof Boolean) {
            return zzf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Integer) {
            return zzf(((Integer) obj).intValue());
        }
        if (obj instanceof Double) {
            return zzg(((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return zzg(((Float) obj).floatValue());
        }
        if (obj instanceof Short) {
            return zzf(((Short) obj).shortValue());
        }
        if (obj instanceof Byte) {
            return zzf(((Byte) obj).byteValue());
        }
        if (obj instanceof zzv) {
            return zzh((zzv) obj);
        }
        if (obj instanceof String) {
            return zzh(zzv.zze((String) obj));
        }
        if (!(obj instanceof ArrayList)) {
            return zze(obj);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(zzk(arrayList2.get(i)));
        }
        return zzi(arrayList);
    }

    public static zzar zzl(zzar zzarVar) {
        int[] iArr = {368046387, 1524073695, 1753971274, -1235975019, -1392305918, 807149497, 27679574, 1740033621, 135813159};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iB = m6.b((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i9 = i8 % 135813159;
        try {
            int i10 = zzarVar.zza;
            int i11 = (i9 ^ iB) + i10;
            if (i10 == 0) {
                throw null;
            }
            switch (i11) {
                case 0:
                    return new zzar();
                case 1:
                    return zze(zzarVar.zzo());
                case 2:
                    return zzf(zzarVar.zzb());
                case 3:
                    return zzh(zzarVar.zzc());
                case 4:
                    ArrayList arrayList = new ArrayList();
                    Iterator it = zzarVar.zzp().iterator();
                    while (it.hasNext()) {
                        arrayList.add(zzl((zzar) it.next()));
                    }
                    return zzi(arrayList);
                case 5:
                    return zzj(zzarVar.zzd());
                case 6:
                    return zzg(zzarVar.zza());
                default:
                    g7.l(zzt.zza("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
                    return null;
            }
        } catch (zzao e) {
            throw new AssertionError(zzt.zza("CEiv6BFfPnitUE+D"), e);
        }
    }

    private final void zzr() {
        this.zza = 1;
        this.zzc = 0L;
        this.zzb = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
    }

    private final void zzs(int i) throws zzao {
        if (i != this.zza) {
            throw new zzao();
        }
    }

    public final double zza() throws zzao {
        int[] iArr = {1360613073, 10730298, 1998148311, 682535208, 744243906, -1215447656, 441767868, 1566369633, 483689685};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        zzs((iArr[7] % 483689685) ^ m6.b((i2 & (~i)) | i3, (i & i4) | i5, i6, i7));
        return this.zzd;
    }

    public final long zzb() throws zzao {
        int[] iArr = {30387226, 1173447944, 304523573, 1171344488, 35694692, 2069301473, 854121980, 1541417540, 1245036421};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        zzs((iArr[7] % 1245036421) ^ m6.b((i2 & (~i)) | i3, (i & i4) | i5, i6, i7));
        return this.zzc;
    }

    public final zzv zzc() throws zzao {
        int[] iArr = {1281944976, 1463473728, 847256033, 1698424322, 948255187, -1554299396, 419914800, 1727952741, 1091714937};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        zzs((iArr[7] % 1091714937) ^ m6.b((i2 & (~i)) | i3, (i & i4) | i5, i6, i7));
        return this.zze;
    }

    public final zzaj zzd() throws zzao {
        int[] iArr = {138700754, 1311190794, 1098494212, 235277834, 2126148, 2082044642, 778544518, 631340353, 54449299};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        zzs((iArr[7] % 54449299) ^ m6.b((i2 & (~i)) | i3, (i & i4) | i5, i6, i7));
        return this.zzg;
    }

    public final Object zzm() throws zzao {
        int[] iArr = {1946855866, 1570063841, 244151099, -250444080, -1599884485, 118034294, 5125130, 1535589735, 713475737};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iB = m6.b((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i9 = this.zza;
        int i10 = ((i8 % 713475737) ^ iB) + i9;
        if (i9 == 0) {
            throw null;
        }
        switch (i10) {
            case 0:
            case 5:
                throw new zzao();
            case 1:
                return zzo();
            case 2:
                return Long.valueOf(zzb());
            case 3:
                return zzc().zzg();
            case 4:
                ArrayList arrayList = new ArrayList();
                Iterator it = zzp().iterator();
                while (it.hasNext()) {
                    arrayList.add(((zzar) it.next()).zzm());
                }
                return arrayList;
            case 6:
                return Double.valueOf(zza());
            default:
                g7.l(zzt.zza("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0252, code lost:
    
        if (r20.equals(java.lang.Object.class) != false) goto L150;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzn(java.lang.Class r20) throws com.google.android.recaptcha.internal.zzao {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzar.zzn(java.lang.Class):java.lang.Object");
    }

    public final Object zzo() throws zzao {
        int[] iArr = {636453333, 363983104, 1075208227, 2146014080, 1783382730, -364134701, 775056794, 1564003050, 99885196};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        zzs((iArr[7] % 99885196) ^ m6.b((i2 & (~i)) | i3, (i & i4) | i5, i6, i7));
        return this.zzb;
    }

    public final List zzp() throws zzao {
        int[] iArr = {1654844049, 956749401, 3147556, 1023856765, 1183918756, -1963614606, 352085974, 955798986, 791251530};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        zzs((iArr[7] % 791251530) ^ m6.b((i2 & (~i)) | i3, (i & i4) | i5, i6, i7));
        return this.zzf;
    }

    public final void zzq(OutputStream outputStream) throws IOException, zzao {
        long[] jArr = {1096079422, 21345924, 206269241, 1367643268, 1352213041, 1453396557, 419974390, 1998713308, 1456575805};
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = (((((~j) & j2) | j3) + ((j & j4) | j5)) - j6) + j7;
        long j10 = j8 % 1456575805;
        int i = ((((~1182595892) & 2124317320) | 1268383979) + ((1182595892 & 872718928) | 1132164311)) - (-1060702887);
        int i2 = 1072628238 % 516816850;
        int i3 = ((((~25701533) & 1812499204) | 591223219) + ((25701533 & 1287816772) | 64642538)) - 1887635333;
        int i4 = 1026374844 % 46811558;
        int i5 = this.zza;
        int i6 = ((((((~2105342203) & 2049862401) | 1698333727) + ((2105342203 & (-1643877632)) | (-2049769426))) - 132143960) ^ (1059789835 % 1012707329)) + i5;
        if (i5 == 0) {
            throw null;
        }
        switch (i6) {
            case 0:
            case 1:
            case 5:
                throw new zzao();
            case 2:
                zzr.zzb(zzb(), new zzaq(outputStream, 1), true);
                return;
            case 3:
                byte[] bArr = zzc().zzc;
                zzr.zzb(((long) bArr.length) * (j9 ^ j10), new zzaq(outputStream, 0), true);
                outputStream.write(bArr);
                return;
            case 4:
                List listZzp = zzp();
                zzr.zzb(listZzp.size(), new zzaq(outputStream, i3 ^ i4), true);
                Iterator it = listZzp.iterator();
                while (it.hasNext()) {
                    ((zzar) it.next()).zzq(outputStream);
                }
                return;
            case 6:
                double dZza = zza();
                zzaq zzaqVar = new zzaq(outputStream, i ^ i2);
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(dZza);
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate((((((~1514722040) & 82790042) | 437825894) + ((1514722040 & 1441228440) | 1392519490)) - 1911317206) ^ (1238504350 % 1769972));
                byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate.putLong(jDoubleToRawLongBits);
                for (byte b : byteBufferAllocate.array()) {
                    zzaqVar.zza(b);
                }
                int length = byteBufferAllocate.array().length;
                return;
            default:
                return;
        }
    }
}
