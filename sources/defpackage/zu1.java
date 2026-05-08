package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.datepicker.b;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes2.dex */
public final class zu1 {
    public final yu1 a;
    public final yu1 b;
    public final yu1 c;
    public final yu1 d;
    public final yu1 e;
    public final yu1 f;
    public final yu1 g;
    public final Paint h;

    public zu1(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(me9.b(context, b.class.getCanonicalName(), R.attr.materialCalendarStyle), lac.r);
        this.a = yu1.a(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.g = yu1.a(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
        this.b = yu1.a(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.c = yu1.a(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        ColorStateList colorStateListB = ye9.b(context, typedArrayObtainStyledAttributes, 6);
        this.d = yu1.a(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.e = yu1.a(context, typedArrayObtainStyledAttributes.getResourceId(7, 0));
        this.f = yu1.a(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(colorStateListB.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
