package defpackage;

import app.rive.runtime.kotlin.renderers.RendererMetrics;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.core.internal.persistence.file.FilePersistenceConfig;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.rum.internal.domain.scope.RumViewScope;
import com.datadog.android.trace.AndroidTracer;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.measurement.zzfw;
import defpackage.r8i;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class e4i<T> implements w5i<T> {
    public static final int[] p = new int[0];
    public static final Unsafe q = r8i.g();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final l3i e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final t4i k;
    public final p1i l;
    public final b8i<?, ?> m;
    public final qxh<?> n;
    public final a3i o;

    public e4i(int[] iArr, Object[] objArr, int i, int i2, l3i l3iVar, boolean z, int[] iArr2, int i3, int i4, t4i t4iVar, p1i p1iVar, b8i b8iVar, qxh qxhVar, a3i a3iVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = z;
        this.f = qxhVar != null && qxhVar.e(l3iVar);
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = t4iVar;
        this.l = p1iVar;
        this.m = b8iVar;
        this.n = qxhVar;
        this.e = l3iVar;
        this.o = a3iVar;
    }

    public static <T> int D(T t, long j) {
        return ((Integer) r8i.l(t, j)).intValue();
    }

    public static <T> long E(T t, long j) {
        return ((Long) r8i.l(t, j)).longValue();
    }

    public static x7i F(Object obj) {
        dzh dzhVar = (dzh) obj;
        x7i x7iVar = dzhVar.zzb;
        if (x7iVar != x7i.f) {
            return x7iVar;
        }
        x7i x7iVar2 = new x7i();
        dzhVar.zzb = x7iVar2;
        return x7iVar2;
    }

    public static Field m(Class<?> cls, String str) {
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

    /* JADX WARN: Removed duplicated region for block: B:125:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x037a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.e4i n(defpackage.g3i r33, defpackage.t4i r34, defpackage.p1i r35, defpackage.b8i r36, defpackage.qxh r37, defpackage.a3i r38) {
        /*
            Method dump skipped, instruction units count: 1000
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e4i.n(g3i, t4i, p1i, b8i, qxh, a3i):e4i");
    }

    public static void q(int i, Object obj, hai haiVar) {
        if (obj instanceof String) {
            ((qwh) haiVar).a.N1(i, (String) obj);
        } else {
            ((qwh) haiVar).a(i, (fvh) obj);
        }
    }

    public final qzh A(int i) {
        return (qzh) this.b[((i / 3) << 1) + 1];
    }

    public final boolean B(dzh dzhVar, dzh dzhVar2, int i) {
        return t(i, dzhVar) == t(i, dzhVar2);
    }

    public final int C(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    @Override // defpackage.w5i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(T r14) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e4i.a(java.lang.Object):boolean");
    }

    @Override // defpackage.w5i
    public final void b(T t) {
        int[] iArr;
        int i;
        int i2 = this.i;
        while (true) {
            iArr = this.h;
            i = this.j;
            if (i2 >= i) {
                break;
            }
            long jC = C(iArr[i2]) & 1048575;
            Object objL = r8i.l(t, jC);
            if (objL != null) {
                r8i.d(t, jC, this.o.zze(objL));
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.l.b(t, iArr[i]);
            i++;
        }
        this.m.h(t);
        if (this.f) {
            this.n.g(t);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x06b6, code lost:
    
        if (u(r24, r14, r3) != false) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x06b8, code lost:
    
        r8 = defpackage.ja.b(r14, 4, r8);
        r5 = 4;
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0979, code lost:
    
        if ((r10 & r11) != 0) goto L303;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011f  */
    @Override // defpackage.w5i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(defpackage.zth r24) {
        /*
            Method dump skipped, instruction units count: 3020
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e4i.c(zth):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x009e. Please report as an issue. */
    @Override // defpackage.w5i
    public final void d(T t, byte[] bArr, int i, int i2, yuh yuhVar) throws zzfw {
        int i3;
        int iV;
        Unsafe unsafe;
        int i4;
        int i5;
        int i6;
        T t2;
        int i7;
        Unsafe unsafe2;
        int i8;
        int i9;
        int i10;
        int iJ;
        e4i<T> e4iVar = this;
        T t3 = t;
        byte[] bArr2 = bArr;
        int i11 = i2;
        yuh yuhVar2 = yuhVar;
        if (!e4iVar.g) {
            l(t3, bArr, i, i11, 0, yuhVar);
            return;
        }
        Unsafe unsafe3 = q;
        int iJ2 = i;
        int i12 = -1;
        int i13 = 0;
        int i14 = 1048575;
        int i15 = 0;
        while (iJ2 < i11) {
            int iE = iJ2 + 1;
            int i16 = bArr2[iJ2];
            if (i16 < 0) {
                iE = zuh.e(i16, bArr2, iE, yuhVar2);
                i16 = yuhVar2.a;
            }
            int i17 = iE;
            int i18 = i16 >>> 3;
            int i19 = i16 & 7;
            int i20 = e4iVar.d;
            int i21 = e4iVar.c;
            if (i18 > i12) {
                iV = (i18 < i21 || i18 > i20) ? -1 : e4iVar.v(i18, i13 / 3);
                i3 = 0;
            } else if (i18 < i21 || i18 > i20) {
                i3 = 0;
                iV = -1;
            } else {
                i3 = 0;
                iV = e4iVar.v(i18, 0);
            }
            int i22 = iV;
            if (i22 == -1) {
                unsafe = unsafe3;
                i4 = i16;
                i5 = i18;
                i6 = i15;
                t2 = t3;
                i7 = i3;
            } else {
                int[] iArr = e4iVar.a;
                int i23 = iArr[i22 + 1];
                int i24 = (i23 & 267386880) >>> 20;
                int i25 = i16;
                long j = i23 & 1048575;
                if (i24 <= 17) {
                    int i26 = iArr[i22 + 2];
                    int i27 = 1 << (i26 >>> 20);
                    int i28 = i26 & 1048575;
                    if (i28 != i14) {
                        if (i14 != 1048575) {
                            unsafe3.putInt(t3, i14, i15);
                        }
                        if (i28 != 1048575) {
                            i15 = unsafe3.getInt(t3, i28);
                        }
                        i14 = i28;
                    }
                    switch (i24) {
                        case 0:
                            i5 = i18;
                            if (i19 != 1) {
                                unsafe2 = unsafe3;
                                t2 = t3;
                                unsafe = unsafe2;
                                i6 = i15;
                                i7 = i22;
                                i4 = i25 == true ? 1 : 0;
                            } else {
                                r8i.d.d(t, j, Double.longBitsToDouble(zuh.k(i17, bArr2)));
                                t3 = t;
                                iJ2 = i17 + 8;
                                i15 |= i27;
                                unsafe3 = unsafe3;
                                i13 = i22;
                                i12 = i5;
                            }
                            break;
                        case 1:
                            i5 = i18;
                            if (i19 != 5) {
                                unsafe2 = unsafe3;
                                t2 = t3;
                                unsafe = unsafe2;
                                i6 = i15;
                                i7 = i22;
                                i4 = i25 == true ? 1 : 0;
                            } else {
                                r8i.d.e(t3, j, Float.intBitsToFloat(zuh.a(i17, bArr2)));
                                iJ2 = i17 + 4;
                                i15 |= i27;
                                i13 = i22;
                                i12 = i5;
                            }
                            break;
                        case 2:
                        case 3:
                            i5 = i18;
                            if (i19 != 0) {
                                unsafe2 = unsafe3;
                                t2 = t3;
                                unsafe = unsafe2;
                                i6 = i15;
                                i7 = i22;
                                i4 = i25 == true ? 1 : 0;
                            } else {
                                int iJ3 = zuh.j(bArr2, i17, yuhVar2);
                                Unsafe unsafe4 = unsafe3;
                                T t4 = t3;
                                unsafe4.putLong(t4, j, yuhVar2.b);
                                unsafe3 = unsafe4;
                                t3 = t4;
                                i15 |= i27;
                                iJ2 = iJ3;
                                i13 = i22;
                                i12 = i5;
                            }
                            break;
                        case 4:
                        case 11:
                            i5 = i18;
                            if (i19 != 0) {
                                unsafe2 = unsafe3;
                                t2 = t3;
                                unsafe = unsafe2;
                                i6 = i15;
                                i7 = i22;
                                i4 = i25 == true ? 1 : 0;
                            } else {
                                int i29 = zuh.i(bArr2, i17, yuhVar2);
                                unsafe3.putInt(t3, j, yuhVar2.a);
                                i15 |= i27;
                                iJ2 = i29;
                                i13 = i22;
                                i12 = i5;
                            }
                            break;
                        case 5:
                        case ModuleDescriptor.MODULE_VERSION /* 14 */:
                            i5 = i18;
                            if (i19 != 1) {
                                unsafe2 = unsafe3;
                                t2 = t3;
                                unsafe = unsafe2;
                                i6 = i15;
                                i7 = i22;
                                i4 = i25 == true ? 1 : 0;
                            } else {
                                Unsafe unsafe5 = unsafe3;
                                T t5 = t3;
                                unsafe5.putLong(t5, j, zuh.k(i17, bArr2));
                                unsafe3 = unsafe5;
                                t3 = t5;
                                iJ2 = i17 + 8;
                                i15 |= i27;
                                i13 = i22;
                                i12 = i5;
                            }
                            break;
                        case 6:
                        case 13:
                            i5 = i18;
                            if (i19 != 5) {
                                unsafe2 = unsafe3;
                                t2 = t3;
                                unsafe = unsafe2;
                                i6 = i15;
                                i7 = i22;
                                i4 = i25 == true ? 1 : 0;
                            } else {
                                unsafe3.putInt(t3, j, zuh.a(i17, bArr2));
                                iJ2 = i17 + 4;
                                i15 |= i27;
                                i13 = i22;
                                i12 = i5;
                            }
                            break;
                        case 7:
                            i5 = i18;
                            if (i19 != 0) {
                                unsafe2 = unsafe3;
                                t2 = t3;
                                unsafe = unsafe2;
                                i6 = i15;
                                i7 = i22;
                                i4 = i25 == true ? 1 : 0;
                            } else {
                                iJ2 = zuh.j(bArr2, i17, yuhVar2);
                                r8i.d.g(t3, j, yuhVar2.b != 0);
                                i15 |= i27;
                                i13 = i22;
                                i12 = i5;
                            }
                            break;
                        case 8:
                            i5 = i18;
                            if (i19 != 2) {
                                unsafe2 = unsafe3;
                                t2 = t3;
                                unsafe = unsafe2;
                                i6 = i15;
                                i7 = i22;
                                i4 = i25 == true ? 1 : 0;
                            } else {
                                iJ2 = (i23 & 536870912) == 0 ? zuh.l(bArr2, i17, yuhVar2) : zuh.m(bArr2, i17, yuhVar2);
                                unsafe3.putObject(t3, j, yuhVar2.c);
                                i15 |= i27;
                                i13 = i22;
                                i12 = i5;
                            }
                            break;
                        case DatadogLogGenerator.CRASH /* 9 */:
                            i5 = i18;
                            if (i19 != 2) {
                                unsafe2 = unsafe3;
                                t2 = t3;
                                unsafe = unsafe2;
                                i6 = i15;
                                i7 = i22;
                                i4 = i25 == true ? 1 : 0;
                            } else {
                                iJ2 = zuh.h(e4iVar.o(i22), bArr2, i17, i11, yuhVar2);
                                Object object = unsafe3.getObject(t3, j);
                                Object obj = yuhVar2.c;
                                if (object == null) {
                                    unsafe3.putObject(t3, j, obj);
                                } else {
                                    unsafe3.putObject(t3, j, mzh.b(object, obj));
                                }
                                i15 |= i27;
                                i13 = i22;
                                i12 = i5;
                            }
                            break;
                        case 10:
                            i5 = i18;
                            if (i19 != 2) {
                                unsafe2 = unsafe3;
                                t2 = t3;
                                unsafe = unsafe2;
                                i6 = i15;
                                i7 = i22;
                                i4 = i25 == true ? 1 : 0;
                            } else {
                                iJ2 = zuh.n(bArr2, i17, yuhVar2);
                                unsafe3.putObject(t3, j, yuhVar2.c);
                                i15 |= i27;
                                i13 = i22;
                                i12 = i5;
                            }
                            break;
                        case 12:
                            i5 = i18;
                            if (i19 != 0) {
                                unsafe2 = unsafe3;
                                t2 = t3;
                                unsafe = unsafe2;
                                i6 = i15;
                                i7 = i22;
                                i4 = i25 == true ? 1 : 0;
                            } else {
                                iJ2 = zuh.i(bArr2, i17, yuhVar2);
                                unsafe3.putInt(t3, j, yuhVar2.a);
                                i15 |= i27;
                                i13 = i22;
                                i12 = i5;
                            }
                            break;
                        case 15:
                            i5 = i18;
                            if (i19 != 0) {
                                unsafe2 = unsafe3;
                                t2 = t3;
                                unsafe = unsafe2;
                                i6 = i15;
                                i7 = i22;
                                i4 = i25 == true ? 1 : 0;
                            } else {
                                iJ2 = zuh.i(bArr2, i17, yuhVar2);
                                unsafe3.putInt(t3, j, beb.s(yuhVar2.a));
                                i15 |= i27;
                                i13 = i22;
                                i12 = i5;
                            }
                            break;
                        case 16:
                            if (i19 != 0) {
                                i5 = i18;
                                unsafe2 = unsafe3;
                                t2 = t3;
                                unsafe = unsafe2;
                                i6 = i15;
                                i7 = i22;
                                i4 = i25 == true ? 1 : 0;
                            } else {
                                int iJ4 = zuh.j(bArr2, i17, yuhVar2);
                                Unsafe unsafe6 = unsafe3;
                                T t6 = t3;
                                i5 = i18;
                                unsafe6.putLong(t6, j, beb.o(yuhVar2.b));
                                unsafe3 = unsafe6;
                                t3 = t6;
                                i15 |= i27;
                                iJ2 = iJ4;
                                i13 = i22;
                                i12 = i5;
                            }
                            break;
                        default:
                            unsafe2 = unsafe3;
                            i5 = i18;
                            t2 = t3;
                            unsafe = unsafe2;
                            i6 = i15;
                            i7 = i22;
                            i4 = i25 == true ? 1 : 0;
                            break;
                    }
                } else {
                    i5 = i18;
                    Unsafe unsafe7 = unsafe3;
                    if (i24 != 27) {
                        if (i24 <= 49) {
                            unsafe = unsafe7;
                            i6 = i15;
                            i10 = i14;
                            iJ = e4iVar.k(t, bArr, i17, i2, i25 == true ? 1 : 0, i5, i19, i22, i23, i24, j, yuhVar);
                            i9 = i25 == true ? 1 : 0;
                            i7 = i22;
                            if (iJ == i17) {
                                t2 = t;
                                i17 = iJ;
                            } else {
                                e4iVar = this;
                                t3 = t;
                                i11 = i2;
                                yuhVar2 = yuhVar;
                            }
                        } else {
                            unsafe = unsafe7;
                            i6 = i15;
                            i7 = i22;
                            i9 = i25 == true ? 1 : 0;
                            i10 = i14;
                            i8 = i17;
                            if (i24 == 50) {
                                if (i19 == 2) {
                                    r(t, bArr, i8, i2, i7, j, yuhVar);
                                    throw null;
                                }
                                t2 = t;
                                i17 = i8;
                            } else {
                                iJ = j(t, bArr, i8, i2, i9 == true ? 1 : 0, i5, i19, i23, i24, j, i7, yuhVar);
                                i4 = i9 == true ? 1 : 0;
                                t2 = t;
                                if (iJ == i8) {
                                    i17 = iJ;
                                    i14 = i10;
                                } else {
                                    e4iVar = this;
                                    i11 = i2;
                                    yuhVar2 = yuhVar;
                                    t3 = t2;
                                }
                            }
                        }
                        iJ2 = iJ;
                        i13 = i7;
                        i14 = i10;
                        i12 = i5;
                        i15 = i6;
                        unsafe3 = unsafe;
                        bArr2 = bArr;
                    } else if (i19 == 2) {
                        e0i e0iVarZza = (e0i) unsafe7.getObject(t3, j);
                        if (!e0iVarZza.zza()) {
                            int size = e0iVarZza.size();
                            e0iVarZza = e0iVarZza.zza(size == 0 ? 10 : size << 1);
                            unsafe7.putObject(t3, j, e0iVarZza);
                        }
                        int iF = zuh.f(e4iVar.o(i22), i25 == true ? 1 : 0, bArr2, i17, i11, e0iVarZza, yuhVar2);
                        bArr2 = bArr;
                        i11 = i2;
                        yuhVar2 = yuhVar;
                        iJ2 = iF;
                        unsafe3 = unsafe7;
                        i13 = i22;
                        i12 = i5;
                        t3 = t;
                    } else {
                        unsafe = unsafe7;
                        i6 = i15;
                        i8 = i17;
                        i7 = i22;
                        i9 = i25 == true ? 1 : 0;
                        i10 = i14;
                        t2 = t;
                        i17 = i8;
                    }
                    i4 = i9;
                    i14 = i10;
                }
            }
            int iD = zuh.d(i4 == true ? 1 : 0, bArr, i17, i2, F(t2), yuhVar);
            bArr2 = bArr;
            yuhVar2 = yuhVar;
            i11 = i2;
            t3 = t2;
            i13 = i7;
            i12 = i5;
            i15 = i6;
            unsafe3 = unsafe;
            iJ2 = iD;
            e4iVar = this;
        }
        T t7 = t3;
        Unsafe unsafe8 = unsafe3;
        int i30 = i11;
        int i31 = i14;
        int i32 = i15;
        if (i31 != 1048575) {
            unsafe8.putInt(t7, i31, i32);
        }
        if (iJ2 != i30) {
            throw zzfw.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8 A[PHI: r3
  0x00d8: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01fd, B:41:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.w5i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(defpackage.dzh r12) {
        /*
            Method dump skipped, instruction units count: 788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e4i.e(dzh):int");
    }

    @Override // defpackage.w5i
    public final T f() {
        return (T) this.k.zza(this.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // defpackage.w5i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(T r18, defpackage.hai r19) {
        /*
            Method dump skipped, instruction units count: 1842
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e4i.g(java.lang.Object, hai):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w5i
    public final void h(dzh dzhVar, dzh dzhVar2) {
        dzh dzhVar3;
        dzhVar2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                dzh dzhVar4 = dzhVar;
                Class<?> cls = z5i.a;
                b8i<?, ?> b8iVar = this.m;
                b8iVar.c(dzhVar4, b8iVar.g(b8iVar.e(dzhVar4), b8iVar.e(dzhVar2)));
                if (this.f) {
                    z5i.h(this.n, dzhVar4, dzhVar2);
                    return;
                }
                return;
            }
            int iC = C(i);
            long j = iC & 1048575;
            int i2 = iArr[i];
            switch ((iC & 267386880) >>> 20) {
                case 0:
                    dzhVar3 = dzhVar;
                    if (t(i, dzhVar2)) {
                        r8i.c cVar = r8i.d;
                        cVar.d(dzhVar3, j, cVar.j(dzhVar2, j));
                        x(i, dzhVar3);
                        continue;
                    }
                    i += 3;
                    dzhVar = dzhVar3;
                    break;
                case 1:
                    dzhVar3 = dzhVar;
                    if (t(i, dzhVar2)) {
                        r8i.c cVar2 = r8i.d;
                        cVar2.e(dzhVar3, j, cVar2.i(dzhVar2, j));
                        x(i, dzhVar3);
                    } else {
                        continue;
                    }
                    i += 3;
                    dzhVar = dzhVar3;
                    break;
                case 2:
                    dzhVar3 = dzhVar;
                    if (t(i, dzhVar2)) {
                        r8i.c cVar3 = r8i.d;
                        cVar3.f(dzhVar3, j, cVar3.l(dzhVar2, j));
                        x(i, dzhVar3);
                    } else {
                        continue;
                    }
                    i += 3;
                    dzhVar = dzhVar3;
                    break;
                case 3:
                    dzhVar3 = dzhVar;
                    if (t(i, dzhVar2)) {
                        r8i.c cVar4 = r8i.d;
                        cVar4.f(dzhVar3, j, cVar4.l(dzhVar2, j));
                        x(i, dzhVar3);
                    } else {
                        continue;
                    }
                    i += 3;
                    dzhVar = dzhVar3;
                    break;
                case 4:
                    dzhVar3 = dzhVar;
                    if (t(i, dzhVar2)) {
                        r8i.c(dzhVar3, r8i.d.k(dzhVar2, j), j);
                        x(i, dzhVar3);
                    } else {
                        continue;
                    }
                    i += 3;
                    dzhVar = dzhVar3;
                    break;
                case 5:
                    dzhVar3 = dzhVar;
                    if (t(i, dzhVar2)) {
                        r8i.c cVar5 = r8i.d;
                        cVar5.f(dzhVar3, j, cVar5.l(dzhVar2, j));
                        x(i, dzhVar3);
                    } else {
                        continue;
                    }
                    i += 3;
                    dzhVar = dzhVar3;
                    break;
                case 6:
                    dzhVar3 = dzhVar;
                    if (t(i, dzhVar2)) {
                        r8i.c(dzhVar3, r8i.d.k(dzhVar2, j), j);
                        x(i, dzhVar3);
                    } else {
                        continue;
                    }
                    i += 3;
                    dzhVar = dzhVar3;
                    break;
                case 7:
                    dzhVar3 = dzhVar;
                    if (t(i, dzhVar2)) {
                        r8i.c cVar6 = r8i.d;
                        cVar6.g(dzhVar3, j, cVar6.h(dzhVar2, j));
                        x(i, dzhVar3);
                    } else {
                        continue;
                    }
                    i += 3;
                    dzhVar = dzhVar3;
                    break;
                case 8:
                    dzhVar3 = dzhVar;
                    if (t(i, dzhVar2)) {
                        r8i.d(dzhVar3, j, r8i.l(dzhVar2, j));
                        x(i, dzhVar3);
                    } else {
                        continue;
                    }
                    i += 3;
                    dzhVar = dzhVar3;
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    dzhVar3 = dzhVar;
                    p(i, dzhVar3, dzhVar2);
                    continue;
                    i += 3;
                    dzhVar = dzhVar3;
                    break;
                case 10:
                    dzhVar3 = dzhVar;
                    if (t(i, dzhVar2)) {
                        r8i.d(dzhVar3, j, r8i.l(dzhVar2, j));
                        x(i, dzhVar3);
                    } else {
                        continue;
                    }
                    i += 3;
                    dzhVar = dzhVar3;
                    break;
                case 11:
                    dzhVar3 = dzhVar;
                    if (t(i, dzhVar2)) {
                        r8i.c(dzhVar3, r8i.d.k(dzhVar2, j), j);
                        x(i, dzhVar3);
                    } else {
                        continue;
                    }
                    i += 3;
                    dzhVar = dzhVar3;
                    break;
                case 12:
                    dzhVar3 = dzhVar;
                    if (t(i, dzhVar2)) {
                        r8i.c(dzhVar3, r8i.d.k(dzhVar2, j), j);
                        x(i, dzhVar3);
                    } else {
                        continue;
                    }
                    i += 3;
                    dzhVar = dzhVar3;
                    break;
                case 13:
                    dzhVar3 = dzhVar;
                    if (t(i, dzhVar2)) {
                        r8i.c(dzhVar3, r8i.d.k(dzhVar2, j), j);
                        x(i, dzhVar3);
                    } else {
                        continue;
                    }
                    i += 3;
                    dzhVar = dzhVar3;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                    dzhVar3 = dzhVar;
                    if (t(i, dzhVar2)) {
                        r8i.c cVar7 = r8i.d;
                        cVar7.f(dzhVar3, j, cVar7.l(dzhVar2, j));
                        x(i, dzhVar3);
                    } else {
                        continue;
                    }
                    i += 3;
                    dzhVar = dzhVar3;
                    break;
                case 15:
                    dzhVar3 = dzhVar;
                    if (t(i, dzhVar2)) {
                        r8i.c(dzhVar3, r8i.d.k(dzhVar2, j), j);
                        x(i, dzhVar3);
                    } else {
                        continue;
                    }
                    i += 3;
                    dzhVar = dzhVar3;
                    break;
                case 16:
                    if (t(i, dzhVar2)) {
                        r8i.c cVar8 = r8i.d;
                        dzhVar3 = dzhVar;
                        cVar8.f(dzhVar3, j, cVar8.l(dzhVar2, j));
                        x(i, dzhVar3);
                    }
                    i += 3;
                    dzhVar = dzhVar3;
                    break;
                case 17:
                    p(i, dzhVar, dzhVar2);
                    break;
                case 18:
                case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case RendererMetrics.SAMPLES /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.l.a(dzhVar, j, dzhVar2);
                    break;
                case 50:
                    Class<?> cls2 = z5i.a;
                    r8i.d(dzhVar, j, this.o.c(r8i.l(dzhVar, j), r8i.l(dzhVar2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case RumViewScope.SLOW_RENDERED_THRESHOLD_FPS /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (u(dzhVar2, i2, i)) {
                        r8i.d(dzhVar, j, r8i.l(dzhVar2, j));
                        r8i.c(dzhVar, i2, iArr[i + 2] & 1048575);
                    }
                    break;
                case 60:
                    y(i, dzhVar, dzhVar2);
                    break;
                case 61:
                case 62:
                case AndroidTracer.SPAN_ID_BIT_SIZE /* 63 */:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (u(dzhVar2, i2, i)) {
                        r8i.d(dzhVar, j, r8i.l(dzhVar2, j));
                        r8i.c(dzhVar, i2, iArr[i + 2] & 1048575);
                    }
                    break;
                case 68:
                    y(i, dzhVar, dzhVar2);
                    break;
            }
            dzhVar3 = dzhVar;
            i += 3;
            dzhVar = dzhVar3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    @Override // defpackage.w5i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(defpackage.dzh r12, defpackage.dzh r13) {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e4i.i(dzh, dzh):boolean");
    }

    public final int j(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, yuh yuhVar) throws zzfw {
        int i9;
        int i10;
        int iJ;
        Object object;
        Unsafe unsafe = q;
        long j2 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                i9 = i;
                if (i5 != 1) {
                    return i9;
                }
                unsafe.putObject(t, j, Double.valueOf(Double.longBitsToDouble(zuh.k(i9, bArr))));
                iJ = i9 + 8;
                unsafe.putInt(t, j2, i4);
                return iJ;
            case 52:
                i10 = i;
                if (i5 != 5) {
                    return i10;
                }
                unsafe.putObject(t, j, Float.valueOf(Float.intBitsToFloat(zuh.a(i10, bArr))));
                iJ = i10 + 4;
                unsafe.putInt(t, j2, i4);
                return iJ;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                iJ = zuh.j(bArr, i, yuhVar);
                unsafe.putObject(t, j, Long.valueOf(yuhVar.b));
                unsafe.putInt(t, j2, i4);
                return iJ;
            case RumViewScope.SLOW_RENDERED_THRESHOLD_FPS /* 55 */:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                iJ = zuh.i(bArr, i, yuhVar);
                unsafe.putObject(t, j, Integer.valueOf(yuhVar.a));
                unsafe.putInt(t, j2, i4);
                return iJ;
            case 56:
            case 65:
                i9 = i;
                if (i5 != 1) {
                    return i9;
                }
                unsafe.putObject(t, j, Long.valueOf(zuh.k(i9, bArr)));
                iJ = i9 + 8;
                unsafe.putInt(t, j2, i4);
                return iJ;
            case 57:
            case 64:
                i10 = i;
                if (i5 != 5) {
                    return i10;
                }
                unsafe.putObject(t, j, Integer.valueOf(zuh.a(i10, bArr)));
                iJ = i10 + 4;
                unsafe.putInt(t, j2, i4);
                return iJ;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                iJ = zuh.j(bArr, i, yuhVar);
                unsafe.putObject(t, j, Boolean.valueOf(yuhVar.b != 0));
                unsafe.putInt(t, j2, i4);
                return iJ;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int i11 = zuh.i(bArr, i, yuhVar);
                int i12 = yuhVar.a;
                if (i12 == 0) {
                    unsafe.putObject(t, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (!a.a.F1(i11, bArr, i11 + i12)) {
                            throw zzfw.d();
                        }
                    }
                    unsafe.putObject(t, j, new String(bArr, i11, i12, mzh.a));
                    i11 += i12;
                }
                unsafe.putInt(t, j2, i4);
                return i11;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int iH = zuh.h(o(i8), bArr, i, i2, yuhVar);
                object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                Object obj = yuhVar.c;
                if (object == null) {
                    unsafe.putObject(t, j, obj);
                } else {
                    unsafe.putObject(t, j, mzh.b(object, obj));
                }
                unsafe.putInt(t, j2, i4);
                return iH;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                iJ = zuh.n(bArr, i, yuhVar);
                unsafe.putObject(t, j, yuhVar.c);
                unsafe.putInt(t, j2, i4);
                return iJ;
            case AndroidTracer.SPAN_ID_BIT_SIZE /* 63 */:
                if (i5 != 0) {
                    return i;
                }
                int i13 = zuh.i(bArr, i, yuhVar);
                int i14 = yuhVar.a;
                qzh qzhVarA = A(i8);
                if (qzhVarA != null && !qzhVarA.zza(i14)) {
                    F(t).a(i3, Long.valueOf(i14));
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
                iJ = zuh.i(bArr, i, yuhVar);
                unsafe.putObject(t, j, Integer.valueOf(beb.s(yuhVar.a)));
                unsafe.putInt(t, j2, i4);
                return iJ;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                iJ = zuh.j(bArr, i, yuhVar);
                unsafe.putObject(t, j, Long.valueOf(beb.o(yuhVar.b)));
                unsafe.putInt(t, j2, i4);
                return iJ;
            case 68:
                if (i5 == 3) {
                    iJ = zuh.g(o(i8), bArr, i, i2, (i3 & (-8)) | 4, yuhVar);
                    object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    Object obj2 = yuhVar.c;
                    if (object == null) {
                        unsafe.putObject(t, j, obj2);
                    } else {
                        unsafe.putObject(t, j, mzh.b(object, obj2));
                    }
                    unsafe.putInt(t, j2, i4);
                    return iJ;
                }
            default:
                return i;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public final int k(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, yuh yuhVar) throws zzfw {
        int iC;
        Unsafe unsafe = q;
        e0i e0iVarZza = (e0i) unsafe.getObject(t, j2);
        if (!e0iVarZza.zza()) {
            int size = e0iVarZza.size();
            e0iVarZza = e0iVarZza.zza(size == 0 ? 10 : size << 1);
            unsafe.putObject(t, j2, e0iVarZza);
        }
        e0i e0iVar = e0iVarZza;
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    kxh kxhVar = (kxh) e0iVar;
                    int i8 = zuh.i(bArr, i, yuhVar);
                    int i9 = yuhVar.a + i8;
                    while (i8 < i9) {
                        kxhVar.b(Double.longBitsToDouble(zuh.k(i8, bArr)));
                        i8 += 8;
                    }
                    if (i8 == i9) {
                        return i8;
                    }
                    throw zzfw.a();
                }
                if (i5 == 1) {
                    kxh kxhVar2 = (kxh) e0iVar;
                    kxhVar2.b(Double.longBitsToDouble(zuh.k(i, bArr)));
                    int i10 = i + 8;
                    while (i10 < i2) {
                        int i11 = zuh.i(bArr, i10, yuhVar);
                        if (i3 != yuhVar.a) {
                            return i10;
                        }
                        kxhVar2.b(Double.longBitsToDouble(zuh.k(i11, bArr)));
                        i10 = i11 + 8;
                    }
                    return i10;
                }
                return i;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
            case 36:
                if (i5 == 2) {
                    vyh vyhVar = (vyh) e0iVar;
                    int i12 = zuh.i(bArr, i, yuhVar);
                    int i13 = yuhVar.a + i12;
                    while (i12 < i13) {
                        vyhVar.b(Float.intBitsToFloat(zuh.a(i12, bArr)));
                        i12 += 4;
                    }
                    if (i12 == i13) {
                        return i12;
                    }
                    throw zzfw.a();
                }
                if (i5 == 5) {
                    vyh vyhVar2 = (vyh) e0iVar;
                    vyhVar2.b(Float.intBitsToFloat(zuh.a(i, bArr)));
                    int i14 = i + 4;
                    while (i14 < i2) {
                        int i15 = zuh.i(bArr, i14, yuhVar);
                        if (i3 != yuhVar.a) {
                            return i14;
                        }
                        vyhVar2.b(Float.intBitsToFloat(zuh.a(i15, bArr)));
                        i14 = i15 + 4;
                    }
                    return i14;
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    b2i b2iVar = (b2i) e0iVar;
                    int i16 = zuh.i(bArr, i, yuhVar);
                    int i17 = yuhVar.a + i16;
                    while (i16 < i17) {
                        i16 = zuh.j(bArr, i16, yuhVar);
                        b2iVar.b(yuhVar.b);
                    }
                    if (i16 == i17) {
                        return i16;
                    }
                    throw zzfw.a();
                }
                if (i5 == 0) {
                    b2i b2iVar2 = (b2i) e0iVar;
                    int iJ = zuh.j(bArr, i, yuhVar);
                    b2iVar2.b(yuhVar.b);
                    while (iJ < i2) {
                        int i18 = zuh.i(bArr, iJ, yuhVar);
                        if (i3 != yuhVar.a) {
                            return iJ;
                        }
                        iJ = zuh.j(bArr, i18, yuhVar);
                        b2iVar2.b(yuhVar.b);
                    }
                    return iJ;
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 != 2) {
                    if (i5 == 0) {
                        return zuh.c(i3, bArr, i, i2, e0iVar, yuhVar);
                    }
                    return i;
                }
                gzh gzhVar = (gzh) e0iVar;
                int i19 = zuh.i(bArr, i, yuhVar);
                int i20 = yuhVar.a + i19;
                while (i19 < i20) {
                    i19 = zuh.i(bArr, i19, yuhVar);
                    gzhVar.b(yuhVar.a);
                }
                if (i19 == i20) {
                    return i19;
                }
                throw zzfw.a();
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    b2i b2iVar3 = (b2i) e0iVar;
                    int i21 = zuh.i(bArr, i, yuhVar);
                    int i22 = yuhVar.a + i21;
                    while (i21 < i22) {
                        b2iVar3.b(zuh.k(i21, bArr));
                        i21 += 8;
                    }
                    if (i21 == i22) {
                        return i21;
                    }
                    throw zzfw.a();
                }
                if (i5 == 1) {
                    b2i b2iVar4 = (b2i) e0iVar;
                    b2iVar4.b(zuh.k(i, bArr));
                    int i23 = i + 8;
                    while (i23 < i2) {
                        int i24 = zuh.i(bArr, i23, yuhVar);
                        if (i3 != yuhVar.a) {
                            return i23;
                        }
                        b2iVar4.b(zuh.k(i24, bArr));
                        i23 = i24 + 8;
                    }
                    return i23;
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    gzh gzhVar2 = (gzh) e0iVar;
                    int i25 = zuh.i(bArr, i, yuhVar);
                    int i26 = yuhVar.a + i25;
                    while (i25 < i26) {
                        gzhVar2.b(zuh.a(i25, bArr));
                        i25 += 4;
                    }
                    if (i25 == i26) {
                        return i25;
                    }
                    throw zzfw.a();
                }
                if (i5 == 5) {
                    gzh gzhVar3 = (gzh) e0iVar;
                    gzhVar3.b(zuh.a(i, bArr));
                    int i27 = i + 4;
                    while (i27 < i2) {
                        int i28 = zuh.i(bArr, i27, yuhVar);
                        if (i3 != yuhVar.a) {
                            return i27;
                        }
                        gzhVar3.b(zuh.a(i28, bArr));
                        i27 = i28 + 4;
                    }
                    return i27;
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    bvh bvhVar = (bvh) e0iVar;
                    int i29 = zuh.i(bArr, i, yuhVar);
                    int i30 = yuhVar.a + i29;
                    while (i29 < i30) {
                        i29 = zuh.j(bArr, i29, yuhVar);
                        bvhVar.b(yuhVar.b != 0);
                    }
                    if (i29 == i30) {
                        return i29;
                    }
                    throw zzfw.a();
                }
                if (i5 == 0) {
                    bvh bvhVar2 = (bvh) e0iVar;
                    int iJ2 = zuh.j(bArr, i, yuhVar);
                    bvhVar2.b(yuhVar.b != 0);
                    while (iJ2 < i2) {
                        int i31 = zuh.i(bArr, iJ2, yuhVar);
                        if (i3 != yuhVar.a) {
                            return iJ2;
                        }
                        iJ2 = zuh.j(bArr, i31, yuhVar);
                        bvhVar2.b(yuhVar.b != 0);
                    }
                    return iJ2;
                }
                return i;
            case 26:
                if (i5 == 2) {
                    if ((j & FilePersistenceConfig.MAX_DISK_SPACE) == 0) {
                        int i32 = zuh.i(bArr, i, yuhVar);
                        int i33 = yuhVar.a;
                        if (i33 < 0) {
                            throw zzfw.b();
                        }
                        if (i33 == 0) {
                            e0iVar.add("");
                        } else {
                            e0iVar.add(new String(bArr, i32, i33, mzh.a));
                            i32 += i33;
                        }
                        while (i32 < i2) {
                            int i34 = zuh.i(bArr, i32, yuhVar);
                            if (i3 != yuhVar.a) {
                                return i32;
                            }
                            i32 = zuh.i(bArr, i34, yuhVar);
                            int i35 = yuhVar.a;
                            if (i35 < 0) {
                                throw zzfw.b();
                            }
                            if (i35 == 0) {
                                e0iVar.add("");
                            } else {
                                e0iVar.add(new String(bArr, i32, i35, mzh.a));
                                i32 += i35;
                            }
                        }
                        return i32;
                    }
                    int i36 = zuh.i(bArr, i, yuhVar);
                    int i37 = yuhVar.a;
                    if (i37 < 0) {
                        throw zzfw.b();
                    }
                    if (i37 == 0) {
                        e0iVar.add("");
                    } else {
                        int i38 = i36 + i37;
                        if (!a.a.F1(i36, bArr, i38)) {
                            throw zzfw.d();
                        }
                        e0iVar.add(new String(bArr, i36, i37, mzh.a));
                        i36 = i38;
                    }
                    while (i36 < i2) {
                        int i39 = zuh.i(bArr, i36, yuhVar);
                        if (i3 != yuhVar.a) {
                            return i36;
                        }
                        i36 = zuh.i(bArr, i39, yuhVar);
                        int i40 = yuhVar.a;
                        if (i40 < 0) {
                            throw zzfw.b();
                        }
                        if (i40 == 0) {
                            e0iVar.add("");
                        } else {
                            int i41 = i36 + i40;
                            if (!a.a.F1(i36, bArr, i41)) {
                                throw zzfw.d();
                            }
                            e0iVar.add(new String(bArr, i36, i40, mzh.a));
                            i36 = i41;
                        }
                    }
                    return i36;
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return zuh.f(o(i6), i3, bArr, i, i2, e0iVar, yuhVar);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    int i42 = zuh.i(bArr, i, yuhVar);
                    int i43 = yuhVar.a;
                    if (i43 < 0) {
                        throw zzfw.b();
                    }
                    if (i43 > bArr.length - i42) {
                        throw zzfw.a();
                    }
                    if (i43 == 0) {
                        e0iVar.add(fvh.a);
                    } else {
                        e0iVar.add(fvh.f(i42, bArr, i43));
                        i42 += i43;
                    }
                    while (i42 < i2) {
                        int i44 = zuh.i(bArr, i42, yuhVar);
                        if (i3 != yuhVar.a) {
                            return i42;
                        }
                        i42 = zuh.i(bArr, i44, yuhVar);
                        int i45 = yuhVar.a;
                        if (i45 < 0) {
                            throw zzfw.b();
                        }
                        if (i45 > bArr.length - i42) {
                            throw zzfw.a();
                        }
                        if (i45 == 0) {
                            e0iVar.add(fvh.a);
                        } else {
                            e0iVar.add(fvh.f(i42, bArr, i45));
                            i42 += i45;
                        }
                    }
                    return i42;
                }
                return i;
            case RendererMetrics.SAMPLES /* 30 */:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iC = zuh.c(i3, bArr, i, i2, e0iVar, yuhVar);
                    }
                    return i;
                }
                gzh gzhVar4 = (gzh) e0iVar;
                iC = zuh.i(bArr, i, yuhVar);
                int i46 = yuhVar.a + iC;
                while (iC < i46) {
                    iC = zuh.i(bArr, iC, yuhVar);
                    gzhVar4.b(yuhVar.a);
                }
                if (iC != i46) {
                    throw zzfw.a();
                }
                dzh dzhVar = (dzh) t;
                x7i x7iVarA = dzhVar.zzb;
                if (x7iVarA == x7i.f) {
                    x7iVarA = null;
                }
                qzh qzhVarA = A(i6);
                Class<?> cls = z5i.a;
                if (qzhVarA != null) {
                    int size2 = e0iVar.size();
                    int i47 = 0;
                    for (int i48 = 0; i48 < size2; i48++) {
                        Integer num = (Integer) e0iVar.get(i48);
                        int iIntValue = num.intValue();
                        if (qzhVarA.zza(iIntValue)) {
                            if (i48 != i47) {
                                e0iVar.set(i47, num);
                            }
                            i47++;
                        } else {
                            b8i<?, ?> b8iVar = this.m;
                            if (x7iVarA == null) {
                                x7iVarA = b8iVar.a();
                            }
                            b8iVar.b(x7iVarA, i4, iIntValue);
                        }
                    }
                    if (i47 != size2) {
                        e0iVar.subList(i47, size2).clear();
                    }
                }
                if (x7iVarA != null) {
                    dzhVar.zzb = x7iVarA;
                }
                return iC;
            case 33:
            case 47:
                if (i5 == 2) {
                    gzh gzhVar5 = (gzh) e0iVar;
                    int i49 = zuh.i(bArr, i, yuhVar);
                    int i50 = yuhVar.a + i49;
                    while (i49 < i50) {
                        i49 = zuh.i(bArr, i49, yuhVar);
                        gzhVar5.b(beb.s(yuhVar.a));
                    }
                    if (i49 == i50) {
                        return i49;
                    }
                    throw zzfw.a();
                }
                if (i5 == 0) {
                    gzh gzhVar6 = (gzh) e0iVar;
                    int i51 = zuh.i(bArr, i, yuhVar);
                    gzhVar6.b(beb.s(yuhVar.a));
                    while (i51 < i2) {
                        int i52 = zuh.i(bArr, i51, yuhVar);
                        if (i3 != yuhVar.a) {
                            return i51;
                        }
                        i51 = zuh.i(bArr, i52, yuhVar);
                        gzhVar6.b(beb.s(yuhVar.a));
                    }
                    return i51;
                }
                return i;
            case 34:
            case 48:
                if (i5 == 2) {
                    b2i b2iVar5 = (b2i) e0iVar;
                    int i53 = zuh.i(bArr, i, yuhVar);
                    int i54 = yuhVar.a + i53;
                    while (i53 < i54) {
                        i53 = zuh.j(bArr, i53, yuhVar);
                        b2iVar5.b(beb.o(yuhVar.b));
                    }
                    if (i53 == i54) {
                        return i53;
                    }
                    throw zzfw.a();
                }
                if (i5 == 0) {
                    b2i b2iVar6 = (b2i) e0iVar;
                    int iJ3 = zuh.j(bArr, i, yuhVar);
                    b2iVar6.b(beb.o(yuhVar.b));
                    while (iJ3 < i2) {
                        int i55 = zuh.i(bArr, iJ3, yuhVar);
                        if (i3 != yuhVar.a) {
                            return iJ3;
                        }
                        iJ3 = zuh.j(bArr, i55, yuhVar);
                        b2iVar6.b(beb.o(yuhVar.b));
                    }
                    return iJ3;
                }
                return i;
            case 49:
                if (i5 == 3) {
                    w5i w5iVarO = o(i6);
                    int i56 = (i3 & (-8)) | 4;
                    int iG = zuh.g(w5iVarO, bArr, i, i2, i56, yuhVar);
                    int i57 = i56;
                    yuh yuhVar2 = yuhVar;
                    e0iVar.add(yuhVar2.c);
                    while (iG < i2) {
                        int i58 = zuh.i(bArr, iG, yuhVar2);
                        if (i3 != yuhVar2.a) {
                            return iG;
                        }
                        int i59 = i57;
                        yuh yuhVar3 = yuhVar2;
                        iG = zuh.g(w5iVarO, bArr, i58, i2, i59, yuhVar3);
                        e0iVar.add(yuhVar3.c);
                        i57 = i59;
                        yuhVar2 = yuhVar3;
                    }
                    return iG;
                }
                return i;
            default:
                return i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x046d, code lost:
    
        r0 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x04fb, code lost:
    
        if (r0 == 1048575) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x04fd, code lost:
    
        r27.putInt(r9, r0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0503, code lost:
    
        r0 = r8.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0507, code lost:
    
        if (r0 >= r8.j) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0509, code lost:
    
        r2 = r8.h[r0];
        r6 = r22[r2];
        r6 = defpackage.r8i.l(r9, r8.C(r2) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0519, code lost:
    
        if (r6 != null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0520, code lost:
    
        if (r8.A(r2) != null) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0522, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0525, code lost:
    
        r0 = r8.o;
        r0.zza(r6);
        r0.zzb(r8.w(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0531, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0532, code lost:
    
        if (r35 != 0) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0534, code lost:
    
        if (r3 != r4) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x053b, code lost:
    
        throw com.google.android.gms.internal.measurement.zzfw.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x053c, code lost:
    
        if (r3 > r4) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x053e, code lost:
    
        if (r5 != r35) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0540, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0545, code lost:
    
        throw com.google.android.gms.internal.measurement.zzfw.c();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int l(T r31, byte[] r32, int r33, int r34, int r35, defpackage.yuh r36) {
        /*
            Method dump skipped, instruction units count: 1390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e4i.l(java.lang.Object, byte[], int, int, int, yuh):int");
    }

    public final w5i o(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.b;
        w5i w5iVar = (w5i) objArr[i2];
        if (w5iVar != null) {
            return w5iVar;
        }
        w5i<T> w5iVarA = l5i.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = w5iVarA;
        return w5iVarA;
    }

    public final void p(int i, Object obj, Object obj2) {
        long jC = C(i) & 1048575;
        if (t(i, obj2)) {
            Object objL = r8i.l(obj, jC);
            Object objL2 = r8i.l(obj2, jC);
            if (objL != null && objL2 != null) {
                r8i.d(obj, jC, mzh.b(objL, objL2));
                x(i, obj);
            } else if (objL2 != null) {
                r8i.d(obj, jC, objL2);
                x(i, obj);
            }
        }
    }

    public final void r(Object obj, byte[] bArr, int i, int i2, int i3, long j, yuh yuhVar) {
        Unsafe unsafe = q;
        Object objW = w(i3);
        Object object = unsafe.getObject(obj, j);
        a3i a3iVar = this.o;
        if (a3iVar.a(object)) {
            u2i u2iVarZzf = a3iVar.zzf();
            a3iVar.c((Object) u2iVarZzf, object);
            unsafe.putObject(obj, j, u2iVarZzf);
        }
        a3iVar.zzb(objW);
        throw null;
    }

    public final <K, V> void s(hai haiVar, int i, Object obj, int i2) {
        if (obj == null) {
            return;
        }
        this.o.zzb(w(i2));
        throw null;
    }

    public final boolean t(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & r8i.d.k(obj, j)) != 0;
        }
        int iC = C(i);
        long j2 = iC & 1048575;
        switch ((iC & 267386880) >>> 20) {
            case 0:
                if (r8i.d.j(obj, j2) != 0.0d) {
                }
                break;
            case 1:
                if (r8i.d.i(obj, j2) != 0.0f) {
                }
                break;
            case 2:
                if (r8i.d.l(obj, j2) != 0) {
                }
                break;
            case 3:
                if (r8i.d.l(obj, j2) != 0) {
                }
                break;
            case 4:
                if (r8i.d.k(obj, j2) != 0) {
                }
                break;
            case 5:
                if (r8i.d.l(obj, j2) != 0) {
                }
                break;
            case 6:
                if (r8i.d.k(obj, j2) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object objL = r8i.l(obj, j2);
                if (!(objL instanceof String)) {
                    if (!(objL instanceof fvh)) {
                        o6.h();
                        break;
                    } else if (!fvh.a.equals(objL)) {
                    }
                } else if (!((String) objL).isEmpty()) {
                }
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                if (r8i.l(obj, j2) != null) {
                }
                break;
            case 10:
                if (!fvh.a.equals(r8i.l(obj, j2))) {
                }
                break;
            case 11:
                if (r8i.d.k(obj, j2) != 0) {
                }
                break;
            case 12:
                if (r8i.d.k(obj, j2) != 0) {
                }
                break;
            case 13:
                if (r8i.d.k(obj, j2) != 0) {
                }
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                if (r8i.d.l(obj, j2) != 0) {
                }
                break;
            case 15:
                if (r8i.d.k(obj, j2) != 0) {
                }
                break;
            case 16:
                if (r8i.d.l(obj, j2) != 0) {
                }
                break;
            case 17:
                if (r8i.l(obj, j2) != null) {
                }
                break;
            default:
                o6.h();
                break;
        }
        return false;
    }

    public final boolean u(T t, int i, int i2) {
        return r8i.d.k(t, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    public final int v(int i, int i2) {
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

    public final Object w(int i) {
        return this.b[(i / 3) << 1];
    }

    public final void x(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        r8i.c(obj, (1 << (i2 >>> 20)) | r8i.d.k(obj, j), j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(int i, Object obj, Object obj2) {
        int iC = C(i);
        int i2 = this.a[i];
        long j = iC & 1048575;
        if (u(obj2, i2, i)) {
            Object objL = r8i.l(obj, j);
            Object objL2 = r8i.l(obj2, j);
            if (objL != null && objL2 != null) {
                r8i.d(obj, j, mzh.b(objL, objL2));
                r8i.c(obj, i2, r1[i + 2] & 1048575);
            } else if (objL2 != null) {
                r8i.d(obj, j, objL2);
                r8i.c(obj, i2, r1[i + 2] & 1048575);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(T r22, defpackage.hai r23) {
        /*
            Method dump skipped, instruction units count: 1524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e4i.z(java.lang.Object, hai):void");
    }
}
