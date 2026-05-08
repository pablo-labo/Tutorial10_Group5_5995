package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface mn1 {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final vpe b = zd0.c(0.0f, null, 7);
        public static final C0322a c = new C0322a();

        /* JADX INFO: renamed from: mn1$a$a, reason: collision with other inner class name */
        public static final class C0322a implements mn1 {
        }
    }

    default float a(float f, float f2, float f3) {
        a.getClass();
        float f4 = f2 + f;
        if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
            return 0.0f;
        }
        float f5 = f4 - f3;
        return Math.abs(f) < Math.abs(f5) ? f : f5;
    }
}
