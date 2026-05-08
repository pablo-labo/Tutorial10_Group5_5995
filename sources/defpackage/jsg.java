package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class jsg {
    public static final lsg a;
    public static final a b;

    public class a extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(jsg.a.U(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            float fFloatValue = f.floatValue();
            jsg.a.W(view, fFloatValue);
        }
    }

    public class b extends Property<View, Rect> {
        @Override // android.util.Property
        public final Rect get(View view) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            return view.getClipBounds();
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new msg(28);
        } else {
            a = new lsg(28);
        }
        b = new a(Float.class, "translationAlpha");
        new b(Rect.class, "clipBounds");
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.V(view, i, i2, i3, i4);
    }
}
