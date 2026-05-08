package defpackage;

import com.google.android.gms.internal.play_billing.b;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o3i {
    public static final beb a;

    static {
        y2i y2iVar = y2i.c;
        a = new beb();
    }

    public static void a(int i, List list, h6i h6iVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b bVar = ((wvh) h6iVar).a;
        int i2 = 0;
        if (!(list instanceof ryh)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    bVar.r(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            bVar.q(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iB += b.b((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            bVar.s(iB);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                bVar.s((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        ryh ryhVar = (ryh) list;
        if (!z) {
            while (i2 < ryhVar.c) {
                int iB2 = ryhVar.b(i2);
                bVar.r(i, (iB2 >> 31) ^ (iB2 + iB2));
                i2++;
            }
            return;
        }
        bVar.q(i, 2);
        int iB3 = 0;
        for (int i4 = 0; i4 < ryhVar.c; i4++) {
            int iB4 = ryhVar.b(i4);
            iB3 += b.b((iB4 >> 31) ^ (iB4 + iB4));
        }
        bVar.s(iB3);
        while (i2 < ryhVar.c) {
            int iB5 = ryhVar.b(i2);
            bVar.s((iB5 >> 31) ^ (iB5 + iB5));
            i2++;
        }
    }

    public static void b(int i, List list, h6i h6iVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b bVar = ((wvh) h6iVar).a;
        int i2 = 0;
        if (!(list instanceof z0i)) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    bVar.t(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            bVar.q(i, 2);
            int iC = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iC += b.c((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            bVar.s(iC);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                bVar.u((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        z0i z0iVar = (z0i) list;
        if (!z) {
            while (i2 < z0iVar.c) {
                long jB = z0iVar.b(i2);
                bVar.t(i, (jB >> 63) ^ (jB + jB));
                i2++;
            }
            return;
        }
        bVar.q(i, 2);
        int iC2 = 0;
        for (int i4 = 0; i4 < z0iVar.c; i4++) {
            long jB2 = z0iVar.b(i4);
            iC2 += b.c((jB2 >> 63) ^ (jB2 + jB2));
        }
        bVar.s(iC2);
        while (i2 < z0iVar.c) {
            long jB3 = z0iVar.b(i2);
            bVar.u((jB3 >> 63) ^ (jB3 + jB3));
            i2++;
        }
    }

    public static void c(int i, List list, h6i h6iVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b bVar = ((wvh) h6iVar).a;
        int i2 = 0;
        if (!(list instanceof ryh)) {
            if (!z) {
                while (i2 < list.size()) {
                    bVar.r(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            bVar.q(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += b.b(((Integer) list.get(i3)).intValue());
            }
            bVar.s(iB);
            while (i2 < list.size()) {
                bVar.s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ryh ryhVar = (ryh) list;
        if (!z) {
            while (i2 < ryhVar.c) {
                bVar.r(i, ryhVar.b(i2));
                i2++;
            }
            return;
        }
        bVar.q(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < ryhVar.c; i4++) {
            iB2 += b.b(ryhVar.b(i4));
        }
        bVar.s(iB2);
        while (i2 < ryhVar.c) {
            bVar.s(ryhVar.b(i2));
            i2++;
        }
    }

    public static void d(int i, List list, h6i h6iVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b bVar = ((wvh) h6iVar).a;
        int i2 = 0;
        if (!(list instanceof z0i)) {
            if (!z) {
                while (i2 < list.size()) {
                    bVar.t(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            bVar.q(i, 2);
            int iC = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iC += b.c(((Long) list.get(i3)).longValue());
            }
            bVar.s(iC);
            while (i2 < list.size()) {
                bVar.u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        z0i z0iVar = (z0i) list;
        if (!z) {
            while (i2 < z0iVar.c) {
                bVar.t(i, z0iVar.b(i2));
                i2++;
            }
            return;
        }
        bVar.q(i, 2);
        int iC2 = 0;
        for (int i4 = 0; i4 < z0iVar.c; i4++) {
            iC2 += b.c(z0iVar.b(i4));
        }
        bVar.s(iC2);
        while (i2 < z0iVar.c) {
            bVar.u(z0iVar.b(i2));
            i2++;
        }
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ryh)) {
            int iC = 0;
            while (i < size) {
                iC += b.c(((Integer) list.get(i)).intValue());
                i++;
            }
            return iC;
        }
        ryh ryhVar = (ryh) list;
        int iC2 = 0;
        while (i < size) {
            iC2 += b.c(ryhVar.b(i));
            i++;
        }
        return iC2;
    }

    public static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (b.b(i << 3) + 4) * size;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (b.b(i << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ryh)) {
            int iC = 0;
            while (i < size) {
                iC += b.c(((Integer) list.get(i)).intValue());
                i++;
            }
            return iC;
        }
        ryh ryhVar = (ryh) list;
        int iC2 = 0;
        while (i < size) {
            iC2 += b.c(ryhVar.b(i));
            i++;
        }
        return iC2;
    }

    public static int j(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof z0i)) {
            int iC = 0;
            while (i < size) {
                iC += b.c(((Long) list.get(i)).longValue());
                i++;
            }
            return iC;
        }
        z0i z0iVar = (z0i) list;
        int iC2 = 0;
        while (i < size) {
            iC2 += b.c(z0iVar.b(i));
            i++;
        }
        return iC2;
    }

    public static int k(int i, Object obj, i3i i3iVar) {
        int i2 = i << 3;
        if (obj instanceof zzh) {
            int iB = b.b(i2);
            int iA = ((zzh) obj).a();
            return m6.n(iA, iA, iB);
        }
        int iB2 = b.b(i2);
        int iA2 = ((pth) ((f2i) obj)).a(i3iVar);
        return m6.n(iA2, iA2, iB2);
    }

    public static int l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ryh)) {
            int iB = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iB += b.b((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iB;
        }
        ryh ryhVar = (ryh) list;
        int iB2 = 0;
        while (i < size) {
            int iB3 = ryhVar.b(i);
            iB2 += b.b((iB3 >> 31) ^ (iB3 + iB3));
            i++;
        }
        return iB2;
    }

    public static int m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof z0i)) {
            int iC = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iC += b.c((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iC;
        }
        z0i z0iVar = (z0i) list;
        int iC2 = 0;
        while (i < size) {
            long jB = z0iVar.b(i);
            iC2 += b.c((jB >> 63) ^ (jB + jB));
            i++;
        }
        return iC2;
    }

    public static int n(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ryh)) {
            int iB = 0;
            while (i < size) {
                iB += b.b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iB;
        }
        ryh ryhVar = (ryh) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += b.b(ryhVar.b(i));
            i++;
        }
        return iB2;
    }

    public static int o(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof z0i)) {
            int iC = 0;
            while (i < size) {
                iC += b.c(((Long) list.get(i)).longValue());
                i++;
            }
            return iC;
        }
        z0i z0iVar = (z0i) list;
        int iC2 = 0;
        while (i < size) {
            iC2 += b.c(z0iVar.b(i));
            i++;
        }
        return iC2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void p(Object obj, Object obj2) {
        oyh oyhVar = (oyh) obj;
        c5i c5iVar = oyhVar.zzc;
        c5i c5iVar2 = ((oyh) obj2).zzc;
        c5i c5iVar3 = c5i.f;
        if (!c5iVar3.equals(c5iVar2)) {
            if (c5iVar3.equals(c5iVar)) {
                int i = c5iVar.a + c5iVar2.a;
                int[] iArrCopyOf = Arrays.copyOf(c5iVar.b, i);
                System.arraycopy(c5iVar2.b, 0, iArrCopyOf, c5iVar.a, c5iVar2.a);
                Object[] objArrCopyOf = Arrays.copyOf(c5iVar.c, i);
                System.arraycopy(c5iVar2.c, 0, objArrCopyOf, c5iVar.a, c5iVar2.a);
                c5iVar = new c5i(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                c5iVar.getClass();
                if (!c5iVar2.equals(c5iVar3)) {
                    if (!c5iVar.e) {
                        b0.l();
                        return;
                    }
                    int i2 = c5iVar.a;
                    int i3 = c5iVar2.a + i2;
                    int[] iArr = c5iVar.b;
                    if (i3 > iArr.length) {
                        int i4 = (i2 / 2) + i2;
                        if (i4 < i3) {
                            i4 = i3;
                        }
                        if (i4 < 8) {
                            i4 = 8;
                        }
                        c5iVar.b = Arrays.copyOf(iArr, i4);
                        c5iVar.c = Arrays.copyOf(c5iVar.c, i4);
                    }
                    System.arraycopy(c5iVar2.b, 0, c5iVar.b, c5iVar.a, c5iVar2.a);
                    System.arraycopy(c5iVar2.c, 0, c5iVar.c, c5iVar.a, c5iVar2.a);
                    c5iVar.a = i3;
                }
            }
        }
        oyhVar.zzc = c5iVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void q(int i, List list, h6i h6iVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b bVar = ((wvh) h6iVar).a;
        int i2 = 0;
        if (list instanceof cuh) {
            if (z) {
                bVar.q(i, 2);
                bVar.s(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                bVar.e(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        bVar.q(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        bVar.s(i3);
        while (i2 < list.size()) {
            bVar.d(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void r(int i, List list, h6i h6iVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b bVar = ((wvh) h6iVar).a;
        int i2 = 0;
        if (list instanceof awh) {
            if (z) {
                bVar.q(i, 2);
                bVar.s(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                bVar.i(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        bVar.q(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        bVar.s(i3);
        while (i2 < list.size()) {
            bVar.j(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void s(int i, List list, h6i h6iVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b bVar = ((wvh) h6iVar).a;
        int i2 = 0;
        if (!(list instanceof ryh)) {
            if (!z) {
                while (i2 < list.size()) {
                    bVar.k(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            bVar.q(i, 2);
            int iC = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iC += b.c(((Integer) list.get(i3)).intValue());
            }
            bVar.s(iC);
            while (i2 < list.size()) {
                bVar.l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ryh ryhVar = (ryh) list;
        if (!z) {
            while (i2 < ryhVar.c) {
                bVar.k(i, ryhVar.b(i2));
                i2++;
            }
            return;
        }
        bVar.q(i, 2);
        int iC2 = 0;
        for (int i4 = 0; i4 < ryhVar.c; i4++) {
            iC2 += b.c(ryhVar.b(i4));
        }
        bVar.s(iC2);
        while (i2 < ryhVar.c) {
            bVar.l(ryhVar.b(i2));
            i2++;
        }
    }

    public static void t(int i, List list, h6i h6iVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b bVar = ((wvh) h6iVar).a;
        int i2 = 0;
        if (!(list instanceof ryh)) {
            if (!z) {
                while (i2 < list.size()) {
                    bVar.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            bVar.q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            bVar.s(i3);
            while (i2 < list.size()) {
                bVar.h(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ryh ryhVar = (ryh) list;
        if (!z) {
            while (i2 < ryhVar.c) {
                bVar.g(i, ryhVar.b(i2));
                i2++;
            }
            return;
        }
        bVar.q(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ryhVar.c; i6++) {
            ryhVar.b(i6);
            i5 += 4;
        }
        bVar.s(i5);
        while (i2 < ryhVar.c) {
            bVar.h(ryhVar.b(i2));
            i2++;
        }
    }

    public static void u(int i, List list, h6i h6iVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b bVar = ((wvh) h6iVar).a;
        int i2 = 0;
        if (!(list instanceof z0i)) {
            if (!z) {
                while (i2 < list.size()) {
                    bVar.i(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            bVar.q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            bVar.s(i3);
            while (i2 < list.size()) {
                bVar.j(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        z0i z0iVar = (z0i) list;
        if (!z) {
            while (i2 < z0iVar.c) {
                bVar.i(i, z0iVar.b(i2));
                i2++;
            }
            return;
        }
        bVar.q(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < z0iVar.c; i6++) {
            z0iVar.b(i6);
            i5 += 8;
        }
        bVar.s(i5);
        while (i2 < z0iVar.c) {
            bVar.j(z0iVar.b(i2));
            i2++;
        }
    }

    public static void v(int i, List list, h6i h6iVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b bVar = ((wvh) h6iVar).a;
        int i2 = 0;
        if (list instanceof mxh) {
            if (z) {
                bVar.q(i, 2);
                bVar.s(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                bVar.g(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        bVar.q(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        bVar.s(i3);
        while (i2 < list.size()) {
            bVar.h(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void w(int i, List list, h6i h6iVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b bVar = ((wvh) h6iVar).a;
        int i2 = 0;
        if (!(list instanceof ryh)) {
            if (!z) {
                while (i2 < list.size()) {
                    bVar.k(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            bVar.q(i, 2);
            int iC = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iC += b.c(((Integer) list.get(i3)).intValue());
            }
            bVar.s(iC);
            while (i2 < list.size()) {
                bVar.l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ryh ryhVar = (ryh) list;
        if (!z) {
            while (i2 < ryhVar.c) {
                bVar.k(i, ryhVar.b(i2));
                i2++;
            }
            return;
        }
        bVar.q(i, 2);
        int iC2 = 0;
        for (int i4 = 0; i4 < ryhVar.c; i4++) {
            iC2 += b.c(ryhVar.b(i4));
        }
        bVar.s(iC2);
        while (i2 < ryhVar.c) {
            bVar.l(ryhVar.b(i2));
            i2++;
        }
    }

    public static void x(int i, List list, h6i h6iVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b bVar = ((wvh) h6iVar).a;
        int i2 = 0;
        if (!(list instanceof z0i)) {
            if (!z) {
                while (i2 < list.size()) {
                    bVar.t(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            bVar.q(i, 2);
            int iC = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iC += b.c(((Long) list.get(i3)).longValue());
            }
            bVar.s(iC);
            while (i2 < list.size()) {
                bVar.u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        z0i z0iVar = (z0i) list;
        if (!z) {
            while (i2 < z0iVar.c) {
                bVar.t(i, z0iVar.b(i2));
                i2++;
            }
            return;
        }
        bVar.q(i, 2);
        int iC2 = 0;
        for (int i4 = 0; i4 < z0iVar.c; i4++) {
            iC2 += b.c(z0iVar.b(i4));
        }
        bVar.s(iC2);
        while (i2 < z0iVar.c) {
            bVar.u(z0iVar.b(i2));
            i2++;
        }
    }

    public static void y(int i, List list, h6i h6iVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b bVar = ((wvh) h6iVar).a;
        int i2 = 0;
        if (!(list instanceof ryh)) {
            if (!z) {
                while (i2 < list.size()) {
                    bVar.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            bVar.q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            bVar.s(i3);
            while (i2 < list.size()) {
                bVar.h(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ryh ryhVar = (ryh) list;
        if (!z) {
            while (i2 < ryhVar.c) {
                bVar.g(i, ryhVar.b(i2));
                i2++;
            }
            return;
        }
        bVar.q(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ryhVar.c; i6++) {
            ryhVar.b(i6);
            i5 += 4;
        }
        bVar.s(i5);
        while (i2 < ryhVar.c) {
            bVar.h(ryhVar.b(i2));
            i2++;
        }
    }

    public static void z(int i, List list, h6i h6iVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b bVar = ((wvh) h6iVar).a;
        int i2 = 0;
        if (!(list instanceof z0i)) {
            if (!z) {
                while (i2 < list.size()) {
                    bVar.i(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            bVar.q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            bVar.s(i3);
            while (i2 < list.size()) {
                bVar.j(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        z0i z0iVar = (z0i) list;
        if (!z) {
            while (i2 < z0iVar.c) {
                bVar.i(i, z0iVar.b(i2));
                i2++;
            }
            return;
        }
        bVar.q(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < z0iVar.c; i6++) {
            z0iVar.b(i6);
            i5 += 8;
        }
        bVar.s(i5);
        while (i2 < z0iVar.c) {
            bVar.j(z0iVar.b(i2));
            i2++;
        }
    }
}
