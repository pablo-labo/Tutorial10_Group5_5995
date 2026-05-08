package defpackage;

import defpackage.wqc;

/* JADX INFO: loaded from: classes.dex */
public interface y54 {

    public static final class a {
        public final qd8 a = pa5.a;
        public final double b = 0.02d;
        public final long c = 10485760;
        public final long d = 262144000;
        public final no3 e;

        public a() {
            eq3 eq3Var = a74.a;
            this.e = no3.c;
        }
    }

    public interface b {
        void a();

        wqc.b b();
    }

    public interface c extends AutoCloseable {
        wqc.a g1();

        w5b getData();

        w5b getMetadata();
    }

    wqc.a a(String str);

    wqc.b b(String str);

    pa5 getFileSystem();
}
