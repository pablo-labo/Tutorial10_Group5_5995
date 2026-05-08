package defpackage;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class phf extends ReplacementSpan implements moc {
    public static final /* synthetic */ int a = 0;

    public static final class a {
        public static void a(Spannable spannable, TextView textView) {
            spannable.getClass();
            Object[] spans = spannable.getSpans(0, spannable.length(), phf.class);
            spans.getClass();
            for (Object obj : spans) {
                phf phfVar = (phf) obj;
                phfVar.c();
                phfVar.g(textView);
            }
        }
    }

    public abstract Drawable a();

    public abstract int b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g(TextView textView);
}
