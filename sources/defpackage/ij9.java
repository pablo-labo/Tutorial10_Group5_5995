package defpackage;

import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.StreamKey;
import defpackage.e47;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ij9 {
    public static final ij9 g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public final String a;
    public final f b;
    public final e c;
    public final oj9 d;
    public final c e;
    public final g f;

    public static final class a {
        public static final String b;
        public final Uri a;

        /* JADX INFO: renamed from: ij9$a$a, reason: collision with other inner class name */
        public static final class C0269a {
            public Uri a;
        }

        static {
            String str = vjg.a;
            b = Integer.toString(0, 36);
        }

        public a(C0269a c0269a) {
            this.a = c0269a.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode() * 31;
        }
    }

    public static class b {
        public static final b i = new b(new a());
        public static final String j = Integer.toString(0, 36);
        public static final String k = Integer.toString(1, 36);
        public static final String l = Integer.toString(2, 36);
        public static final String m = Integer.toString(3, 36);
        public static final String n = Integer.toString(4, 36);
        public static final String o = Integer.toString(5, 36);
        public static final String p = Integer.toString(6, 36);
        public static final String q = Integer.toString(7, 36);
        public final long a;
        public final long b;
        public final long c;
        public final long d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;

        public static final class a {
            public long a;
            public long b = Long.MIN_VALUE;
            public boolean c;
            public boolean d;
            public boolean e;
            public boolean f;
        }

        public b(a aVar) {
            this.a = vjg.c0(aVar.a);
            this.c = vjg.c0(aVar.b);
            this.b = aVar.a;
            this.d = aVar.b;
            this.e = aVar.c;
            this.f = aVar.d;
            this.g = aVar.e;
            this.h = aVar.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h;
        }

        public final int hashCode() {
            long j2 = this.b;
            int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
            long j3 = this.d;
            return ((((((((i2 + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
        }
    }

    @Deprecated
    public static final class c extends b {
        public static final c r = new c(new b.a());
    }

    public static final class e {
        public static final e f = new e(new a());
        public static final String g;
        public static final String h;
        public static final String i;
        public static final String j;
        public static final String k;
        public final long a;
        public final long b;
        public final long c;
        public final float d;
        public final float e;

        public static final class a {
            public long a = -9223372036854775807L;
            public long b = -9223372036854775807L;
            public long c = -9223372036854775807L;
            public float d = -3.4028235E38f;
            public float e = -3.4028235E38f;
        }

        static {
            String str = vjg.a;
            g = Integer.toString(0, 36);
            h = Integer.toString(1, 36);
            i = Integer.toString(2, 36);
            j = Integer.toString(3, 36);
            k = Integer.toString(4, 36);
        }

        public e(a aVar) {
            long j2 = aVar.a;
            long j3 = aVar.b;
            long j4 = aVar.c;
            float f2 = aVar.d;
            float f3 = aVar.e;
            this.a = j2;
            this.b = j3;
            this.c = j4;
            this.d = f2;
            this.e = f3;
        }

        public static e b(Bundle bundle) {
            a aVar = new a();
            e eVar = f;
            aVar.a = bundle.getLong(g, eVar.a);
            aVar.b = bundle.getLong(h, eVar.b);
            aVar.c = bundle.getLong(i, eVar.c);
            aVar.d = bundle.getFloat(j, eVar.d);
            aVar.e = bundle.getFloat(k, eVar.e);
            return new e(aVar);
        }

        public final a a() {
            a aVar = new a();
            aVar.a = this.a;
            aVar.b = this.b;
            aVar.c = this.c;
            aVar.d = this.d;
            aVar.e = this.e;
            return aVar;
        }

        public final Bundle c() {
            Bundle bundle = new Bundle();
            e eVar = f;
            long j2 = eVar.a;
            long j3 = this.a;
            if (j3 != j2) {
                bundle.putLong(g, j3);
            }
            long j4 = eVar.b;
            long j5 = this.b;
            if (j5 != j4) {
                bundle.putLong(h, j5);
            }
            long j6 = eVar.c;
            long j7 = this.c;
            if (j7 != j6) {
                bundle.putLong(i, j7);
            }
            float f2 = eVar.d;
            float f3 = this.d;
            if (f3 != f2) {
                bundle.putFloat(j, f3);
            }
            float f4 = eVar.e;
            float f5 = this.e;
            if (f5 != f4) {
                bundle.putFloat(k, f5);
            }
            return bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.d == eVar.d && this.e == eVar.e;
        }

        public final int hashCode() {
            long j2 = this.a;
            long j3 = this.b;
            int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.c;
            int i3 = (i2 + ((int) ((j4 >>> 32) ^ j4))) * 31;
            float f2 = this.d;
            int iFloatToIntBits = (i3 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.e;
            return iFloatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
        }
    }

    public static final class f {
        public static final String i;
        public static final String j;
        public static final String k;
        public static final String l;
        public static final String m;
        public static final String n;
        public static final String o;
        public static final String p;
        public final Uri a;
        public final String b;
        public final d c;
        public final a d;
        public final List<StreamKey> e;
        public final String f;
        public final e47<i> g;
        public final long h;

        static {
            String str = vjg.a;
            i = Integer.toString(0, 36);
            j = Integer.toString(1, 36);
            k = Integer.toString(2, 36);
            l = Integer.toString(3, 36);
            m = Integer.toString(4, 36);
            n = Integer.toString(5, 36);
            o = Integer.toString(6, 36);
            p = Integer.toString(7, 36);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(Uri uri, String str, d dVar, a aVar, List list, String str2, e47 e47Var, long j2) {
            this.a = uri;
            this.b = st9.p(str);
            this.c = dVar;
            this.d = aVar;
            this.e = list;
            this.f = str2;
            this.g = e47Var;
            e47.b bVar = e47.b;
            e47.a aVar2 = new e47.a();
            for (int i2 = 0; i2 < e47Var.size(); i2++) {
                i iVar = (i) e47Var.get(i2);
                i.a aVar3 = new i.a();
                aVar3.a = iVar.a;
                aVar3.b = iVar.b;
                aVar3.c = iVar.c;
                aVar3.d = iVar.d;
                aVar3.e = iVar.e;
                aVar3.f = iVar.f;
                aVar3.g = iVar.g;
                aVar2.c(new h(aVar3));
            }
            aVar2.f();
            this.h = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a.equals(fVar.a) && Objects.equals(this.b, fVar.b) && Objects.equals(this.c, fVar.c) && Objects.equals(this.d, fVar.d) && this.e.equals(fVar.e) && Objects.equals(this.f, fVar.f) && this.g.equals(fVar.g) && this.h == fVar.h;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            d dVar = this.c;
            int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            a aVar = this.d;
            int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31;
            String str2 = this.f;
            return (int) ((((long) ((this.g.hashCode() + ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31) + this.h);
        }
    }

    public static final class g {
        public static final g d = new g(new a());
        public static final String e;
        public static final String f;
        public static final String g;
        public final Uri a;
        public final String b;
        public final Bundle c;

        public static final class a {
            public Uri a;
            public String b;
            public Bundle c;
        }

        static {
            String str = vjg.a;
            e = Integer.toString(0, 36);
            f = Integer.toString(1, 36);
            g = Integer.toString(2, 36);
        }

        public g(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (Objects.equals(this.a, gVar.a) && Objects.equals(this.b, gVar.b)) {
                if ((this.c == null) == (gVar.c == null)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Uri uri = this.a;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.b;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.c != null ? 1 : 0);
        }
    }

    @Deprecated
    public static final class h extends i {
    }

    public static class i {
        public static final String h;
        public static final String i;
        public static final String j;
        public static final String k;
        public static final String l;
        public static final String m;
        public static final String n;
        public final Uri a;
        public final String b;
        public final String c;
        public final int d;
        public final int e;
        public final String f;
        public final String g;

        public static final class a {
            public Uri a;
            public String b;
            public String c;
            public int d;
            public int e;
            public String f;
            public String g;
        }

        static {
            String str = vjg.a;
            h = Integer.toString(0, 36);
            i = Integer.toString(1, 36);
            j = Integer.toString(2, 36);
            k = Integer.toString(3, 36);
            l = Integer.toString(4, 36);
            m = Integer.toString(5, 36);
            n = Integer.toString(6, 36);
        }

        public i(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.a.equals(iVar.a) && Objects.equals(this.b, iVar.b) && Objects.equals(this.c, iVar.c) && this.d == iVar.d && this.e == iVar.e && Objects.equals(this.f, iVar.f) && Objects.equals(this.g, iVar.g);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d) * 31) + this.e) * 31;
            String str3 = this.f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.g;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    static {
        b.a aVar = new b.a();
        ryc rycVar = ryc.V;
        e47.b bVar = e47.b;
        qyc qycVar = qyc.e;
        List list = Collections.EMPTY_LIST;
        qyc qycVar2 = qyc.e;
        e.a aVar2 = new e.a();
        g = new ij9("", new c(aVar), null, new e(aVar2), oj9.K, g.d);
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
    }

    public ij9(String str, c cVar, f fVar, e eVar, oj9 oj9Var, g gVar) {
        this.a = str;
        this.b = fVar;
        this.c = eVar;
        this.d = oj9Var;
        this.e = cVar;
        this.f = gVar;
    }

    public static ij9 a(Bundle bundle) {
        c cVar;
        g gVar;
        Map mapA;
        d dVar;
        a aVar;
        qyc qycVarF;
        qyc qycVarA;
        f fVar;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(i);
        e eVarB = bundle2 == null ? e.f : e.b(bundle2);
        Bundle bundle3 = bundle.getBundle(j);
        oj9 oj9VarB = bundle3 == null ? oj9.K : oj9.b(bundle3);
        Bundle bundle4 = bundle.getBundle(k);
        if (bundle4 == null) {
            cVar = c.r;
        } else {
            b.a aVar2 = new b.a();
            String str = b.j;
            b bVar = b.i;
            long j2 = bVar.a;
            long j3 = bVar.d;
            long j4 = bVar.b;
            long jO = vjg.O(bundle4.getLong(str, j2));
            boolean z = true;
            ka2.l(jO >= 0);
            aVar2.a = jO;
            long jO2 = vjg.O(bundle4.getLong(b.k, bVar.c));
            ka2.l(jO2 == Long.MIN_VALUE || jO2 >= 0);
            aVar2.b = jO2;
            aVar2.c = bundle4.getBoolean(b.l, bVar.e);
            aVar2.d = bundle4.getBoolean(b.m, bVar.f);
            aVar2.e = bundle4.getBoolean(b.n, bVar.g);
            aVar2.f = bundle4.getBoolean(b.q, bVar.h);
            long j5 = bundle4.getLong(b.o, j4);
            if (j5 != j4) {
                ka2.l(j5 >= 0);
                aVar2.a = j5;
            }
            long j6 = bundle4.getLong(b.p, j3);
            if (j6 != j3) {
                if (j6 != Long.MIN_VALUE && j6 < 0) {
                    z = false;
                }
                ka2.l(z);
                aVar2.b = j6;
            }
            cVar = new c(aVar2);
        }
        c cVar2 = cVar;
        Bundle bundle5 = bundle.getBundle(l);
        if (bundle5 == null) {
            gVar = g.d;
        } else {
            g.a aVar3 = new g.a();
            aVar3.a = (Uri) bundle5.getParcelable(g.e);
            aVar3.b = bundle5.getString(g.f);
            aVar3.c = bundle5.getBundle(g.g);
            gVar = new g(aVar3);
        }
        g gVar2 = gVar;
        Bundle bundle6 = bundle.getBundle(m);
        if (bundle6 == null) {
            fVar = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(f.k);
            if (bundle7 == null) {
                dVar = null;
            } else {
                String string2 = bundle7.getString(d.i);
                string2.getClass();
                UUID uuidFromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(d.j);
                String str2 = d.k;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str2);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    mapA = ryc.V;
                } else {
                    HashMap map = new HashMap();
                    if (bundle9 != bundle8) {
                        for (String str3 : bundle9.keySet()) {
                            String string3 = bundle9.getString(str3);
                            if (string3 != null) {
                                map.put(str3, string3);
                            }
                        }
                    }
                    mapA = f47.a(map);
                }
                boolean z2 = bundle7.getBoolean(d.l, false);
                boolean z3 = bundle7.getBoolean(d.m, false);
                boolean z4 = bundle7.getBoolean(d.n, false);
                String str4 = d.o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str4);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                e47 e47VarJ = e47.j(arrayList);
                byte[] byteArray = bundle7.getByteArray(d.p);
                d.a aVar4 = new d.a(uuidFromString);
                aVar4.b = uri;
                aVar4.c = f47.a(mapA);
                aVar4.d = z2;
                aVar4.f = z4;
                aVar4.e = z3;
                aVar4.g = e47.j(e47VarJ);
                aVar4.h = byteArray != null ? Arrays.copyOf(byteArray, byteArray.length) : null;
                dVar = new d(aVar4);
            }
            Bundle bundle10 = bundle6.getBundle(f.l);
            if (bundle10 == null) {
                aVar = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(a.b);
                uri2.getClass();
                a.C0269a c0269a = new a.C0269a();
                c0269a.a = uri2;
                aVar = new a(c0269a);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(f.m);
            if (parcelableArrayList == null) {
                e47.b bVar2 = e47.b;
                qycVarF = qyc.e;
            } else {
                e47.b bVar3 = e47.b;
                e47.a aVar5 = new e47.a();
                int i2 = 0;
                while (i2 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i2);
                    bundle11.getClass();
                    aVar5.c(new StreamKey(bundle11.getInt(StreamKey.d, 0), bundle11.getInt(StreamKey.e, 0), bundle11.getInt(StreamKey.f, 0)));
                    i2++;
                    parcelableArrayList = parcelableArrayList;
                }
                qycVarF = aVar5.f();
            }
            qyc qycVar = qycVarF;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(f.o);
            if (parcelableArrayList2 == null) {
                e47.b bVar4 = e47.b;
                qycVarA = qyc.e;
            } else {
                qycVarA = vp1.a(new r40(12), parcelableArrayList2);
            }
            qyc qycVar2 = qycVarA;
            long j7 = bundle6.getLong(f.p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(f.i);
            uri3.getClass();
            fVar = new f(uri3, bundle6.getString(f.j), dVar, aVar, qycVar, bundle6.getString(f.n), qycVar2, j7);
        }
        return new ij9(string, cVar2, fVar, eVarB, oj9VarB, gVar2);
    }

    public final Bundle b(boolean z) {
        f fVar;
        Bundle bundle = new Bundle();
        String str = this.a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        e eVar = e.f;
        e eVar2 = this.c;
        if (!eVar2.equals(eVar)) {
            bundle.putBundle(i, eVar2.c());
        }
        oj9 oj9Var = oj9.K;
        oj9 oj9Var2 = this.d;
        if (!oj9Var2.equals(oj9Var)) {
            bundle.putBundle(j, oj9Var2.c());
        }
        b bVar = b.i;
        c cVar = this.e;
        if (!cVar.equals(bVar)) {
            Bundle bundle2 = new Bundle();
            long j2 = cVar.a;
            if (j2 != bVar.a) {
                bundle2.putLong(b.j, j2);
            }
            long j3 = cVar.c;
            if (j3 != bVar.c) {
                bundle2.putLong(b.k, j3);
            }
            long j4 = cVar.b;
            if (j4 != bVar.b) {
                bundle2.putLong(b.o, j4);
            }
            long j5 = cVar.d;
            if (j5 != bVar.d) {
                bundle2.putLong(b.p, j5);
            }
            boolean z2 = cVar.e;
            if (z2 != bVar.e) {
                bundle2.putBoolean(b.l, z2);
            }
            boolean z3 = cVar.f;
            if (z3 != bVar.f) {
                bundle2.putBoolean(b.m, z3);
            }
            boolean z4 = cVar.g;
            if (z4 != bVar.g) {
                bundle2.putBoolean(b.n, z4);
            }
            boolean z5 = cVar.h;
            if (z5 != bVar.h) {
                bundle2.putBoolean(b.q, z5);
            }
            bundle.putBundle(k, bundle2);
        }
        g gVar = g.d;
        g gVar2 = this.f;
        if (!gVar2.equals(gVar)) {
            Bundle bundle3 = new Bundle();
            Uri uri = gVar2.a;
            if (uri != null) {
                bundle3.putParcelable(g.e, uri);
            }
            String str2 = gVar2.b;
            if (str2 != null) {
                bundle3.putString(g.f, str2);
            }
            Bundle bundle4 = gVar2.c;
            if (bundle4 != null) {
                bundle3.putBundle(g.g, bundle4);
            }
            bundle.putBundle(l, bundle3);
        }
        if (z && (fVar = this.b) != null) {
            e47<i> e47Var = fVar.g;
            List<StreamKey> list = fVar.e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(f.i, fVar.a);
            String str3 = fVar.b;
            if (str3 != null) {
                bundle5.putString(f.j, str3);
            }
            d dVar = fVar.c;
            if (dVar != null) {
                String str4 = f.k;
                e47<Integer> e47Var2 = dVar.g;
                f47<String, String> f47Var = dVar.c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(d.i, dVar.a.toString());
                Uri uri2 = dVar.b;
                if (uri2 != null) {
                    bundle6.putParcelable(d.j, uri2);
                }
                if (!f47Var.isEmpty()) {
                    String str5 = d.k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : f47Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z6 = dVar.d;
                if (z6) {
                    bundle6.putBoolean(d.l, z6);
                }
                boolean z7 = dVar.e;
                if (z7) {
                    bundle6.putBoolean(d.m, z7);
                }
                boolean z8 = dVar.f;
                if (z8) {
                    bundle6.putBoolean(d.n, z8);
                }
                if (!e47Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(d.o, new ArrayList<>(e47Var2));
                }
                byte[] bArr = dVar.h;
                if (bArr != null) {
                    bundle6.putByteArray(d.p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            a aVar = fVar.d;
            if (aVar != null) {
                String str6 = f.l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(a.b, aVar.a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(f.m, vp1.b(list, new r6()));
            }
            String str7 = fVar.f;
            if (str7 != null) {
                bundle5.putString(f.n, str7);
            }
            if (!e47Var.isEmpty()) {
                bundle5.putParcelableArrayList(f.o, vp1.b(e47Var, new s6()));
            }
            long j6 = fVar.h;
            if (j6 != -9223372036854775807L) {
                bundle5.putLong(f.p, j6);
            }
            bundle.putBundle(m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij9)) {
            return false;
        }
        ij9 ij9Var = (ij9) obj;
        return Objects.equals(this.a, ij9Var.a) && this.e.equals(ij9Var.e) && Objects.equals(this.b, ij9Var.b) && Objects.equals(this.c, ij9Var.c) && Objects.equals(this.d, ij9Var.d) && Objects.equals(this.f, ij9Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        f fVar = this.b;
        return this.f.hashCode() + ((this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((iHashCode + (fVar != null ? fVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public static final class d {
        public static final String i;
        public static final String j;
        public static final String k;
        public static final String l;
        public static final String m;
        public static final String n;
        public static final String o;
        public static final String p;
        public final UUID a;
        public final Uri b;
        public final f47<String, String> c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final e47<Integer> g;
        public final byte[] h;

        static {
            String str = vjg.a;
            i = Integer.toString(0, 36);
            j = Integer.toString(1, 36);
            k = Integer.toString(2, 36);
            l = Integer.toString(3, 36);
            m = Integer.toString(4, 36);
            n = Integer.toString(5, 36);
            o = Integer.toString(6, 36);
            p = Integer.toString(7, 36);
        }

        public d(a aVar) {
            ka2.q((aVar.f && aVar.b == null) ? false : true);
            UUID uuid = aVar.a;
            uuid.getClass();
            this.a = uuid;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.f = aVar.f;
            this.e = aVar.e;
            this.g = aVar.g;
            byte[] bArr = aVar.h;
            this.h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        }

        public final a a() {
            a aVar = new a();
            aVar.a = this.a;
            aVar.b = this.b;
            aVar.c = this.c;
            aVar.d = this.d;
            aVar.e = this.e;
            aVar.f = this.f;
            aVar.g = this.g;
            aVar.h = this.h;
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && Objects.equals(this.b, dVar.b) && Objects.equals(this.c, dVar.c) && this.d == dVar.d && this.f == dVar.f && this.e == dVar.e && this.g.equals(dVar.g) && Arrays.equals(this.h, dVar.h);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            Uri uri = this.b;
            return Arrays.hashCode(this.h) + ((this.g.hashCode() + ((((((((this.c.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
        }

        public static final class a {
            public UUID a;
            public Uri b;
            public f47<String, String> c;
            public boolean d;
            public boolean e;
            public boolean f;
            public e47<Integer> g;
            public byte[] h;

            @Deprecated
            public a() {
                this.c = ryc.V;
                this.e = true;
                e47.b bVar = e47.b;
                this.g = qyc.e;
            }

            public a(UUID uuid) {
                this();
                this.a = uuid;
            }
        }
    }
}
