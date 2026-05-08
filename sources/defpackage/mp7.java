package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import defpackage.xh8;

/* JADX INFO: loaded from: classes2.dex */
public final class mp7 implements lp7, xh8 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lp7
    public final void a(String str) {
        Object systemService = ((Context) (this instanceof ai8 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(Context.class), null)).getSystemService("clipboard");
        systemService.getClass();
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("text", str));
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
