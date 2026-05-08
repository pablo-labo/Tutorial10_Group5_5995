package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.nac;

/* JADX INFO: loaded from: classes.dex */
public final class d extends ViewGroup {

    public static class a extends ConstraintLayout.a {
        public float A0;
        public float B0;
        public float C0;
        public float q0;
        public boolean r0;
        public float s0;
        public float t0;
        public float u0;
        public float v0;
        public float w0;
        public float x0;
        public float y0;
        public float z0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        a aVar = new a();
        aVar.q0 = 1.0f;
        aVar.r0 = false;
        aVar.s0 = 0.0f;
        aVar.t0 = 0.0f;
        aVar.u0 = 0.0f;
        aVar.v0 = 0.0f;
        aVar.w0 = 1.0f;
        aVar.x0 = 1.0f;
        aVar.y0 = 0.0f;
        aVar.z0 = 0.0f;
        aVar.A0 = 0.0f;
        aVar.B0 = 0.0f;
        aVar.C0 = 0.0f;
        return aVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        a aVar = new a(context, attributeSet);
        aVar.q0 = 1.0f;
        aVar.r0 = false;
        aVar.s0 = 0.0f;
        aVar.t0 = 0.0f;
        aVar.u0 = 0.0f;
        aVar.v0 = 0.0f;
        aVar.w0 = 1.0f;
        aVar.x0 = 1.0f;
        aVar.y0 = 0.0f;
        aVar.z0 = 0.0f;
        aVar.A0 = 0.0f;
        aVar.B0 = 0.0f;
        aVar.C0 = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nac.d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 15) {
                aVar.q0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.q0);
            } else if (index == 28) {
                aVar.s0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.s0);
                aVar.r0 = true;
            } else if (index == 23) {
                aVar.u0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.u0);
            } else if (index == 24) {
                aVar.v0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.v0);
            } else if (index == 22) {
                aVar.t0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.t0);
            } else if (index == 20) {
                aVar.w0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.w0);
            } else if (index == 21) {
                aVar.x0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.x0);
            } else if (index == 16) {
                aVar.y0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.y0);
            } else if (index == 17) {
                aVar.z0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.z0);
            } else if (index == 18) {
                aVar.A0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.A0);
            } else if (index == 19) {
                aVar.B0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.B0);
            } else if (index == 27) {
                aVar.C0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.C0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public c getConstraintSet() {
        getChildCount();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }
}
