package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface u2e {

    public static final class a {
        public static final q2e a = new q2e();
        public static final r2e b = new r2e();
        public static final s2e c = new s2e();
        public static final t2e d = new t2e();

        /* JADX INFO: renamed from: u2e$a$a, reason: collision with other inner class name */
        public static final class C0427a implements zk1 {
            public static final C0427a a = new C0427a();

            @Override // defpackage.zk1
            public final long a(vzd vzdVar, int i) {
                String str = vzdVar.f.a.a.b;
                return cr8.c(zkd.A(str, i), zkd.z(str, i));
            }
        }

        public static final class b implements zk1 {
            public static final b a = new b();

            @Override // defpackage.zk1
            public final long a(vzd vzdVar, int i) {
                return vzdVar.f.j(i);
            }
        }
    }

    p2e a(u3e u3eVar);
}
