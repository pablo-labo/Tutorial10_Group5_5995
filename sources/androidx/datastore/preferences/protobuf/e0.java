package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.l;
import androidx.datastore.preferences.protobuf.p;
import defpackage.kn8;
import defpackage.ot8;
import defpackage.sp9;
import defpackage.tr1;
import defpackage.uod;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public static final Class<?> a;
    public static final h0<?, ?> b;
    public static final h0<?, ?> c;
    public static final j0 d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = x(false);
        c = x(true);
        d = new j0();
    }

    public static <UT, UB> UB A(int i, int i2, UB ub, h0<UT, UB> h0Var) {
        if (ub == null) {
            ub = (UB) h0Var.m();
        }
        h0Var.e(ub, i, i2);
        return ub;
    }

    public static void B(int i, List<Boolean> list, k0 k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((g) k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.X1(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        codedOutputStream.n2(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = CodedOutputStream.e;
            i3++;
        }
        codedOutputStream.p2(i3);
        while (i2 < list.size()) {
            codedOutputStream.W1(list.get(i2).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void C(int i, List<tr1> list, k0 k0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g gVar = (g) k0Var;
        gVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            gVar.a.Z1(i, list.get(i2));
        }
    }

    public static void D(int i, List<Double> list, k0 k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((g) k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = list.get(i2).doubleValue();
                codedOutputStream.getClass();
                codedOutputStream.d2(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        codedOutputStream.n2(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = CodedOutputStream.e;
            i3 += 8;
        }
        codedOutputStream.p2(i3);
        while (i2 < list.size()) {
            codedOutputStream.e2(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    public static void E(int i, List<Integer> list, k0 k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((g) k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.f2(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.n2(i, 2);
        int iO1 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iO1 += CodedOutputStream.O1(list.get(i3).intValue());
        }
        codedOutputStream.p2(iO1);
        while (i2 < list.size()) {
            codedOutputStream.g2(list.get(i2).intValue());
            i2++;
        }
    }

    public static void F(int i, List<Integer> list, k0 k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((g) k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.b2(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.n2(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = CodedOutputStream.e;
            i3 += 4;
        }
        codedOutputStream.p2(i3);
        while (i2 < list.size()) {
            codedOutputStream.c2(list.get(i2).intValue());
            i2++;
        }
    }

    public static void G(int i, List<Long> list, k0 k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((g) k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.d2(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.n2(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = CodedOutputStream.e;
            i3 += 8;
        }
        codedOutputStream.p2(i3);
        while (i2 < list.size()) {
            codedOutputStream.e2(list.get(i2).longValue());
            i2++;
        }
    }

    public static void H(int i, List<Float> list, k0 k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((g) k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = list.get(i2).floatValue();
                codedOutputStream.getClass();
                codedOutputStream.b2(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        codedOutputStream.n2(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = CodedOutputStream.e;
            i3 += 4;
        }
        codedOutputStream.p2(i3);
        while (i2 < list.size()) {
            codedOutputStream.c2(Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    public static void I(int i, List<?> list, k0 k0Var, uod uodVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g gVar = (g) k0Var;
        gVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            gVar.b(i, list.get(i2), uodVar);
        }
    }

    public static void J(int i, List<Integer> list, k0 k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((g) k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.f2(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.n2(i, 2);
        int iO1 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iO1 += CodedOutputStream.O1(list.get(i3).intValue());
        }
        codedOutputStream.p2(iO1);
        while (i2 < list.size()) {
            codedOutputStream.g2(list.get(i2).intValue());
            i2++;
        }
    }

    public static void K(int i, List<Long> list, k0 k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((g) k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.q2(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.n2(i, 2);
        int iU1 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iU1 += CodedOutputStream.U1(list.get(i3).longValue());
        }
        codedOutputStream.p2(iU1);
        while (i2 < list.size()) {
            codedOutputStream.r2(list.get(i2).longValue());
            i2++;
        }
    }

    public static void L(int i, List<?> list, k0 k0Var, uod uodVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g gVar = (g) k0Var;
        gVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            gVar.a.h2(i, (sp9) list.get(i2), uodVar);
        }
    }

    public static void M(int i, List<Integer> list, k0 k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((g) k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.b2(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.n2(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = CodedOutputStream.e;
            i3 += 4;
        }
        codedOutputStream.p2(i3);
        while (i2 < list.size()) {
            codedOutputStream.c2(list.get(i2).intValue());
            i2++;
        }
    }

    public static void N(int i, List<Long> list, k0 k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((g) k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.d2(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.n2(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = CodedOutputStream.e;
            i3 += 8;
        }
        codedOutputStream.p2(i3);
        while (i2 < list.size()) {
            codedOutputStream.e2(list.get(i2).longValue());
            i2++;
        }
    }

    public static void O(int i, List<Integer> list, k0 k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((g) k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = list.get(i2).intValue();
                codedOutputStream.o2(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        codedOutputStream.n2(i, 2);
        int iT1 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = list.get(i3).intValue();
            iT1 += CodedOutputStream.T1((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        codedOutputStream.p2(iT1);
        while (i2 < list.size()) {
            int iIntValue3 = list.get(i2).intValue();
            codedOutputStream.p2((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    public static void P(int i, List<Long> list, k0 k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((g) k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = list.get(i2).longValue();
                codedOutputStream.q2(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        codedOutputStream.n2(i, 2);
        int iU1 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = list.get(i3).longValue();
            iU1 += CodedOutputStream.U1((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        codedOutputStream.p2(iU1);
        while (i2 < list.size()) {
            long jLongValue3 = list.get(i2).longValue();
            codedOutputStream.r2((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void Q(int i, List<String> list, k0 k0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((g) k0Var).a;
        int i2 = 0;
        if (!(list instanceof ot8)) {
            while (i2 < list.size()) {
                codedOutputStream.l2(i, list.get(i2));
                i2++;
            }
            return;
        }
        ot8 ot8Var = (ot8) list;
        while (i2 < list.size()) {
            Object objJ1 = ot8Var.J1(i2);
            if (objJ1 instanceof String) {
                codedOutputStream.l2(i, (String) objJ1);
            } else {
                codedOutputStream.Z1(i, (tr1) objJ1);
            }
            i2++;
        }
    }

    public static void R(int i, List<Integer> list, k0 k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((g) k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.o2(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.n2(i, 2);
        int iT1 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iT1 += CodedOutputStream.T1(list.get(i3).intValue());
        }
        codedOutputStream.p2(iT1);
        while (i2 < list.size()) {
            codedOutputStream.p2(list.get(i2).intValue());
            i2++;
        }
    }

    public static void S(int i, List<Long> list, k0 k0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((g) k0Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.q2(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.n2(i, 2);
        int iU1 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iU1 += CodedOutputStream.U1(list.get(i3).longValue());
        }
        codedOutputStream.p2(iU1);
        while (i2 < list.size()) {
            codedOutputStream.r2(list.get(i2).longValue());
            i2++;
        }
    }

    public static int a(int i, List<tr1> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR1 = CodedOutputStream.R1(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iR1 += CodedOutputStream.K1(list.get(i2));
        }
        return iR1;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.R1(i) * size) + c(list);
    }

    public static int c(List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof o) {
            o oVar = (o) list;
            if (size <= 0) {
                return 0;
            }
            oVar.c(0);
            throw null;
        }
        int iO1 = 0;
        for (int i = 0; i < size; i++) {
            iO1 += CodedOutputStream.O1(list.get(i).intValue());
        }
        return iO1;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.L1(i) * size;
    }

    public static int e(List<?> list) {
        return list.size() * 4;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.M1(i) * size;
    }

    public static int g(List<?> list) {
        return list.size() * 8;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.R1(i) * size) + i(list);
    }

    public static int i(List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof o) {
            o oVar = (o) list;
            if (size <= 0) {
                return 0;
            }
            oVar.c(0);
            throw null;
        }
        int iO1 = 0;
        for (int i = 0; i < size; i++) {
            iO1 += CodedOutputStream.O1(list.get(i).intValue());
        }
        return iO1;
    }

    public static int j(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (CodedOutputStream.R1(i) * list.size()) + k(list);
    }

    public static int k(List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof t) {
            t tVar = (t) list;
            if (size <= 0) {
                return 0;
            }
            tVar.c(0);
            throw null;
        }
        int iU1 = 0;
        for (int i = 0; i < size; i++) {
            iU1 += CodedOutputStream.U1(list.get(i).longValue());
        }
        return iU1;
    }

    public static int l(int i, Object obj, uod uodVar) {
        if (obj instanceof kn8) {
            return CodedOutputStream.P1((kn8) obj) + CodedOutputStream.R1(i);
        }
        int iR1 = CodedOutputStream.R1(i);
        int iB = ((a) ((sp9) obj)).b(uodVar);
        return CodedOutputStream.T1(iB) + iB + iR1;
    }

    public static int m(int i, List<?> list, uod uodVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR1 = CodedOutputStream.R1(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof kn8) {
                iR1 = CodedOutputStream.P1((kn8) obj) + iR1;
            } else {
                int iB = ((a) ((sp9) obj)).b(uodVar);
                iR1 = CodedOutputStream.T1(iB) + iB + iR1;
            }
        }
        return iR1;
    }

    public static int n(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.R1(i) * size) + o(list);
    }

    public static int o(List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof o) {
            o oVar = (o) list;
            if (size <= 0) {
                return 0;
            }
            oVar.c(0);
            throw null;
        }
        int iT1 = 0;
        for (int i = 0; i < size; i++) {
            int iIntValue = list.get(i).intValue();
            iT1 += CodedOutputStream.T1((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iT1;
    }

    public static int p(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.R1(i) * size) + q(list);
    }

    public static int q(List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof t) {
            t tVar = (t) list;
            if (size <= 0) {
                return 0;
            }
            tVar.c(0);
            throw null;
        }
        int iU1 = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = list.get(i).longValue();
            iU1 += CodedOutputStream.U1((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iU1;
    }

    public static int r(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iR1 = CodedOutputStream.R1(i) * size;
        if (!(list instanceof ot8)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof tr1) {
                    int size2 = ((tr1) obj).size();
                    iR1 = CodedOutputStream.T1(size2) + size2 + iR1;
                } else {
                    iR1 = CodedOutputStream.Q1((String) obj) + iR1;
                }
                i2++;
            }
            return iR1;
        }
        ot8 ot8Var = (ot8) list;
        while (i2 < size) {
            Object objJ1 = ot8Var.J1(i2);
            if (objJ1 instanceof tr1) {
                int size3 = ((tr1) objJ1).size();
                iR1 = CodedOutputStream.T1(size3) + size3 + iR1;
            } else {
                iR1 = CodedOutputStream.Q1((String) objJ1) + iR1;
            }
            i2++;
        }
        return iR1;
    }

    public static int s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.R1(i) * size) + t(list);
    }

    public static int t(List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof o) {
            o oVar = (o) list;
            if (size <= 0) {
                return 0;
            }
            oVar.c(0);
            throw null;
        }
        int iT1 = 0;
        for (int i = 0; i < size; i++) {
            iT1 += CodedOutputStream.T1(list.get(i).intValue());
        }
        return iT1;
    }

    public static int u(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.R1(i) * size) + v(list);
    }

    public static int v(List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof t) {
            t tVar = (t) list;
            if (size <= 0) {
                return 0;
            }
            tVar.c(0);
            throw null;
        }
        int iU1 = 0;
        for (int i = 0; i < size; i++) {
            iU1 += CodedOutputStream.U1(list.get(i).longValue());
        }
        return iU1;
    }

    public static <UT, UB> UB w(int i, List<Integer> list, p.b bVar, UB ub, h0<UT, UB> h0Var) {
        if (bVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!bVar.a()) {
                    ub = (UB) A(i, iIntValue, ub, h0Var);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = list.get(i3);
            int iIntValue2 = num.intValue();
            if (bVar.a()) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                ub = (UB) A(i, iIntValue2, ub, h0Var);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    public static h0<?, ?> x(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (h0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static <T, FT extends l.a<FT>> void y(j<FT> jVar, T t, T t2) {
        f0 f0Var = jVar.c(t2).a;
        if (f0Var.isEmpty()) {
            return;
        }
        l<T> lVarD = jVar.d(t);
        lVarD.getClass();
        if (f0Var.b.size() > 0) {
            lVarD.h(f0Var.d(0));
            throw null;
        }
        Iterator<Map.Entry<Object, Object>> it = f0Var.f().iterator();
        if (it.hasNext()) {
            lVarD.h(it.next());
            throw null;
        }
    }

    public static boolean z(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
