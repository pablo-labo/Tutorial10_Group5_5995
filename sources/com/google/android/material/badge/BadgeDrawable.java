package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.indeed.android.jobsearch.R;
import defpackage.ece;
import defpackage.epg;
import defpackage.hcf;
import defpackage.jkf;
import defpackage.k0;
import defpackage.lac;
import defpackage.prg;
import defpackage.vdf;
import defpackage.ye9;
import defpackage.ze9;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class BadgeDrawable extends Drawable implements vdf.b {
    public float V;
    public final SavedState W;
    public float X;
    public float Y;
    public int Z;
    public final WeakReference<Context> a;
    public float a0;
    public final ze9 b;
    public float b0;
    public final vdf c;
    public float c0;
    public final Rect d;
    public WeakReference<View> d0;
    public float e;
    public WeakReference<FrameLayout> e0;
    public float f;

    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int V;
        public int W;
        public int X;
        public boolean Y;
        public int Z;
        public int a;
        public int a0;
        public int b;
        public int b0;
        public int c;
        public int c0;
        public int d;
        public int d0;
        public int e;
        public int e0;
        public String f;

        public static class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.c = 255;
                savedState.d = -1;
                savedState.a = parcel.readInt();
                savedState.b = parcel.readInt();
                savedState.c = parcel.readInt();
                savedState.d = parcel.readInt();
                savedState.e = parcel.readInt();
                savedState.f = parcel.readString();
                savedState.V = parcel.readInt();
                savedState.X = parcel.readInt();
                savedState.Z = parcel.readInt();
                savedState.a0 = parcel.readInt();
                savedState.b0 = parcel.readInt();
                savedState.c0 = parcel.readInt();
                savedState.d0 = parcel.readInt();
                savedState.e0 = parcel.readInt();
                savedState.Y = parcel.readInt() != 0;
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeString(this.f.toString());
            parcel.writeInt(this.V);
            parcel.writeInt(this.X);
            parcel.writeInt(this.Z);
            parcel.writeInt(this.a0);
            parcel.writeInt(this.b0);
            parcel.writeInt(this.c0);
            parcel.writeInt(this.d0);
            parcel.writeInt(this.e0);
            parcel.writeInt(this.Y ? 1 : 0);
        }
    }

    public BadgeDrawable(Context context) {
        hcf hcfVar;
        Context context2;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.a = weakReference;
        jkf.c(context, jkf.b, "Theme.MaterialComponents");
        Resources resources = context.getResources();
        this.d = new Rect();
        this.b = new ze9();
        this.e = resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius);
        this.V = resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding);
        this.f = resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius);
        vdf vdfVar = new vdf(this);
        this.c = vdfVar;
        vdfVar.a.setTextAlign(Paint.Align.CENTER);
        SavedState savedState = new SavedState();
        savedState.c = 255;
        savedState.d = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.TextAppearance_MaterialComponents_Badge, lac.G);
        typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        ColorStateList colorStateListB = ye9.b(context, typedArrayObtainStyledAttributes, 3);
        ye9.b(context, typedArrayObtainStyledAttributes, 4);
        ye9.b(context, typedArrayObtainStyledAttributes, 5);
        typedArrayObtainStyledAttributes.getInt(2, 0);
        typedArrayObtainStyledAttributes.getInt(1, 1);
        int i = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        typedArrayObtainStyledAttributes.getResourceId(i, 0);
        typedArrayObtainStyledAttributes.getString(i);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        ye9.b(context, typedArrayObtainStyledAttributes, 6);
        typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(R.style.TextAppearance_MaterialComponents_Badge, lac.w);
        typedArrayObtainStyledAttributes2.hasValue(0);
        typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
        savedState.b = colorStateListB.getDefaultColor();
        savedState.f = context.getString(R.string.mtrl_badge_numberless_content_description);
        savedState.V = R.plurals.mtrl_badge_content_description;
        savedState.W = R.string.mtrl_exceed_max_badge_number_content_description;
        savedState.Y = true;
        this.W = savedState;
        Context context3 = weakReference.get();
        if (context3 == null || vdfVar.f == (hcfVar = new hcf(context3, R.style.TextAppearance_MaterialComponents_Badge)) || (context2 = weakReference.get()) == null) {
            return;
        }
        vdfVar.b(hcfVar, context2);
        m();
    }

    public static BadgeDrawable b(Context context) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        jkf.a(context, null, R.attr.badgeStyle, R.style.Widget_MaterialComponents_Badge);
        int[] iArr = lac.c;
        jkf.b(context, null, iArr, R.attr.badgeStyle, R.style.Widget_MaterialComponents_Badge, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.badgeStyle, R.style.Widget_MaterialComponents_Badge);
        badgeDrawable.j(typedArrayObtainStyledAttributes.getInt(8, 4));
        if (typedArrayObtainStyledAttributes.hasValue(9)) {
            badgeDrawable.k(typedArrayObtainStyledAttributes.getInt(9, 0));
        }
        badgeDrawable.g(ye9.b(context, typedArrayObtainStyledAttributes, 0).getDefaultColor());
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            badgeDrawable.i(ye9.b(context, typedArrayObtainStyledAttributes, 3).getDefaultColor());
        }
        badgeDrawable.h(typedArrayObtainStyledAttributes.getInt(1, 8388661));
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
        SavedState savedState = badgeDrawable.W;
        savedState.Z = dimensionPixelOffset;
        badgeDrawable.m();
        savedState.a0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(10, 0);
        badgeDrawable.m();
        savedState.b0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, savedState.Z);
        badgeDrawable.m();
        savedState.c0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(11, savedState.a0);
        badgeDrawable.m();
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            badgeDrawable.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, (int) badgeDrawable.e);
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            badgeDrawable.V = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, (int) badgeDrawable.V);
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            badgeDrawable.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, (int) badgeDrawable.f);
        }
        typedArrayObtainStyledAttributes.recycle();
        return badgeDrawable;
    }

    @Override // vdf.b
    public final void a() {
        invalidateSelf();
    }

    public final String c() {
        if (e() <= this.Z) {
            return NumberFormat.getInstance().format(e());
        }
        Context context = this.a.get();
        return context == null ? "" : context.getString(R.string.mtrl_exceed_max_badge_number_suffix, Integer.valueOf(this.Z), "+");
    }

    public final String d() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        boolean zF = f();
        SavedState savedState = this.W;
        if (!zF) {
            return savedState.f;
        }
        if (savedState.V <= 0 || (context = this.a.get()) == null) {
            return null;
        }
        int iE = e();
        int i = this.Z;
        return iE <= i ? context.getResources().getQuantityString(savedState.V, e(), Integer.valueOf(e())) : context.getString(savedState.W, Integer.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (getBounds().isEmpty() || this.W.c == 0 || !isVisible()) {
            return;
        }
        this.b.draw(canvas);
        if (f()) {
            Rect rect = new Rect();
            String strC = c();
            vdf vdfVar = this.c;
            vdfVar.a.getTextBounds(strC, 0, strC.length(), rect);
            canvas.drawText(strC, this.X, this.Y + (rect.height() / 2), vdfVar.a);
        }
    }

    public final int e() {
        if (f()) {
            return this.W.d;
        }
        return 0;
    }

    public final boolean f() {
        return this.W.d != -1;
    }

    public final void g(int i) {
        this.W.a = i;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        ze9 ze9Var = this.b;
        if (ze9Var.a.c != colorStateListValueOf) {
            ze9Var.k(colorStateListValueOf);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.W.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(int i) {
        SavedState savedState = this.W;
        if (savedState.X != i) {
            savedState.X = i;
            WeakReference<View> weakReference = this.d0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            View view = this.d0.get();
            WeakReference<FrameLayout> weakReference2 = this.e0;
            l(view, weakReference2 != null ? weakReference2.get() : null);
        }
    }

    public final void i(int i) {
        this.W.b = i;
        vdf vdfVar = this.c;
        if (vdfVar.a.getColor() != i) {
            vdfVar.a.setColor(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    public final void j(int i) {
        SavedState savedState = this.W;
        if (savedState.e != i) {
            savedState.e = i;
            this.Z = ((int) Math.pow(10.0d, ((double) i) - 1.0d)) - 1;
            this.c.d = true;
            m();
            invalidateSelf();
        }
    }

    public final void k(int i) {
        int iMax = Math.max(0, i);
        SavedState savedState = this.W;
        if (savedState.d != iMax) {
            savedState.d = iMax;
            this.c.d = true;
            m();
            invalidateSelf();
        }
    }

    public final void l(View view, FrameLayout frameLayout) {
        this.d0 = new WeakReference<>(view);
        this.e0 = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        m();
        invalidateSelf();
    }

    public final void m() {
        Context context = this.a.get();
        WeakReference<View> weakReference = this.d0;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.d;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference<FrameLayout> weakReference2 = this.e0;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null) {
            frameLayout.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zF = f();
        SavedState savedState = this.W;
        int i = (zF ? savedState.c0 : savedState.a0) + savedState.e0;
        int i2 = savedState.X;
        if (i2 == 8388691 || i2 == 8388693) {
            this.Y = rect3.bottom - i;
        } else {
            this.Y = rect3.top + i;
        }
        if (e() <= 9) {
            float f = !f() ? this.e : this.f;
            this.a0 = f;
            this.c0 = f;
            this.b0 = f;
        } else {
            float f2 = this.f;
            this.a0 = f2;
            this.c0 = f2;
            this.b0 = (this.c.a(c()) / 2.0f) + this.V;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(f() ? R.dimen.mtrl_badge_text_horizontal_edge_offset : R.dimen.mtrl_badge_horizontal_edge_offset);
        int i3 = (f() ? savedState.b0 : savedState.Z) + savedState.d0;
        int i4 = savedState.X;
        if (i4 == 8388659 || i4 == 8388691) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            this.X = view.getLayoutDirection() == 0 ? (rect3.left - this.b0) + dimensionPixelSize + i3 : ((rect3.right + this.b0) - dimensionPixelSize) - i3;
        } else {
            WeakHashMap<View, prg> weakHashMap2 = epg.a;
            this.X = view.getLayoutDirection() == 0 ? ((rect3.right + this.b0) - dimensionPixelSize) - i3 : (rect3.left - this.b0) + dimensionPixelSize + i3;
        }
        float f3 = this.X;
        float f4 = this.Y;
        float f5 = this.b0;
        float f6 = this.c0;
        rect2.set((int) (f3 - f5), (int) (f4 - f6), (int) (f3 + f5), (int) (f4 + f6));
        float f7 = this.a0;
        ze9 ze9Var = this.b;
        ece.a aVarE = ze9Var.a.a.e();
        aVarE.e = new k0(f7);
        aVarE.f = new k0(f7);
        aVarE.g = new k0(f7);
        aVarE.h = new k0(f7);
        ze9Var.setShapeAppearanceModel(aVarE.a());
        if (rect.equals(rect2)) {
            return;
        }
        ze9Var.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable, vdf.b
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.W.c = i;
        this.c.a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
