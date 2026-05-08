package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.ac4;
import defpackage.epg;
import defpackage.pj0;
import defpackage.prg;
import defpackage.smf;
import defpackage.umf;
import defpackage.wac;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class AppCompatBackgroundHelper {
    public final View a;
    public smf d;
    public smf e;
    public smf f;
    public int c = -1;
    public final pj0 b = pj0.a();

    public AppCompatBackgroundHelper(View view) {
        this.a = view;
    }

    public final void a() {
        View view = this.a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f == null) {
                    this.f = new smf();
                }
                smf smfVar = this.f;
                smfVar.a = null;
                smfVar.d = false;
                smfVar.b = null;
                smfVar.c = false;
                WeakHashMap<View, prg> weakHashMap = epg.a;
                ColorStateList colorStateListC = epg.d.c(view);
                if (colorStateListC != null) {
                    smfVar.d = true;
                    smfVar.a = colorStateListC;
                }
                PorterDuff.Mode modeD = epg.d.d(view);
                if (modeD != null) {
                    smfVar.c = true;
                    smfVar.b = modeD;
                }
                if (smfVar.d || smfVar.c) {
                    pj0.e(background, smfVar, view.getDrawableState());
                    return;
                }
            }
            smf smfVar2 = this.e;
            if (smfVar2 != null) {
                pj0.e(background, smfVar2, view.getDrawableState());
                return;
            }
            smf smfVar3 = this.d;
            if (smfVar3 != null) {
                pj0.e(background, smfVar3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        smf smfVar = this.e;
        if (smfVar != null) {
            return smfVar.a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        smf smfVar = this.e;
        if (smfVar != null) {
            return smfVar.b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListF;
        View view = this.a;
        Context context = view.getContext();
        int[] iArr = wac.A;
        umf umfVarE = umf.e(context, attributeSet, iArr, i);
        TypedArray typedArray = umfVarE.b;
        View view2 = this.a;
        epg.n(view2, view2.getContext(), iArr, attributeSet, umfVarE.b, i);
        try {
            if (typedArray.hasValue(0)) {
                this.c = typedArray.getResourceId(0, -1);
                pj0 pj0Var = this.b;
                Context context2 = view.getContext();
                int i2 = this.c;
                synchronized (pj0Var) {
                    colorStateListF = pj0Var.a.f(context2, i2);
                }
                if (colorStateListF != null) {
                    g(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                epg.d.i(view, umfVarE.a(1));
            }
            if (typedArray.hasValue(2)) {
                epg.d.j(view, ac4.c(typedArray.getInt(2, -1), null));
            }
            umfVarE.f();
        } catch (Throwable th) {
            umfVarE.f();
            throw th;
        }
    }

    public final void e() {
        this.c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateListF;
        this.c = i;
        pj0 pj0Var = this.b;
        if (pj0Var != null) {
            Context context = this.a.getContext();
            synchronized (pj0Var) {
                colorStateListF = pj0Var.a.f(context, i);
            }
        } else {
            colorStateListF = null;
        }
        g(colorStateListF);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new smf();
            }
            smf smfVar = this.d;
            smfVar.a = colorStateList;
            smfVar.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new smf();
        }
        smf smfVar = this.e;
        smfVar.a = colorStateList;
        smfVar.d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new smf();
        }
        smf smfVar = this.e;
        smfVar.b = mode;
        smfVar.c = true;
        a();
    }
}
