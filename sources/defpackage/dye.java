package defpackage;

import defpackage.e47;

/* JADX INFO: loaded from: classes.dex */
public interface dye {

    public interface a {
        public static final C0212a a = new C0212a();

        /* JADX INFO: renamed from: dye$a$a, reason: collision with other inner class name */
        public class C0212a implements a {
            @Override // dye.a
            public final boolean a(androidx.media3.common.a aVar) {
                return false;
            }

            @Override // dye.a
            public final int b(androidx.media3.common.a aVar) {
                return 1;
            }

            @Override // dye.a
            public final dye c(androidx.media3.common.a aVar) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }
        }

        boolean a(androidx.media3.common.a aVar);

        int b(androidx.media3.common.a aVar);

        dye c(androidx.media3.common.a aVar);
    }

    public static class b {
        public static final b c = new b(-9223372036854775807L, false);
        public final long a;
        public final boolean b;

        public b(long j, boolean z) {
            this.a = j;
            this.b = z;
        }
    }

    default wxe a(int i, byte[] bArr, int i2) {
        e47.b bVar = e47.b;
        e47.a aVar = new e47.a();
        b(bArr, 0, i2, b.c, new k91(aVar));
        return new t83(aVar.f());
    }

    void b(byte[] bArr, int i, int i2, b bVar, wq2<s83> wq2Var);

    int c();

    default void reset() {
    }
}
