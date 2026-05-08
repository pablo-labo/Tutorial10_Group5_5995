package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import defpackage.u44;

/* JADX INFO: loaded from: classes.dex */
public interface wrg<T extends View> extends rie {
    static u44 m(int i, int i2, int i3) {
        if (i == -2) {
            return u44.b.a;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            w44.a(i4);
            return new u44.a(i4);
        }
        int i5 = i2 - i3;
        if (i5 <= 0) {
            return null;
        }
        w44.a(i5);
        return new u44.a(i5);
    }

    default iie a() {
        ViewGroup.LayoutParams layoutParams = b().getLayoutParams();
        u44 u44VarM = m(layoutParams != null ? layoutParams.width : -1, b().getWidth(), t() ? b().getPaddingRight() + b().getPaddingLeft() : 0);
        if (u44VarM == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = b().getLayoutParams();
        u44 u44VarM2 = m(layoutParams2 != null ? layoutParams2.height : -1, b().getHeight(), t() ? b().getPaddingBottom() + b().getPaddingTop() : 0);
        if (u44VarM2 == null) {
            return null;
        }
        return new iie(u44VarM, u44VarM2);
    }

    T b();

    @Override // defpackage.rie
    default Object f(lu2<? super iie> lu2Var) {
        iie iieVarA = a();
        if (iieVarA != null) {
            return iieVarA;
        }
        qw1 qw1Var = new qw1(1, ewa.v(lu2Var));
        qw1Var.q();
        ViewTreeObserver viewTreeObserver = b().getViewTreeObserver();
        vrg vrgVar = new vrg(this, viewTreeObserver, qw1Var);
        viewTreeObserver.addOnPreDrawListener(vrgVar);
        qw1Var.t(new urg(this, viewTreeObserver, vrgVar));
        return qw1Var.p();
    }

    default void s(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            b().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    default boolean t() {
        return true;
    }
}
