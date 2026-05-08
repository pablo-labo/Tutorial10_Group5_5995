package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.indeed.android.jobsearch.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zj1 extends rca {
    public boolean A0;
    public final int[] B0;
    public final int w0;
    public final int x0;
    public final int y0;
    public final int z0;

    public zj1(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.w0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.x0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.y0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.z0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
        this.B0 = new int[5];
    }

    @Override // defpackage.rca
    public final yj1 e(Context context) {
        return new yj1(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                WeakHashMap<View, prg> weakHashMap = epg.a;
                if (getLayoutDirection() == 1) {
                    int i8 = i5 - measuredWidth;
                    childAt.layout(i8 - childAt.getMeasuredWidth(), 0, i8, i6);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i6);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zj1.onMeasure(int, int):void");
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.A0 = z;
    }
}
