package defpackage;

import app.rive.runtime.kotlin.renderers.RendererMetrics;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.core.internal.persistence.file.FilePersistenceConfig;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.rum.internal.domain.scope.RumViewScope;
import com.datadog.android.trace.AndroidTracer;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.firebase_remote_config.zzhp;
import com.google.android.gms.internal.firebase_remote_config.zzhq;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class e9i<T> implements cbi<T> {
    public static final int[] q = new int[0];
    public static final Unsafe r = rdi.g();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final x8i e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int[] i;
    public final int j;
    public final int k;
    public final p9i l;
    public final k7i m;
    public final rci<?, ?> n;
    public final t3i<?> o;
    public final g8i p;

    public e9i(int[] iArr, Object[] objArr, int i, int i2, x8i x8iVar, boolean z, int[] iArr2, int i3, int i4, p9i p9iVar, k7i k7iVar, rci rciVar, t3i t3iVar, g8i g8iVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = x8iVar instanceof a5i;
        this.h = z;
        this.f = t3iVar != null && t3iVar.e(x8iVar);
        this.i = iArr2;
        this.j = i3;
        this.k = i4;
        this.l = p9iVar;
        this.m = k7iVar;
        this.n = rciVar;
        this.o = t3iVar;
        this.e = x8iVar;
        this.p = g8iVar;
    }

    public static <T> int B(T t, long j) {
        return ((Integer) rdi.l(t, j)).intValue();
    }

    public static <T> long C(T t, long j) {
        return ((Long) rdi.l(t, j)).longValue();
    }

    public static kdi E(Object obj) {
        a5i a5iVar = (a5i) obj;
        kdi kdiVar = a5iVar.zztc;
        if (kdiVar != kdi.e) {
            return kdiVar;
        }
        kdi kdiVar2 = new kdi();
        a5iVar.zztc = kdiVar2;
        return kdiVar2;
    }

    public static Field l(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(uz.c(name.length() + uz.c(40, str), string));
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            b0.o(l6.i(sb, " not found. Known fields are ", string));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.e9i m(defpackage.u8i r34, defpackage.p9i r35, defpackage.k7i r36, defpackage.rci r37, defpackage.t3i r38, defpackage.g8i r39) {
        /*
            Method dump skipped, instruction units count: 1069
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e9i.m(u8i, p9i, k7i, rci, t3i, g8i):e9i");
    }

    public final boolean A(a5i a5iVar, Object obj, int i) {
        return r(i, a5iVar) == r(i, obj);
    }

    public final int D(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    @Override // defpackage.cbi
    public final T a() {
        return (T) this.l.a(this.e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    @Override // defpackage.cbi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.a5i r11, defpackage.a5i r12) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e9i.b(a5i, a5i):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8 A[PHI: r3
  0x00d8: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01fd, B:41:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.cbi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(defpackage.a5i r12) {
        /*
            Method dump skipped, instruction units count: 788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e9i.c(a5i):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    @Override // defpackage.cbi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(defpackage.a5i r12, defpackage.a5i r13) {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e9i.d(a5i, a5i):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0068. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    @Override // defpackage.cbi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(T r22, byte[] r23, int r24, int r25, defpackage.d0i r26) throws com.google.android.gms.internal.firebase_remote_config.zzhq {
        /*
            Method dump skipped, instruction units count: 804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e9i.e(java.lang.Object, byte[], int, int, d0i):void");
    }

    @Override // defpackage.cbi
    public final void f(T t) {
        int[] iArr;
        int i;
        int i2 = this.j;
        while (true) {
            iArr = this.i;
            i = this.k;
            if (i2 >= i) {
                break;
            }
            long jZ = z(iArr[i2]) & 1048575;
            Object objL = rdi.l(t, jZ);
            if (objL != null) {
                rdi.d(t, jZ, this.p.c(objL));
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.m.c(t, iArr[i]);
            i++;
        }
        this.n.m(t);
        if (this.f) {
            this.o.h(t);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x06ac A[Catch: all -> 0x050a, TryCatch #1 {all -> 0x050a, blocks: (B:174:0x06a7, B:176:0x06ac, B:177:0x06b1, B:138:0x04fe, B:143:0x0511, B:144:0x0526, B:145:0x053b, B:146:0x0550, B:148:0x0561, B:151:0x0568, B:153:0x056c, B:155:0x0572, B:157:0x057a, B:158:0x0584, B:159:0x0599, B:160:0x05aa, B:162:0x05b3, B:163:0x05ce, B:164:0x05e4, B:165:0x05ee, B:166:0x0606, B:167:0x061c, B:168:0x0632, B:169:0x0648, B:170:0x065e, B:171:0x0674, B:172:0x068c), top: B:193:0x06a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06b7 A[SYNTHETIC] */
    @Override // defpackage.cbi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(T r22, defpackage.f4b r23, defpackage.m3i r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1894
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e9i.g(java.lang.Object, f4b, m3i):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    @Override // defpackage.cbi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(T r15) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e9i.h(java.lang.Object):boolean");
    }

    public final int i(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, d0i d0iVar) throws zzhq {
        int i9;
        int i10;
        int iJ;
        Object object;
        Unsafe unsafe = r;
        long j2 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                i9 = i;
                if (i5 != 1) {
                    return i9;
                }
                unsafe.putObject(t, j, Double.valueOf(Double.longBitsToDouble(vzh.k(i9, bArr))));
                iJ = i9 + 8;
                unsafe.putInt(t, j2, i4);
                return iJ;
            case 52:
                i10 = i;
                if (i5 != 5) {
                    return i10;
                }
                unsafe.putObject(t, j, Float.valueOf(Float.intBitsToFloat(vzh.a(i10, bArr))));
                iJ = i10 + 4;
                unsafe.putInt(t, j2, i4);
                return iJ;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                iJ = vzh.j(bArr, i, d0iVar);
                unsafe.putObject(t, j, Long.valueOf(d0iVar.b));
                unsafe.putInt(t, j2, i4);
                return iJ;
            case RumViewScope.SLOW_RENDERED_THRESHOLD_FPS /* 55 */:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                iJ = vzh.i(bArr, i, d0iVar);
                unsafe.putObject(t, j, Integer.valueOf(d0iVar.a));
                unsafe.putInt(t, j2, i4);
                return iJ;
            case 56:
            case 65:
                i9 = i;
                if (i5 != 1) {
                    return i9;
                }
                unsafe.putObject(t, j, Long.valueOf(vzh.k(i9, bArr)));
                iJ = i9 + 8;
                unsafe.putInt(t, j2, i4);
                return iJ;
            case 57:
            case 64:
                i10 = i;
                if (i5 != 5) {
                    return i10;
                }
                unsafe.putObject(t, j, Integer.valueOf(vzh.a(i10, bArr)));
                iJ = i10 + 4;
                unsafe.putInt(t, j2, i4);
                return iJ;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                iJ = vzh.j(bArr, i, d0iVar);
                unsafe.putObject(t, j, Boolean.valueOf(d0iVar.b != 0));
                unsafe.putInt(t, j2, i4);
                return iJ;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int i11 = vzh.i(bArr, i, d0iVar);
                int i12 = d0iVar.a;
                if (i12 == 0) {
                    unsafe.putObject(t, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (!cei.a.H1(bArr, i11, i11 + i12)) {
                            throw zzhq.h();
                        }
                    }
                    unsafe.putObject(t, j, new String(bArr, i11, i12, p5i.a));
                    i11 += i12;
                }
                unsafe.putInt(t, j2, i4);
                return i11;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int iH = vzh.h(w(i8), bArr, i, i2, d0iVar);
                object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                Object obj = d0iVar.c;
                if (object == null) {
                    unsafe.putObject(t, j, obj);
                } else {
                    unsafe.putObject(t, j, p5i.a(object, obj));
                }
                unsafe.putInt(t, j2, i4);
                return iH;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                iJ = vzh.n(bArr, i, d0iVar);
                unsafe.putObject(t, j, d0iVar.c);
                unsafe.putInt(t, j2, i4);
                return iJ;
            case AndroidTracer.SPAN_ID_BIT_SIZE /* 63 */:
                if (i5 != 0) {
                    return i;
                }
                int i13 = vzh.i(bArr, i, d0iVar);
                int i14 = d0iVar.a;
                v5i v5iVarY = y(i8);
                if (v5iVarY != null && !v5iVarY.a()) {
                    E(t).a(i3, Long.valueOf(i14));
                    return i13;
                }
                unsafe.putObject(t, j, Integer.valueOf(i14));
                iJ = i13;
                unsafe.putInt(t, j2, i4);
                return iJ;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                iJ = vzh.i(bArr, i, d0iVar);
                unsafe.putObject(t, j, Integer.valueOf(a2i.f(d0iVar.a)));
                unsafe.putInt(t, j2, i4);
                return iJ;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                iJ = vzh.j(bArr, i, d0iVar);
                unsafe.putObject(t, j, Long.valueOf(a2i.g(d0iVar.b)));
                unsafe.putInt(t, j2, i4);
                return iJ;
            case 68:
                if (i5 == 3) {
                    iJ = vzh.g(w(i8), bArr, i, i2, (i3 & (-8)) | 4, d0iVar);
                    object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    Object obj2 = d0iVar.c;
                    if (object == null) {
                        unsafe.putObject(t, j, obj2);
                    } else {
                        unsafe.putObject(t, j, p5i.a(object, obj2));
                    }
                    unsafe.putInt(t, j2, i4);
                    return iJ;
                }
            default:
                return i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int j(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, d0i d0iVar) throws zzhq {
        int i8;
        int i9;
        int iC;
        Unsafe unsafe = r;
        s5i s5iVarB0 = (s5i) unsafe.getObject(t, j2);
        if (!s5iVarB0.Q()) {
            int size = s5iVarB0.size();
            s5iVarB0 = s5iVarB0.b0(size == 0 ? 10 : size << 1);
            unsafe.putObject(t, j2, s5iVarB0);
        }
        s5i s5iVar = s5iVarB0;
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    d3i d3iVar = (d3i) s5iVar;
                    int i10 = vzh.i(bArr, i, d0iVar);
                    int i11 = d0iVar.a + i10;
                    while (i10 < i11) {
                        d3iVar.b(d3iVar.c, Double.longBitsToDouble(vzh.k(i10, bArr)));
                        i10 += 8;
                    }
                    if (i10 == i11) {
                        return i10;
                    }
                    throw zzhq.b();
                }
                if (i5 != 1) {
                    return i;
                }
                d3i d3iVar2 = (d3i) s5iVar;
                d3iVar2.b(d3iVar2.c, Double.longBitsToDouble(vzh.k(i, bArr)));
                int i12 = i + 8;
                while (i12 < i2) {
                    int i13 = vzh.i(bArr, i12, d0iVar);
                    if (i3 != d0iVar.a) {
                        return i12;
                    }
                    d3iVar2.b(d3iVar2.c, Double.longBitsToDouble(vzh.k(i13, bArr)));
                    i12 = i13 + 8;
                }
                return i12;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
            case 36:
                if (i5 == 2) {
                    x4i x4iVar = (x4i) s5iVar;
                    int i14 = vzh.i(bArr, i, d0iVar);
                    int i15 = d0iVar.a + i14;
                    while (i14 < i15) {
                        x4iVar.b(Float.intBitsToFloat(vzh.a(i14, bArr)), x4iVar.c);
                        i14 += 4;
                    }
                    if (i14 == i15) {
                        return i14;
                    }
                    throw zzhq.b();
                }
                if (i5 != 5) {
                    return i;
                }
                x4i x4iVar2 = (x4i) s5iVar;
                x4iVar2.b(Float.intBitsToFloat(vzh.a(i, bArr)), x4iVar2.c);
                int i16 = i + 4;
                while (i16 < i2) {
                    int i17 = vzh.i(bArr, i16, d0iVar);
                    if (i3 != d0iVar.a) {
                        return i16;
                    }
                    x4iVar2.b(Float.intBitsToFloat(vzh.a(i17, bArr)), x4iVar2.c);
                    i16 = i17 + 4;
                }
                return i16;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    u7i u7iVar = (u7i) s5iVar;
                    int i18 = vzh.i(bArr, i, d0iVar);
                    int i19 = d0iVar.a + i18;
                    while (i18 < i19) {
                        i18 = vzh.j(bArr, i18, d0iVar);
                        u7iVar.c(d0iVar.b);
                    }
                    if (i18 == i19) {
                        return i18;
                    }
                    throw zzhq.b();
                }
                if (i5 != 0) {
                    return i;
                }
                u7i u7iVar2 = (u7i) s5iVar;
                int iJ = vzh.j(bArr, i, d0iVar);
                u7iVar2.c(d0iVar.b);
                while (iJ < i2) {
                    int i20 = vzh.i(bArr, iJ, d0iVar);
                    if (i3 != d0iVar.a) {
                        return iJ;
                    }
                    iJ = vzh.j(bArr, i20, d0iVar);
                    u7iVar2.c(d0iVar.b);
                }
                return iJ;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 != 2) {
                    return i5 == 0 ? vzh.c(i3, bArr, i, i2, s5iVar, d0iVar) : i;
                }
                k5i k5iVar = (k5i) s5iVar;
                int i21 = vzh.i(bArr, i, d0iVar);
                int i22 = d0iVar.a + i21;
                while (i21 < i22) {
                    i21 = vzh.i(bArr, i21, d0iVar);
                    k5iVar.b(d0iVar.a);
                }
                if (i21 == i22) {
                    return i21;
                }
                throw zzhq.b();
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    u7i u7iVar3 = (u7i) s5iVar;
                    int i23 = vzh.i(bArr, i, d0iVar);
                    int i24 = d0iVar.a + i23;
                    while (i23 < i24) {
                        u7iVar3.c(vzh.k(i23, bArr));
                        i23 += 8;
                    }
                    if (i23 == i24) {
                        return i23;
                    }
                    throw zzhq.b();
                }
                if (i5 != 1) {
                    return i;
                }
                u7i u7iVar4 = (u7i) s5iVar;
                u7iVar4.c(vzh.k(i, bArr));
                int i25 = i + 8;
                while (i25 < i2) {
                    int i26 = vzh.i(bArr, i25, d0iVar);
                    if (i3 != d0iVar.a) {
                        return i25;
                    }
                    u7iVar4.c(vzh.k(i26, bArr));
                    i25 = i26 + 8;
                }
                return i25;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    k5i k5iVar2 = (k5i) s5iVar;
                    int i27 = vzh.i(bArr, i, d0iVar);
                    int i28 = d0iVar.a + i27;
                    while (i27 < i28) {
                        k5iVar2.b(vzh.a(i27, bArr));
                        i27 += 4;
                    }
                    if (i27 == i28) {
                        return i27;
                    }
                    throw zzhq.b();
                }
                if (i5 != 5) {
                    return i;
                }
                k5i k5iVar3 = (k5i) s5iVar;
                k5iVar3.b(vzh.a(i, bArr));
                int i29 = i + 4;
                while (i29 < i2) {
                    int i30 = vzh.i(bArr, i29, d0iVar);
                    if (i3 != d0iVar.a) {
                        return i29;
                    }
                    k5iVar3.b(vzh.a(i30, bArr));
                    i29 = i30 + 4;
                }
                return i29;
            case 25:
            case 42:
                if (i5 == 2) {
                    b0i b0iVar = (b0i) s5iVar;
                    int i31 = vzh.i(bArr, i, d0iVar);
                    int i32 = d0iVar.a + i31;
                    while (i31 < i32) {
                        i31 = vzh.j(bArr, i31, d0iVar);
                        b0iVar.b(b0iVar.c, d0iVar.b != 0);
                    }
                    if (i31 == i32) {
                        return i31;
                    }
                    throw zzhq.b();
                }
                if (i5 != 0) {
                    return i;
                }
                b0i b0iVar2 = (b0i) s5iVar;
                int iJ2 = vzh.j(bArr, i, d0iVar);
                b0iVar2.b(b0iVar2.c, d0iVar.b != 0);
                while (iJ2 < i2) {
                    int i33 = vzh.i(bArr, iJ2, d0iVar);
                    if (i3 != d0iVar.a) {
                        return iJ2;
                    }
                    iJ2 = vzh.j(bArr, i33, d0iVar);
                    b0iVar2.b(b0iVar2.c, d0iVar.b != 0);
                }
                return iJ2;
            case 26:
                if (i5 != 2) {
                    return i;
                }
                if ((j & FilePersistenceConfig.MAX_DISK_SPACE) == 0) {
                    int i34 = vzh.i(bArr, i, d0iVar);
                    int i35 = d0iVar.a;
                    if (i35 < 0) {
                        throw zzhq.c();
                    }
                    if (i35 == 0) {
                        s5iVar.add("");
                    } else {
                        s5iVar.add(new String(bArr, i34, i35, p5i.a));
                        i34 += i35;
                    }
                    while (i34 < i2) {
                        int i36 = vzh.i(bArr, i34, d0iVar);
                        if (i3 != d0iVar.a) {
                            return i34;
                        }
                        i34 = vzh.i(bArr, i36, d0iVar);
                        int i37 = d0iVar.a;
                        if (i37 < 0) {
                            throw zzhq.c();
                        }
                        if (i37 == 0) {
                            s5iVar.add("");
                        } else {
                            s5iVar.add(new String(bArr, i34, i37, p5i.a));
                            i34 += i37;
                        }
                    }
                    return i34;
                }
                int i38 = vzh.i(bArr, i, d0iVar);
                int i39 = d0iVar.a;
                if (i39 < 0) {
                    throw zzhq.c();
                }
                if (i39 == 0) {
                    s5iVar.add("");
                } else {
                    int i40 = i38 + i39;
                    if (!cei.a.H1(bArr, i38, i40)) {
                        throw zzhq.h();
                    }
                    s5iVar.add(new String(bArr, i38, i39, p5i.a));
                    i38 = i40;
                }
                while (i38 < i2) {
                    int i41 = vzh.i(bArr, i38, d0iVar);
                    if (i3 != d0iVar.a) {
                        return i38;
                    }
                    i38 = vzh.i(bArr, i41, d0iVar);
                    int i42 = d0iVar.a;
                    if (i42 < 0) {
                        throw zzhq.c();
                    }
                    if (i42 == 0) {
                        s5iVar.add("");
                    } else {
                        int i43 = i38 + i42;
                        if (!cei.a.H1(bArr, i38, i43)) {
                            throw zzhq.h();
                        }
                        s5iVar.add(new String(bArr, i38, i42, p5i.a));
                        i38 = i43;
                    }
                }
                return i38;
            case 27:
                i8 = i;
                if (i5 == 2) {
                    return vzh.f(w(i6), i3, bArr, i8, i2, s5iVar, d0iVar);
                }
                return i8;
            case 28:
                i8 = i;
                if (i5 == 2) {
                    int i44 = vzh.i(bArr, i8, d0iVar);
                    int i45 = d0iVar.a;
                    if (i45 < 0) {
                        throw zzhq.c();
                    }
                    if (i45 > bArr.length - i44) {
                        throw zzhq.b();
                    }
                    if (i45 == 0) {
                        s5iVar.add(h0i.a);
                    } else {
                        s5iVar.add(h0i.b(i44, bArr, i45));
                        i44 += i45;
                    }
                    while (i44 < i2) {
                        int i46 = vzh.i(bArr, i44, d0iVar);
                        if (i3 != d0iVar.a) {
                            return i44;
                        }
                        i44 = vzh.i(bArr, i46, d0iVar);
                        int i47 = d0iVar.a;
                        if (i47 < 0) {
                            throw zzhq.c();
                        }
                        if (i47 > bArr.length - i44) {
                            throw zzhq.b();
                        }
                        if (i47 == 0) {
                            s5iVar.add(h0i.a);
                        } else {
                            s5iVar.add(h0i.b(i44, bArr, i47));
                            i44 += i47;
                        }
                    }
                    return i44;
                }
                return i8;
            case RendererMetrics.SAMPLES /* 30 */:
            case 44:
                i9 = i;
                if (i5 != 2) {
                    if (i5 == 0) {
                        iC = vzh.c(i3, bArr, i9, i2, s5iVar, d0iVar);
                    }
                    return i9;
                }
                k5i k5iVar4 = (k5i) s5iVar;
                iC = vzh.i(bArr, i9, d0iVar);
                int i48 = d0iVar.a + iC;
                while (iC < i48) {
                    iC = vzh.i(bArr, iC, d0iVar);
                    k5iVar4.b(d0iVar.a);
                }
                if (iC != i48) {
                    throw zzhq.b();
                }
                a5i a5iVar = (a5i) t;
                kdi kdiVar = a5iVar.zztc;
                if (kdiVar == kdi.e) {
                    kdiVar = null;
                }
                kdi kdiVar2 = (kdi) hbi.a(i4, s5iVar, y(i6), kdiVar, this.n);
                if (kdiVar2 != null) {
                    a5iVar.zztc = kdiVar2;
                }
                return iC;
            case 33:
            case 47:
                i9 = i;
                if (i5 == 2) {
                    k5i k5iVar5 = (k5i) s5iVar;
                    int i49 = vzh.i(bArr, i9, d0iVar);
                    int i50 = d0iVar.a + i49;
                    while (i49 < i50) {
                        i49 = vzh.i(bArr, i49, d0iVar);
                        k5iVar5.b(a2i.f(d0iVar.a));
                    }
                    if (i49 == i50) {
                        return i49;
                    }
                    throw zzhq.b();
                }
                if (i5 == 0) {
                    k5i k5iVar6 = (k5i) s5iVar;
                    int i51 = vzh.i(bArr, i9, d0iVar);
                    k5iVar6.b(a2i.f(d0iVar.a));
                    while (i51 < i2) {
                        int i52 = vzh.i(bArr, i51, d0iVar);
                        if (i3 != d0iVar.a) {
                            return i51;
                        }
                        i51 = vzh.i(bArr, i52, d0iVar);
                        k5iVar6.b(a2i.f(d0iVar.a));
                    }
                    return i51;
                }
                return i9;
            case 34:
            case 48:
                i9 = i;
                if (i5 == 2) {
                    u7i u7iVar5 = (u7i) s5iVar;
                    int i53 = vzh.i(bArr, i9, d0iVar);
                    int i54 = d0iVar.a + i53;
                    while (i53 < i54) {
                        i53 = vzh.j(bArr, i53, d0iVar);
                        u7iVar5.c(a2i.g(d0iVar.b));
                    }
                    if (i53 == i54) {
                        return i53;
                    }
                    throw zzhq.b();
                }
                if (i5 == 0) {
                    u7i u7iVar6 = (u7i) s5iVar;
                    int iJ3 = vzh.j(bArr, i9, d0iVar);
                    u7iVar6.c(a2i.g(d0iVar.b));
                    while (iJ3 < i2) {
                        int i55 = vzh.i(bArr, iJ3, d0iVar);
                        if (i3 != d0iVar.a) {
                            return iJ3;
                        }
                        iJ3 = vzh.j(bArr, i55, d0iVar);
                        u7iVar6.c(a2i.g(d0iVar.b));
                    }
                    return iJ3;
                }
                return i9;
            case 49:
                if (i5 == 3) {
                    cbi cbiVarW = w(i6);
                    int i56 = (i3 & (-8)) | 4;
                    int iG = vzh.g(cbiVarW, bArr, i, i2, i56, d0iVar);
                    byte[] bArr2 = bArr;
                    int i57 = i2;
                    int i58 = i56;
                    d0i d0iVar2 = d0iVar;
                    s5iVar.add(d0iVar2.c);
                    while (iG < i57) {
                        int i59 = vzh.i(bArr2, iG, d0iVar2);
                        if (i3 != d0iVar2.a) {
                            return iG;
                        }
                        byte[] bArr3 = bArr2;
                        int i60 = i58;
                        int i61 = i57;
                        d0i d0iVar3 = d0iVar2;
                        iG = vzh.g(cbiVarW, bArr3, i59, i61, i60, d0iVar3);
                        s5iVar.add(d0iVar3.c);
                        i58 = i60;
                        bArr2 = bArr3;
                        i57 = i61;
                        d0iVar2 = d0iVar3;
                    }
                    return iG;
                }
            default:
                return i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0429, code lost:
    
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04a8, code lost:
    
        if (r0 == r15) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x04aa, code lost:
    
        r27.putInt(r9, r0, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x04b0, code lost:
    
        r0 = r8.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x04b4, code lost:
    
        if (r0 >= r8.k) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x04b6, code lost:
    
        r8.p(r9, r8.i[r0], r33, r8.n);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x04c4, code lost:
    
        if (r10 != 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04c6, code lost:
    
        if (r3 != r4) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x04cd, code lost:
    
        throw com.google.android.gms.internal.firebase_remote_config.zzhq.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04ce, code lost:
    
        if (r3 > r4) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x04d0, code lost:
    
        if (r14 != r10) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x04d2, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x04d7, code lost:
    
        throw com.google.android.gms.internal.firebase_remote_config.zzhq.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int k(T r31, byte[] r32, int r33, int r34, int r35, defpackage.d0i r36) {
        /*
            Method dump skipped, instruction units count: 1280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e9i.k(java.lang.Object, byte[], int, int, int, d0i):int");
    }

    public final void n(int i, Object obj, Object obj2) {
        long jZ = z(i) & 1048575;
        if (r(i, obj2)) {
            Object objL = rdi.l(obj, jZ);
            Object objL2 = rdi.l(obj2, jZ);
            if (objL != null && objL2 != null) {
                rdi.d(obj, jZ, p5i.a(objL, objL2));
                t(i, obj);
            } else if (objL2 != null) {
                rdi.d(obj, jZ, objL2);
                t(i, obj);
            }
        }
    }

    public final void o(Object obj, int i, f4b f4bVar) throws zzhp {
        a2i a2iVar = (a2i) f4bVar.d;
        if ((536870912 & i) != 0) {
            f4bVar.s(2);
            rdi.d(obj, i & 1048575, a2iVar.o());
        } else if (!this.g) {
            rdi.d(obj, i & 1048575, f4bVar.D());
        } else {
            f4bVar.s(2);
            rdi.d(obj, i & 1048575, a2iVar.c());
        }
    }

    public final void p(Object obj, int i, Object obj2, rci rciVar) {
        int i2 = this.a[i];
        Object objL = rdi.l(obj, z(i) & 1048575);
        if (objL == null || y(i) == null) {
            return;
        }
        g8i g8iVar = this.p;
        g8iVar.f(objL);
        x(i);
        g8iVar.a();
        throw null;
    }

    public final void q(Object obj, byte[] bArr, int i, int i2, int i3, long j, d0i d0iVar) {
        Unsafe unsafe = r;
        x(i3);
        Object object = unsafe.getObject(obj, j);
        g8i g8iVar = this.p;
        if (g8iVar.d(object)) {
            j8i j8iVarB = g8iVar.b();
            g8iVar.zzd(j8iVarB, object);
            unsafe.putObject(obj, j, j8iVarB);
        }
        g8iVar.a();
        throw null;
    }

    public final boolean r(int i, Object obj) {
        if (!this.h) {
            int i2 = this.a[i + 2];
            return (rdi.d.f(obj, (long) (i2 & 1048575)) & (1 << (i2 >>> 20))) != 0;
        }
        int iZ = z(i);
        long j = iZ & 1048575;
        switch ((iZ & 267386880) >>> 20) {
            case 0:
                if (rdi.d.j(obj, j) != 0.0d) {
                }
                break;
            case 1:
                if (rdi.d.i(obj, j) != 0.0f) {
                }
                break;
            case 2:
                if (rdi.d.g(obj, j) != 0) {
                }
                break;
            case 3:
                if (rdi.d.g(obj, j) != 0) {
                }
                break;
            case 4:
                if (rdi.d.f(obj, j) != 0) {
                }
                break;
            case 5:
                if (rdi.d.g(obj, j) != 0) {
                }
                break;
            case 6:
                if (rdi.d.f(obj, j) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object objL = rdi.l(obj, j);
                if (!(objL instanceof String)) {
                    if (!(objL instanceof h0i)) {
                        o6.h();
                        break;
                    } else if (!h0i.a.equals(objL)) {
                    }
                } else if (!((String) objL).isEmpty()) {
                }
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                if (rdi.l(obj, j) != null) {
                }
                break;
            case 10:
                if (!h0i.a.equals(rdi.l(obj, j))) {
                }
                break;
            case 11:
                if (rdi.d.f(obj, j) != 0) {
                }
                break;
            case 12:
                if (rdi.d.f(obj, j) != 0) {
                }
                break;
            case 13:
                if (rdi.d.f(obj, j) != 0) {
                }
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                if (rdi.d.g(obj, j) != 0) {
                }
                break;
            case 15:
                if (rdi.d.f(obj, j) != 0) {
                }
                break;
            case 16:
                if (rdi.d.g(obj, j) != 0) {
                }
                break;
            case 17:
                if (rdi.l(obj, j) != null) {
                }
                break;
            default:
                o6.h();
                break;
        }
        return false;
    }

    public final boolean s(T t, int i, int i2) {
        return rdi.d.f(t, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    public final void t(int i, Object obj) {
        if (this.h) {
            return;
        }
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        rdi.e(obj, rdi.d.f(obj, j) | (1 << (i2 >>> 20)), j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(int i, Object obj, Object obj2) {
        int iZ = z(i);
        int i2 = this.a[i];
        long j = iZ & 1048575;
        if (s(obj2, i2, i)) {
            Object objL = rdi.l(obj, j);
            Object objL2 = rdi.l(obj2, j);
            if (objL != null && objL2 != null) {
                rdi.d(obj, j, p5i.a(objL, objL2));
                v(obj, i2, i);
            } else if (objL2 != null) {
                rdi.d(obj, j, objL2);
                v(obj, i2, i);
            }
        }
    }

    public final void v(T t, int i, int i2) {
        rdi.e(t, i, this.a[i2 + 2] & 1048575);
    }

    public final cbi w(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.b;
        cbi cbiVar = (cbi) objArr[i2];
        if (cbiVar != null) {
            return cbiVar;
        }
        cbi<T> cbiVarA = oai.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = cbiVarA;
        return cbiVarA;
    }

    public final Object x(int i) {
        return this.b[(i / 3) << 1];
    }

    public final v5i y(int i) {
        return (v5i) this.b[((i / 3) << 1) + 1];
    }

    public final int z(int i) {
        return this.a[i + 1];
    }
}
