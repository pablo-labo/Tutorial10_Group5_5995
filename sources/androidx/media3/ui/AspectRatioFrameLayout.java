package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.sac;

/* JADX INFO: loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public static final /* synthetic */ int d = 0;
    public final b a;
    public float b;
    public int c;

    public interface a {
    }

    public final class b implements Runnable {
        public boolean a;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a = false;
            int i = AspectRatioFrameLayout.d;
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, sac.a, 0, 0);
            try {
                this.c = typedArrayObtainStyledAttributes.getInt(0, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.a = new b();
    }

    public int getResizeMode() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r4 > 0.0f) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        r2 = r2 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        r1 = r1 / r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r4 > 0.0f) goto L23;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            float r9 = r8.b
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto Lb
            goto L36
        Lb:
            int r9 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            float r1 = (float) r9
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r8.b
            float r4 = r4 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r3
            float r3 = java.lang.Math.abs(r4)
            r5 = 1008981770(0x3c23d70a, float:0.01)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r5 = 1
            androidx.media3.ui.AspectRatioFrameLayout$b r6 = r8.a
            if (r3 > 0) goto L37
            boolean r8 = r6.a
            if (r8 != 0) goto L36
            r6.a = r5
            androidx.media3.ui.AspectRatioFrameLayout r8 = androidx.media3.ui.AspectRatioFrameLayout.this
            r8.post(r6)
        L36:
            return
        L37:
            int r3 = r8.c
            if (r3 == 0) goto L58
            if (r3 == r5) goto L54
            r7 = 2
            if (r3 == r7) goto L50
            r7 = 4
            if (r3 == r7) goto L44
            goto L5f
        L44:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            float r3 = r8.b
            if (r10 <= 0) goto L4d
        L4a:
            float r2 = r2 * r3
        L4b:
            int r9 = (int) r2
            goto L5f
        L4d:
            float r1 = r1 / r3
        L4e:
            int r0 = (int) r1
            goto L5f
        L50:
            float r9 = r8.b
            float r2 = r2 * r9
            goto L4b
        L54:
            float r10 = r8.b
            float r1 = r1 / r10
            goto L4e
        L58:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            float r3 = r8.b
            if (r10 <= 0) goto L4a
            goto L4d
        L5f:
            boolean r10 = r6.a
            if (r10 != 0) goto L6a
            r6.a = r5
            androidx.media3.ui.AspectRatioFrameLayout r10 = androidx.media3.ui.AspectRatioFrameLayout.this
            r10.post(r6)
        L6a:
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public void setAspectRatio(float f) {
        if (this.b != f) {
            this.b = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(a aVar) {
    }

    public void setResizeMode(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }
}
