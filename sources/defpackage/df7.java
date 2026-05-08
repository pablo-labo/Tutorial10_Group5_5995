package defpackage;

import androidx.compose.runtime.r;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class df7 implements cf7 {
    public final g4a a;

    public df7(int i, AndroidComposeView.c cVar) {
        this.a = r.f(new bf7(i));
    }

    @Override // defpackage.cf7
    public final int a() {
        return ((bf7) ((gme) this.a).getValue()).a;
    }
}
