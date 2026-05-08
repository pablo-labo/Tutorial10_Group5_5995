package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.a;
import androidx.appcompat.app.d;
import androidx.fragment.app.g;
import com.indeed.android.jobsearch.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class wi0 extends g implements bj0 {
    public AppCompatDelegateImpl p0;

    public wi0() {
        this.d.b.c("androidx:appcompat", new ui0(this));
        q(new vi0(this));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        z();
        w().a(view, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0211 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00aa  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r10) {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi0.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        a aVarY = y();
        if (getWindow().hasFeature(0)) {
            if (aVarY == null || !aVarY.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // defpackage.dg2, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a aVarY = y();
        if (keyCode == 82 && aVarY != null && aVarY.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final <T extends View> T findViewById(int i) {
        return (T) w().c(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) w();
        if (appCompatDelegateImpl.e0 == null) {
            appCompatDelegateImpl.H();
            a aVar = appCompatDelegateImpl.d0;
            appCompatDelegateImpl.e0 = new oze(aVar != null ? aVar.e() : appCompatDelegateImpl.Z);
        }
        return appCompatDelegateImpl.e0;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = emg.a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        w().g();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) w();
        if (appCompatDelegateImpl.v0 && appCompatDelegateImpl.p0) {
            appCompatDelegateImpl.H();
            a aVar = appCompatDelegateImpl.d0;
            if (aVar != null) {
                aVar.g();
            }
        }
        pj0 pj0VarA = pj0.a();
        Context context = appCompatDelegateImpl.Z;
        synchronized (pj0VarA) {
            w5d w5dVar = pj0VarA.a;
            synchronized (w5dVar) {
                r59<WeakReference<Drawable.ConstantState>> r59Var = w5dVar.b.get(context);
                if (r59Var != null) {
                    r59Var.c();
                }
            }
        }
        appCompatDelegateImpl.H0 = new Configuration(appCompatDelegateImpl.Z.getResources().getConfiguration());
        appCompatDelegateImpl.u(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.fragment.app.g, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        w().j();
    }

    @Override // androidx.fragment.app.g, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentA;
        if (!super.onMenuItemSelected(i, menuItem)) {
            a aVarY = y();
            if (menuItem.getItemId() != 16908332 || aVarY == null || (aVarY.d() & 4) == 0 || (intentA = kca.a(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentA)) {
                navigateUpTo(intentA);
                return true;
            }
            taf tafVar = new taf(this);
            Intent intentA2 = kca.a(this);
            if (intentA2 == null) {
                intentA2 = kca.a(this);
            }
            if (intentA2 != null) {
                ComponentName component = intentA2.getComponent();
                if (component == null) {
                    component = intentA2.resolveActivity(tafVar.b.getPackageManager());
                }
                tafVar.a(component);
                tafVar.a.add(intentA2);
            }
            tafVar.b();
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((AppCompatDelegateImpl) w()).D();
    }

    @Override // androidx.fragment.app.g, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) w();
        appCompatDelegateImpl.H();
        a aVar = appCompatDelegateImpl.d0;
        if (aVar != null) {
            aVar.s(true);
        }
    }

    @Override // androidx.fragment.app.g, android.app.Activity
    public void onStart() {
        super.onStart();
        ((AppCompatDelegateImpl) w()).u(true, false);
    }

    @Override // androidx.fragment.app.g, android.app.Activity
    public void onStop() {
        super.onStop();
        w().k();
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        w().t(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        a aVarY = y();
        if (getWindow().hasFeature(0)) {
            if (aVarY == null || !aVarY.k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i) {
        z();
        w().o(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((AppCompatDelegateImpl) w()).J0 = i;
    }

    public final d w() {
        if (this.p0 == null) {
            d.c cVar = d.a;
            this.p0 = new AppCompatDelegateImpl(this, null, this, this);
        }
        return this.p0;
    }

    public final a y() {
        AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) w();
        appCompatDelegateImpl.H();
        return appCompatDelegateImpl.d0;
    }

    public final void z() {
        zte.e(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        z();
        w().p(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        z();
        w().r(view, layoutParams);
    }
}
