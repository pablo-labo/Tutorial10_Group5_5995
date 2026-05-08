package defpackage;

import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public interface z4d {

    public static final class a {
        public static /* synthetic */ Collection a(z4d z4dVar, lz3 lz3Var, int i) {
            if ((i & 1) != 0) {
                lz3Var = lz3.m;
            }
            in9.a.getClass();
            return z4dVar.f(lz3Var, zz3.c);
        }
    }

    v62 d(n8a n8aVar, dia diaVar);

    Collection<aj3> f(lz3 lz3Var, Function1<? super n8a, Boolean> function1);
}
