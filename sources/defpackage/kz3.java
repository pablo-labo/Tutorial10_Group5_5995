package defpackage;

import defpackage.lz3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kz3 {

    public static final class a extends kz3 {
        public static final a a = new a();
        public static final int b;

        static {
            lz3.a aVar = lz3.c;
            aVar.getClass();
            int i = lz3.k;
            aVar.getClass();
            int i2 = lz3.i;
            aVar.getClass();
            b = (~(lz3.j | i2)) & i;
        }

        @Override // defpackage.kz3
        public final int a() {
            return b;
        }
    }

    public static final class b extends kz3 {
        public static final b a = new b();

        @Override // defpackage.kz3
        public final int a() {
            return 0;
        }
    }

    public abstract int a();

    public final String toString() {
        return getClass().getSimpleName();
    }
}
