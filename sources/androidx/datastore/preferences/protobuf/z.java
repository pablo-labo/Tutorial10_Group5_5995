package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.l;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.u;
import app.rive.runtime.kotlin.renderers.RendererMetrics;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.rum.internal.domain.scope.RumViewScope;
import com.datadog.android.trace.AndroidTracer;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.a6c;
import defpackage.akb;
import defpackage.d95;
import defpackage.f7g;
import defpackage.l5;
import defpackage.mha;
import defpackage.pp9;
import defpackage.r6;
import defpackage.sp9;
import defpackage.tr1;
import defpackage.u40;
import defpackage.uod;
import defpackage.w20;
import defpackage.zic;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class z<T> implements uod<T> {
    public static final int[] q = new int[0];
    public static final Unsafe r = f7g.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final sp9 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int[] i;
    public final int j;
    public final int k;
    public final mha l;
    public final s m;
    public final h0<?, ?> n;
    public final j<?> o;
    public final w p;

    public z(int[] iArr, Object[] objArr, int i, int i2, sp9 sp9Var, boolean z, int[] iArr2, int i3, int i4, mha mhaVar, s sVar, h0 h0Var, j jVar, w wVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = sp9Var instanceof n;
        this.h = z;
        this.f = jVar != null && jVar.e(sp9Var);
        this.i = iArr2;
        this.j = i3;
        this.k = i4;
        this.l = mhaVar;
        this.m = sVar;
        this.n = h0Var;
        this.o = jVar;
        this.e = sp9Var;
        this.p = wVar;
    }

    public static <T> long A(T t, long j) {
        return ((Long) f7g.d.i(t, j)).longValue();
    }

    public static Field C(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbM = akb.m("Field ", str, " for ");
            u40.k(cls, sbM, " not found. Known fields are ");
            sbM.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbM.toString());
        }
    }

    public static int F(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void J(int i, Object obj, k0 k0Var) {
        if (obj instanceof String) {
            ((g) k0Var).a.l2(i, (String) obj);
        } else {
            ((g) k0Var).a(i, (tr1) obj);
        }
    }

    public static List<?> s(Object obj, long j) {
        return (List) f7g.d.i(obj, j);
    }

    public static z w(pp9 pp9Var, mha mhaVar, s sVar, h0 h0Var, j jVar, w wVar) {
        if (pp9Var instanceof zic) {
            return x((zic) pp9Var, mhaVar, sVar, h0Var, jVar, wVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> androidx.datastore.preferences.protobuf.z<T> x(defpackage.zic r35, defpackage.mha r36, androidx.datastore.preferences.protobuf.s r37, androidx.datastore.preferences.protobuf.h0<?, ?> r38, androidx.datastore.preferences.protobuf.j<?> r39, androidx.datastore.preferences.protobuf.w r40) {
        /*
            Method dump skipped, instruction units count: 1041
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.z.x(zic, mha, androidx.datastore.preferences.protobuf.s, androidx.datastore.preferences.protobuf.h0, androidx.datastore.preferences.protobuf.j, androidx.datastore.preferences.protobuf.w):androidx.datastore.preferences.protobuf.z");
    }

    public static long y(int i) {
        return i & 1048575;
    }

    public static <T> int z(T t, long j) {
        return ((Integer) f7g.d.i(t, j)).intValue();
    }

    public final void B(Object obj, int i, d0 d0Var) {
        if ((536870912 & i) != 0) {
            f7g.o(obj, i & 1048575, d0Var.N());
        } else if (this.g) {
            f7g.o(obj, i & 1048575, d0Var.D());
        } else {
            f7g.o(obj, i & 1048575, d0Var.q());
        }
    }

    public final void D(int i, Object obj) {
        if (this.h) {
            return;
        }
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        f7g.m(obj, f7g.d.g(obj, j) | (1 << (i2 >>> 20)), j);
    }

    public final void E(T t, int i, int i2) {
        f7g.m(t, i, this.a[i2 + 2] & 1048575);
    }

    public final int G(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(T r24, androidx.datastore.preferences.protobuf.k0 r25) {
        /*
            Method dump skipped, instruction units count: 1518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.z.H(java.lang.Object, androidx.datastore.preferences.protobuf.k0):void");
    }

    public final <K, V> void I(k0 k0Var, int i, Object obj, int i2) {
        if (obj != null) {
            Object objM = m(i2);
            w wVar = this.p;
            u.a<?, ?> aVarB = wVar.b(objM);
            v vVarD = wVar.d(obj);
            CodedOutputStream codedOutputStream = ((g) k0Var).a;
            codedOutputStream.getClass();
            for (Map.Entry<K, V> entry : vVarD.entrySet()) {
                codedOutputStream.n2(i, 2);
                codedOutputStream.p2(u.a(aVarB, entry.getKey(), entry.getValue()));
                u.b(codedOutputStream, aVarB, entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // defpackage.uod
    public final T a() {
        return (T) this.l.a(this.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x0665 A[Catch: all -> 0x049c, TryCatch #8 {all -> 0x049c, blocks: (B:180:0x0660, B:182:0x0665, B:183:0x066a, B:137:0x047d, B:140:0x049f, B:141:0x04b4, B:142:0x04c9, B:143:0x04de, B:144:0x04f3, B:145:0x0508, B:147:0x0517, B:150:0x051e, B:151:0x0524, B:152:0x0530, B:153:0x0545, B:154:0x055a, B:156:0x0565, B:157:0x0584, B:158:0x0598, B:159:0x05a5, B:160:0x05bc, B:161:0x05d1, B:162:0x05e6, B:163:0x05fb, B:164:0x0610, B:165:0x0625, B:166:0x063b, B:172:0x0651), top: B:206:0x0660 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0670 A[SYNTHETIC] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.uod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(T r20, androidx.datastore.preferences.protobuf.d0 r21, androidx.datastore.preferences.protobuf.i r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1834
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.z.b(java.lang.Object, androidx.datastore.preferences.protobuf.d0, androidx.datastore.preferences.protobuf.i):void");
    }

    @Override // defpackage.uod
    public final void c(T t) {
        int[] iArr;
        int i;
        int i2 = this.j;
        while (true) {
            iArr = this.i;
            i = this.k;
            if (i2 >= i) {
                break;
            }
            long jG = G(iArr[i2]) & 1048575;
            Object objI = f7g.d.i(t, jG);
            if (objI != null) {
                f7g.o(t, jG, this.p.e(objI));
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.m.a(t, iArr[i]);
            i++;
        }
        this.n.j(t);
        if (this.f) {
            this.o.f(t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uod
    public final int d(a aVar) {
        return this.h ? p(aVar) : o(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Type inference failed for: r4v3, types: [uod] */
    /* JADX WARN: Type inference failed for: r4v5, types: [uod] */
    /* JADX WARN: Type inference failed for: r4v6, types: [uod] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26, types: [uod] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    @Override // defpackage.uod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(T r15) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.z.e(java.lang.Object):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // defpackage.uod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(androidx.datastore.preferences.protobuf.n r11, androidx.datastore.preferences.protobuf.n r12) {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.z.f(androidx.datastore.preferences.protobuf.n, androidx.datastore.preferences.protobuf.n):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.uod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(androidx.datastore.preferences.protobuf.n r12) {
        /*
            Method dump skipped, instruction units count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.z.g(androidx.datastore.preferences.protobuf.n):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // defpackage.uod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(T r18, androidx.datastore.preferences.protobuf.k0 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2004
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.z.h(java.lang.Object, androidx.datastore.preferences.protobuf.k0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // defpackage.uod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(androidx.datastore.preferences.protobuf.n r12, androidx.datastore.preferences.protobuf.n r13) {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.z.i(androidx.datastore.preferences.protobuf.n, androidx.datastore.preferences.protobuf.n):boolean");
    }

    public final boolean j(n nVar, Object obj, int i) {
        return q(i, nVar) == q(i, obj);
    }

    public final <UT, UB> UB k(Object obj, int i, UB ub, h0<UT, UB> h0Var) {
        p.b bVarL;
        int i2 = this.a[i];
        Object objI = f7g.d.i(obj, G(i) & 1048575);
        if (objI == null || (bVarL = l(i)) == null) {
            return ub;
        }
        w wVar = this.p;
        v vVarC = wVar.c(objI);
        u.a<?, ?> aVarB = wVar.b(m(i));
        Iterator it = vVarC.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((Integer) entry.getValue()).getClass();
            if (!bVarL.a()) {
                if (ub == null) {
                    ub = (UB) h0Var.m();
                }
                int iA = u.a(aVarB, entry.getKey(), entry.getValue());
                byte[] bArr = new byte[iA];
                Logger logger = CodedOutputStream.e;
                CodedOutputStream.b bVar = new CodedOutputStream.b(bArr, iA);
                try {
                    u.b(bVar, aVarB, entry.getKey(), entry.getValue());
                    if (bVar.h - bVar.i != 0) {
                        r6.g("Did not write as much data as expected.");
                        return null;
                    }
                    h0Var.d(ub, i2, new tr1.e(bArr));
                    it.remove();
                } catch (IOException e) {
                    l5.r(e);
                    return null;
                }
            }
        }
        return ub;
    }

    public final p.b l(int i) {
        return (p.b) this.b[((i / 3) * 2) + 1];
    }

    public final Object m(int i) {
        return this.b[(i / 3) * 2];
    }

    public final uod n(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        uod uodVar = (uod) objArr[i2];
        if (uodVar != null) {
            return uodVar;
        }
        uod<T> uodVarA = a6c.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = uodVarA;
        return uodVarA;
    }

    public final int o(T t) {
        int i;
        int iR1;
        int iU1;
        int iR12;
        int iO1;
        int iM1;
        int iR13;
        int iQ1;
        int iC;
        int iR14;
        int iN1;
        Unsafe unsafe = r;
        int i2 = -1;
        int i3 = 0;
        int iC2 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i3 >= iArr.length) {
                h0<?, ?> h0Var = this.n;
                int iH = h0Var.h(h0Var.g(t)) + iC2;
                if (!this.f) {
                    return iH;
                }
                f0 f0Var = this.o.c(t).a;
                int iC3 = 0;
                for (int i5 = 0; i5 < f0Var.b.size(); i5++) {
                    Map.Entry<Object, Object> entryD = f0Var.d(i5);
                    iC3 += l.c((l.a) entryD.getKey(), entryD.getValue());
                }
                for (Map.Entry<Object, Object> entry : f0Var.f()) {
                    iC3 += l.c((l.a) entry.getKey(), entry.getValue());
                }
                return iH + iC3;
            }
            int iG = G(i3);
            int i6 = iArr[i3];
            int iF = F(iG);
            if (iF <= 17) {
                int i7 = iArr[i3 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = unsafe.getInt(t, i8);
                    i2 = i8;
                }
            } else {
                i = 0;
            }
            long j = iG & 1048575;
            switch (iF) {
                case 0:
                    if ((i & i4) != 0) {
                        iC2 = w20.c(i6, 8, iC2);
                    }
                    break;
                case 1:
                    if ((i4 & i) != 0) {
                        iC2 = w20.c(i6, 4, iC2);
                    }
                    break;
                case 2:
                    if ((i4 & i) != 0) {
                        long j2 = unsafe.getLong(t, j);
                        iR1 = CodedOutputStream.R1(i6);
                        iU1 = CodedOutputStream.U1(j2);
                        iR14 = iU1 + iR1;
                        iC2 += iR14;
                    }
                    break;
                case 3:
                    if ((i4 & i) != 0) {
                        long j3 = unsafe.getLong(t, j);
                        iR1 = CodedOutputStream.R1(i6);
                        iU1 = CodedOutputStream.U1(j3);
                        iR14 = iU1 + iR1;
                        iC2 += iR14;
                    }
                    break;
                case 4:
                    if ((i4 & i) != 0) {
                        int i9 = unsafe.getInt(t, j);
                        iR12 = CodedOutputStream.R1(i6);
                        iO1 = CodedOutputStream.O1(i9);
                        iM1 = iO1 + iR12;
                        iC2 += iM1;
                    }
                    break;
                case 5:
                    if ((i4 & i) != 0) {
                        iM1 = CodedOutputStream.M1(i6);
                        iC2 += iM1;
                    }
                    break;
                case 6:
                    if ((i4 & i) != 0) {
                        iM1 = CodedOutputStream.L1(i6);
                        iC2 += iM1;
                    }
                    break;
                case 7:
                    if ((i4 & i) != 0) {
                        iC2 = w20.c(i6, 1, iC2);
                    }
                    break;
                case 8:
                    if ((i4 & i) != 0) {
                        Object object = unsafe.getObject(t, j);
                        if (object instanceof tr1) {
                            int iR15 = CodedOutputStream.R1(i6);
                            int size = ((tr1) object).size();
                            iC = defpackage.b0.c(size, size, iR15, iC2);
                            iC2 = iC;
                        } else {
                            iR13 = CodedOutputStream.R1(i6);
                            iQ1 = CodedOutputStream.Q1((String) object);
                            iC = iQ1 + iR13 + iC2;
                            iC2 = iC;
                        }
                    }
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    if ((i4 & i) != 0) {
                        iM1 = e0.l(i6, unsafe.getObject(t, j), n(i3));
                        iC2 += iM1;
                    }
                    break;
                case 10:
                    if ((i4 & i) != 0) {
                        iM1 = CodedOutputStream.J1(i6, (tr1) unsafe.getObject(t, j));
                        iC2 += iM1;
                    }
                    break;
                case 11:
                    if ((i4 & i) != 0) {
                        iM1 = CodedOutputStream.S1(i6, unsafe.getInt(t, j));
                        iC2 += iM1;
                    }
                    break;
                case 12:
                    if ((i4 & i) != 0) {
                        int i10 = unsafe.getInt(t, j);
                        iR12 = CodedOutputStream.R1(i6);
                        iO1 = CodedOutputStream.O1(i10);
                        iM1 = iO1 + iR12;
                        iC2 += iM1;
                    }
                    break;
                case 13:
                    if ((i4 & i) != 0) {
                        iC2 = w20.c(i6, 4, iC2);
                    }
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                    if ((i & i4) != 0) {
                        iC2 = w20.c(i6, 8, iC2);
                    }
                    break;
                case 15:
                    if ((i4 & i) != 0) {
                        int i11 = unsafe.getInt(t, j);
                        iR12 = CodedOutputStream.R1(i6);
                        iO1 = CodedOutputStream.T1((i11 >> 31) ^ (i11 << 1));
                        iM1 = iO1 + iR12;
                        iC2 += iM1;
                    }
                    break;
                case 16:
                    if ((i4 & i) != 0) {
                        long j4 = unsafe.getLong(t, j);
                        iR1 = CodedOutputStream.R1(i6);
                        iU1 = CodedOutputStream.U1((j4 >> 63) ^ (j4 << 1));
                        iR14 = iU1 + iR1;
                        iC2 += iR14;
                    }
                    break;
                case 17:
                    if ((i4 & i) != 0) {
                        iM1 = CodedOutputStream.N1(i6, (sp9) unsafe.getObject(t, j), n(i3));
                        iC2 += iM1;
                    }
                    break;
                case 18:
                    iM1 = e0.f(i6, (List) unsafe.getObject(t, j));
                    iC2 += iM1;
                    break;
                case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                    iM1 = e0.d(i6, (List) unsafe.getObject(t, j));
                    iC2 += iM1;
                    break;
                case 20:
                    iM1 = e0.j(i6, (List) unsafe.getObject(t, j));
                    iC2 += iM1;
                    break;
                case 21:
                    iM1 = e0.u(i6, (List) unsafe.getObject(t, j));
                    iC2 += iM1;
                    break;
                case 22:
                    iM1 = e0.h(i6, (List) unsafe.getObject(t, j));
                    iC2 += iM1;
                    break;
                case 23:
                    iM1 = e0.f(i6, (List) unsafe.getObject(t, j));
                    iC2 += iM1;
                    break;
                case 24:
                    iM1 = e0.d(i6, (List) unsafe.getObject(t, j));
                    iC2 += iM1;
                    break;
                case 25:
                    List list = (List) unsafe.getObject(t, j);
                    Class<?> cls = e0.a;
                    int size2 = list.size();
                    iR14 = size2 == 0 ? 0 : (CodedOutputStream.R1(i6) + 1) * size2;
                    iC2 += iR14;
                    break;
                case 26:
                    iM1 = e0.r(i6, (List) unsafe.getObject(t, j));
                    iC2 += iM1;
                    break;
                case 27:
                    iM1 = e0.m(i6, (List) unsafe.getObject(t, j), n(i3));
                    iC2 += iM1;
                    break;
                case 28:
                    iM1 = e0.a(i6, (List) unsafe.getObject(t, j));
                    iC2 += iM1;
                    break;
                case 29:
                    iM1 = e0.s(i6, (List) unsafe.getObject(t, j));
                    iC2 += iM1;
                    break;
                case RendererMetrics.SAMPLES /* 30 */:
                    iM1 = e0.b(i6, (List) unsafe.getObject(t, j));
                    iC2 += iM1;
                    break;
                case 31:
                    iM1 = e0.d(i6, (List) unsafe.getObject(t, j));
                    iC2 += iM1;
                    break;
                case 32:
                    iM1 = e0.f(i6, (List) unsafe.getObject(t, j));
                    iC2 += iM1;
                    break;
                case 33:
                    iM1 = e0.n(i6, (List) unsafe.getObject(t, j));
                    iC2 += iM1;
                    break;
                case 34:
                    iM1 = e0.p(i6, (List) unsafe.getObject(t, j));
                    iC2 += iM1;
                    break;
                case 35:
                    int iG2 = e0.g((List) unsafe.getObject(t, j));
                    if (iG2 > 0) {
                        iC2 = defpackage.b0.c(iG2, CodedOutputStream.R1(i6), iG2, iC2);
                    }
                    break;
                case 36:
                    int iE = e0.e((List) unsafe.getObject(t, j));
                    if (iE > 0) {
                        iC2 = defpackage.b0.c(iE, CodedOutputStream.R1(i6), iE, iC2);
                    }
                    break;
                case 37:
                    int iK = e0.k((List) unsafe.getObject(t, j));
                    if (iK > 0) {
                        iC2 = defpackage.b0.c(iK, CodedOutputStream.R1(i6), iK, iC2);
                    }
                    break;
                case 38:
                    int iV = e0.v((List) unsafe.getObject(t, j));
                    if (iV > 0) {
                        iC2 = defpackage.b0.c(iV, CodedOutputStream.R1(i6), iV, iC2);
                    }
                    break;
                case 39:
                    int i12 = e0.i((List) unsafe.getObject(t, j));
                    if (i12 > 0) {
                        iC2 = defpackage.b0.c(i12, CodedOutputStream.R1(i6), i12, iC2);
                    }
                    break;
                case 40:
                    int iG3 = e0.g((List) unsafe.getObject(t, j));
                    if (iG3 > 0) {
                        iC2 = defpackage.b0.c(iG3, CodedOutputStream.R1(i6), iG3, iC2);
                    }
                    break;
                case 41:
                    int iE2 = e0.e((List) unsafe.getObject(t, j));
                    if (iE2 > 0) {
                        iC2 = defpackage.b0.c(iE2, CodedOutputStream.R1(i6), iE2, iC2);
                    }
                    break;
                case 42:
                    List list2 = (List) unsafe.getObject(t, j);
                    Class<?> cls2 = e0.a;
                    int size3 = list2.size();
                    if (size3 > 0) {
                        iC2 = defpackage.b0.c(size3, CodedOutputStream.R1(i6), size3, iC2);
                    }
                    break;
                case 43:
                    int iT = e0.t((List) unsafe.getObject(t, j));
                    if (iT > 0) {
                        iC2 = defpackage.b0.c(iT, CodedOutputStream.R1(i6), iT, iC2);
                    }
                    break;
                case 44:
                    int iC4 = e0.c((List) unsafe.getObject(t, j));
                    if (iC4 > 0) {
                        iC2 = defpackage.b0.c(iC4, CodedOutputStream.R1(i6), iC4, iC2);
                    }
                    break;
                case 45:
                    int iE3 = e0.e((List) unsafe.getObject(t, j));
                    if (iE3 > 0) {
                        iC2 = defpackage.b0.c(iE3, CodedOutputStream.R1(i6), iE3, iC2);
                    }
                    break;
                case 46:
                    int iG4 = e0.g((List) unsafe.getObject(t, j));
                    if (iG4 > 0) {
                        iC2 = defpackage.b0.c(iG4, CodedOutputStream.R1(i6), iG4, iC2);
                    }
                    break;
                case 47:
                    int iO = e0.o((List) unsafe.getObject(t, j));
                    if (iO > 0) {
                        iC2 = defpackage.b0.c(iO, CodedOutputStream.R1(i6), iO, iC2);
                    }
                    break;
                case 48:
                    int iQ = e0.q((List) unsafe.getObject(t, j));
                    if (iQ > 0) {
                        iC2 = defpackage.b0.c(iQ, CodedOutputStream.R1(i6), iQ, iC2);
                    }
                    break;
                case 49:
                    List list3 = (List) unsafe.getObject(t, j);
                    uod uodVarN = n(i3);
                    Class<?> cls3 = e0.a;
                    int size4 = list3.size();
                    if (size4 == 0) {
                        iN1 = 0;
                    } else {
                        iN1 = 0;
                        for (int i13 = 0; i13 < size4; i13++) {
                            iN1 += CodedOutputStream.N1(i6, (sp9) list3.get(i13), uodVarN);
                        }
                    }
                    iC2 += iN1;
                    break;
                case 50:
                    iM1 = this.p.g(i6, unsafe.getObject(t, j), m(i3));
                    iC2 += iM1;
                    break;
                case 51:
                    if (r(t, i6, i3)) {
                        iC2 = w20.c(i6, 8, iC2);
                    }
                    break;
                case 52:
                    if (r(t, i6, i3)) {
                        iC2 = w20.c(i6, 4, iC2);
                    }
                    break;
                case 53:
                    if (r(t, i6, i3)) {
                        long jA = A(t, j);
                        iR1 = CodedOutputStream.R1(i6);
                        iU1 = CodedOutputStream.U1(jA);
                        iR14 = iU1 + iR1;
                        iC2 += iR14;
                    }
                    break;
                case 54:
                    if (r(t, i6, i3)) {
                        long jA2 = A(t, j);
                        iR1 = CodedOutputStream.R1(i6);
                        iU1 = CodedOutputStream.U1(jA2);
                        iR14 = iU1 + iR1;
                        iC2 += iR14;
                    }
                    break;
                case RumViewScope.SLOW_RENDERED_THRESHOLD_FPS /* 55 */:
                    if (r(t, i6, i3)) {
                        int iZ = z(t, j);
                        iR12 = CodedOutputStream.R1(i6);
                        iO1 = CodedOutputStream.O1(iZ);
                        iM1 = iO1 + iR12;
                        iC2 += iM1;
                    }
                    break;
                case 56:
                    if (r(t, i6, i3)) {
                        iM1 = CodedOutputStream.M1(i6);
                        iC2 += iM1;
                    }
                    break;
                case 57:
                    if (r(t, i6, i3)) {
                        iM1 = CodedOutputStream.L1(i6);
                        iC2 += iM1;
                    }
                    break;
                case 58:
                    if (r(t, i6, i3)) {
                        iC2 = w20.c(i6, 1, iC2);
                    }
                    break;
                case 59:
                    if (r(t, i6, i3)) {
                        Object object2 = unsafe.getObject(t, j);
                        if (object2 instanceof tr1) {
                            int iR16 = CodedOutputStream.R1(i6);
                            int size5 = ((tr1) object2).size();
                            iC = defpackage.b0.c(size5, size5, iR16, iC2);
                            iC2 = iC;
                        } else {
                            iR13 = CodedOutputStream.R1(i6);
                            iQ1 = CodedOutputStream.Q1((String) object2);
                            iC = iQ1 + iR13 + iC2;
                            iC2 = iC;
                        }
                    }
                    break;
                case 60:
                    if (r(t, i6, i3)) {
                        iM1 = e0.l(i6, unsafe.getObject(t, j), n(i3));
                        iC2 += iM1;
                    }
                    break;
                case 61:
                    if (r(t, i6, i3)) {
                        iM1 = CodedOutputStream.J1(i6, (tr1) unsafe.getObject(t, j));
                        iC2 += iM1;
                    }
                    break;
                case 62:
                    if (r(t, i6, i3)) {
                        iM1 = CodedOutputStream.S1(i6, z(t, j));
                        iC2 += iM1;
                    }
                    break;
                case AndroidTracer.SPAN_ID_BIT_SIZE /* 63 */:
                    if (r(t, i6, i3)) {
                        int iZ2 = z(t, j);
                        iR12 = CodedOutputStream.R1(i6);
                        iO1 = CodedOutputStream.O1(iZ2);
                        iM1 = iO1 + iR12;
                        iC2 += iM1;
                    }
                    break;
                case 64:
                    if (r(t, i6, i3)) {
                        iC2 = w20.c(i6, 4, iC2);
                    }
                    break;
                case 65:
                    if (r(t, i6, i3)) {
                        iC2 = w20.c(i6, 8, iC2);
                    }
                    break;
                case 66:
                    if (r(t, i6, i3)) {
                        int iZ3 = z(t, j);
                        iR12 = CodedOutputStream.R1(i6);
                        iO1 = CodedOutputStream.T1((iZ3 >> 31) ^ (iZ3 << 1));
                        iM1 = iO1 + iR12;
                        iC2 += iM1;
                    }
                    break;
                case 67:
                    if (r(t, i6, i3)) {
                        long jA3 = A(t, j);
                        iR1 = CodedOutputStream.R1(i6);
                        iU1 = CodedOutputStream.U1((jA3 >> 63) ^ (jA3 << 1));
                        iR14 = iU1 + iR1;
                        iC2 += iR14;
                    }
                    break;
                case 68:
                    if (r(t, i6, i3)) {
                        iM1 = CodedOutputStream.N1(i6, (sp9) unsafe.getObject(t, j), n(i3));
                        iC2 += iM1;
                    }
                    break;
            }
            i3 += 3;
        }
    }

    public final int p(T t) {
        int iR1;
        int iU1;
        int iR12;
        int iO1;
        int iM1;
        int iR13;
        int iQ1;
        int iR14;
        int iU12;
        int iN1;
        Unsafe unsafe = r;
        int i = 0;
        int iC = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                h0<?, ?> h0Var = this.n;
                return h0Var.h(h0Var.g(t)) + iC;
            }
            int iG = G(i);
            int iF = F(iG);
            int i2 = iArr[i];
            long j = iG & 1048575;
            if (iF >= d95.a.a() && iF <= d95.b.a()) {
                int i3 = iArr[i + 2];
            }
            switch (iF) {
                case 0:
                    if (q(i, t)) {
                        iC = w20.c(i2, 8, iC);
                    }
                    break;
                case 1:
                    if (q(i, t)) {
                        iC = w20.c(i2, 4, iC);
                    }
                    break;
                case 2:
                    if (q(i, t)) {
                        long jH = f7g.d.h(t, j);
                        iR1 = CodedOutputStream.R1(i2);
                        iU1 = CodedOutputStream.U1(jH);
                        iM1 = iU1 + iR1;
                        iC += iM1;
                    }
                    break;
                case 3:
                    if (q(i, t)) {
                        long jH2 = f7g.d.h(t, j);
                        iR1 = CodedOutputStream.R1(i2);
                        iU1 = CodedOutputStream.U1(jH2);
                        iM1 = iU1 + iR1;
                        iC += iM1;
                    }
                    break;
                case 4:
                    if (q(i, t)) {
                        int iG2 = f7g.d.g(t, j);
                        iR12 = CodedOutputStream.R1(i2);
                        iO1 = CodedOutputStream.O1(iG2);
                        iM1 = iO1 + iR12;
                        iC += iM1;
                    }
                    break;
                case 5:
                    if (q(i, t)) {
                        iM1 = CodedOutputStream.M1(i2);
                        iC += iM1;
                    }
                    break;
                case 6:
                    if (q(i, t)) {
                        iM1 = CodedOutputStream.L1(i2);
                        iC += iM1;
                    }
                    break;
                case 7:
                    if (q(i, t)) {
                        iC = w20.c(i2, 1, iC);
                    }
                    break;
                case 8:
                    if (q(i, t)) {
                        Object objI = f7g.d.i(t, j);
                        if (objI instanceof tr1) {
                            int iR15 = CodedOutputStream.R1(i2);
                            int size = ((tr1) objI).size();
                            iC = defpackage.b0.c(size, size, iR15, iC);
                        } else {
                            iR13 = CodedOutputStream.R1(i2);
                            iQ1 = CodedOutputStream.Q1((String) objI);
                            iC = iQ1 + iR13 + iC;
                        }
                    }
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    if (q(i, t)) {
                        iM1 = e0.l(i2, f7g.d.i(t, j), n(i));
                        iC += iM1;
                    }
                    break;
                case 10:
                    if (q(i, t)) {
                        iM1 = CodedOutputStream.J1(i2, (tr1) f7g.d.i(t, j));
                        iC += iM1;
                    }
                    break;
                case 11:
                    if (q(i, t)) {
                        iM1 = CodedOutputStream.S1(i2, f7g.d.g(t, j));
                        iC += iM1;
                    }
                    break;
                case 12:
                    if (q(i, t)) {
                        int iG3 = f7g.d.g(t, j);
                        iR12 = CodedOutputStream.R1(i2);
                        iO1 = CodedOutputStream.O1(iG3);
                        iM1 = iO1 + iR12;
                        iC += iM1;
                    }
                    break;
                case 13:
                    if (q(i, t)) {
                        iC = w20.c(i2, 4, iC);
                    }
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                    if (q(i, t)) {
                        iC = w20.c(i2, 8, iC);
                    }
                    break;
                case 15:
                    if (q(i, t)) {
                        int iG4 = f7g.d.g(t, j);
                        iR12 = CodedOutputStream.R1(i2);
                        iO1 = CodedOutputStream.T1((iG4 >> 31) ^ (iG4 << 1));
                        iM1 = iO1 + iR12;
                        iC += iM1;
                    }
                    break;
                case 16:
                    if (q(i, t)) {
                        long jH3 = f7g.d.h(t, j);
                        iR14 = CodedOutputStream.R1(i2);
                        iU12 = CodedOutputStream.U1((jH3 >> 63) ^ (jH3 << 1));
                        iM1 = iU12 + iR14;
                        iC += iM1;
                    }
                    break;
                case 17:
                    if (q(i, t)) {
                        iM1 = CodedOutputStream.N1(i2, (sp9) f7g.d.i(t, j), n(i));
                        iC += iM1;
                    }
                    break;
                case 18:
                    iM1 = e0.f(i2, s(t, j));
                    iC += iM1;
                    break;
                case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                    iM1 = e0.d(i2, s(t, j));
                    iC += iM1;
                    break;
                case 20:
                    iM1 = e0.j(i2, s(t, j));
                    iC += iM1;
                    break;
                case 21:
                    iM1 = e0.u(i2, s(t, j));
                    iC += iM1;
                    break;
                case 22:
                    iM1 = e0.h(i2, s(t, j));
                    iC += iM1;
                    break;
                case 23:
                    iM1 = e0.f(i2, s(t, j));
                    iC += iM1;
                    break;
                case 24:
                    iM1 = e0.d(i2, s(t, j));
                    iC += iM1;
                    break;
                case 25:
                    List<?> listS = s(t, j);
                    Class<?> cls = e0.a;
                    int size2 = listS.size();
                    iC += size2 == 0 ? 0 : (CodedOutputStream.R1(i2) + 1) * size2;
                    break;
                case 26:
                    iM1 = e0.r(i2, s(t, j));
                    iC += iM1;
                    break;
                case 27:
                    iM1 = e0.m(i2, s(t, j), n(i));
                    iC += iM1;
                    break;
                case 28:
                    iM1 = e0.a(i2, s(t, j));
                    iC += iM1;
                    break;
                case 29:
                    iM1 = e0.s(i2, s(t, j));
                    iC += iM1;
                    break;
                case RendererMetrics.SAMPLES /* 30 */:
                    iM1 = e0.b(i2, s(t, j));
                    iC += iM1;
                    break;
                case 31:
                    iM1 = e0.d(i2, s(t, j));
                    iC += iM1;
                    break;
                case 32:
                    iM1 = e0.f(i2, s(t, j));
                    iC += iM1;
                    break;
                case 33:
                    iM1 = e0.n(i2, s(t, j));
                    iC += iM1;
                    break;
                case 34:
                    iM1 = e0.p(i2, s(t, j));
                    iC += iM1;
                    break;
                case 35:
                    int iG5 = e0.g((List) unsafe.getObject(t, j));
                    if (iG5 > 0) {
                        iC = defpackage.b0.c(iG5, CodedOutputStream.R1(i2), iG5, iC);
                    }
                    break;
                case 36:
                    int iE = e0.e((List) unsafe.getObject(t, j));
                    if (iE > 0) {
                        iC = defpackage.b0.c(iE, CodedOutputStream.R1(i2), iE, iC);
                    }
                    break;
                case 37:
                    int iK = e0.k((List) unsafe.getObject(t, j));
                    if (iK > 0) {
                        iC = defpackage.b0.c(iK, CodedOutputStream.R1(i2), iK, iC);
                    }
                    break;
                case 38:
                    int iV = e0.v((List) unsafe.getObject(t, j));
                    if (iV > 0) {
                        iC = defpackage.b0.c(iV, CodedOutputStream.R1(i2), iV, iC);
                    }
                    break;
                case 39:
                    int i4 = e0.i((List) unsafe.getObject(t, j));
                    if (i4 > 0) {
                        iC = defpackage.b0.c(i4, CodedOutputStream.R1(i2), i4, iC);
                    }
                    break;
                case 40:
                    int iG6 = e0.g((List) unsafe.getObject(t, j));
                    if (iG6 > 0) {
                        iC = defpackage.b0.c(iG6, CodedOutputStream.R1(i2), iG6, iC);
                    }
                    break;
                case 41:
                    int iE2 = e0.e((List) unsafe.getObject(t, j));
                    if (iE2 > 0) {
                        iC = defpackage.b0.c(iE2, CodedOutputStream.R1(i2), iE2, iC);
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(t, j);
                    Class<?> cls2 = e0.a;
                    int size3 = list.size();
                    if (size3 > 0) {
                        iC = defpackage.b0.c(size3, CodedOutputStream.R1(i2), size3, iC);
                    }
                    break;
                case 43:
                    int iT = e0.t((List) unsafe.getObject(t, j));
                    if (iT > 0) {
                        iC = defpackage.b0.c(iT, CodedOutputStream.R1(i2), iT, iC);
                    }
                    break;
                case 44:
                    int iC2 = e0.c((List) unsafe.getObject(t, j));
                    if (iC2 > 0) {
                        iC = defpackage.b0.c(iC2, CodedOutputStream.R1(i2), iC2, iC);
                    }
                    break;
                case 45:
                    int iE3 = e0.e((List) unsafe.getObject(t, j));
                    if (iE3 > 0) {
                        iC = defpackage.b0.c(iE3, CodedOutputStream.R1(i2), iE3, iC);
                    }
                    break;
                case 46:
                    int iG7 = e0.g((List) unsafe.getObject(t, j));
                    if (iG7 > 0) {
                        iC = defpackage.b0.c(iG7, CodedOutputStream.R1(i2), iG7, iC);
                    }
                    break;
                case 47:
                    int iO = e0.o((List) unsafe.getObject(t, j));
                    if (iO > 0) {
                        iC = defpackage.b0.c(iO, CodedOutputStream.R1(i2), iO, iC);
                    }
                    break;
                case 48:
                    int iQ = e0.q((List) unsafe.getObject(t, j));
                    if (iQ > 0) {
                        iC = defpackage.b0.c(iQ, CodedOutputStream.R1(i2), iQ, iC);
                    }
                    break;
                case 49:
                    List<?> listS2 = s(t, j);
                    uod uodVarN = n(i);
                    Class<?> cls3 = e0.a;
                    int size4 = listS2.size();
                    if (size4 == 0) {
                        iN1 = 0;
                    } else {
                        iN1 = 0;
                        for (int i5 = 0; i5 < size4; i5++) {
                            iN1 += CodedOutputStream.N1(i2, (sp9) listS2.get(i5), uodVarN);
                        }
                    }
                    iC += iN1;
                    break;
                case 50:
                    iM1 = this.p.g(i2, f7g.d.i(t, j), m(i));
                    iC += iM1;
                    break;
                case 51:
                    if (r(t, i2, i)) {
                        iC = w20.c(i2, 8, iC);
                    }
                    break;
                case 52:
                    if (r(t, i2, i)) {
                        iC = w20.c(i2, 4, iC);
                    }
                    break;
                case 53:
                    if (r(t, i2, i)) {
                        long jA = A(t, j);
                        iR1 = CodedOutputStream.R1(i2);
                        iU1 = CodedOutputStream.U1(jA);
                        iM1 = iU1 + iR1;
                        iC += iM1;
                    }
                    break;
                case 54:
                    if (r(t, i2, i)) {
                        long jA2 = A(t, j);
                        iR1 = CodedOutputStream.R1(i2);
                        iU1 = CodedOutputStream.U1(jA2);
                        iM1 = iU1 + iR1;
                        iC += iM1;
                    }
                    break;
                case RumViewScope.SLOW_RENDERED_THRESHOLD_FPS /* 55 */:
                    if (r(t, i2, i)) {
                        int iZ = z(t, j);
                        iR12 = CodedOutputStream.R1(i2);
                        iO1 = CodedOutputStream.O1(iZ);
                        iM1 = iO1 + iR12;
                        iC += iM1;
                    }
                    break;
                case 56:
                    if (r(t, i2, i)) {
                        iM1 = CodedOutputStream.M1(i2);
                        iC += iM1;
                    }
                    break;
                case 57:
                    if (r(t, i2, i)) {
                        iM1 = CodedOutputStream.L1(i2);
                        iC += iM1;
                    }
                    break;
                case 58:
                    if (r(t, i2, i)) {
                        iC = w20.c(i2, 1, iC);
                    }
                    break;
                case 59:
                    if (r(t, i2, i)) {
                        Object objI2 = f7g.d.i(t, j);
                        if (objI2 instanceof tr1) {
                            int iR16 = CodedOutputStream.R1(i2);
                            int size5 = ((tr1) objI2).size();
                            iC = defpackage.b0.c(size5, size5, iR16, iC);
                        } else {
                            iR13 = CodedOutputStream.R1(i2);
                            iQ1 = CodedOutputStream.Q1((String) objI2);
                            iC = iQ1 + iR13 + iC;
                        }
                    }
                    break;
                case 60:
                    if (r(t, i2, i)) {
                        iM1 = e0.l(i2, f7g.d.i(t, j), n(i));
                        iC += iM1;
                    }
                    break;
                case 61:
                    if (r(t, i2, i)) {
                        iM1 = CodedOutputStream.J1(i2, (tr1) f7g.d.i(t, j));
                        iC += iM1;
                    }
                    break;
                case 62:
                    if (r(t, i2, i)) {
                        iM1 = CodedOutputStream.S1(i2, z(t, j));
                        iC += iM1;
                    }
                    break;
                case AndroidTracer.SPAN_ID_BIT_SIZE /* 63 */:
                    if (r(t, i2, i)) {
                        int iZ2 = z(t, j);
                        iR12 = CodedOutputStream.R1(i2);
                        iO1 = CodedOutputStream.O1(iZ2);
                        iM1 = iO1 + iR12;
                        iC += iM1;
                    }
                    break;
                case 64:
                    if (r(t, i2, i)) {
                        iC = w20.c(i2, 4, iC);
                    }
                    break;
                case 65:
                    if (r(t, i2, i)) {
                        iC = w20.c(i2, 8, iC);
                    }
                    break;
                case 66:
                    if (r(t, i2, i)) {
                        int iZ3 = z(t, j);
                        iR12 = CodedOutputStream.R1(i2);
                        iO1 = CodedOutputStream.T1((iZ3 >> 31) ^ (iZ3 << 1));
                        iM1 = iO1 + iR12;
                        iC += iM1;
                    }
                    break;
                case 67:
                    if (r(t, i2, i)) {
                        long jA3 = A(t, j);
                        iR14 = CodedOutputStream.R1(i2);
                        iU12 = CodedOutputStream.U1((jA3 >> 63) ^ (jA3 << 1));
                        iM1 = iU12 + iR14;
                        iC += iM1;
                    }
                    break;
                case 68:
                    if (r(t, i2, i)) {
                        iM1 = CodedOutputStream.N1(i2, (sp9) f7g.d.i(t, j), n(i));
                        iC += iM1;
                    }
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(int r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.z.q(int, java.lang.Object):boolean");
    }

    public final boolean r(T t, int i, int i2) {
        return f7g.d.g(t, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    public final <K, V> void t(Object obj, int i, Object obj2, i iVar, d0 d0Var) {
        long jG = G(i) & 1048575;
        Object objI = f7g.d.i(obj, jG);
        w wVar = this.p;
        if (objI == null) {
            objI = wVar.f();
            f7g.o(obj, jG, objI);
        } else if (wVar.h(objI)) {
            v vVarF = wVar.f();
            wVar.a(vVarF, objI);
            f7g.o(obj, jG, vVarF);
            objI = vVarF;
        }
        d0Var.A(wVar.c(objI), wVar.b(obj2), iVar);
    }

    public final void u(int i, Object obj, Object obj2) {
        long jG = G(i) & 1048575;
        if (q(i, obj2)) {
            f7g.e eVar = f7g.d;
            Object objI = eVar.i(obj, jG);
            Object objI2 = eVar.i(obj2, jG);
            if (objI != null && objI2 != null) {
                f7g.o(obj, jG, p.c(objI, objI2));
                D(i, obj);
            } else if (objI2 != null) {
                f7g.o(obj, jG, objI2);
                D(i, obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(int i, Object obj, Object obj2) {
        int iG = G(i);
        int i2 = this.a[i];
        long j = iG & 1048575;
        if (r(obj2, i2, i)) {
            f7g.e eVar = f7g.d;
            Object objI = eVar.i(obj, j);
            Object objI2 = eVar.i(obj2, j);
            if (objI != null && objI2 != null) {
                f7g.o(obj, j, p.c(objI, objI2));
                E(obj, i2, i);
            } else if (objI2 != null) {
                f7g.o(obj, j, objI2);
                E(obj, i2, i);
            }
        }
    }
}
