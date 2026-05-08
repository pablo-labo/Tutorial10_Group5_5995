package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.d;
import com.indeed.android.jobsearch.R;
import defpackage.og8;

/* JADX INFO: loaded from: classes.dex */
public class nj0 extends hg2 implements bj0 {
    public AppCompatDelegateImpl d;
    public final mj0 e;

    /* JADX WARN: Type inference failed for: r2v2, types: [mj0] */
    public nj0(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.e = new og8.a() { // from class: mj0
            @Override // og8.a
            public final boolean e(KeyEvent keyEvent) {
                return this.a.f(keyEvent);
            }
        };
        d dVarD = d();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((AppCompatDelegateImpl) dVarD).J0 = i;
        dVarD.i();
    }

    @Override // defpackage.hg2, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d().a(view, layoutParams);
    }

    public final d d() {
        if (this.d == null) {
            d.c cVar = d.a;
            this.d = new AppCompatDelegateImpl(getContext(), getWindow(), this, this);
        }
        return this.d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().j();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return og8.b(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    public final void e() {
        zte.e(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public final boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final <T extends View> T findViewById(int i) {
        return (T) d().c(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().g();
    }

    @Override // defpackage.hg2, android.app.Dialog
    public void onCreate(Bundle bundle) {
        d().f();
        super.onCreate(bundle);
        d().i();
    }

    @Override // defpackage.hg2, android.app.Dialog
    public final void onStop() {
        super.onStop();
        d().k();
    }

    @Override // defpackage.hg2, android.app.Dialog
    public void setContentView(int i) {
        e();
        d().o(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        d().t(getContext().getString(i));
    }

    @Override // defpackage.hg2, android.app.Dialog
    public void setContentView(View view) {
        e();
        d().p(view);
    }

    @Override // defpackage.hg2, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        d().r(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().t(charSequence);
    }
}
