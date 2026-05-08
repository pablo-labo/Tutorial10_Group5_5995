package defpackage;

import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.widget.TextView;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.a;
import com.facebook.react.bridge.ReadableMap;
import defpackage.hc4;

/* JADX INFO: loaded from: classes2.dex */
public final class ht5 extends phf {
    public TextView V;
    public final Uri W;
    public final int X;
    public final int Y;
    public final jc4<hx5> Z;
    public Drawable a0;
    public final int b;
    public final ReadableMap c;
    public final a2<?, a, ?, ?> d;
    public final Object e;
    public final String f;

    public ht5(Resources resources, int i, int i2, int i3, Uri uri, ReadableMap readableMap, a2<?, a, ?, ?> a2Var, Object obj, String str) {
        a2Var.getClass();
        this.b = i3;
        this.c = readableMap;
        this.d = a2Var;
        this.e = obj;
        this.f = str;
        if (uri == null) {
            uri = Uri.EMPTY;
            uri.getClass();
        }
        this.W = uri;
        this.X = (int) nn2.G(i2);
        this.Y = (int) nn2.G(i);
        this.Z = new jc4<>(new hx5(new ix5(resources)));
    }

    @Override // defpackage.phf
    public final Drawable a() {
        return this.a0;
    }

    @Override // defpackage.phf
    public final int b() {
        return this.Y;
    }

    @Override // defpackage.phf
    public final void c() {
        jc4<hx5> jc4Var = this.Z;
        jc4Var.f.a(hc4.a.d0);
        jc4Var.b = true;
        jc4Var.c();
    }

    @Override // defpackage.phf
    public final void d() {
        jc4<hx5> jc4Var = this.Z;
        jc4Var.f.a(hc4.a.e0);
        jc4Var.b = false;
        jc4Var.c();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.getClass();
        charSequence.getClass();
        paint.getClass();
        if (this.a0 == null) {
            dnc dncVar = new dnc(ImageRequestBuilder.d(this.W), this.c, q07.a);
            jc4<hx5> jc4Var = this.Z;
            DH dh = jc4Var.d;
            dh.getClass();
            h91 h91VarA = b37.a(this.f);
            zmd zmdVarK = ((hx5) dh).k(2);
            if (!wna.a(zmdVarK.d, h91VarA)) {
                zmdVarK.d = h91VarA;
                zmdVarK.e = null;
                zmdVarK.v();
                zmdVarK.invalidateSelf();
            }
            a2<?, a, ?, ?> a2Var = this.d;
            a2Var.c();
            a2Var.f = jc4Var.e;
            Object obj = this.e;
            if (obj != null) {
                a2Var.a = obj;
            }
            a2Var.b = dncVar;
            jc4Var.e(a2Var.a());
            a2Var.c();
            DH dh2 = jc4Var.d;
            nfd nfdVarB = dh2 != 0 ? dh2.b() : null;
            if (nfdVarB == null) {
                r6.g("Required value was null.");
                return;
            }
            nfdVarB.setBounds(0, 0, this.X, this.Y);
            int i6 = this.b;
            if (i6 != 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    nfdVarB.setColorFilter(new BlendModeColorFilter(i6, BlendMode.SRC_IN));
                } else {
                    nfdVarB.setColorFilter(new PorterDuffColorFilter(i6, PorterDuff.Mode.SRC_IN));
                }
            }
            nfdVarB.setCallback(this.V);
            this.a0 = nfdVarB;
        }
        canvas.save();
        Drawable drawable = this.a0;
        if (drawable == null) {
            r6.g("Required value was null.");
            return;
        }
        canvas.translate(f, ((i4 + ((int) paint.descent())) - (((int) (paint.descent() - paint.ascent())) / 2)) - (drawable.getBounds().height() / 2));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // defpackage.phf
    public final void e() {
        jc4<hx5> jc4Var = this.Z;
        jc4Var.f.a(hc4.a.d0);
        jc4Var.b = true;
        jc4Var.c();
    }

    @Override // defpackage.phf
    public final void f() {
        jc4<hx5> jc4Var = this.Z;
        jc4Var.f.a(hc4.a.e0);
        jc4Var.b = false;
        jc4Var.c();
    }

    @Override // defpackage.phf
    public final void g(TextView textView) {
        this.V = textView;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getClass();
        charSequence.getClass();
        if (fontMetricsInt != null) {
            int i3 = -this.Y;
            fontMetricsInt.ascent = i3;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i3;
            fontMetricsInt.bottom = 0;
        }
        return this.X;
    }
}
