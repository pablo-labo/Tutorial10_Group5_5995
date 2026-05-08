package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class c50 implements y72 {
    public final d50 a;

    public c50(d50 d50Var) {
        this.a = d50Var;
    }

    @Override // defpackage.y72
    public final x72 a() {
        ClipData primaryClip = this.a.a.getPrimaryClip();
        if (primaryClip != null) {
            return new x72(primaryClip);
        }
        return null;
    }

    @Override // defpackage.y72
    public final j6g b(x72 x72Var) {
        ClipboardManager clipboardManager = this.a.a;
        if (x72Var != null) {
            clipboardManager.setPrimaryClip(x72Var.a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            xf0.a(clipboardManager);
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
        }
        return j6g.a;
    }
}
