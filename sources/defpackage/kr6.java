package defpackage;

import java.security.SecureRandom;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kr6 {
    public final boolean a;

    public static final class a extends kr6 {
        @Override // defpackage.kr6
        public final long c() {
            return ThreadLocalRandom.current().nextLong(0L, Long.MAX_VALUE) + 1;
        }
    }

    public static final class b extends kr6 {
        public final SecureRandom b;

        public b(boolean z) {
            super(z);
            try {
                this.b = SecureRandom.getInstanceStrong();
            } catch (Throwable th) {
                throw new ExceptionInInitializerError(th);
            }
        }

        @Override // defpackage.kr6
        public final long c() {
            SecureRandom secureRandom = this.b;
            long jNextLong = secureRandom.nextLong();
            while (true) {
                long j = jNextLong & Long.MAX_VALUE;
                if (j != 0) {
                    return j;
                }
                jNextLong = secureRandom.nextLong();
            }
        }
    }

    public static final class c extends kr6 {
        public final AtomicLong b;

        public c(boolean z) {
            super(z);
            this.b = new AtomicLong(0L);
        }

        @Override // defpackage.kr6
        public final tc3 b() {
            return mc3.b(this.b.incrementAndGet());
        }

        @Override // defpackage.kr6
        public final long c() {
            return this.b.incrementAndGet();
        }
    }

    public kr6(boolean z) {
        this.a = z;
    }

    public static kr6 a(String str, boolean z) {
        String upperCase = str.toUpperCase(Locale.US);
        upperCase.getClass();
        switch (upperCase) {
            case "RANDOM":
                return new a(z);
            case "SEQUENTIAL":
                return new c(z);
            case "SECURE_RANDOM":
                return new b(z);
            default:
                return null;
        }
    }

    public tc3 b() {
        return this.a ? new lc3((System.currentTimeMillis() / 1000) << 32, c()) : mc3.b(c());
    }

    public abstract long c();
}
