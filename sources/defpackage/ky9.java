package defpackage;

import defpackage.v03;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface ky9 extends v03.a {

    public static final class a implements v03.b<ky9> {
        public static final /* synthetic */ a a = new a();
    }

    <R> Object W(Function1<? super Long, ? extends R> function1, lu2<? super R> lu2Var);

    @Override // v03.a
    default v03.b<?> getKey() {
        return a.a;
    }
}
