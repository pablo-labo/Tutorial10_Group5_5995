package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.indeed.android.jobsearch.R;
import defpackage.kv8;

/* JADX INFO: loaded from: classes.dex */
public class hg2 extends Dialog implements zv8, hqa, dld {
    public aw8 a;
    public final bld b;
    public final dqa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg2(Context context, int i) {
        super(context, i);
        context.getClass();
        this.b = new bld(new cld(this, new hr(this, 13)));
        this.c = new dqa(new gg2(this, 0));
    }

    public static void a(hg2 hg2Var) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        c();
        super.addContentView(view, layoutParams);
    }

    public final aw8 b() {
        aw8 aw8Var = this.a;
        if (aw8Var != null) {
            return aw8Var;
        }
        aw8 aw8Var2 = new aw8(this, true);
        this.a = aw8Var2;
        return aw8Var2;
    }

    public final void c() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // defpackage.zv8
    public final kv8 getLifecycle() {
        return b();
    }

    @Override // defpackage.dld
    public final ald getSavedStateRegistry() {
        return this.b.b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.c.d();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            dqa dqaVar = this.c;
            dqaVar.e = onBackInvokedDispatcher;
            dqaVar.e(dqaVar.g);
        }
        this.b.a(bundle);
        b().f(kv8.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.b.b(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        b().f(kv8.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().f(kv8.a.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // defpackage.hqa
    public final dqa r() {
        return this.c;
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        c();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        c();
        super.setContentView(view, layoutParams);
    }
}
