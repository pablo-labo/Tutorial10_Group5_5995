package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public interface th0 {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final C0424a b = new C0424a();

        /* JADX INFO: renamed from: th0$a$a, reason: collision with other inner class name */
        public static final class C0424a extends f4<String> {
            @Override // defpackage.l1
            public final int a() {
                return 0;
            }

            @Override // defpackage.l1, java.util.Collection, java.util.Set
            public final /* bridge */ boolean contains(Object obj) {
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            }

            @Override // defpackage.f4, java.util.Collection, java.util.Set
            public final boolean equals(Object obj) {
                return obj == this;
            }

            @Override // defpackage.f4, java.util.Collection, java.util.Set
            public final int hashCode() {
                return 0;
            }

            @Override // java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<String> iterator() {
                return xr4.a;
            }
        }
    }
}
