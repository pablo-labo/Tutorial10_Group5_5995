package defpackage;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public interface in9 extends z4d {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
    }

    public static final class b extends jn9 {
        public static final b b = new b();

        @Override // defpackage.jn9, defpackage.in9
        public final Set<n8a> a() {
            return is4.a;
        }

        @Override // defpackage.jn9, defpackage.in9
        public final Set<n8a> c() {
            return is4.a;
        }

        @Override // defpackage.jn9, defpackage.in9
        public final Set<n8a> g() {
            return is4.a;
        }
    }

    Set<n8a> a();

    Collection b(n8a n8aVar, dia diaVar);

    Set<n8a> c();

    Collection<? extends sfe> e(n8a n8aVar, dia diaVar);

    Set<n8a> g();
}
