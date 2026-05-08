package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegateImpl;
import defpackage.i7;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    public interface b {
        void a();
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b();

    public abstract void c(boolean z);

    public abstract int d();

    public abstract Context e();

    public boolean f() {
        return false;
    }

    public abstract void g();

    public void h() {
    }

    public abstract boolean i(int i, KeyEvent keyEvent);

    public boolean j(KeyEvent keyEvent) {
        return false;
    }

    public boolean k() {
        return false;
    }

    public abstract void l(ColorDrawable colorDrawable);

    public abstract void m(boolean z);

    public abstract void n(boolean z);

    public abstract void o();

    public abstract void p(float f);

    public abstract void q(Drawable drawable);

    public abstract void r(boolean z);

    public abstract void s(boolean z);

    public abstract void t(CharSequence charSequence);

    public abstract void u(CharSequence charSequence);

    public i7 v(AppCompatDelegateImpl.d dVar) {
        return null;
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0006a extends ViewGroup.MarginLayoutParams {
        public int a;

        public C0006a(C0006a c0006a) {
            super((ViewGroup.MarginLayoutParams) c0006a);
            this.a = 0;
            this.a = c0006a.a;
        }

        public C0006a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }
    }
}
