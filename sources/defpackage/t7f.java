package defpackage;

import android.annotation.SuppressLint;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.material.badge.BadgeDrawable;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"PrivateResource"})
public final class t7f {
    public final fu2 a;
    public final bk1 b;

    public t7f(fu2 fu2Var, bk1 bk1Var) {
        this.a = fu2Var;
        this.b = bk1Var;
    }

    public final int a(int i) {
        TypedValue typedValue = new TypedValue();
        this.a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    public final void b(MenuItem menuItem, b7f b7fVar) {
        oca ocaVar;
        b7fVar.getClass();
        bk1 bk1Var = this.b;
        rca rcaVar = bk1Var.b;
        Menu menu = bk1Var.getMenu();
        menu.getClass();
        int i = 0;
        int i2 = 0;
        while (true) {
            ocaVar = null;
            if (!(i2 < menu.size())) {
                i = -1;
                break;
            }
            int i3 = i2 + 1;
            MenuItem item = menu.getItem(i2);
            if (item == null) {
                k20.o();
                return;
            } else {
                if (i < 0) {
                    u63.o0();
                    throw null;
                }
                if (menuItem.equals(item)) {
                    break;
                }
                i++;
                i2 = i3;
            }
        }
        String badgeValue = b7fVar.getBadgeValue();
        if (badgeValue == null) {
            BadgeDrawable badgeDrawable = rcaVar.i0.get(i);
            if (badgeDrawable != null) {
                badgeDrawable.setVisible(false, false);
                badgeDrawable.W.Y = false;
                return;
            }
            return;
        }
        Integer numB = vve.B(10, badgeValue);
        rcaVar.getClass();
        if (i == -1) {
            v40.j(i, " is not a valid view id");
            return;
        }
        BadgeDrawable badgeDrawableB = rcaVar.i0.get(i);
        if (badgeDrawableB == null) {
            badgeDrawableB = BadgeDrawable.b(rcaVar.getContext());
            rcaVar.i0.put(i, badgeDrawableB);
        }
        BadgeDrawable.SavedState savedState = badgeDrawableB.W;
        if (i == -1) {
            v40.j(i, " is not a valid view id");
            return;
        }
        oca[] ocaVarArr = rcaVar.f;
        if (ocaVarArr != null) {
            int length = ocaVarArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                oca ocaVar2 = ocaVarArr[i4];
                if (ocaVar2.getId() == i) {
                    ocaVar = ocaVar2;
                    break;
                }
                i4++;
            }
        }
        if (ocaVar != null) {
            ocaVar.setBadge(badgeDrawableB);
        }
        badgeDrawableB.setVisible(true, false);
        savedState.Y = true;
        badgeDrawableB.clearText();
        savedState.d = -1;
        badgeDrawableB.m();
        badgeDrawableB.invalidateSelf();
        if (numB != null) {
            badgeDrawableB.k(numB.intValue());
        } else if (!badgeValue.equals("")) {
            badgeDrawableB.setText(badgeValue);
        }
        Integer tabBarItemBadgeTextColor = b7fVar.getTabBarItemBadgeTextColor();
        badgeDrawableB.i(tabBarItemBadgeTextColor != null ? tabBarItemBadgeTextColor.intValue() : a(R.attr.colorOnError));
        Integer tabBarItemBadgeBackgroundColor = b7fVar.getTabBarItemBadgeBackgroundColor();
        badgeDrawableB.g(tabBarItemBadgeBackgroundColor != null ? tabBarItemBadgeBackgroundColor.intValue() : a(R.attr.colorError));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.s7f r7) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t7f.c(s7f):void");
    }
}
