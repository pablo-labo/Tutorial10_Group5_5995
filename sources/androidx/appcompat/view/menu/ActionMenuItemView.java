package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.qnf;
import defpackage.vee;
import defpackage.wac;
import defpackage.yp5;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements k.a, View.OnClickListener, ActionMenuView.a {
    public boolean V;
    public boolean W;
    public h a;
    public final int a0;
    public CharSequence b;
    public int b0;
    public Drawable c;
    public final int c0;
    public f.b d;
    public a e;
    public b f;

    public class a extends yp5 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // defpackage.yp5
        public final vee b() {
            ActionMenuPresenter.a aVar;
            b bVar = ActionMenuItemView.this.f;
            if (bVar == null || (aVar = ActionMenuPresenter.this.j0) == null) {
                return null;
            }
            return aVar.a();
        }

        @Override // defpackage.yp5
        public final boolean c() {
            vee veeVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            f.b bVar = actionMenuItemView.d;
            return bVar != null && bVar.b(actionMenuItemView.a) && (veeVarB = b()) != null && veeVarB.a();
        }
    }

    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.V = d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wac.c, 0, 0);
        this.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.c0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.b0 = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.a.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void c(h hVar) {
        this.a = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.getTitleCondensed());
        setId(hVar.a);
        setVisibility(hVar.isVisible() ? 0 : 8);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.e == null) {
            this.e = new a();
        }
    }

    public final boolean d() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void e() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.b);
        if (this.c != null && ((this.a.y & 4) != 4 || (!this.V && !this.W))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.b : null);
        CharSequence charSequence = this.a.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.a.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.a.r;
        if (TextUtils.isEmpty(charSequence2)) {
            qnf.a(this, z3 ? null : this.a.e);
        } else {
            qnf.a(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f.b bVar = this.d;
        if (bVar != null) {
            bVar.b(this.a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.V = d();
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.b0) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.a0;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.c == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.a.hasSubMenu() && (aVar = this.e) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.W != z) {
            this.W = z;
            h hVar = this.a;
            if (hVar != null) {
                f fVar = hVar.n;
                fVar.k = true;
                fVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.c = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.c0;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        e();
    }

    public void setItemInvoker(f.b bVar) {
        this.d = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.b0 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(b bVar) {
        this.f = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.b = charSequence;
        e();
    }
}
