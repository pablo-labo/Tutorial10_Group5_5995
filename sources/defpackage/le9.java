package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.c;
import com.indeed.android.jobsearch.R;
import defpackage.ece;
import defpackage.epg;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class le9 extends c.a {
    public final ze9 c;
    public final Rect d;

    /* JADX WARN: Illegal instructions before constructor call */
    public le9(Context context, int i) {
        TypedValue typedValueA = me9.a(context, R.attr.materialAlertDialogTheme);
        int i2 = typedValueA == null ? 0 : typedValueA.data;
        Context contextA = ff9.a(context, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        contextA = i2 != 0 ? new fu2(contextA, i2) : contextA;
        TypedValue typedValueA2 = me9.a(context, R.attr.materialAlertDialogTheme);
        super(contextA, typedValueA2 == null ? 0 : typedValueA2.data);
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        jkf.a(context2, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int[] iArr = lac.n;
        jkf.b(context2, null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayObtainStyledAttributes.recycle();
        if (context2.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        this.d = new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        int iB = me9.b(context2, le9.class.getCanonicalName(), R.attr.colorSurface);
        ze9 ze9Var = new ze9(context2, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        ze9Var.i(context2);
        ze9Var.k(ColorStateList.valueOf(iB));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                ece.a aVarE = ze9Var.a.a.e();
                aVarE.e = new k0(dimension);
                aVarE.f = new k0(dimension);
                aVarE.g = new k0(dimension);
                aVarE.h = new k0(dimension);
                ze9Var.setShapeAppearanceModel(aVarE.a());
            }
        }
        this.c = ze9Var;
    }

    @Override // androidx.appcompat.app.c.a
    public final c.a a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        throw null;
    }

    public final void c(int i, k87 k87Var) {
    }

    @Override // androidx.appcompat.app.c.a
    public final c create() {
        c cVarCreate = super.create();
        Window window = cVarCreate.getWindow();
        View decorView = window.getDecorView();
        ze9 ze9Var = this.c;
        if (ze9Var != null) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            ze9Var.j(epg.d.e(decorView));
        }
        Rect rect = this.d;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) ze9Var, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new jf7(cVarCreate, rect));
        return cVarCreate;
    }

    public final le9 d() {
        return (le9) super.setPositiveButton(android.R.string.ok, null);
    }

    public final void e(String str, m98 m98Var) {
        super.a(str, m98Var);
    }

    public final void f(CharSequence charSequence) {
    }

    public final le9 g(View view) {
        return (le9) super.setView(view);
    }

    @Override // androidx.appcompat.app.c.a
    public final c.a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (le9) super.setNegativeButton(i, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    public final c.a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (le9) super.setPositiveButton(i, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    public final c.a setTitle(CharSequence charSequence) {
        return (le9) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.c.a
    public final c.a setView(View view) {
        return (le9) super.setView(view);
    }
}
