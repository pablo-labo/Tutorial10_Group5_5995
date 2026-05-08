package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIManagerModule;
import com.indeed.android.jobsearch.R;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class lq5 extends FrameLayout {
    public final TextView a;
    public final jq5 b;
    public final a c;

    public final class a implements Runnable {
        public boolean a;
        public int b;
        public int c;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            double d;
            double d2;
            lq5 lq5Var = lq5.this;
            jq5 jq5Var = lq5Var.b;
            if (this.a) {
                return;
            }
            int i = this.b;
            long j = jq5Var.e;
            long j2 = jq5Var.d;
            int i2 = (int) (((jq5Var.Y * ((double) ((int) ((j - j2) / 1000000.0d)))) / 1000.0d) + 1.0d);
            int i3 = jq5Var.f - 1;
            int i4 = (i2 - i3) + i;
            this.b = i4;
            int i5 = this.c + jq5Var.W;
            this.c = i5;
            if (j == j2) {
                d2 = 0.0d;
                d = 1.0E9d;
            } else {
                d = 1.0E9d;
                d2 = (((double) i3) * 1.0E9d) / (j - j2);
            }
            lq5Var.a(d2, j == j2 ? 0.0d : (((double) (jq5Var.X - 1)) * d) / (j - j2), i4, i5, jq5Var.Z);
            jq5Var.d = -1L;
            jq5Var.e = -1L;
            jq5Var.f = 0;
            jq5Var.W = 0;
            jq5Var.X = 0;
            lq5Var.postDelayed(this, 500L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq5(ReactContext reactContext) {
        super(reactContext);
        reactContext.getClass();
        View.inflate(reactContext, R.layout.fps_view, this);
        View viewFindViewById = findViewById(R.id.fps_text);
        viewFindViewById.getClass();
        this.a = (TextView) viewFindViewById;
        jq5 jq5Var = new jq5(reactContext);
        this.b = jq5Var;
        this.c = new a();
        a(0.0d, 0.0d, 0, 0, jq5Var.Z);
    }

    public final void a(double d, double d2, int i, int i2, boolean z) {
        Locale locale = Locale.US;
        String strConcat = String.format(locale, "UI: %.1f fps\n%d dropped so far\n%d stutters (4+) so far", Arrays.copyOf(new Object[]{Double.valueOf(d), Integer.valueOf(i), Integer.valueOf(i2)}, 3));
        if (!z) {
            strConcat = strConcat.concat(String.format(locale, "\nJS: %.1f fps", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1)));
        }
        this.a.setText(strConcat);
        s55.b("ReactNative", strConcat);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jq5 jq5Var = this.b;
        jq5Var.d = -1L;
        jq5Var.e = -1L;
        jq5Var.f = 0;
        jq5Var.W = 0;
        jq5Var.X = 0;
        double d = jq5Var.Y;
        q44 q44Var = jq5Var.c;
        ReactContext reactContext = jq5Var.a;
        UIManagerModule uIManagerModule = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
        if (reactContext.isBridgeless()) {
            jq5Var.Z = true;
        } else {
            reactContext.getCatalystInstance().addBridgeIdleDebugListener(q44Var);
            jq5Var.Z = false;
        }
        if (uIManagerModule != null) {
            uIManagerModule.setViewHierarchyUpdateDebugListener(q44Var);
        }
        jq5Var.Y = d;
        UiThreadUtil.runOnUiThread(new qb0(jq5Var, 3));
        a aVar = this.c;
        aVar.a = false;
        lq5.this.post(aVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jq5 jq5Var = this.b;
        ReactContext reactContext = jq5Var.a;
        UIManagerModule uIManagerModule = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
        if (!reactContext.isBridgeless()) {
            reactContext.getCatalystInstance().removeBridgeIdleDebugListener(jq5Var.c);
        }
        if (uIManagerModule != null) {
            uIManagerModule.setViewHierarchyUpdateDebugListener(null);
        }
        UiThreadUtil.runOnUiThread(new h50(jq5Var, 4));
        this.c.a = true;
    }
}
