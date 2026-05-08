package defpackage;

import defpackage.c7e;
import defpackage.e69;
import defpackage.xpb;

/* JADX INFO: loaded from: classes3.dex */
public interface ce9 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final b a;
        public static final c b;
        public static final C0105a c;
        public static final d d;
        public static final /* synthetic */ a[] e;

        /* JADX INFO: renamed from: ce9$a$a, reason: collision with other inner class name */
        public static final class C0105a extends a {
            public C0105a() {
                super("DEFAULT", 2);
            }

            @Override // ce9.a
            public final void a(xpb.a aVar, en6 en6Var) {
                en6Var.getClass();
                throw new UnsupportedOperationException("Should not be invoked");
            }
        }

        public static final class b extends a {
            public b() {
                super("DONE", 0);
            }

            @Override // ce9.a
            public final void a(xpb.a aVar, en6 en6Var) {
                en6Var.getClass();
                xpb xpbVar = xpb.this;
                xpbVar.b.add(new c7e.a(new oh7(aVar.a, xpbVar.a, 1), en6Var));
            }
        }

        public static final class c extends a {
            public c() {
                super("DROP", 1);
            }

            @Override // ce9.a
            public final void a(xpb.a aVar, en6 en6Var) {
                en6Var.getClass();
            }
        }

        public static final class d extends a {
            public d() {
                super("NOTHING", 3);
            }

            @Override // ce9.a
            public final void a(xpb.a aVar, en6 en6Var) {
                en6Var.getClass();
            }
        }

        static {
            b bVar = new b();
            a = bVar;
            c cVar = new c();
            b = cVar;
            C0105a c0105a = new C0105a();
            c = c0105a;
            d dVar = new d();
            d = dVar;
            e = new a[]{bVar, cVar, c0105a, dVar};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }

        public abstract void a(xpb.a aVar, en6 en6Var);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final /* synthetic */ b[] c;

        static {
            b bVar = new b("PROPAGATE", 0);
            a = bVar;
            b bVar2 = new b("CANCEL", 1);
            b = bVar2;
            c = new b[]{bVar, bVar2};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) c.clone();
        }
    }

    public static final class c {
        public static final c d;
        public static final c e;
        public static final c f;
        public final a a;
        public final a b;
        public final b c;

        static {
            a.d dVar = a.d;
            b bVar = b.a;
            d = new c(dVar, dVar, bVar);
            e = new c(dVar, dVar, b.b);
            f = new c(a.c, a.a, bVar);
        }

        public c(a aVar, a aVar2, b bVar) {
            this.a = aVar;
            this.b = aVar2;
            this.c = bVar;
        }
    }

    int a(e69.a aVar);

    gd9 b();

    boolean c();

    c d(e69.a aVar, gd9 gd9Var);

    boolean e(a aVar);

    boolean f(e69.a aVar);
}
