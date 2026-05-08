package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class g94 {
    public static final e a;
    public static final f b;
    public static final d c;
    public static final fva<g94> d;
    public static final boolean e;

    public static class a extends g94 {
        @Override // defpackage.g94
        public final g a(int i, int i2, int i3, int i4) {
            return g.b;
        }

        @Override // defpackage.g94
        public final float b(int i, int i2, int i3, int i4) {
            if (Math.min(i2 / i4, i / i3) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r0);
        }
    }

    public static class b extends g94 {
        @Override // defpackage.g94
        public final g a(int i, int i2, int i3, int i4) {
            return g.a;
        }

        @Override // defpackage.g94
        public final float b(int i, int i2, int i3, int i4) {
            int iCeil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            return 1.0f / (r1 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
        }
    }

    public static class c extends g94 {
        @Override // defpackage.g94
        public final g a(int i, int i2, int i3, int i4) {
            return b(i, i2, i3, i4) == 1.0f ? g.b : g94.a.a(i, i2, i3, i4);
        }

        @Override // defpackage.g94
        public final float b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, g94.a.b(i, i2, i3, i4));
        }
    }

    public static class d extends g94 {
        @Override // defpackage.g94
        public final g a(int i, int i2, int i3, int i4) {
            return g.b;
        }

        @Override // defpackage.g94
        public final float b(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    public static class e extends g94 {
        @Override // defpackage.g94
        public final g a(int i, int i2, int i3, int i4) {
            return g94.e ? g.b : g.a;
        }

        @Override // defpackage.g94
        public final float b(int i, int i2, int i3, int i4) {
            if (g94.e) {
                return Math.min(i3 / i, i4 / i2);
            }
            if (Math.max(i2 / i4, i / i3) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r0);
        }
    }

    public static class f extends g94 {
        @Override // defpackage.g94
        public final g a(int i, int i2, int i3, int i4) {
            return g.b;
        }

        @Override // defpackage.g94
        public final float b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class g {
        public static final g a;
        public static final g b;
        public static final /* synthetic */ g[] c;

        static {
            g gVar = new g("MEMORY", 0);
            a = gVar;
            g gVar2 = new g("QUALITY", 1);
            b = gVar2;
            c = new g[]{gVar, gVar2};
        }

        public g() {
            throw null;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) c.clone();
        }
    }

    static {
        new a();
        new b();
        a = new e();
        new c();
        d dVar = new d();
        b = new f();
        c = dVar;
        d = fva.a(dVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        e = true;
    }

    public abstract g a(int i, int i2, int i3, int i4);

    public abstract float b(int i, int i2, int i3, int i4);
}
