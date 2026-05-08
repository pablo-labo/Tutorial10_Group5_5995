package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.appcompat.widget.AppCompatBackgroundHelper;
import androidx.appcompat.widget.AppCompatEmojiTextHelper;
import androidx.appcompat.widget.AppCompatTextHelper;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes.dex */
public class cj0 extends CheckBox {
    public final fj0 a;
    public final AppCompatBackgroundHelper b;
    public final AppCompatTextHelper c;
    public AppCompatEmojiTextHelper d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        rmf.a(context);
        lkf.a(this, getContext());
        fj0 fj0Var = new fj0(this);
        this.a = fj0Var;
        fj0Var.b(attributeSet, i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.b = appCompatBackgroundHelper;
        appCompatBackgroundHelper.d(attributeSet, i);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.c = appCompatTextHelper;
        appCompatTextHelper.f(attributeSet, i);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new AppCompatEmojiTextHelper(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.a();
        }
        AppCompatTextHelper appCompatTextHelper = this.c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.b;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.b;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        fj0 fj0Var = this.a;
        if (fj0Var != null) {
            return fj0Var.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        fj0 fj0Var = this.a;
        if (fj0Var != null) {
            return fj0Var.c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        fj0 fj0Var = this.a;
        if (fj0Var != null) {
            if (fj0Var.f) {
                fj0Var.f = false;
            } else {
                fj0Var.f = true;
                fj0Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        fj0 fj0Var = this.a;
        if (fj0Var != null) {
            fj0Var.b = colorStateList;
            fj0Var.d = true;
            fj0Var.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        fj0 fj0Var = this.a;
        if (fj0Var != null) {
            fj0Var.c = mode;
            fj0Var.e = true;
            fj0Var.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        AppCompatTextHelper appCompatTextHelper = this.c;
        appCompatTextHelper.k(colorStateList);
        appCompatTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        AppCompatTextHelper appCompatTextHelper = this.c;
        appCompatTextHelper.l(mode);
        appCompatTextHelper.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(pnb.A(getContext(), i));
    }

    public cj0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }
}
