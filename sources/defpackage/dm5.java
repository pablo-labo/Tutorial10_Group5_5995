package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class dm5 {
    public final jm5 a;
    public final AndroidComposeView b;
    public final a4a<FocusTargetNode> c = nnd.a();
    public final a4a<sl5> d = nnd.a();
    public boolean e;

    public dm5(jm5 jm5Var, AndroidComposeView androidComposeView) {
        this.a = jm5Var;
        this.b = androidComposeView;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        this.b.w(new cm5(0, this, dm5.class, "invalidateNodes", "invalidateNodes()V", 0, 0));
        this.e = true;
    }
}
