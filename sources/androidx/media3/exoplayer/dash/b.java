package androidx.media3.exoplayer.dash;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.a;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.d;
import androidx.media3.exoplayer.dash.d.c;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.source.g;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.o;
import androidx.media3.exoplayer.source.p;
import androidx.media3.exoplayer.upstream.Loader;
import defpackage.ayd;
import defpackage.bg;
import defpackage.bm2;
import defpackage.bm7;
import defpackage.d09;
import defpackage.d8b;
import defpackage.e47;
import defpackage.ea;
import defpackage.ea1;
import defpackage.ee3;
import defpackage.ez3;
import defpackage.fs4;
import defpackage.grf;
import defpackage.jc9;
import defpackage.ka2;
import defpackage.l3d;
import defpackage.nz8;
import defpackage.o05;
import defpackage.od3;
import defpackage.p35;
import defpackage.p42;
import defpackage.p6;
import defpackage.qk3;
import defpackage.qyc;
import defpackage.r40;
import defpackage.r6;
import defpackage.rjd;
import defpackage.sdb;
import defpackage.st9;
import defpackage.t40;
import defpackage.u05;
import defpackage.vb1;
import defpackage.vjg;
import defpackage.wpf;
import defpackage.xpf;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class b implements g, p.a<p42<androidx.media3.exoplayer.dash.a>>, p42.b<androidx.media3.exoplayer.dash.a> {
    public static final Pattern p0 = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern q0 = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final long V;
    public final d09 W;
    public final qk3 X;
    public final xpf Y;
    public final a[] Z;
    public final int a;
    public final ee3 a0;
    public final a.InterfaceC0041a b;
    public final d b0;
    public final grf c;
    public final androidx.media3.exoplayer.drm.b d;
    public final i.a d0;
    public final androidx.media3.exoplayer.upstream.b e;
    public final a.C0043a e0;
    public final vb1 f;
    public final sdb f0;
    public g.a g0;
    public bm2 j0;
    public od3 k0;
    public int l0;
    public List<u05> m0;
    public long o0;
    public boolean n0 = true;
    public p42<androidx.media3.exoplayer.dash.a>[] h0 = new p42[0];
    public o05[] i0 = new o05[0];
    public final IdentityHashMap<p42<androidx.media3.exoplayer.dash.a>, d.c> c0 = new IdentityHashMap<>();

    public static final class a {
        public final int[] a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final e47<androidx.media3.common.a> h;

        public a(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6, e47<androidx.media3.common.a> e47Var) {
            this.b = i;
            this.a = iArr;
            this.c = i2;
            this.e = i3;
            this.f = i4;
            this.g = i5;
            this.d = i6;
            this.h = e47Var;
        }
    }

    public b(int i, od3 od3Var, vb1 vb1Var, int i2, a.InterfaceC0041a interfaceC0041a, grf grfVar, androidx.media3.exoplayer.drm.b bVar, a.C0043a c0043a, androidx.media3.exoplayer.upstream.b bVar2, i.a aVar, long j, d09 d09Var, qk3 qk3Var, ee3 ee3Var, DashMediaSource.c cVar, sdb sdbVar) {
        int i3;
        int i4;
        int[][] iArr;
        boolean[] zArr;
        androidx.media3.common.a[][] aVarArr;
        androidx.media3.common.a[] aVarArrN;
        ez3 ez3VarK;
        Integer num;
        this.a = i;
        this.k0 = od3Var;
        this.f = vb1Var;
        this.l0 = i2;
        this.b = interfaceC0041a;
        this.c = grfVar;
        this.d = bVar;
        this.e0 = c0043a;
        this.e = bVar2;
        this.d0 = aVar;
        this.V = j;
        this.W = d09Var;
        this.X = qk3Var;
        this.a0 = ee3Var;
        this.f0 = sdbVar;
        boolean z = true;
        this.b0 = new d(od3Var, cVar, qk3Var);
        int i5 = 0;
        ee3Var.getClass();
        e47.b bVar3 = e47.b;
        qyc qycVar = qyc.e;
        this.j0 = new bm2(qycVar, qycVar);
        d8b d8bVarB = od3Var.b(i2);
        List<u05> list = d8bVarB.d;
        this.m0 = list;
        List<ea> list2 = d8bVarB.c;
        int size = list2.size();
        HashMap map = new HashMap(jc9.a(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i6 = 0; i6 < size; i6++) {
            map.put(Long.valueOf(list2.get(i6).a), Integer.valueOf(i6));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i6));
            arrayList.add(arrayList2);
            sparseArray.put(i6, arrayList2);
        }
        int i7 = 0;
        while (i7 < size) {
            ea eaVar = list2.get(i7);
            List<ez3> list3 = eaVar.e;
            List<ez3> list4 = eaVar.f;
            boolean z2 = z;
            ez3 ez3VarK2 = k("http://dashif.org/guidelines/trickmode", list3);
            ez3VarK2 = ez3VarK2 == null ? k("http://dashif.org/guidelines/trickmode", list4) : ez3VarK2;
            int iIntValue = (ez3VarK2 == null || (num = (Integer) map.get(Long.valueOf(Long.parseLong(ez3VarK2.b)))) == null || !g(eaVar, list2.get(num.intValue()))) ? i7 : num.intValue();
            if (iIntValue == i7 && (ez3VarK = k("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = ez3VarK.b;
                String str2 = vjg.a;
                String[] strArrSplit = str.split(",", -1);
                int length = strArrSplit.length;
                for (int i8 = i5; i8 < length; i8++) {
                    Integer num2 = (Integer) map.get(Long.valueOf(Long.parseLong(strArrSplit[i8])));
                    if (num2 != null && g(eaVar, list2.get(num2.intValue()))) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i7) {
                List list5 = (List) sparseArray.get(i7);
                List list6 = (List) sparseArray.get(iIntValue);
                list6.addAll(list5);
                sparseArray.put(i7, list6);
                arrayList.remove(list5);
            }
            i7++;
            z = z2;
            i5 = 0;
        }
        boolean z3 = z;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i9 = 0; i9 < size2; i9++) {
            int[] iArrP1 = bm7.P1((Collection) arrayList.get(i9));
            iArr2[i9] = iArrP1;
            Arrays.sort(iArrP1);
        }
        boolean[] zArr2 = new boolean[size2];
        androidx.media3.common.a[][] aVarArr2 = new androidx.media3.common.a[size2][];
        int i10 = 0;
        int i11 = 0;
        while (i10 < size2) {
            int[] iArr3 = iArr2[i10];
            int length2 = iArr3.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length2) {
                    iArr = iArr2;
                    break;
                }
                List<l3d> list7 = list2.get(iArr3[i12]).c;
                iArr = iArr2;
                for (int i13 = 0; i13 < list7.size(); i13++) {
                    if (!list7.get(i13).d.isEmpty()) {
                        zArr2[i10] = z3;
                        i11++;
                        break;
                    }
                }
                i12++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i10];
            int length3 = iArr4.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length3) {
                    zArr = zArr2;
                    aVarArr = aVarArr2;
                    aVarArrN = new androidx.media3.common.a[0];
                    break;
                }
                int i15 = iArr4[i14];
                ea eaVar2 = list2.get(i15);
                List<ez3> list8 = list2.get(i15).d;
                int[] iArr5 = iArr4;
                int i16 = 0;
                while (i16 < list8.size()) {
                    ez3 ez3Var = list8.get(i16);
                    zArr = zArr2;
                    aVarArr = aVarArr2;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(ez3Var.a)) {
                        a.C0036a c0036a = new a.C0036a();
                        c0036a.m = st9.p("application/cea-608");
                        c0036a.a = r6.d(eaVar2.a, ":cea608", new StringBuilder());
                        aVarArrN = n(ez3Var, p0, new androidx.media3.common.a(c0036a));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(ez3Var.a)) {
                        a.C0036a c0036a2 = new a.C0036a();
                        c0036a2.m = st9.p("application/cea-708");
                        c0036a2.a = r6.d(eaVar2.a, ":cea708", new StringBuilder());
                        aVarArrN = n(ez3Var, q0, new androidx.media3.common.a(c0036a2));
                        break;
                    }
                    i16++;
                    aVarArr2 = aVarArr;
                    zArr2 = zArr;
                }
                i14++;
                iArr4 = iArr5;
            }
            aVarArr[i10] = aVarArrN;
            if (aVarArrN.length != 0) {
                i11++;
            }
            i10++;
            aVarArr2 = aVarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        androidx.media3.common.a[][] aVarArr3 = aVarArr2;
        int size3 = list.size() + i11 + size2;
        wpf[] wpfVarArr = new wpf[size3];
        a[] aVarArr4 = new a[size3];
        int i17 = 0;
        int i18 = 0;
        while (i17 < size2) {
            int[] iArr7 = iArr6[i17];
            ArrayList arrayList3 = new ArrayList();
            for (int i19 : iArr7) {
                arrayList3.addAll(list2.get(i19).c);
            }
            int size4 = arrayList3.size();
            androidx.media3.common.a[] aVarArr5 = new androidx.media3.common.a[size4];
            int i20 = 0;
            while (i20 < size4) {
                int i21 = size2;
                androidx.media3.common.a aVar2 = ((l3d) arrayList3.get(i20)).a;
                int i22 = i18;
                a.C0036a c0036aA = aVar2.a();
                c0036aA.N = bVar.c(aVar2);
                aVarArr5[i20] = new androidx.media3.common.a(c0036aA);
                i20++;
                size2 = i21;
                i18 = i22;
            }
            int i23 = size2;
            int i24 = i18;
            ea eaVar3 = list2.get(iArr7[0]);
            long j2 = eaVar3.a;
            String string = j2 != -1 ? Long.toString(j2) : p6.c(i17, "unset:");
            int i25 = i24 + 1;
            if (zArr3[i17]) {
                i3 = i24 + 2;
            } else {
                i3 = i25;
                i25 = -1;
            }
            if (aVarArr3[i17].length != 0) {
                i4 = i3 + 1;
            } else {
                i4 = i3;
                i3 = -1;
            }
            List<ea> list9 = list2;
            int i26 = 0;
            while (i26 < size4) {
                int i27 = i26;
                aVarArr5[i27] = interfaceC0041a.a(aVarArr5[i27]);
                i26 = i27 + 1;
            }
            wpfVarArr[i24] = new wpf(string, aVarArr5);
            int i28 = eaVar3.b;
            e47.b bVar4 = e47.b;
            qyc qycVar2 = qyc.e;
            a aVar3 = new a(i28, 0, iArr7, i24, i25, i3, -1, qycVar2);
            int i29 = i24;
            aVarArr4[i29] = aVar3;
            int i30 = -1;
            if (i25 != -1) {
                String strK = t40.k(string, ":emsg");
                a.C0036a c0036a3 = new a.C0036a();
                c0036a3.a = strK;
                c0036a3.m = st9.p("application/x-emsg");
                wpfVarArr[i25] = new wpf(strK, new androidx.media3.common.a(c0036a3));
                a aVar4 = new a(5, 1, iArr7, i29, -1, -1, -1, qycVar2);
                i29 = i29;
                aVarArr4[i25] = aVar4;
                i30 = -1;
            }
            if (i3 != i30) {
                String strK2 = t40.k(string, ":cc");
                aVarArr4[i3] = new a(3, 1, iArr7, i29, -1, -1, -1, e47.k(aVarArr3[i17]));
                androidx.media3.common.a[] aVarArr6 = aVarArr3[i17];
                for (int i31 = 0; i31 < aVarArr6.length; i31++) {
                    aVarArr6[i31] = interfaceC0041a.a(aVarArr6[i31]);
                }
                wpfVarArr[i3] = new wpf(strK2, aVarArr3[i17]);
            }
            i17++;
            size2 = i23;
            i18 = i4;
            list2 = list9;
        }
        int i32 = 0;
        while (i32 < list.size()) {
            u05 u05Var = list.get(i32);
            a.C0036a c0036a4 = new a.C0036a();
            c0036a4.a = u05Var.a();
            c0036a4.m = st9.p("application/x-emsg");
            wpfVarArr[i18] = new wpf(u05Var.a() + ":" + i32, new androidx.media3.common.a(c0036a4));
            e47.b bVar5 = e47.b;
            aVarArr4[i18] = new a(5, 2, new int[0], -1, -1, -1, i32, qyc.e);
            i32++;
            i18++;
        }
        Pair pairCreate = Pair.create(new xpf(wpfVarArr), aVarArr4);
        this.Y = (xpf) pairCreate.first;
        this.Z = (a[]) pairCreate.second;
    }

    public static boolean g(ea eaVar, ea eaVar2) {
        int i = eaVar.b;
        List<l3d> list = eaVar.c;
        int i2 = eaVar2.b;
        List<l3d> list2 = eaVar2.c;
        if (i == i2) {
            if (list.isEmpty() || list2.isEmpty()) {
                return true;
            }
            androidx.media3.common.a aVar = list.get(0).a;
            androidx.media3.common.a aVar2 = list2.get(0).a;
            int i3 = aVar.f & (-16385);
            int i4 = aVar2.f & (-16385);
            if (Objects.equals(aVar.d, aVar2.d) && i3 == i4) {
                return true;
            }
        }
        return false;
    }

    public static ez3 k(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            ez3 ez3Var = (ez3) list.get(i);
            if (str.equals(ez3Var.a)) {
                return ez3Var;
            }
        }
        return null;
    }

    public static androidx.media3.common.a[] n(ez3 ez3Var, Pattern pattern, androidx.media3.common.a aVar) {
        String str = ez3Var.b;
        if (str == null) {
            return new androidx.media3.common.a[]{aVar};
        }
        String str2 = vjg.a;
        String[] strArrSplit = str.split(";", -1);
        androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            Matcher matcher = pattern.matcher(strArrSplit[i]);
            if (!matcher.matches()) {
                return new androidx.media3.common.a[]{aVar};
            }
            int i2 = Integer.parseInt(matcher.group(1));
            a.C0036a c0036aA = aVar.a();
            c0036aA.a = aVar.a + ":" + i2;
            c0036aA.J = i2;
            c0036aA.d = matcher.group(2);
            aVarArr[i] = new androidx.media3.common.a(c0036aA);
        }
        return aVarArr;
    }

    @Override // androidx.media3.exoplayer.source.p.a
    public final void b(p pVar) {
        this.g0.b(this);
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long c(long j, ayd aydVar) {
        for (p42<androidx.media3.exoplayer.dash.a> p42Var : this.h0) {
            if (p42Var.a == 2) {
                return p42Var.e.c(j, aydVar);
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.p
    public final boolean d() {
        return this.j0.d();
    }

    @Override // androidx.media3.exoplayer.source.p
    public final boolean e(androidx.media3.exoplayer.g gVar) {
        return this.j0.e(gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // androidx.media3.exoplayer.source.g
    public final long f(p35[] p35VarArr, boolean[] zArr, rjd[] rjdVarArr, boolean[] zArr2, long j) {
        int i;
        boolean z;
        int[] iArr;
        int[] iArr2;
        int i2;
        int i3;
        int i4;
        wpf wpfVarA;
        e47<androidx.media3.common.a> e47Var;
        int i5;
        d.c cVar;
        boolean z2;
        int[] iArr3 = new int[p35VarArr.length];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = -1;
            if (i7 >= p35VarArr.length) {
                break;
            }
            p35 p35Var = p35VarArr[i7];
            if (p35Var != null) {
                iArr3[i7] = this.Y.b(p35Var.m());
            } else {
                iArr3[i7] = -1;
            }
            i7++;
        }
        for (int i8 = 0; i8 < p35VarArr.length; i8++) {
            if (p35VarArr[i8] == null || !zArr[i8]) {
                rjd rjdVar = rjdVarArr[i8];
                if (rjdVar instanceof p42) {
                    ((p42) rjdVar).C(this);
                } else if (rjdVar instanceof p42.a) {
                    p42.a aVar = (p42.a) rjdVar;
                    boolean[] zArr3 = p42.this.d;
                    int i9 = aVar.c;
                    ka2.q(zArr3[i9]);
                    zArr3[i9] = false;
                }
                rjdVarArr[i8] = null;
            }
        }
        int i10 = 0;
        while (true) {
            z = true;
            if (i10 >= p35VarArr.length) {
                break;
            }
            rjd rjdVar2 = rjdVarArr[i10];
            if ((rjdVar2 instanceof fs4) || (rjdVar2 instanceof p42.a)) {
                int iM = m(i10, iArr3);
                if (iM == -1) {
                    z2 = rjdVarArr[i10] instanceof fs4;
                } else {
                    rjd rjdVar3 = rjdVarArr[i10];
                    z2 = (rjdVar3 instanceof p42.a) && ((p42.a) rjdVar3).a == rjdVarArr[iM];
                }
                if (!z2) {
                    rjd rjdVar4 = rjdVarArr[i10];
                    if (rjdVar4 instanceof p42.a) {
                        p42.a aVar2 = (p42.a) rjdVar4;
                        boolean[] zArr4 = p42.this.d;
                        int i11 = aVar2.c;
                        ka2.q(zArr4[i11]);
                        zArr4[i11] = false;
                    }
                    rjdVarArr[i10] = null;
                }
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < p35VarArr.length) {
            p35 p35Var2 = p35VarArr[i12];
            if (p35Var2 == null) {
                iArr2 = iArr3;
                i2 = i6;
                i3 = i12;
            } else {
                rjd rjdVar5 = rjdVarArr[i12];
                if (rjdVar5 == null) {
                    zArr2[i12] = z;
                    a aVar3 = this.Z[iArr3[i12]];
                    int i13 = aVar3.c;
                    if (i13 == 0) {
                        int i14 = aVar3.f;
                        boolean z3 = i14 != i ? z ? 1 : 0 : i6;
                        if (z3 != 0) {
                            wpfVarA = this.Y.a(i14);
                            i4 = z ? 1 : 0;
                        } else {
                            i4 = i6;
                            wpfVarA = null;
                        }
                        int i15 = aVar3.g;
                        if (i15 != i) {
                            e47Var = this.Z[i15].h;
                        } else {
                            e47.b bVar = e47.b;
                            e47Var = qyc.e;
                        }
                        int size = e47Var.size() + i4;
                        androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[size];
                        int[] iArr4 = new int[size];
                        if (z3 != 0) {
                            aVarArr[i6] = wpfVarA.d[i6];
                            iArr4[i6] = 5;
                            i5 = z ? 1 : 0;
                        } else {
                            i5 = i6;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i16 = i6; i16 < e47Var.size(); i16++) {
                            androidx.media3.common.a aVar4 = e47Var.get(i16);
                            aVarArr[i5] = aVar4;
                            iArr4[i5] = 3;
                            arrayList.add(aVar4);
                            i5 += z ? 1 : 0;
                        }
                        if (!this.k0.d || z3 == 0) {
                            cVar = null;
                        } else {
                            d dVar = this.b0;
                            cVar = dVar.new c(dVar.a);
                        }
                        iArr2 = iArr3;
                        i3 = i12;
                        d.c cVar2 = cVar;
                        i2 = 0;
                        p42<androidx.media3.exoplayer.dash.a> p42Var = new p42<>(aVar3.b, iArr4, aVarArr, this.b.b(this.W, this.k0, this.f, this.l0, aVar3.a, p35Var2, aVar3.b, this.V, z3, arrayList, cVar, this.c, this.f0), this, this.X, j, this.d, this.e0, this.e, this.d0, this.n0);
                        synchronized (this) {
                            this.c0.put(p42Var, cVar2);
                        }
                        rjdVarArr[i3] = p42Var;
                    } else {
                        iArr2 = iArr3;
                        i2 = i6;
                        i3 = i12;
                        if (i13 == 2) {
                            rjdVarArr[i3] = new o05(this.m0.get(aVar3.d), p35Var2.m().d[i2], this.k0.d);
                        }
                    }
                } else {
                    iArr2 = iArr3;
                    i2 = i6;
                    i3 = i12;
                    if (rjdVar5 instanceof p42) {
                        ((androidx.media3.exoplayer.dash.a) ((p42) rjdVar5).e).g(p35Var2);
                    }
                }
            }
            i12 = i3 + 1;
            i6 = i2;
            iArr3 = iArr2;
            i = -1;
            z = true;
        }
        int[] iArr5 = iArr3;
        boolean z4 = i6;
        int i17 = z4 ? 1 : 0;
        while (i17 < p35VarArr.length) {
            if (rjdVarArr[i17] != null || p35VarArr[i17] == null) {
                iArr = iArr5;
            } else {
                a aVar5 = this.Z[iArr5[i17]];
                if (aVar5.c == 1) {
                    iArr = iArr5;
                    int iM2 = m(i17, iArr);
                    if (iM2 != -1) {
                        p42 p42Var2 = (p42) rjdVarArr[iM2];
                        int i18 = aVar5.b;
                        boolean[] zArr5 = p42Var2.d;
                        o[] oVarArr = p42Var2.c0;
                        for (int i19 = z4 ? 1 : 0; i19 < oVarArr.length; i19++) {
                            if (p42Var2.b[i19] == i18) {
                                ka2.q(!zArr5[i19]);
                                zArr5[i19] = true;
                                oVarArr[i19].E(j, true);
                                rjdVarArr[i17] = new p42.a(p42Var2, oVarArr[i19], i19);
                            }
                        }
                        bg.h();
                        return 0L;
                    }
                    rjdVarArr[i17] = new fs4();
                    i17++;
                    iArr5 = iArr;
                } else {
                    iArr = iArr5;
                }
            }
            i17++;
            iArr5 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = rjdVarArr.length;
        for (int i20 = z4 ? 1 : 0; i20 < length; i20++) {
            rjd rjdVar6 = rjdVarArr[i20];
            if (rjdVar6 instanceof p42) {
                arrayList2.add((p42) rjdVar6);
            } else if (rjdVar6 instanceof o05) {
                arrayList3.add((o05) rjdVar6);
            }
        }
        p42<androidx.media3.exoplayer.dash.a>[] p42VarArr = new p42[arrayList2.size()];
        this.h0 = p42VarArr;
        arrayList2.toArray(p42VarArr);
        o05[] o05VarArr = new o05[arrayList3.size()];
        this.i0 = o05VarArr;
        arrayList3.toArray(o05VarArr);
        ee3 ee3Var = this.a0;
        AbstractList abstractListB = nz8.b(new r40(5), arrayList2);
        ee3Var.getClass();
        this.j0 = new bm2(arrayList2, abstractListB);
        if (this.n0) {
            this.n0 = z4;
            this.o0 = j;
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.p
    public final long h() {
        return this.j0.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    @Override // androidx.media3.exoplayer.source.g
    public final long i(long j) {
        int i;
        ea1 ea1Var;
        boolean zE;
        boolean z;
        p42<androidx.media3.exoplayer.dash.a>[] p42VarArr = this.h0;
        int length = p42VarArr.length;
        boolean z2 = false;
        int i2 = 0;
        while (i2 < length) {
            p42<androidx.media3.exoplayer.dash.a> p42Var = p42VarArr[i2];
            o[] oVarArr = p42Var.c0;
            o oVar = p42Var.b0;
            Loader loader = p42Var.X;
            ArrayList<ea1> arrayList = p42Var.Z;
            p42Var.i0 = j;
            p42Var.l0 = z2;
            if (p42Var.z()) {
                p42Var.h0 = j;
                z = z2;
                i = i2;
            } else {
                ?? r15 = z2;
                while (true) {
                    if (r15 >= arrayList.size()) {
                        i = i2;
                        break;
                    }
                    ea1Var = arrayList.get(r15);
                    long j2 = ea1Var.g;
                    i = i2;
                    if (j2 == j && ea1Var.k == -9223372036854775807L) {
                        break;
                    }
                    if (j2 > j) {
                        break;
                    }
                    i2 = i;
                    r15++;
                }
                ea1Var = null;
                if (ea1Var != null) {
                    zE = oVar.D(ea1Var.e(0));
                } else {
                    long jH = p42Var.h();
                    zE = oVar.E(j, jH == Long.MIN_VALUE || j < jH);
                }
                if (zE) {
                    p42Var.j0 = p42Var.B(oVar.s(), 0);
                    for (o oVar2 : oVarArr) {
                        oVar2.E(j, true);
                    }
                } else {
                    p42Var.h0 = j;
                    p42Var.n0 = false;
                    arrayList.clear();
                    p42Var.j0 = 0;
                    if (loader.d()) {
                        oVar.j();
                        for (o oVar3 : oVarArr) {
                            oVar3.j();
                        }
                        loader.b();
                    } else {
                        loader.c = null;
                        z = false;
                        oVar.C(false);
                        for (o oVar4 : p42Var.c0) {
                            oVar4.C(false);
                        }
                    }
                }
                z = false;
            }
            i2 = i + 1;
            z2 = z;
        }
        o05[] o05VarArr = this.i0;
        int length2 = o05VarArr.length;
        for (?? r5 = z2; r5 < length2; r5++) {
            o05 o05Var = o05VarArr[r5];
            int iA = vjg.a(o05Var.c, j, true);
            o05Var.V = iA;
            o05Var.W = (o05Var.d && iA == o05Var.c.length) ? j : -9223372036854775807L;
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long j() {
        p42<androidx.media3.exoplayer.dash.a>[] p42VarArr = this.h0;
        int length = p42VarArr.length;
        for (int i = 0; i < length; i++) {
            p42<androidx.media3.exoplayer.dash.a> p42Var = p42VarArr[i];
            p42Var.getClass();
            try {
                if (p42Var.m0) {
                    return this.o0;
                }
            } finally {
                p42Var.m0 = false;
            }
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void l() {
        this.W.a();
    }

    public final int m(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 != -1) {
            a[] aVarArr = this.Z;
            int i3 = aVarArr[i2].e;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                if (i5 == i3 && aVarArr[i5].c == 0) {
                    return i4;
                }
            }
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void p(g.a aVar, long j) {
        this.g0 = aVar;
        aVar.a(this);
    }

    @Override // androidx.media3.exoplayer.source.g
    public final xpf q() {
        return this.Y;
    }

    @Override // androidx.media3.exoplayer.source.p
    public final long s() {
        return this.j0.s();
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void t(long j, boolean z) {
        long j2;
        for (p42<androidx.media3.exoplayer.dash.a> p42Var : this.h0) {
            if (!p42Var.z()) {
                o oVar = p42Var.b0;
                int i = oVar.q;
                oVar.i(j, z, true);
                o oVar2 = p42Var.b0;
                int i2 = oVar2.q;
                if (i2 > i) {
                    synchronized (oVar2) {
                        j2 = oVar2.p == 0 ? Long.MIN_VALUE : oVar2.n[oVar2.r];
                    }
                    int i3 = 0;
                    while (true) {
                        o[] oVarArr = p42Var.c0;
                        if (i3 >= oVarArr.length) {
                            break;
                        }
                        oVarArr[i3].i(j2, z, p42Var.d[i3]);
                        i3++;
                    }
                }
                int iMin = Math.min(p42Var.B(i2, 0), p42Var.j0);
                if (iMin > 0) {
                    vjg.U(p42Var.Z, 0, iMin);
                    p42Var.j0 -= iMin;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    @Override // androidx.media3.exoplayer.source.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(long r20) {
        /*
            r19 = this;
            r0 = r19
            p42<androidx.media3.exoplayer.dash.a>[] r1 = r0.h0
            int r2 = r1.length
            r4 = 0
        L6:
            if (r4 >= r2) goto L94
            r5 = r1[r4]
            androidx.media3.exoplayer.upstream.Loader r6 = r5.X
            boolean r6 = r6.d()
            if (r6 != 0) goto L8e
            od3 r6 = r0.k0
            int r7 = r0.l0
            long r9 = r6.d(r7)
            androidx.media3.exoplayer.source.o r6 = r5.b0
            androidx.media3.exoplayer.upstream.Loader r7 = r5.X
            boolean r7 = r7.d()
            r7 = r7 ^ 1
            defpackage.ka2.q(r7)
            boolean r7 = r5.z()
            if (r7 != 0) goto L8e
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L8e
            java.util.ArrayList<ea1> r11 = r5.Z
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L3f
            goto L8e
        L3f:
            ea1 r11 = r5.x()
            long r12 = r11.l
            int r7 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r7 == 0) goto L4a
            goto L4c
        L4a:
            long r12 = r11.h
        L4c:
            int r7 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r7 > 0) goto L51
            goto L8e
        L51:
            long r12 = r6.p()
            int r7 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r7 > 0) goto L5a
            goto L8e
        L5a:
            long r7 = r6.q()
            r14 = 1
            long r7 = r7 + r14
            long r7 = java.lang.Math.max(r9, r7)
            r6.k(r7)
            androidx.media3.exoplayer.source.o[] r6 = r5.c0
            int r7 = r6.length
            r8 = 0
        L6c:
            if (r8 >= r7) goto L84
            r11 = r6[r8]
            long r16 = r11.q()
            r18 = r4
            long r3 = r16 + r14
            long r3 = java.lang.Math.max(r9, r3)
            r11.k(r3)
            int r8 = r8 + 1
            r4 = r18
            goto L6c
        L84:
            r18 = r4
            androidx.media3.exoplayer.source.i$a r8 = r5.V
            int r11 = r5.a
            r8.h(r9, r11, r12)
            goto L90
        L8e:
            r18 = r4
        L90:
            int r4 = r18 + 1
            goto L6
        L94:
            bm2 r0 = r0.j0
            r1 = r20
            r0.u(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.b.u(long):void");
    }
}
