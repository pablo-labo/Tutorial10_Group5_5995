package defpackage;

import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class tfd extends e.c implements sfd {
    public Function1<? super ufd, Boolean> d0;

    public tfd() {
        throw null;
    }

    @Override // defpackage.sfd
    public final boolean H0(ufd ufdVar) {
        Function1<? super ufd, Boolean> function1 = this.d0;
        if (function1 != null) {
            return function1.invoke(ufdVar).booleanValue();
        }
        return false;
    }

    @Override // defpackage.sfd
    public final boolean l0(ufd ufdVar) {
        return false;
    }
}
