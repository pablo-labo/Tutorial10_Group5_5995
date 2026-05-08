package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ogd {
    public a a = a.b;
    public float[] b = null;
    public int c = 0;
    public boolean d = false;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("OVERLAY_COLOR", 0);
            a = aVar;
            a aVar2 = new a("BITMAP_ONLY", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ogd.class != obj.getClass()) {
            return false;
        }
        ogd ogdVar = (ogd) obj;
        if (this.c == ogdVar.c && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && this.a == ogdVar.a && this.d == ogdVar.d) {
            return Arrays.equals(this.b, ogdVar.b);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 961;
        float[] fArr = this.b;
        return ((((iHashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.c) * 28629151) + (this.d ? 1 : 0);
    }
}
