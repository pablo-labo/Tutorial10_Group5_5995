package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.e47;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes.dex */
public class dqf {
    public static final dqf F = new dqf(new b());
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final f47<wpf, cqf> D;
    public final i47<Integer> E;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final e47<String> m;
    public final e47<String> n;
    public final int o;
    public final e47<String> p;
    public final int q;
    public final int r;
    public final int s;
    public final e47<String> t;
    public final a u;
    public final e47<String> v;
    public final int w;
    public final boolean x;
    public final int y;
    public final boolean z;

    public static final class a {
        public static final a d = new a(new C0210a());
        public static final String e;
        public static final String f;
        public static final String g;
        public final int a;
        public final boolean b;
        public final boolean c;

        /* JADX INFO: renamed from: dqf$a$a, reason: collision with other inner class name */
        public static final class C0210a {
            public int a = 0;
            public boolean b = false;
            public boolean c = false;
        }

        static {
            String str = vjg.a;
            e = Integer.toString(1, 36);
            f = Integer.toString(2, 36);
            g = Integer.toString(3, 36);
        }

        public a(C0210a c0210a) {
            this.a = c0210a.a;
            this.b = c0210a.b;
            this.c = c0210a.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((((this.a + 31) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0);
        }
    }

    public static class b {
        public boolean A;
        public boolean B;
        public boolean C;
        public HashMap<wpf, cqf> D;
        public HashSet<Integer> E;
        public int e;
        public int f;
        public int g;
        public int h;
        public e47<String> m;
        public e47<String> n;
        public int o;
        public e47<String> p;
        public int q;
        public int r;
        public int s;
        public e47<String> t;
        public a u;
        public e47<String> v;
        public int w;
        public boolean x;
        public int y;
        public boolean z;
        public int a = Integer.MAX_VALUE;
        public int b = Integer.MAX_VALUE;
        public int c = Integer.MAX_VALUE;
        public int d = Integer.MAX_VALUE;
        public int i = Integer.MAX_VALUE;
        public int j = Integer.MAX_VALUE;
        public boolean k = true;
        public boolean l = true;

        public b() {
            e47.b bVar = e47.b;
            qyc qycVar = qyc.e;
            this.m = qycVar;
            this.n = qycVar;
            this.o = 0;
            this.p = qycVar;
            this.q = 0;
            this.r = Integer.MAX_VALUE;
            this.s = Integer.MAX_VALUE;
            this.t = qycVar;
            this.u = a.d;
            this.v = qycVar;
            this.w = 0;
            this.x = true;
            this.y = 0;
            this.z = false;
            this.A = false;
            this.B = false;
            this.C = false;
            this.D = new HashMap<>();
            this.E = new HashSet<>();
        }

        public static qyc f(String[] strArr) {
            e47.b bVar = e47.b;
            e47.a aVar = new e47.a();
            for (String str : strArr) {
                str.getClass();
                aVar.c(vjg.P(str));
            }
            return aVar.f();
        }

        public b a(cqf cqfVar) {
            this.D.put(cqfVar.a, cqfVar);
            return this;
        }

        public dqf b() {
            return new dqf(this);
        }

        public b c() {
            this.D.clear();
            return this;
        }

        public b d(int i) {
            Iterator<cqf> it = this.D.values().iterator();
            while (it.hasNext()) {
                if (it.next().a.c == i) {
                    it.remove();
                }
            }
            return this;
        }

        @EnsuresNonNull({"preferredVideoMimeTypes", "preferredVideoLanguages", "preferredAudioLanguages", "preferredAudioMimeTypes", "audioOffloadPreferences", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
        public final void e(dqf dqfVar) {
            this.a = dqfVar.a;
            this.b = dqfVar.b;
            this.c = dqfVar.c;
            this.d = dqfVar.d;
            this.e = dqfVar.e;
            this.f = dqfVar.f;
            this.g = dqfVar.g;
            this.h = dqfVar.h;
            this.i = dqfVar.i;
            this.j = dqfVar.j;
            this.k = dqfVar.k;
            this.l = dqfVar.l;
            this.m = dqfVar.m;
            this.n = dqfVar.n;
            this.o = dqfVar.o;
            this.p = dqfVar.p;
            this.q = dqfVar.q;
            this.r = dqfVar.r;
            this.s = dqfVar.s;
            this.t = dqfVar.t;
            this.u = dqfVar.u;
            this.v = dqfVar.v;
            this.w = dqfVar.w;
            this.x = dqfVar.x;
            this.y = dqfVar.y;
            this.z = dqfVar.z;
            this.A = dqfVar.A;
            this.B = dqfVar.B;
            this.C = dqfVar.C;
            this.E = new HashSet<>(dqfVar.E);
            this.D = new HashMap<>(dqfVar.D);
        }

        public b g(Set<Integer> set) {
            this.E.clear();
            this.E.addAll(set);
            return this;
        }

        public b h() {
            this.y = -3;
            return this;
        }

        public b i(cqf cqfVar) {
            wpf wpfVar = cqfVar.a;
            d(wpfVar.c);
            this.D.put(wpfVar, cqfVar);
            return this;
        }

        public b j() {
            return k(new String[0]);
        }

        public b k(String... strArr) {
            this.v = f(strArr);
            this.x = false;
            return this;
        }

        public b l() {
            this.w = 0;
            this.x = false;
            return this;
        }

        public b m(int i, boolean z) {
            HashSet<Integer> hashSet = this.E;
            if (z) {
                hashSet.add(Integer.valueOf(i));
                return this;
            }
            hashSet.remove(Integer.valueOf(i));
            return this;
        }
    }

    static {
        String str = vjg.a;
        G = Integer.toString(1, 36);
        H = Integer.toString(2, 36);
        I = Integer.toString(3, 36);
        J = Integer.toString(4, 36);
        K = Integer.toString(5, 36);
        L = Integer.toString(6, 36);
        M = Integer.toString(7, 36);
        N = Integer.toString(8, 36);
        O = Integer.toString(9, 36);
        P = Integer.toString(10, 36);
        Q = Integer.toString(11, 36);
        R = Integer.toString(12, 36);
        S = Integer.toString(13, 36);
        T = Integer.toString(14, 36);
        U = Integer.toString(15, 36);
        V = Integer.toString(16, 36);
        W = Integer.toString(17, 36);
        X = Integer.toString(18, 36);
        Y = Integer.toString(19, 36);
        Z = Integer.toString(20, 36);
        a0 = Integer.toString(21, 36);
        b0 = Integer.toString(22, 36);
        c0 = Integer.toString(23, 36);
        d0 = Integer.toString(24, 36);
        e0 = Integer.toString(25, 36);
        f0 = Integer.toString(26, 36);
        g0 = Integer.toString(27, 36);
        h0 = Integer.toString(28, 36);
        i0 = Integer.toString(29, 36);
        j0 = Integer.toString(30, 36);
        k0 = Integer.toString(31, 36);
        l0 = Integer.toString(32, 36);
        m0 = Integer.toString(33, 36);
        n0 = Integer.toString(34, 36);
    }

    public dqf(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
        this.m = bVar.m;
        this.n = bVar.n;
        this.o = bVar.o;
        this.p = bVar.p;
        this.q = bVar.q;
        this.r = bVar.r;
        this.s = bVar.s;
        this.t = bVar.t;
        this.u = bVar.u;
        this.v = bVar.v;
        this.w = bVar.w;
        this.x = bVar.x;
        this.y = bVar.y;
        this.z = bVar.z;
        this.A = bVar.A;
        this.B = bVar.B;
        this.C = bVar.C;
        this.D = f47.a(bVar.D);
        this.E = i47.k(bVar.E);
    }

    public static dqf b(Bundle bundle) {
        a aVar;
        qyc qycVarF;
        b bVar = new b();
        dqf dqfVar = F;
        bVar.a = bundle.getInt(L, dqfVar.a);
        bVar.b = bundle.getInt(M, dqfVar.b);
        bVar.c = bundle.getInt(N, dqfVar.c);
        bVar.d = bundle.getInt(O, dqfVar.d);
        bVar.e = bundle.getInt(P, dqfVar.e);
        bVar.f = bundle.getInt(Q, dqfVar.f);
        bVar.g = bundle.getInt(R, dqfVar.g);
        bVar.h = bundle.getInt(S, dqfVar.h);
        bVar.i = bundle.getInt(T, dqfVar.i);
        int i = bundle.getInt(U, dqfVar.j);
        bVar.j = i;
        bVar.k = bVar.i == Integer.MAX_VALUE && i == Integer.MAX_VALUE && bundle.getBoolean(m0, dqfVar.k);
        bVar.l = bundle.getBoolean(V, dqfVar.l);
        String[] stringArray = bundle.getStringArray(W);
        String[] strArr = new String[0];
        if (stringArray == null) {
            stringArray = strArr;
        }
        bVar.m = e47.k(stringArray);
        String[] stringArray2 = bundle.getStringArray(l0);
        String[] strArr2 = new String[0];
        if (stringArray2 == null) {
            stringArray2 = strArr2;
        }
        bVar.n = e47.k(stringArray2);
        bVar.o = bundle.getInt(e0, dqfVar.o);
        String[] stringArray3 = bundle.getStringArray(G);
        String[] strArr3 = new String[0];
        if (stringArray3 == null) {
            stringArray3 = strArr3;
        }
        bVar.p = b.f(stringArray3);
        bVar.q = bundle.getInt(H, dqfVar.q);
        bVar.r = bundle.getInt(X, dqfVar.r);
        bVar.s = bundle.getInt(Y, dqfVar.s);
        String[] stringArray4 = bundle.getStringArray(Z);
        String[] strArr4 = new String[0];
        if (stringArray4 == null) {
            stringArray4 = strArr4;
        }
        bVar.t = e47.k(stringArray4);
        Bundle bundle2 = bundle.getBundle(j0);
        if (bundle2 != null) {
            a.C0210a c0210a = new a.C0210a();
            String str = a.e;
            a aVar2 = a.d;
            c0210a.a = bundle2.getInt(str, aVar2.a);
            c0210a.b = bundle2.getBoolean(a.f, aVar2.b);
            c0210a.c = bundle2.getBoolean(a.g, aVar2.c);
            aVar = new a(c0210a);
        } else {
            a.C0210a c0210a2 = new a.C0210a();
            a aVar3 = a.d;
            c0210a2.a = bundle.getInt(g0, aVar3.a);
            c0210a2.b = bundle.getBoolean(h0, aVar3.b);
            c0210a2.c = bundle.getBoolean(i0, aVar3.c);
            aVar = new a(c0210a2);
        }
        bVar.u = aVar;
        String[] stringArray5 = bundle.getStringArray(I);
        String[] strArr5 = new String[0];
        if (stringArray5 == null) {
            stringArray5 = strArr5;
        }
        bVar.v = b.f(stringArray5);
        bVar.w = bundle.getInt(J, dqfVar.w);
        bVar.x = bVar.v.isEmpty() && bVar.w == 0 && bundle.getBoolean(n0, dqfVar.x);
        bVar.y = bundle.getInt(f0, dqfVar.y);
        bVar.z = bundle.getBoolean(K, dqfVar.z);
        bVar.A = bundle.getBoolean(k0, dqfVar.A);
        bVar.B = bundle.getBoolean(a0, dqfVar.B);
        bVar.C = bundle.getBoolean(b0, dqfVar.C);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(c0);
        if (parcelableArrayList == null) {
            qycVarF = qyc.e;
        } else {
            e47.b bVar2 = e47.b;
            e47.a aVar4 = new e47.a();
            for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                Bundle bundle3 = (Bundle) parcelableArrayList.get(i2);
                bundle3.getClass();
                Bundle bundle4 = bundle3.getBundle(cqf.c);
                bundle4.getClass();
                wpf wpfVarA = wpf.a(bundle4);
                int[] intArray = bundle3.getIntArray(cqf.d);
                intArray.getClass();
                aVar4.c(new cqf(wpfVarA, bm7.J1(intArray)));
            }
            qycVarF = aVar4.f();
        }
        bVar.D = new HashMap<>();
        for (int i3 = 0; i3 < qycVarF.d; i3++) {
            cqf cqfVar = (cqf) qycVarF.get(i3);
            bVar.D.put(cqfVar.a, cqfVar);
        }
        int[] intArray2 = bundle.getIntArray(d0);
        int[] iArr = new int[0];
        if (intArray2 == null) {
            intArray2 = iArr;
        }
        bVar.E = new HashSet<>();
        for (int i4 : intArray2) {
            bVar.E.add(Integer.valueOf(i4));
        }
        return new dqf(bVar);
    }

    public b a() {
        b bVar = new b();
        bVar.e(this);
        return bVar;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(L, this.a);
        bundle.putInt(M, this.b);
        bundle.putInt(N, this.c);
        bundle.putInt(O, this.d);
        bundle.putInt(P, this.e);
        bundle.putInt(Q, this.f);
        bundle.putInt(R, this.g);
        bundle.putInt(S, this.h);
        bundle.putInt(T, this.i);
        bundle.putInt(U, this.j);
        bundle.putBoolean(m0, this.k);
        bundle.putBoolean(V, this.l);
        bundle.putStringArray(W, (String[]) this.m.toArray(new String[0]));
        bundle.putStringArray(l0, (String[]) this.n.toArray(new String[0]));
        bundle.putInt(e0, this.o);
        bundle.putStringArray(G, (String[]) this.p.toArray(new String[0]));
        bundle.putInt(H, this.q);
        bundle.putInt(X, this.r);
        bundle.putInt(Y, this.s);
        bundle.putStringArray(Z, (String[]) this.t.toArray(new String[0]));
        bundle.putStringArray(I, (String[]) this.v.toArray(new String[0]));
        bundle.putInt(J, this.w);
        bundle.putBoolean(n0, this.x);
        bundle.putInt(f0, this.y);
        bundle.putBoolean(K, this.z);
        a aVar = this.u;
        bundle.putInt(g0, aVar.a);
        boolean z = aVar.b;
        bundle.putBoolean(h0, z);
        boolean z2 = aVar.c;
        bundle.putBoolean(i0, z2);
        Bundle bundle2 = new Bundle();
        bundle2.putInt(a.e, aVar.a);
        bundle2.putBoolean(a.f, z);
        bundle2.putBoolean(a.g, z2);
        bundle.putBundle(j0, bundle2);
        bundle.putBoolean(k0, this.A);
        bundle.putBoolean(a0, this.B);
        bundle.putBoolean(b0, this.C);
        x37<cqf> x37VarG = this.D.values();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(x37VarG.size());
        for (cqf cqfVar : x37VarG) {
            cqfVar.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putBundle(cqf.c, cqfVar.a.d());
            bundle3.putIntArray(cqf.d, bm7.P1(cqfVar.b));
            arrayList.add(bundle3);
        }
        bundle.putParcelableArrayList(c0, arrayList);
        bundle.putIntArray(d0, bm7.P1(this.E));
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dqf dqfVar = (dqf) obj;
            if (this.a == dqfVar.a && this.b == dqfVar.b && this.c == dqfVar.c && this.d == dqfVar.d && this.e == dqfVar.e && this.f == dqfVar.f && this.g == dqfVar.g && this.h == dqfVar.h && this.l == dqfVar.l && this.i == dqfVar.i && this.j == dqfVar.j && this.k == dqfVar.k && this.m.equals(dqfVar.m) && this.n.equals(dqfVar.n) && this.o == dqfVar.o && this.p.equals(dqfVar.p) && this.q == dqfVar.q && this.r == dqfVar.r && this.s == dqfVar.s && this.t.equals(dqfVar.t) && this.u.equals(dqfVar.u) && this.v.equals(dqfVar.v) && this.w == dqfVar.w && this.x == dqfVar.x && this.y == dqfVar.y && this.z == dqfVar.z && this.A == dqfVar.A && this.B == dqfVar.B && this.C == dqfVar.C) {
                f47<wpf, cqf> f47Var = dqfVar.D;
                f47<wpf, cqf> f47Var2 = this.D;
                f47Var2.getClass();
                if (jc9.b(f47Var, f47Var2) && this.E.equals(dqfVar.E)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.E.hashCode() + ((this.D.hashCode() + ((((((((((((((((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((((((((this.p.hashCode() + ((((this.n.hashCode() + ((this.m.hashCode() + ((((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + (this.l ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31) + (this.k ? 1 : 0)) * 31)) * 31)) * 31) + this.o) * 31)) * 31) + this.q) * 31) + this.r) * 31) + this.s) * 31)) * 31)) * 31)) * 31) + this.w) * 31) + (this.x ? 1 : 0)) * 31) + this.y) * 31) + (this.z ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31)) * 31);
    }
}
