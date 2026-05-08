package defpackage;

import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class d50 implements z72 {
    public final ClipboardManager a;

    public d50(Context context) {
        Object systemService = context.getSystemService("clipboard");
        systemService.getClass();
        this.a = (ClipboardManager) systemService;
    }
}
