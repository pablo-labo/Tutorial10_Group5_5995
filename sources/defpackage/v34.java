package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import defpackage.u34;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.fcm.DeviceNotifications$loadImage$2", f = "DeviceNotifications.kt", l = {177}, m = "invokeSuspend")
public final class v34 extends c1f implements Function2<e13, lu2<? super u34.c>, Object> {
    final /* synthetic */ v27 $request;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v34(v27 v27Var, lu2<? super v34> lu2Var) {
        super(2, lu2Var);
        this.$request = v27Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new v34(this.$request, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super u34.c> lu2Var) {
        return ((v34) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        Bitmap bitmap = null;
        if (i == 0) {
            r7d.b(obj);
            u34.a.getClass();
            n17 n17Var = new n17(u34.b());
            frc frcVar = new frc(n17Var.a, n17Var.b, new d2f(new j17(n17Var)), new d2f(new k17(n17Var)), boa.D(l17.a), new ng2(), n17Var.c);
            v27 v27Var = this.$request;
            this.label = 1;
            obj = f13.d(new zqc(null, v27Var, frcVar), this);
            g13 g13Var = g13.a;
            if (obj == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        d37 d37Var = (d37) obj;
        if (!(d37Var instanceof nye)) {
            return new u34.c(null, "failed");
        }
        Drawable drawable = ((nye) d37Var).a;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            boolean z = drawable instanceof BitmapDrawable;
            if (!z || ((BitmapDrawable) drawable).getBitmap() != null) {
                if (z) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                    if (bitmapDrawable.getBitmap() == null) {
                        l5.q("bitmap is null");
                        return null;
                    }
                    bitmap = (intrinsicWidth == bitmapDrawable.getBitmap().getWidth() && intrinsicHeight == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), intrinsicWidth, intrinsicHeight, true);
                } else {
                    Rect bounds = drawable.getBounds();
                    int i2 = bounds.left;
                    int i3 = bounds.top;
                    int i4 = bounds.right;
                    int i5 = bounds.bottom;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                    drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    drawable.draw(new Canvas(bitmapCreateBitmap));
                    drawable.setBounds(i2, i3, i4, i5);
                    bitmap = bitmapCreateBitmap;
                }
            }
        }
        return new u34.c(bitmap, "succeeded");
    }
}
