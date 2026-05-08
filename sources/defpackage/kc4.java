package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import defpackage.hc4;
import defpackage.ic4;
import defpackage.wna;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class kc4<DH extends ic4> extends ImageView {
    public static boolean V = false;
    public final bu0 a;
    public float b;
    public jc4<DH> c;
    public boolean d;
    public boolean e;
    public Object f;

    public kc4(Context context) {
        super(context);
        this.a = new bu0();
        this.b = 0.0f;
        this.d = false;
        this.e = false;
        this.f = null;
        a(context);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        V = z;
    }

    public final void a(Context context) {
        try {
            it5.a();
            if (this.d) {
                return;
            }
            boolean z = true;
            this.d = true;
            this.c = new jc4<>(null);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                return;
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!V || context.getApplicationInfo().targetSdkVersion < 24) {
                z = false;
            }
            this.e = z;
        } finally {
            it5.a();
        }
    }

    public final void b() {
        Drawable drawable;
        if (!this.e || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public float getAspectRatio() {
        return this.b;
    }

    public gc4 getController() {
        return this.c.e;
    }

    public Object getExtraData() {
        return this.f;
    }

    public DH getHierarchy() {
        DH dh = this.c.d;
        dh.getClass();
        return dh;
    }

    public Drawable getTopLevelDrawable() {
        DH dh = this.c.d;
        if (dh == null) {
            return null;
        }
        return dh.b();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        jc4<DH> jc4Var = this.c;
        jc4Var.f.a(hc4.a.d0);
        jc4Var.b = true;
        jc4Var.c();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        jc4<DH> jc4Var = this.c;
        jc4Var.f.a(hc4.a.e0);
        jc4Var.b = false;
        jc4Var.c();
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        b();
        jc4<DH> jc4Var = this.c;
        jc4Var.f.a(hc4.a.d0);
        jc4Var.b = true;
        jc4Var.c();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        bu0 bu0Var = this.a;
        bu0Var.a = i;
        bu0Var.b = i2;
        float f = this.b;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (f > 0.0f && layoutParams != null) {
            int i3 = layoutParams.height;
            if (i3 == 0 || i3 == -2) {
                bu0Var.b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(bu0Var.a) - paddingRight) / f) + paddingBottom), bu0Var.b), 1073741824);
            } else {
                int i4 = layoutParams.width;
                if (i4 == 0 || i4 == -2) {
                    bu0Var.a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(bu0Var.b) - paddingBottom) * f) + paddingRight), bu0Var.a), 1073741824);
                }
            }
        }
        super.onMeasure(bu0Var.a, bu0Var.b);
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        b();
        jc4<DH> jc4Var = this.c;
        jc4Var.f.a(hc4.a.e0);
        jc4Var.b = false;
        jc4Var.c();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        jc4<DH> jc4Var = this.c;
        if (!jc4Var.d() ? false : jc4Var.e.a(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        b();
    }

    public void setAspectRatio(float f) {
        if (f == this.b) {
            return;
        }
        this.b = f;
        requestLayout();
    }

    public void setController(gc4 gc4Var) {
        this.c.e(gc4Var);
        DH dh = this.c.d;
        super.setImageDrawable(dh == null ? null : dh.b());
    }

    public void setExtraData(Object obj) {
        this.f = obj;
    }

    public void setHierarchy(DH dh) {
        this.c.f(dh);
        DH dh2 = this.c.d;
        super.setImageDrawable(dh2 == null ? null : dh2.b());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        a(getContext());
        this.c.e(null);
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        a(getContext());
        this.c.e(null);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i) {
        a(getContext());
        this.c.e(null);
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        a(getContext());
        this.c.e(null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.e = z;
    }

    @Override // android.view.View
    public final String toString() {
        wna.a aVarB = wna.b(this);
        jc4<DH> jc4Var = this.c;
        aVarB.b(jc4Var != null ? jc4Var.toString() : "<no holder set>", "holder");
        return aVarB.toString();
    }
}
