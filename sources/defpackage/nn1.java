package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nn1 {
    public static final dn2 a = new dn2(new nf(4));
    public static final a b = new a();

    public static final class a implements mn1 {
        @Override // defpackage.mn1
        public final float a(float f, float f2, float f3) {
            float fAbs = Math.abs((f2 + f) - f);
            float f4 = (0.3f * f3) - (0.0f * fAbs);
            float f5 = f3 - f4;
            if ((fAbs <= f3) && f5 < fAbs) {
                f4 = f3 - fAbs;
            }
            return f - f4;
        }
    }
}
