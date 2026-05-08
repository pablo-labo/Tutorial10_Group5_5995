package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class sn1 {

    public static final class a {
        public static kx8 a(List list, float f, float f2, int i) {
            return new kx8((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i & 2) != 0 ? 0.0f : f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i & 4) != 0 ? Float.POSITIVE_INFINITY : f2)) & 4294967295L), list);
        }
    }

    public abstract void a(float f, long j, u2b u2bVar);
}
