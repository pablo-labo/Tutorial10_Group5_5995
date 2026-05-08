package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xce implements ct2 {
    public final String a;
    public final dc0 b;
    public final ArrayList c;
    public final cc0 d;
    public final fc0 e;
    public final dc0 f;
    public final a g;
    public final b h;
    public final float i;
    public final boolean j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final /* synthetic */ a[] b;

        static {
            a aVar = new a("BUTT", 0);
            a = aVar;
            b = new a[]{aVar, new a("ROUND", 1), new a("UNKNOWN", 2)};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final /* synthetic */ b[] b;

        static {
            b bVar = new b("MITER", 0);
            a = bVar;
            b = new b[]{bVar, new b("ROUND", 1), new b("BEVEL", 2)};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) b.clone();
        }
    }

    public xce(String str, dc0 dc0Var, ArrayList arrayList, cc0 cc0Var, fc0 fc0Var, dc0 dc0Var2, a aVar, b bVar, float f, boolean z) {
        this.a = str;
        this.b = dc0Var;
        this.c = arrayList;
        this.d = cc0Var;
        this.e = fc0Var;
        this.f = dc0Var2;
        this.g = aVar;
        this.h = bVar;
        this.i = f;
        this.j = z;
    }

    @Override // defpackage.ct2
    public final ks2 a(j79 j79Var, s69 s69Var, ba1 ba1Var) {
        return new cwe(j79Var, ba1Var, this);
    }
}
