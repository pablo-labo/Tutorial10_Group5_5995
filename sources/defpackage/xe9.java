package defpackage;

import android.R;
import android.content.res.ColorStateList;

/* JADX INFO: loaded from: classes2.dex */
public final class xe9 extends wj0 {
    public static final int[][] V = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList e;
    public boolean f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int iZ = hh1.z(this, com.indeed.android.jobsearch.R.attr.colorControlActivated);
            int iZ2 = hh1.z(this, com.indeed.android.jobsearch.R.attr.colorOnSurface);
            int iZ3 = hh1.z(this, com.indeed.android.jobsearch.R.attr.colorSurface);
            this.e = new ColorStateList(V, new int[]{hh1.G(iZ3, 1.0f, iZ), hh1.G(iZ3, 0.54f, iZ2), hh1.G(iZ3, 0.38f, iZ2), hh1.G(iZ3, 0.38f, iZ2)});
        }
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
