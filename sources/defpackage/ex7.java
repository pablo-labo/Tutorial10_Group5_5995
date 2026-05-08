package defpackage;

import defpackage.v03;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public interface ex7 extends v03.a {

    public static final class a implements v03.b<ex7> {
        public static final /* synthetic */ a a = new a();
    }

    CancellationException G();

    d42 L0(d78 d78Var);

    r6e<ex7> a();

    o74 d0(Function1<? super Throwable, j6g> function1);

    void h(CancellationException cancellationException);

    boolean isActive();

    boolean isCancelled();

    boolean o0();

    Object s0(pu2 pu2Var);

    boolean start();

    o74 v(boolean z, boolean z2, wy7 wy7Var);
}
