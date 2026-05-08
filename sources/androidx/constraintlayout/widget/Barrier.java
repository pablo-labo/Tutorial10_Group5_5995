package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.gq2;
import defpackage.n81;
import defpackage.nac;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends b {
    public int a0;
    public int b0;
    public n81 c0;

    public Barrier(Context context) {
        super(context);
        this.a = new int[32];
        this.V = null;
        this.W = new HashMap<>();
        this.c = context;
        g(null);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.b
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.c0 = new n81();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, nac.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.c0.t0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.c0.u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.d = this.c0;
        i();
    }

    public boolean getAllowsGoneWidget() {
        return this.c0.t0;
    }

    public int getMargin() {
        return this.c0.u0;
    }

    public int getType() {
        return this.a0;
    }

    @Override // androidx.constraintlayout.widget.b
    public final void h(gq2 gq2Var, boolean z) {
        int i = this.a0;
        this.b0 = i;
        if (z) {
            if (i == 5) {
                this.b0 = 1;
            } else if (i == 6) {
                this.b0 = 0;
            }
        } else if (i == 5) {
            this.b0 = 0;
        } else if (i == 6) {
            this.b0 = 1;
        }
        if (gq2Var instanceof n81) {
            ((n81) gq2Var).s0 = this.b0;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.c0.t0 = z;
    }

    public void setDpMargin(int i) {
        this.c0.u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.c0.u0 = i;
    }

    public void setType(int i) {
        this.a0 = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
