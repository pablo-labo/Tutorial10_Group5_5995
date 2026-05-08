package org.apache.avro;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.ax5;
import defpackage.l5;
import defpackage.t40;
import defpackage.u40;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    public static abstract class a {
        public final org.apache.avro.g a;
        public final org.apache.avro.g b;
        public final EnumC0377a c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: org.apache.avro.f$a$a, reason: collision with other inner class name */
        public static final class EnumC0377a {
            public static final EnumC0377a V;
            public static final EnumC0377a W;
            public static final EnumC0377a X;
            public static final /* synthetic */ EnumC0377a[] Y;
            public static final EnumC0377a a;
            public static final EnumC0377a b;
            public static final EnumC0377a c;
            public static final EnumC0377a d;
            public static final EnumC0377a e;
            public static final EnumC0377a f;

            static {
                EnumC0377a enumC0377a = new EnumC0377a("DO_NOTHING", 0);
                a = enumC0377a;
                EnumC0377a enumC0377a2 = new EnumC0377a("ERROR", 1);
                b = enumC0377a2;
                EnumC0377a enumC0377a3 = new EnumC0377a("PROMOTE", 2);
                c = enumC0377a3;
                EnumC0377a enumC0377a4 = new EnumC0377a("CONTAINER", 3);
                d = enumC0377a4;
                EnumC0377a enumC0377a5 = new EnumC0377a("ENUM", 4);
                e = enumC0377a5;
                EnumC0377a enumC0377a6 = new EnumC0377a("SKIP", 5);
                f = enumC0377a6;
                EnumC0377a enumC0377a7 = new EnumC0377a("RECORD", 6);
                V = enumC0377a7;
                EnumC0377a enumC0377a8 = new EnumC0377a("WRITER_UNION", 7);
                W = enumC0377a8;
                EnumC0377a enumC0377a9 = new EnumC0377a("READER_UNION", 8);
                X = enumC0377a9;
                Y = new EnumC0377a[]{enumC0377a, enumC0377a2, enumC0377a3, enumC0377a4, enumC0377a5, enumC0377a6, enumC0377a7, enumC0377a8, enumC0377a9};
            }

            public EnumC0377a() {
                throw null;
            }

            public static EnumC0377a valueOf(String str) {
                return (EnumC0377a) Enum.valueOf(EnumC0377a.class, str);
            }

            public static EnumC0377a[] values() {
                return (EnumC0377a[]) Y.clone();
            }
        }

        public a(org.apache.avro.g gVar, org.apache.avro.g gVar2, ax5 ax5Var, EnumC0377a enumC0377a) {
            this.a = gVar;
            this.b = gVar2;
            this.c = enumC0377a;
            if (gVar2 == null) {
                return;
            }
            ax5Var.i(gVar2.G());
        }
    }

    public static class b extends a {
        public final a d;

        public b(org.apache.avro.g gVar, org.apache.avro.g gVar2, ax5 ax5Var, a aVar) {
            super(gVar, gVar2, ax5Var, a.EnumC0377a.d);
            this.d = aVar;
        }
    }

    public static class c extends a {
        public c(org.apache.avro.g gVar, org.apache.avro.g gVar2, ax5 ax5Var) {
            super(gVar, gVar2, ax5Var, a.EnumC0377a.a);
        }
    }

    public static class d extends a {
        public final int[] d;
        public final Object[] e;

        public d(org.apache.avro.g gVar, org.apache.avro.g gVar2, ax5 ax5Var, int[] iArr, Object[] objArr) {
            super(gVar, gVar2, ax5Var, a.EnumC0377a.e);
            this.d = iArr;
            int size = gVar2.A().size();
            int iMin = Math.min(size, iArr.length);
            boolean z = iArr.length <= size;
            int i = 0;
            while (z && i < iMin) {
                z &= i == iArr[i];
                i++;
            }
            this.e = objArr;
        }
    }

    public static class e extends a {
        public final a d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            public static final a a;
            public static final a b;
            public static final a c;
            public static final a d;
            public static final a e;
            public static final /* synthetic */ a[] f;

            static {
                a aVar = new a("INCOMPATIBLE_SCHEMA_TYPES", 0);
                a = aVar;
                a aVar2 = new a("NAMES_DONT_MATCH", 1);
                b = aVar2;
                a aVar3 = new a("SIZES_DONT_MATCH", 2);
                c = aVar3;
                a aVar4 = new a("MISSING_REQUIRED_FIELD", 3);
                d = aVar4;
                a aVar5 = new a("NO_MATCHING_BRANCH", 4);
                e = aVar5;
                f = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
            }

            public a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f.clone();
            }
        }

        public e(org.apache.avro.g gVar, org.apache.avro.g gVar2, ax5 ax5Var, a aVar) {
            super(gVar, gVar2, ax5Var, a.EnumC0377a.b);
            this.d = aVar;
        }

        public final String toString() {
            int iOrdinal = this.d.ordinal();
            org.apache.avro.g gVar = this.a;
            org.apache.avro.g gVar2 = this.b;
            if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                if (iOrdinal == 3) {
                    String str = "<oops>";
                    for (g.f fVar : gVar2.C()) {
                        if (gVar.B(fVar.b) == null && fVar.f == null) {
                            str = fVar.b;
                        }
                    }
                    StringBuilder sbF = u40.f("Found ", gVar.E(), ", expecting ", gVar2.E(), ", missing required field ");
                    sbF.append(str);
                    return sbF.toString();
                }
                if (iOrdinal != 4) {
                    l5.q("Unknown error.");
                    return null;
                }
            }
            return t40.l("Found ", gVar.E(), ", expecting ", gVar2.E());
        }
    }

    /* JADX INFO: renamed from: org.apache.avro.f$f, reason: collision with other inner class name */
    public static class C0378f extends a {
    }

    public static class g extends a {
        public final int d;
        public final a e;

        public g(org.apache.avro.g gVar, org.apache.avro.g gVar2, ax5 ax5Var, int i, a aVar) {
            super(gVar, gVar2, ax5Var, a.EnumC0377a.X);
            this.d = i;
            this.e = aVar;
        }
    }

    public static class h extends a {
        public final a[] d;
        public final g.f[] e;
        public final int f;
        public final Object[] g;
        public final ax5.f h;

        public h(org.apache.avro.g gVar, org.apache.avro.g gVar2, ax5 ax5Var, a[] aVarArr, g.f[] fVarArr, int i, Object[] objArr) {
            super(gVar, gVar2, ax5Var, a.EnumC0377a.V);
            this.d = aVarArr;
            this.e = fVarArr;
            this.f = i;
            this.g = objArr;
            this.h = ax5Var.l(gVar2);
        }

        public static a a(org.apache.avro.g gVar, org.apache.avro.g gVar2, ax5 ax5Var, HashMap map) {
            h hVar;
            a[] aVarArr;
            g.f[] fVarArr;
            g.r rVar = new g.r(gVar, gVar2);
            a aVar = (a) map.get(rVar);
            if (aVar != null) {
                return aVar;
            }
            List<g.f> listC = gVar.C();
            List<g.f> listC2 = gVar2.C();
            Iterator<g.f> it = listC.iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                if (gVar2.B(it.next().b) != null) {
                    i2++;
                }
            }
            a[] aVarArr2 = new a[listC.size()];
            int size = listC2.size();
            g.f[] fVarArr2 = new g.f[size];
            Object[] objArr = new Object[size - i2];
            h hVar2 = new h(gVar, gVar2, ax5Var, aVarArr2, fVarArr2, i2, objArr);
            map.put(rVar, hVar2);
            int i3 = 0;
            for (g.f fVar : listC) {
                String str = fVar.b;
                org.apache.avro.g gVar3 = fVar.d;
                g.f fVarB = gVar2.B(str);
                if (fVarB != null) {
                    fVarArr2[i3] = fVarB;
                    aVarArr2[i] = f.a(gVar3, fVarB.d, ax5Var, map);
                    aVarArr = aVarArr2;
                    fVarArr = fVarArr2;
                    i++;
                    i3++;
                    hVar = hVar2;
                } else {
                    hVar = hVar2;
                    aVarArr = aVarArr2;
                    fVarArr = fVarArr2;
                    aVarArr[i] = new i(gVar3, null, ax5Var, a.EnumC0377a.f);
                    i++;
                }
                hVar2 = hVar;
                aVarArr2 = aVarArr;
                fVarArr2 = fVarArr;
            }
            h hVar3 = hVar2;
            g.f[] fVarArr3 = fVarArr2;
            for (g.f fVar2 : listC2) {
                if (gVar.B(fVar2.b) == null) {
                    if (fVar2.f == null) {
                        e eVar = new e(gVar, gVar2, ax5Var, e.a.d);
                        map.put(rVar, eVar);
                        return eVar;
                    }
                    objArr[i3 - i2] = ax5Var.j(fVar2);
                    fVarArr3[i3] = fVar2;
                    i3++;
                }
            }
            return hVar3;
        }
    }

    public static class i extends a {
    }

    public static class j extends a {
        public final a[] d;
        public final boolean e;

        public j(org.apache.avro.g gVar, org.apache.avro.g gVar2, ax5 ax5Var, boolean z, a[] aVarArr) {
            super(gVar, gVar2, ax5Var, a.EnumC0377a.W);
            this.e = z;
            this.d = aVarArr;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0275, code lost:
    
        if (r2 != 9) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x027c, code lost:
    
        if (r5.ordinal() != 8) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0285, code lost:
    
        if (r5 != 7) goto L156;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:110:0x01d9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:120:0x01ff. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0287  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.apache.avro.f.a a(org.apache.avro.g r16, org.apache.avro.g r17, defpackage.ax5 r18, java.util.HashMap r19) {
        /*
            Method dump skipped, instruction units count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.avro.f.a(org.apache.avro.g, org.apache.avro.g, ax5, java.util.HashMap):org.apache.avro.f$a");
    }

    public static boolean b(org.apache.avro.g gVar, org.apache.avro.g gVar2, HashMap map) {
        g.u uVarK = gVar.K();
        if (uVarK == gVar2.K() && ((uVarK != g.u.RECORD && uVarK != g.u.FIXED && uVarK != g.u.ENUM) || gVar.H() == null || gVar.H().equals(gVar2.H()))) {
            switch (uVarK.ordinal()) {
                case 0:
                    g.r rVar = new g.r(gVar, gVar2);
                    if (!map.containsKey(rVar)) {
                        map.put(rVar, Boolean.TRUE);
                        List<g.f> listC = gVar.C();
                        List<g.f> listC2 = gVar2.C();
                        if (listC.size() != listC2.size()) {
                            map.put(rVar, Boolean.FALSE);
                        } else {
                            for (int i2 = 0; i2 < listC.size(); i2++) {
                                if (!listC.get(i2).b.equals(listC2.get(i2).b) || !b(listC.get(i2).d, listC2.get(i2).d, map)) {
                                    map.put(rVar, Boolean.FALSE);
                                }
                            }
                        }
                    }
                    return ((Boolean) map.get(rVar)).booleanValue();
                case 1:
                    return gVar.A().equals(gVar2.A());
                case 2:
                    return b(gVar.x(), gVar2.x(), map);
                case 3:
                    return b(gVar.M(), gVar2.M(), map);
                case 4:
                    List<org.apache.avro.g> listL = gVar.L();
                    List<org.apache.avro.g> listL2 = gVar2.L();
                    if (listL.size() == listL2.size()) {
                        for (int i3 = 0; i3 < listL.size(); i3++) {
                            if (!b(listL.get(i3), listL2.get(i3), map)) {
                            }
                            break;
                        }
                        return true;
                    }
                    break;
                case 5:
                    if (gVar.D() == gVar2.D()) {
                        return true;
                    }
                    break;
                case 6:
                case 7:
                case 8:
                case DatadogLogGenerator.CRASH /* 9 */:
                case 10:
                case 11:
                case 12:
                case 13:
                    return true;
                default:
                    l5.q("Unknown schema type: ".concat(String.valueOf(gVar.K())));
                    return false;
            }
        }
        return false;
    }
}
