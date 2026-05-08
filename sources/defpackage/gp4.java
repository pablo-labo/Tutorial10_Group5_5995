package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.a;

/* JADX INFO: loaded from: classes2.dex */
public final class gp4 extends a {
    @Override // com.google.android.material.tabs.a
    public final void b(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float fSin;
        float fCos;
        RectF rectFA = a.a(tabLayout, view);
        RectF rectFA2 = a.a(tabLayout, view2);
        if (rectFA.left < rectFA2.left) {
            double d = (((double) f) * 3.141592653589793d) / 2.0d;
            fSin = (float) (1.0d - Math.cos(d));
            fCos = (float) Math.sin(d);
        } else {
            double d2 = (((double) f) * 3.141592653589793d) / 2.0d;
            fSin = (float) Math.sin(d2);
            fCos = (float) (1.0d - Math.cos(d2));
        }
        int i = (int) rectFA.left;
        int i2 = (int) rectFA2.left;
        LinearInterpolator linearInterpolator = be0.a;
        drawable.setBounds(Math.round(fSin * (i2 - i)) + i, drawable.getBounds().top, Math.round(fCos * (((int) rectFA2.right) - r6)) + ((int) rectFA.right), drawable.getBounds().bottom);
    }
}
