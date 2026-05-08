package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.ac4;
import defpackage.lkf;
import defpackage.pnb;
import defpackage.rmf;
import defpackage.sj0;
import defpackage.smf;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    public final AppCompatBackgroundHelper a;
    public final sj0 b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        rmf.a(context);
        this.c = false;
        lkf.a(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.a = appCompatBackgroundHelper;
        appCompatBackgroundHelper.d(attributeSet, i);
        sj0 sj0Var = new sj0(this);
        this.b = sj0Var;
        sj0Var.b(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.a();
        }
        sj0 sj0Var = this.b;
        if (sj0Var != null) {
            sj0Var.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.a;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.a;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        smf smfVar;
        sj0 sj0Var = this.b;
        if (sj0Var == null || (smfVar = sj0Var.b) == null) {
            return null;
        }
        return smfVar.a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        smf smfVar;
        sj0 sj0Var = this.b;
        if (sj0Var == null || (smfVar = sj0Var.b) == null) {
            return null;
        }
        return smfVar.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(this.b.a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        sj0 sj0Var = this.b;
        if (sj0Var != null) {
            sj0Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        sj0 sj0Var = this.b;
        if (sj0Var != null && drawable != null && !this.c) {
            sj0Var.c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (sj0Var != null) {
            sj0Var.a();
            if (this.c) {
                return;
            }
            ImageView imageView = sj0Var.a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(sj0Var.c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        sj0 sj0Var = this.b;
        if (sj0Var != null) {
            ImageView imageView = sj0Var.a;
            if (i != 0) {
                Drawable drawableA = pnb.A(imageView.getContext(), i);
                if (drawableA != null) {
                    ac4.a(drawableA);
                }
                imageView.setImageDrawable(drawableA);
            } else {
                imageView.setImageDrawable(null);
            }
            sj0Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        sj0 sj0Var = this.b;
        if (sj0Var != null) {
            sj0Var.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        sj0 sj0Var = this.b;
        if (sj0Var != null) {
            if (sj0Var.b == null) {
                sj0Var.b = new smf();
            }
            smf smfVar = sj0Var.b;
            smfVar.a = colorStateList;
            smfVar.d = true;
            sj0Var.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        sj0 sj0Var = this.b;
        if (sj0Var != null) {
            if (sj0Var.b == null) {
                sj0Var.b = new smf();
            }
            smf smfVar = sj0Var.b;
            smfVar.b = mode;
            smfVar.c = true;
            sj0Var.a();
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
