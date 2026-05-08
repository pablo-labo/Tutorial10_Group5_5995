package defpackage;

import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class q65 extends s3 {
    public final a c = new a();

    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        public final Random initialValue() {
            return new Random();
        }
    }

    @Override // defpackage.s3
    public final Random a() {
        Random random = this.c.get();
        random.getClass();
        return random;
    }
}
