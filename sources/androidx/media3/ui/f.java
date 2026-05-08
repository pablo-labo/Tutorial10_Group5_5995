package androidx.media3.ui;

import android.content.Context;
import android.text.Layout;
import android.widget.FrameLayout;
import androidx.media3.ui.SubtitleView;
import defpackage.fxg;
import defpackage.gx1;
import defpackage.jye;
import defpackage.n83;
import defpackage.vjg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class f extends FrameLayout implements SubtitleView.a {
    public float V;
    public final androidx.media3.ui.a a;
    public final fxg b;
    public List<n83> c;
    public gx1 d;
    public float e;
    public int f;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(Context context) {
        super(context, null);
        this.c = Collections.EMPTY_LIST;
        this.d = gx1.g;
        this.e = 0.0533f;
        this.f = 0;
        this.V = 0.08f;
        androidx.media3.ui.a aVar = new androidx.media3.ui.a(context, 0);
        this.a = aVar;
        fxg fxgVar = new fxg(context, null);
        this.b = fxgVar;
        fxgVar.setBackgroundColor(0);
        addView(aVar);
        addView(fxgVar);
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public final void a(List<n83> list, gx1 gx1Var, float f, int i, float f2) {
        this.d = gx1Var;
        this.e = f;
        this.f = i;
        this.V = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            n83 n83Var = list.get(i2);
            if (n83Var.d != null) {
                arrayList.add(n83Var);
            } else {
                arrayList2.add(n83Var);
            }
        }
        if (!this.c.isEmpty() || !arrayList2.isEmpty()) {
            this.c = arrayList2;
            c();
        }
        this.a.a(arrayList, gx1Var, f, i, f2);
        invalidate();
    }

    public final String b(float f, int i) {
        float fB = jye.b(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fB == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fB / getContext().getResources().getDisplayMetrics().density)};
        String str = vjg.a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x052a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instruction units count: 1789
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.f.c():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.c.isEmpty()) {
            return;
        }
        c();
    }
}
