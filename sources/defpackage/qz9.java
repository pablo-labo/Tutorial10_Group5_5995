package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import defpackage.rz9;

/* JADX INFO: loaded from: classes.dex */
public final class qz9 extends b implements rz9.c {
    public boolean a0;
    public boolean b0;
    public float c0;
    public View[] d0;

    @Override // androidx.constraintlayout.widget.b
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, nac.h);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.a0 = typedArrayObtainStyledAttributes.getBoolean(index, this.a0);
                } else if (index == 0) {
                    this.b0 = typedArrayObtainStyledAttributes.getBoolean(index, this.b0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public float getProgress() {
        return this.c0;
    }

    public void setProgress(float f) {
        this.c0 = f;
        int i = 0;
        if (this.b <= 0) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int childCount = viewGroup.getChildCount();
            while (i < childCount) {
                viewGroup.getChildAt(i);
                i++;
            }
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        View[] viewArr = this.V;
        if (viewArr == null || viewArr.length != this.b) {
            this.V = new View[this.b];
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            this.V[i2] = constraintLayout.a.get(this.a[i2]);
        }
        this.d0 = this.V;
        while (i < this.b) {
            View view = this.d0[i];
            i++;
        }
    }
}
