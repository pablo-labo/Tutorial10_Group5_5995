package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface pv1<M extends Member> {

    public static final class a {
        public static <M extends Member> void a(pv1<? extends M> pv1Var, Object[] objArr) {
            objArr.getClass();
            pv1Var.getClass();
            if (pv1Var.a().size() == objArr.length) {
                return;
            }
            StringBuilder sb = new StringBuilder("Callable expects ");
            sb.append(pv1Var.a().size());
            sb.append(" arguments, but ");
            l5.q(w20.k(sb, objArr.length, " were provided."));
        }
    }

    List<Type> a();

    boolean b();

    Object call(Object[] objArr);

    M getMember();

    Type getReturnType();
}
