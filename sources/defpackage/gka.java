package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gka extends xb1<fka, a> {
    public final bkd V;
    public final s0a W;
    public final q66 f;

    public static abstract class a implements uo6 {

        /* JADX INFO: renamed from: gka$a$a, reason: collision with other inner class name */
        public static final class C0250a extends a {
            public static final C0250a a = new C0250a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0250a);
            }

            public final int hashCode() {
                return 1481716510;
            }

            public final String toString() {
                return "CloseNonIABottomSheet";
            }
        }

        public static final class b extends a {
            public final String a;

            public b(String str) {
                str.getClass();
                this.a = str;
            }
        }

        public static final class c extends a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1569524053;
            }

            public final String toString() {
                return "ShowNonIABottomSheet";
            }
        }

        public static final class d extends a {
            public final String a;

            public d(String str) {
                str.getClass();
                this.a = str;
            }
        }
    }

    public gka(q66 q66Var, bkd bkdVar, s0a s0aVar) {
        this.f = q66Var;
        this.V = bkdVar;
        this.W = s0aVar;
    }

    @Override // defpackage.xb1
    public final xo6 h() {
        return new fka(0);
    }
}
