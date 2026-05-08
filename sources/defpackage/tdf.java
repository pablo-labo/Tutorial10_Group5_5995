package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tdf {
    public static final d a = new d(null, false);
    public static final d b = new d(null, true);
    public static final d c;
    public static final d d;

    public static class a implements b {
        public static final a a = new a();

        /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
        @Override // tdf.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int a(java.lang.CharSequence r5, int r6) {
            /*
                r4 = this;
                r4 = 0
                r0 = 2
                r1 = r4
                r2 = r0
            L4:
                if (r1 >= r6) goto L24
                if (r2 != r0) goto L24
                char r2 = r5.charAt(r1)
                byte r2 = java.lang.Character.getDirectionality(r2)
                tdf$d r3 = defpackage.tdf.a
                r3 = 1
                if (r2 == 0) goto L20
                if (r2 == r3) goto L1e
                if (r2 == r0) goto L1e
                switch(r2) {
                    case 14: goto L20;
                    case 15: goto L20;
                    case 16: goto L1e;
                    case 17: goto L1e;
                    default: goto L1c;
                }
            L1c:
                r2 = r0
                goto L21
            L1e:
                r2 = r4
                goto L21
            L20:
                r2 = r3
            L21:
                int r1 = r1 + 1
                goto L4
            L24:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: tdf.a.a(java.lang.CharSequence, int):int");
        }
    }

    public interface b {
        int a(CharSequence charSequence, int i);
    }

    public static abstract class c {
        public final b a;

        public c(b bVar) {
            this.a = bVar;
        }

        public abstract boolean a();

        public final boolean b(CharSequence charSequence, int i) {
            if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
                o6.h();
                return false;
            }
            b bVar = this.a;
            if (bVar == null) {
                return a();
            }
            int iA = bVar.a(charSequence, i);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return a();
            }
            return false;
        }
    }

    public static class d extends c {
        public final boolean b;

        public d(a aVar, boolean z) {
            super(aVar);
            this.b = z;
        }

        @Override // tdf.c
        public final boolean a() {
            return this.b;
        }
    }

    static {
        a aVar = a.a;
        c = new d(aVar, false);
        d = new d(aVar, true);
    }
}
