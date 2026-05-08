package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.material.tabs.TabLayout;
import defpackage.be0;
import defpackage.gsg;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static RectF a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.s0 || !(view instanceof TabLayout.h)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        TabLayout.h hVar = (TabLayout.h) view;
        int contentWidth = hVar.getContentWidth();
        int contentHeight = hVar.getContentHeight();
        int iB = (int) gsg.b(hVar.getContext(), 24);
        if (contentWidth < iB) {
            contentWidth = iB;
        }
        int right = (hVar.getRight() + hVar.getLeft()) / 2;
        int bottom = (hVar.getBottom() + hVar.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
    }

    public void b(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF rectFA = a(tabLayout, view);
        RectF rectFA2 = a(tabLayout, view2);
        int i = (int) rectFA.left;
        int i2 = (int) rectFA2.left;
        LinearInterpolator linearInterpolator = be0.a;
        drawable.setBounds(Math.round((i2 - i) * f) + i, drawable.getBounds().top, Math.round(f * (((int) rectFA2.right) - r1)) + ((int) rectFA.right), drawable.getBounds().bottom);
    }
}
