package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class sj0 {
    public final ImageView a;
    public smf b;
    public int c = 0;

    public sj0(ImageView imageView) {
        this.a = imageView;
    }

    public final void a() {
        smf smfVar;
        ImageView imageView = this.a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            ac4.a(drawable);
        }
        if (drawable == null || (smfVar = this.b) == null) {
            return;
        }
        pj0.e(drawable, smfVar, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = this.a;
        Context context = imageView.getContext();
        int[] iArr = wac.f;
        umf umfVarE = umf.e(context, attributeSet, iArr, i);
        TypedArray typedArray = umfVarE.b;
        epg.n(imageView, imageView.getContext(), iArr, attributeSet, umfVarE.b, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = pnb.A(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                ac4.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(umfVarE.a(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(ac4.c(typedArray.getInt(3, -1), null));
            }
            umfVarE.f();
        } catch (Throwable th) {
            umfVarE.f();
            throw th;
        }
    }
}
