package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a60 {
    public static final a60 a = new a60();

    public final void a(View view, ueb uebVar) {
        Context context = view.getContext();
        PointerIcon systemIcon = uebVar instanceof v80 ? null : uebVar instanceof w80 ? PointerIcon.getSystemIcon(context, ((w80) uebVar).b) : PointerIcon.getSystemIcon(context, 1000);
        if (wl7.b(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
