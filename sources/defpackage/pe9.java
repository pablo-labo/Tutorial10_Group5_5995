package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.indeed.android.jobsearch.R;
import defpackage.ze9;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class pe9 {
    public final MaterialButton a;
    public ece b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public ze9 m;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q;
    public RippleDrawable r;
    public int s;

    public pe9(MaterialButton materialButton, ece eceVar) {
        this.a = materialButton;
        this.b = eceVar;
    }

    public final cde a() {
        RippleDrawable rippleDrawable = this.r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        int numberOfLayers = this.r.getNumberOfLayers();
        RippleDrawable rippleDrawable2 = this.r;
        return numberOfLayers > 2 ? (cde) rippleDrawable2.getDrawable(2) : (cde) rippleDrawable2.getDrawable(1);
    }

    public final ze9 b(boolean z) {
        RippleDrawable rippleDrawable = this.r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (ze9) ((LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void c(ece eceVar) {
        this.b = eceVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(eceVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(eceVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(eceVar);
        }
    }

    public final void d(int i, int i2) {
        WeakHashMap<View, prg> weakHashMap = epg.a;
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        ze9 ze9Var = new ze9(this.b);
        MaterialButton materialButton = this.a;
        ze9Var.i(materialButton.getContext());
        ze9Var.setTintList(this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            ze9Var.setTintMode(mode);
        }
        float f = this.h;
        ColorStateList colorStateList = this.k;
        ze9Var.a.j = f;
        ze9Var.invalidateSelf();
        ze9.b bVar = ze9Var.a;
        if (bVar.d != colorStateList) {
            bVar.d = colorStateList;
            ze9Var.onStateChange(ze9Var.getState());
        }
        ze9 ze9Var2 = new ze9(this.b);
        ze9Var2.setTint(0);
        float f2 = this.h;
        int iZ = this.n ? hh1.z(materialButton, R.attr.colorSurface) : 0;
        ze9Var2.a.j = f2;
        ze9Var2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iZ);
        ze9.b bVar2 = ze9Var2.a;
        if (bVar2.d != colorStateListValueOf) {
            bVar2.d = colorStateListValueOf;
            ze9Var2.onStateChange(ze9Var2.getState());
        }
        ze9 ze9Var3 = new ze9(this.b);
        this.m = ze9Var3;
        ze9Var3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(ydd.b(this.l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{ze9Var2, ze9Var}), this.c, this.e, this.d, this.f), this.m);
        this.r = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        ze9 ze9VarB = b(false);
        if (ze9VarB != null) {
            ze9VarB.j(this.s);
        }
    }

    public final void f() {
        ze9 ze9VarB = b(false);
        ze9 ze9VarB2 = b(true);
        if (ze9VarB != null) {
            float f = this.h;
            ColorStateList colorStateList = this.k;
            ze9VarB.a.j = f;
            ze9VarB.invalidateSelf();
            ze9.b bVar = ze9VarB.a;
            if (bVar.d != colorStateList) {
                bVar.d = colorStateList;
                ze9VarB.onStateChange(ze9VarB.getState());
            }
            if (ze9VarB2 != null) {
                float f2 = this.h;
                int iZ = this.n ? hh1.z(this.a, R.attr.colorSurface) : 0;
                ze9VarB2.a.j = f2;
                ze9VarB2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iZ);
                ze9.b bVar2 = ze9VarB2.a;
                if (bVar2.d != colorStateListValueOf) {
                    bVar2.d = colorStateListValueOf;
                    ze9VarB2.onStateChange(ze9VarB2.getState());
                }
            }
        }
    }
}
