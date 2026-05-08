package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class vdf {
    public float c;
    public final WeakReference<b> e;
    public hcf f;
    public final TextPaint a = new TextPaint(1);
    public final a b = new a();
    public boolean d = true;

    public class a extends v1 {
        public a() {
        }

        @Override // defpackage.v1
        public final void k0(int i) {
            vdf vdfVar = vdf.this;
            vdfVar.d = true;
            b bVar = vdfVar.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // defpackage.v1
        public final void l0(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            vdf vdfVar = vdf.this;
            vdfVar.d = true;
            b bVar = vdfVar.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public vdf(b bVar) {
        this.e = new WeakReference<>(null);
        this.e = new WeakReference<>(bVar);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.c;
        }
        float fMeasureText = str == null ? 0.0f : this.a.measureText((CharSequence) str, 0, str.length());
        this.c = fMeasureText;
        this.d = false;
        return fMeasureText;
    }

    public final void b(hcf hcfVar, Context context) {
        if (this.f != hcfVar) {
            this.f = hcfVar;
            WeakReference<b> weakReference = this.e;
            if (hcfVar != null) {
                TextPaint textPaint = this.a;
                a aVar = this.b;
                hcfVar.f(context, textPaint, aVar);
                b bVar = weakReference.get();
                if (bVar != null) {
                    textPaint.drawableState = bVar.getState();
                }
                hcfVar.e(context, textPaint, aVar);
                this.d = true;
            }
            b bVar2 = weakReference.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }
}
