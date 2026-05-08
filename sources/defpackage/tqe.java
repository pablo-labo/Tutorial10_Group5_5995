package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuPresenter;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class tqe extends i7 implements f.a {
    public WeakReference<View> V;
    public boolean W;
    public f X;
    public Context d;
    public ActionBarContextView e;
    public AppCompatDelegateImpl.d f;

    @Override // defpackage.i7
    public final void T() {
        if (this.W) {
            return;
        }
        this.W = true;
        this.f.a(this);
    }

    @Override // defpackage.i7
    public final View U() {
        WeakReference<View> weakReference = this.V;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // defpackage.i7
    public final f W() {
        return this.X;
    }

    @Override // defpackage.i7
    public final MenuInflater X() {
        return new oze(this.e.getContext());
    }

    @Override // defpackage.i7
    public final CharSequence Y() {
        return this.e.getSubtitle();
    }

    @Override // defpackage.i7
    public final CharSequence a0() {
        return this.e.getTitle();
    }

    @Override // defpackage.i7
    public final void b0() {
        this.f.b(this, this.X);
    }

    @Override // defpackage.i7
    public final boolean c0() {
        return this.e.k0;
    }

    @Override // defpackage.i7
    public final void g0(View view) {
        this.e.setCustomView(view);
        this.V = view != null ? new WeakReference<>(view) : null;
    }

    @Override // defpackage.i7
    public final void h0(int i) {
        i0(this.d.getString(i));
    }

    @Override // defpackage.i7
    public final void i0(CharSequence charSequence) {
        this.e.setSubtitle(charSequence);
    }

    @Override // defpackage.i7
    public final void j0(int i) {
        k0(this.d.getString(i));
    }

    @Override // defpackage.i7
    public final void k0(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean l(f fVar, MenuItem menuItem) {
        return this.f.a.b(this, menuItem);
    }

    @Override // defpackage.i7
    public final void l0(boolean z) {
        this.b = z;
        this.e.setTitleOptional(z);
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void q(f fVar) {
        b0();
        ActionMenuPresenter actionMenuPresenter = this.e.d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.n();
        }
    }
}
