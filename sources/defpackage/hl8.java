package defpackage;

import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class hl8 {
    public final List<ct2> a;
    public final s69 b;
    public final String c;
    public final long d;
    public final a e;
    public final long f;
    public final String g;
    public final List<ge9> h;
    public final rc0 i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final nc0 q;
    public final mte r;
    public final dc0 s;
    public final List<lh8<Float>> t;
    public final b u;
    public final boolean v;
    public final v w;
    public final id4 x;
    public final hj8 y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("PRE_COMP", 0);
            a = aVar;
            a aVar2 = new a("SOLID", 1);
            a aVar3 = new a("IMAGE", 2);
            b = aVar3;
            a aVar4 = new a("NULL", 3);
            a aVar5 = new a("SHAPE", 4);
            a aVar6 = new a("TEXT", 5);
            a aVar7 = new a("UNKNOWN", 6);
            c = aVar7;
            d = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final /* synthetic */ b[] c;

        static {
            b bVar = new b("NONE", 0);
            a = bVar;
            b bVar2 = new b("ADD", 1);
            b bVar3 = new b("INVERT", 2);
            b = bVar3;
            c = new b[]{bVar, bVar2, bVar3, new b("LUMA", 3), new b("LUMA_INVERTED", 4), new b("UNKNOWN", 5)};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) c.clone();
        }
    }

    public hl8(List<ct2> list, s69 s69Var, String str, long j, a aVar, long j2, String str2, List<ge9> list2, rc0 rc0Var, int i, int i2, int i3, float f, float f2, float f3, float f4, nc0 nc0Var, mte mteVar, List<lh8<Float>> list3, b bVar, dc0 dc0Var, boolean z, v vVar, id4 id4Var, hj8 hj8Var) {
        this.a = list;
        this.b = s69Var;
        this.c = str;
        this.d = j;
        this.e = aVar;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = rc0Var;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = f;
        this.n = f2;
        this.o = f3;
        this.p = f4;
        this.q = nc0Var;
        this.r = mteVar;
        this.t = list3;
        this.u = bVar;
        this.s = dc0Var;
        this.v = z;
        this.w = vVar;
        this.x = id4Var;
        this.y = hj8Var;
    }

    public final String a(String str) {
        int i;
        StringBuilder sbG = q6.g(str);
        sbG.append(this.c);
        sbG.append("\n");
        long j = this.f;
        s69 s69Var = this.b;
        hl8 hl8VarD = s69Var.i.d(j);
        if (hl8VarD != null) {
            sbG.append("\t\tParents: ");
            sbG.append(hl8VarD.c);
            for (hl8 hl8VarD2 = s69Var.i.d(hl8VarD.f); hl8VarD2 != null; hl8VarD2 = s69Var.i.d(hl8VarD2.f)) {
                sbG.append("->");
                sbG.append(hl8VarD2.c);
            }
            sbG.append(str);
            sbG.append("\n");
        }
        List<ge9> list = this.h;
        if (!list.isEmpty()) {
            sbG.append(str);
            sbG.append("\tMasks: ");
            sbG.append(list.size());
            sbG.append("\n");
        }
        int i2 = this.j;
        if (i2 != 0 && (i = this.k) != 0) {
            sbG.append(str);
            sbG.append("\tBackground: ");
            sbG.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.l)));
        }
        List<ct2> list2 = this.a;
        if (!list2.isEmpty()) {
            sbG.append(str);
            sbG.append("\tShapes:\n");
            for (ct2 ct2Var : list2) {
                sbG.append(str);
                sbG.append("\t\t");
                sbG.append(ct2Var);
                sbG.append("\n");
            }
        }
        return sbG.toString();
    }

    public final String toString() {
        return a("");
    }
}
