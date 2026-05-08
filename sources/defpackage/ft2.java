package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface ft2 {

    public static final class a {
        public static final C0244a a = new C0244a();
        public static final e b = new e();
        public static final c c = new c();
        public static final d d = new d();
        public static final f e = new f();
        public static final qg5 f = new qg5();
        public static final b g = new b();

        /* JADX INFO: renamed from: ft2$a$a, reason: collision with other inner class name */
        public static final class C0244a implements ft2 {
            @Override // defpackage.ft2
            public final long a(long j, long j2) {
                float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i = wmd.a;
                return jFloatToRawIntBits;
            }
        }

        public static final class b implements ft2 {
            @Override // defpackage.ft2
            public final long a(long j, long j2) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                int i = wmd.a;
                return jFloatToRawIntBits;
            }
        }

        public static final class c implements ft2 {
            @Override // defpackage.ft2
            public final long a(long j, long j2) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                int i = wmd.a;
                return jFloatToRawIntBits;
            }
        }

        public static final class d implements ft2 {
            @Override // defpackage.ft2
            public final long a(long j, long j2) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                int i = wmd.a;
                return jFloatToRawIntBits;
            }
        }

        public static final class e implements ft2 {
            @Override // defpackage.ft2
            public final long a(long j, long j2) {
                float fE = cr8.e(j, j2);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fE)) << 32) | (((long) Float.floatToRawIntBits(fE)) & 4294967295L);
                int i = wmd.a;
                return jFloatToRawIntBits;
            }
        }

        public static final class f implements ft2 {
            @Override // defpackage.ft2
            public final long a(long j, long j2) {
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i = wmd.a;
                    return jFloatToRawIntBits;
                }
                float fE = cr8.e(j, j2);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fE)) << 32) | (((long) Float.floatToRawIntBits(fE)) & 4294967295L);
                int i2 = wmd.a;
                return jFloatToRawIntBits2;
            }
        }
    }

    long a(long j, long j2);
}
