package defpackage;

import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import defpackage.pl8;

/* JADX INFO: loaded from: classes2.dex */
public final class ol8 {
    public boolean e;
    public xn0 g;
    public final tl8 a = new tl8();
    public final ym8 b = new ym8();
    public final ul8 c = new ul8();
    public final SparseArray<xl8> d = new SparseArray<>(0);
    public long f = -1;

    public static void b(View view) {
        view.setClickable(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.getClass();
                b(childAt);
            }
        }
    }

    public final void a(View view, gaa gaaVar) {
        UiThreadUtil.assertOnUiThread();
        Animation animationA = this.c.a(view, view.getLeft(), view.getTop(), view.getWidth(), view.getHeight());
        if (animationA == null) {
            gaaVar.a();
            return;
        }
        b(view);
        animationA.setAnimationListener(new nl8(gaaVar));
        long duration = animationA.getDuration();
        if (duration > this.f) {
            if (this.g != null) {
                Handler uiThreadHandler = UiThreadUtil.getUiThreadHandler();
                xn0 xn0Var = this.g;
                xn0Var.getClass();
                uiThreadHandler.removeCallbacks(xn0Var);
                xn0 xn0Var2 = this.g;
                xn0Var2.getClass();
                uiThreadHandler.postDelayed(xn0Var2, duration);
            }
            this.f = duration;
        }
        view.startAnimation(animationA);
    }

    public final void c(ReadableMap readableMap, Callback callback) {
        if (readableMap == null) {
            d();
            return;
        }
        this.e = false;
        int i = readableMap.hasKey("duration") ? readableMap.getInt("duration") : 0;
        pl8.a.getClass();
        pl8 pl8Var = pl8.b;
        if (readableMap.hasKey(pl8.a.a(pl8Var))) {
            ReadableMap map = readableMap.getMap(pl8.a.a(pl8Var));
            map.getClass();
            this.a.c(i, map);
            this.e = true;
        }
        pl8 pl8Var2 = pl8.c;
        if (readableMap.hasKey(pl8.a.a(pl8Var2))) {
            ReadableMap map2 = readableMap.getMap(pl8.a.a(pl8Var2));
            map2.getClass();
            this.b.c(i, map2);
            this.e = true;
        }
        pl8 pl8Var3 = pl8.d;
        if (readableMap.hasKey(pl8.a.a(pl8Var3))) {
            ReadableMap map3 = readableMap.getMap(pl8.a.a(pl8Var3));
            map3.getClass();
            this.c.c(i, map3);
            this.e = true;
        }
        if (!this.e || callback == null) {
            return;
        }
        this.g = new xn0(callback, 5);
    }

    public final void d() {
        tl8 tl8Var = this.a;
        tl8Var.c = null;
        tl8Var.d = 0;
        tl8Var.b = 0;
        tl8Var.a = null;
        ym8 ym8Var = this.b;
        ym8Var.c = null;
        ym8Var.d = 0;
        ym8Var.b = 0;
        ym8Var.a = null;
        ul8 ul8Var = this.c;
        ul8Var.c = null;
        ul8Var.d = 0;
        ul8Var.b = 0;
        ul8Var.a = null;
        this.g = null;
        this.e = false;
        this.f = -1L;
        SparseArray<xl8> sparseArray = this.d;
        int size = sparseArray.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            xl8 xl8VarValueAt = sparseArray.valueAt(size);
            xl8VarValueAt.getClass();
            if (!xl8VarValueAt.isValid()) {
                sparseArray.removeAt(size);
            }
        }
    }

    public final boolean e(View view) {
        if (view == null) {
            return false;
        }
        return (this.e && view.getParent() != null) || this.d.get(view.getId()) != null;
    }
}
