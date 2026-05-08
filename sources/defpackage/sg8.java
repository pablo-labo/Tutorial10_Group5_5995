package defpackage;

import android.view.KeyEvent;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class sg8 extends e.c implements rg8 {
    public Function1<? super ng8, Boolean> d0;
    public Function1<? super ng8, Boolean> e0;

    public sg8() {
        throw null;
    }

    @Override // defpackage.rg8
    public final boolean N0(KeyEvent keyEvent) {
        Function1<? super ng8, Boolean> function1 = this.e0;
        if (function1 != null) {
            return function1.invoke(new ng8(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // defpackage.rg8
    public final boolean b1(KeyEvent keyEvent) {
        Function1<? super ng8, Boolean> function1 = this.d0;
        if (function1 != null) {
            return function1.invoke(new ng8(keyEvent)).booleanValue();
        }
        return false;
    }
}
