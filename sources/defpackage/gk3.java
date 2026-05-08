package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.view.menu.j;

/* JADX INFO: loaded from: classes.dex */
public interface gk3 {
    boolean a();

    boolean b();

    boolean c();

    void collapseActionView();

    void d(Menu menu, j.a aVar);

    boolean e();

    void f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    boolean h();

    void i(int i);

    prg j(int i, long j);

    void k();

    void l(boolean z);

    void m();

    void n();

    void o(int i);

    void p(int i);

    int q();

    void r();

    void s(Drawable drawable);

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
