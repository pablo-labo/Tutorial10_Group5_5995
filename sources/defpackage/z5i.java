package defpackage;

import com.google.android.gms.internal.measurement.zzev;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class z5i {
    public static final Class<?> a;
    public static final b8i<?, ?> b;
    public static final b8i<?, ?> c;
    public static final e8i d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = d(false);
        c = d(true);
        d = new e8i();
    }

    public static int A(List<?> list) {
        return list.size() << 2;
    }

    public static void B(int i, List<Integer> list, hai haiVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzev zzevVar = ((qwh) haiVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzevVar.V1(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        zzevVar.L1(i, 2);
        int iG2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iG2 += zzev.g2(list.get(i3).intValue());
        }
        zzevVar.U1(iG2);
        while (i2 < list.size()) {
            zzevVar.K1(list.get(i2).intValue());
            i2++;
        }
    }

    public static int C(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzev.h2(i) * size;
    }

    public static int D(List<?> list) {
        return list.size() << 3;
    }

    public static void E(int i, List<Integer> list, hai haiVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzev zzevVar = ((qwh) haiVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzevVar.Z1(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        zzevVar.L1(i, 2);
        int iJ2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ2 += zzev.j2(list.get(i3).intValue());
        }
        zzevVar.U1(iJ2);
        while (i2 < list.size()) {
            zzevVar.U1(list.get(i2).intValue());
            i2++;
        }
    }

    public static void F(int i, List<Integer> list, hai haiVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzev zzevVar = ((qwh) haiVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = list.get(i2).intValue();
                zzevVar.Z1(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        zzevVar.L1(i, 2);
        int iJ2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = list.get(i3).intValue();
            iJ2 += zzev.j2((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        zzevVar.U1(iJ2);
        while (i2 < list.size()) {
            int iIntValue3 = list.get(i2).intValue();
            zzevVar.U1((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    public static void G(int i, List<Integer> list, hai haiVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzev zzevVar = ((qwh) haiVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzevVar.f2(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        zzevVar.L1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = zzev.e;
            i3 += 4;
        }
        zzevVar.U1(i3);
        while (i2 < list.size()) {
            zzevVar.c2(list.get(i2).intValue());
            i2++;
        }
    }

    public static void H(int i, List<Integer> list, hai haiVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzev zzevVar = ((qwh) haiVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzevVar.f2(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        zzevVar.L1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = zzev.e;
            i3 += 4;
        }
        zzevVar.U1(i3);
        while (i2 < list.size()) {
            zzevVar.c2(list.get(i2).intValue());
            i2++;
        }
    }

    public static void I(int i, List<Integer> list, hai haiVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzev zzevVar = ((qwh) haiVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzevVar.V1(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        zzevVar.L1(i, 2);
        int iG2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iG2 += zzev.g2(list.get(i3).intValue());
        }
        zzevVar.U1(iG2);
        while (i2 < list.size()) {
            zzevVar.K1(list.get(i2).intValue());
            i2++;
        }
    }

    public static void J(int i, List<Boolean> list, hai haiVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzev zzevVar = ((qwh) haiVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzevVar.R1(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        zzevVar.L1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = zzev.e;
            i3++;
        }
        zzevVar.U1(i3);
        while (i2 < list.size()) {
            zzevVar.J1(list.get(i2).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int a(int i, Object obj, w5i w5iVar) {
        if (obj instanceof b1i) {
            int iD2 = zzev.d2(i);
            int iA = ((b1i) obj).a();
            return zzev.j2(iA) + iA + iD2;
        }
        int iD22 = zzev.d2(i);
        zth zthVar = (zth) ((l3i) obj);
        int iH = zthVar.h();
        if (iH == -1) {
            iH = w5iVar.c(zthVar);
            zthVar.i(iH);
        }
        return zzev.j2(iH) + iH + iD22;
    }

    public static int b(int i, List<?> list, w5i w5iVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iD2 = zzev.d2(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof b1i) {
                int iA = ((b1i) obj).a();
                iD2 = zzev.j2(iA) + iA + iD2;
            } else {
                zth zthVar = (zth) ((l3i) obj);
                int iH = zthVar.h();
                if (iH == -1) {
                    iH = w5iVar.c(zthVar);
                    zthVar.i(iH);
                }
                iD2 = zzev.j2(iH) + iH + iD2;
            }
        }
        return iD2;
    }

    public static int c(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof b2i)) {
            int iE2 = 0;
            while (i < size) {
                iE2 += zzev.e2(list.get(i).longValue());
                i++;
            }
            return iE2;
        }
        b2i b2iVar = (b2i) list;
        int iE22 = 0;
        while (i < size) {
            b2iVar.c(i);
            iE22 += zzev.e2(b2iVar.b[i]);
            i++;
        }
        return iE22;
    }

    public static b8i<?, ?> d(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (b8i) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void e(int i, List<String> list, hai haiVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzev zzevVar = ((qwh) haiVar).a;
        int i2 = 0;
        if (!(list instanceof q1i)) {
            while (i2 < list.size()) {
                zzevVar.N1(i, list.get(i2));
                i2++;
            }
            return;
        }
        q1i q1iVar = (q1i) list;
        while (i2 < list.size()) {
            Object objP = q1iVar.P(i2);
            if (objP instanceof String) {
                zzevVar.N1(i, (String) objP);
            } else {
                zzevVar.O1(i, (fvh) objP);
            }
            i2++;
        }
    }

    public static void f(int i, List<?> list, hai haiVar, w5i w5iVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        qwh qwhVar = (qwh) haiVar;
        qwhVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            qwhVar.a.Q1(i, (l3i) list.get(i2), w5iVar);
        }
    }

    public static void g(int i, List<Double> list, hai haiVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzev zzevVar = ((qwh) haiVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = list.get(i2).doubleValue();
                zzevVar.getClass();
                zzevVar.a2(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        zzevVar.L1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = zzev.e;
            i3 += 8;
        }
        zzevVar.U1(i3);
        while (i2 < list.size()) {
            zzevVar.b2(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    public static <T, FT extends cyh<FT>> void h(qxh<FT> qxhVar, T t, T t2) {
        d6i d6iVar = qxhVar.b(t2).a;
        if (d6iVar.isEmpty()) {
            return;
        }
        uxh<T> uxhVarF = qxhVar.f(t);
        uxhVarF.getClass();
        if (d6iVar.b.size() > 0) {
            uxhVarF.b(d6iVar.f(0));
            throw null;
        }
        Iterator<T> it = d6iVar.h().iterator();
        if (it.hasNext()) {
            uxhVarF.b((Map.Entry) it.next());
            throw null;
        }
    }

    public static boolean i(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int j(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iD2 = zzev.d2(i) * size;
        if (!(list instanceof q1i)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof fvh) {
                    int iB = ((fvh) obj).b();
                    iD2 = zzev.j2(iB) + iB + iD2;
                } else {
                    iD2 = zzev.T1((String) obj) + iD2;
                }
                i2++;
            }
            return iD2;
        }
        q1i q1iVar = (q1i) list;
        while (i2 < size) {
            Object objP = q1iVar.P(i2);
            if (objP instanceof fvh) {
                int iB2 = ((fvh) objP).b();
                iD2 = zzev.j2(iB2) + iB2 + iD2;
            } else {
                iD2 = zzev.T1((String) objP) + iD2;
            }
            i2++;
        }
        return iD2;
    }

    public static int k(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof b2i)) {
            int iE2 = 0;
            while (i < size) {
                iE2 += zzev.e2(list.get(i).longValue());
                i++;
            }
            return iE2;
        }
        b2i b2iVar = (b2i) list;
        int iE22 = 0;
        while (i < size) {
            b2iVar.c(i);
            iE22 += zzev.e2(b2iVar.b[i]);
            i++;
        }
        return iE22;
    }

    public static void l(int i, List<fvh> list, hai haiVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        qwh qwhVar = (qwh) haiVar;
        qwhVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            qwhVar.a.O1(i, list.get(i2));
        }
    }

    public static void m(int i, List<?> list, hai haiVar, w5i w5iVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        qwh qwhVar = (qwh) haiVar;
        qwhVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            qwhVar.b(i, list.get(i2), w5iVar);
        }
    }

    public static void n(int i, List<Float> list, hai haiVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzev zzevVar = ((qwh) haiVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = list.get(i2).floatValue();
                zzevVar.getClass();
                zzevVar.f2(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        zzevVar.L1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = zzev.e;
            i3 += 4;
        }
        zzevVar.U1(i3);
        while (i2 < list.size()) {
            zzevVar.c2(Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    public static int o(int i, List<fvh> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iD2 = zzev.d2(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int iB = list.get(i2).b();
            iD2 += zzev.j2(iB) + iB;
        }
        return iD2;
    }

    public static int p(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof b2i)) {
            int iE2 = 0;
            while (i < size) {
                long jLongValue = list.get(i).longValue();
                iE2 += zzev.e2((jLongValue >> 63) ^ (jLongValue << 1));
                i++;
            }
            return iE2;
        }
        b2i b2iVar = (b2i) list;
        int iE22 = 0;
        while (i < size) {
            b2iVar.c(i);
            long j = b2iVar.b[i];
            iE22 += zzev.e2((j >> 63) ^ (j << 1));
            i++;
        }
        return iE22;
    }

    public static void q(int i, List<Long> list, hai haiVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzev zzevVar = ((qwh) haiVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzevVar.M1(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        zzevVar.L1(i, 2);
        int iE2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iE2 += zzev.e2(list.get(i3).longValue());
        }
        zzevVar.U1(iE2);
        while (i2 < list.size()) {
            zzevVar.S1(list.get(i2).longValue());
            i2++;
        }
    }

    public static int r(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof gzh)) {
            int iG2 = 0;
            while (i < size) {
                iG2 += zzev.g2(list.get(i).intValue());
                i++;
            }
            return iG2;
        }
        gzh gzhVar = (gzh) list;
        int iG22 = 0;
        while (i < size) {
            gzhVar.c(i);
            iG22 += zzev.g2(gzhVar.b[i]);
            i++;
        }
        return iG22;
    }

    public static void s(int i, List<Long> list, hai haiVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzev zzevVar = ((qwh) haiVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzevVar.M1(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        zzevVar.L1(i, 2);
        int iE2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iE2 += zzev.e2(list.get(i3).longValue());
        }
        zzevVar.U1(iE2);
        while (i2 < list.size()) {
            zzevVar.S1(list.get(i2).longValue());
            i2++;
        }
    }

    public static int t(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof gzh)) {
            int iG2 = 0;
            while (i < size) {
                iG2 += zzev.g2(list.get(i).intValue());
                i++;
            }
            return iG2;
        }
        gzh gzhVar = (gzh) list;
        int iG22 = 0;
        while (i < size) {
            gzhVar.c(i);
            iG22 += zzev.g2(gzhVar.b[i]);
            i++;
        }
        return iG22;
    }

    public static void u(int i, List<Long> list, hai haiVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzev zzevVar = ((qwh) haiVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = list.get(i2).longValue();
                zzevVar.M1(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        zzevVar.L1(i, 2);
        int iE2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = list.get(i3).longValue();
            iE2 += zzev.e2((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        zzevVar.U1(iE2);
        while (i2 < list.size()) {
            long jLongValue3 = list.get(i2).longValue();
            zzevVar.S1((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static int v(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof gzh)) {
            int iJ2 = 0;
            while (i < size) {
                iJ2 += zzev.j2(list.get(i).intValue());
                i++;
            }
            return iJ2;
        }
        gzh gzhVar = (gzh) list;
        int iJ22 = 0;
        while (i < size) {
            gzhVar.c(i);
            iJ22 += zzev.j2(gzhVar.b[i]);
            i++;
        }
        return iJ22;
    }

    public static void w(int i, List<Long> list, hai haiVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzev zzevVar = ((qwh) haiVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzevVar.a2(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        zzevVar.L1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = zzev.e;
            i3 += 8;
        }
        zzevVar.U1(i3);
        while (i2 < list.size()) {
            zzevVar.b2(list.get(i2).longValue());
            i2++;
        }
    }

    public static int x(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof gzh)) {
            int iJ2 = 0;
            while (i < size) {
                int iIntValue = list.get(i).intValue();
                iJ2 += zzev.j2((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
            return iJ2;
        }
        gzh gzhVar = (gzh) list;
        int iJ22 = 0;
        while (i < size) {
            gzhVar.c(i);
            int i2 = gzhVar.b[i];
            iJ22 += zzev.j2((i2 >> 31) ^ (i2 << 1));
            i++;
        }
        return iJ22;
    }

    public static void y(int i, List<Long> list, hai haiVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzev zzevVar = ((qwh) haiVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzevVar.a2(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        zzevVar.L1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = zzev.e;
            i3 += 8;
        }
        zzevVar.U1(i3);
        while (i2 < list.size()) {
            zzevVar.b2(list.get(i2).longValue());
            i2++;
        }
    }

    public static int z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzev.k2(i) * size;
    }
}
