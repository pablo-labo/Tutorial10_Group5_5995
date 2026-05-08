package defpackage;

import android.content.Context;
import android.util.TypedValue;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes2.dex */
public final class op4 {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public op4(Context context) {
        TypedValue typedValueA = me9.a(context, R.attr.elevationOverlayEnabled);
        boolean z = (typedValueA == null || typedValueA.type != 18 || typedValueA.data == 0) ? false : true;
        TypedValue typedValueA2 = me9.a(context, R.attr.elevationOverlayColor);
        int i = typedValueA2 != null ? typedValueA2.data : 0;
        TypedValue typedValueA3 = me9.a(context, R.attr.elevationOverlayAccentColor);
        int i2 = typedValueA3 != null ? typedValueA3.data : 0;
        TypedValue typedValueA4 = me9.a(context, R.attr.colorSurface);
        int i3 = typedValueA4 != null ? typedValueA4.data : 0;
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f2;
    }
}
