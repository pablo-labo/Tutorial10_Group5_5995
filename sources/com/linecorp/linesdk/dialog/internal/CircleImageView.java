package com.linecorp.linesdk.dialog.internal;

import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.cgd;

/* JADX INFO: loaded from: classes3.dex */
public class CircleImageView extends AppCompatImageView {
    public CircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setImageDrawable(null);
            return;
        }
        cgd cgdVar = new cgd(getContext().getResources(), ((BitmapDrawable) drawable).getBitmap());
        cgdVar.k = true;
        cgdVar.j = true;
        cgdVar.g = Math.min(cgdVar.m, cgdVar.l) / 2;
        Paint paint = cgdVar.d;
        BitmapShader bitmapShader = cgdVar.e;
        paint.setShader(bitmapShader);
        cgdVar.invalidateSelf();
        float fMax = Math.max(r8.getWidth(), r8.getHeight()) / 2.0f;
        if (cgdVar.g != fMax) {
            cgdVar.k = false;
            if (fMax > 0.05f) {
                paint.setShader(bitmapShader);
            } else {
                paint.setShader(null);
            }
            cgdVar.g = fMax;
            cgdVar.invalidateSelf();
        }
        super.setImageDrawable(cgdVar);
    }
}
