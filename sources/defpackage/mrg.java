package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes.dex */
public final class mrg implements tpa {
    public final Rect a = new Rect();
    public final /* synthetic */ ViewPager b;

    public mrg(ViewPager viewPager) {
        this.b = viewPager;
    }

    @Override // defpackage.tpa
    public final rzg b(View view, rzg rzgVar) {
        rzg rzgVarI = epg.i(view, rzgVar);
        if (rzgVarI.a.o()) {
            return rzgVarI;
        }
        int iB = rzgVarI.b();
        Rect rect = this.a;
        rect.left = iB;
        rect.top = rzgVarI.d();
        rect.right = rzgVarI.c();
        rect.bottom = rzgVarI.a();
        ViewPager viewPager = this.b;
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            rzg rzgVarB = epg.b(viewPager.getChildAt(i), rzgVarI);
            rect.left = Math.min(rzgVarB.b(), rect.left);
            rect.top = Math.min(rzgVarB.d(), rect.top);
            rect.right = Math.min(rzgVarB.c(), rect.right);
            rect.bottom = Math.min(rzgVarB.a(), rect.bottom);
        }
        return rzgVarI.f(rect.left, rect.top, rect.right, rect.bottom);
    }
}
