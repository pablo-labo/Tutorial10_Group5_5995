package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m3c {
    public final a a;
    public final a b;
    public final int c;
    public final boolean d;

    public static final class a {
        public final b[] a;

        public a(b... bVarArr) {
            this.a = bVarArr;
        }
    }

    public static final class b {
        public final int a;
        public final int b;
        public final float[] c;
        public final float[] d;

        public b(int i, int i2, float[] fArr, float[] fArr2) {
            this.a = i;
            ka2.l(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.c = fArr;
            this.d = fArr2;
            this.b = i2;
        }
    }

    public m3c(a aVar, a aVar2, int i) {
        this.a = aVar;
        this.b = aVar2;
        this.c = i;
        this.d = aVar == aVar2;
    }
}
