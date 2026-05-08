package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes2.dex */
public final class ma0 implements f3f {
    public final View a;
    public final uzg b;

    public ma0(View view) {
        Window window;
        view.getClass();
        this.a = view;
        Context context = view.getContext();
        context.getClass();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                window = null;
                break;
            } else if (context instanceof Activity) {
                window = ((Activity) context).getWindow();
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
                context.getClass();
            }
        }
        if (window != null) {
            this.b = new uzg(window, this.a);
        } else {
            l5.q("The Compose View must be hosted in an Activity with a Window!");
            throw null;
        }
    }

    @Override // defpackage.f3f
    public final void a() {
        this.b.a.c(true);
    }

    @Override // defpackage.f3f
    public final void c() {
        this.b.a.d(true);
    }
}
