package defpackage;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class t70 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ u70 a;

    public t70(u70 u70Var) {
        this.a = u70Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Context context = view.getContext();
        u70 u70Var = this.a;
        if (u70Var.d) {
            return;
        }
        context.getApplicationContext().registerComponentCallbacks(u70Var.e);
        u70Var.d = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Context context = view.getContext();
        u70 u70Var = this.a;
        if (u70Var.d) {
            context.getApplicationContext().unregisterComponentCallbacks(u70Var.e);
            u70Var.d = false;
        }
    }
}
