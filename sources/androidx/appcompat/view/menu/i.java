package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import com.indeed.android.jobsearch.R;
import defpackage.ko9;

/* JADX INFO: loaded from: classes.dex */
public class i {
    public final Context a;
    public final f b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public j.a h;
    public ko9 i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final a k = new a();

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            i.this.c();
        }
    }

    public i(Context context, f fVar, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = fVar;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final ko9 a() {
        ko9 lVar;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.a;
            if (iMin >= dimensionPixelSize) {
                lVar = new b(context2, this.e, this.d, this.c);
            } else {
                lVar = new l(context2, this.b, this.e, this.d, this.c);
            }
            lVar.m(this.b);
            lVar.t(this.k);
            lVar.p(this.e);
            lVar.d(this.h);
            lVar.q(this.g);
            lVar.r(this.f);
            this.i = lVar;
        }
        return this.i;
    }

    public final boolean b() {
        ko9 ko9Var = this.i;
        return ko9Var != null && ko9Var.a();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        ko9 ko9VarA = a();
        ko9VarA.u(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            ko9VarA.s(i);
            ko9VarA.v(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            ko9VarA.a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        ko9VarA.b();
    }
}
