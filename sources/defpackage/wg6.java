package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wg6 extends krg<View> {
    public final Rect c;
    public final Rect d;
    public int e;
    public int f;

    public wg6() {
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        AppBarLayout appBarLayoutV;
        rzg lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (appBarLayoutV = v(coordinatorLayout.d(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            if (appBarLayoutV.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.a() + lastWindowInsets.d();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.r(view, i, i2, View.MeasureSpec.makeMeasureSpec((x(appBarLayoutV) + size) - appBarLayoutV.getMeasuredHeight(), i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    @Override // defpackage.krg
    public final void u(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout appBarLayoutV = v(coordinatorLayout.d(view));
        int i2 = 0;
        if (appBarLayoutV == null) {
            coordinatorLayout.q(view, i);
            this.e = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
        int bottom = appBarLayoutV.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
        int bottom2 = ((appBarLayoutV.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
        Rect rect = this.c;
        rect.set(paddingLeft, bottom, width, bottom2);
        rzg lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.b() + rect.left;
                rect.right -= lastWindowInsets.c();
            }
        }
        int i3 = fVar.c;
        if (i3 == 0) {
            i3 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.d;
        Gravity.apply(i3, measuredWidth, measuredHeight, rect, rect2, i);
        if (this.f != 0) {
            float fW = w(appBarLayoutV);
            int i4 = this.f;
            i2 = ie7.i((int) (fW * i4), 0, i4);
        }
        view.layout(rect2.left, rect2.top - i2, rect2.right, rect2.bottom - i2);
        this.e = rect2.top - appBarLayoutV.getBottom();
    }

    public abstract AppBarLayout v(ArrayList arrayList);

    public float w(View view) {
        return 1.0f;
    }

    public int x(View view) {
        return view.getMeasuredHeight();
    }

    public wg6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }
}
