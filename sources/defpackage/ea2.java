package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import defpackage.o7d;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ea2 extends hd0 implements jd0 {
    public final d9a e;
    public final ReactApplicationContext f;
    public int g;
    public int h;
    public int i;
    public int j;
    public ReadableMap k;
    public boolean l;

    public static final class a {
        public static Context a(hd0 hd0Var) {
            Object aVar;
            ArrayList arrayList = hd0Var.a;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    hd0 hd0Var2 = (hd0) it.next();
                    if (!(hd0Var2 instanceof r4c)) {
                        return a(hd0Var2);
                    }
                    r4c r4cVar = (r4c) hd0Var2;
                    try {
                        UIManager uIManager = r4cVar.i;
                        aVar = uIManager != null ? uIManager.resolveView(r4cVar.f) : null;
                    } catch (Throwable th) {
                        aVar = new o7d.a(th);
                    }
                    if (aVar instanceof o7d.a) {
                        aVar = null;
                    }
                    View view = (View) aVar;
                    if (view != null) {
                        return view.getContext();
                    }
                    return null;
                }
            }
            return null;
        }
    }

    public ea2(ReadableMap readableMap, d9a d9aVar, ReactApplicationContext reactApplicationContext) {
        this.e = d9aVar;
        this.f = reactApplicationContext;
        a(readableMap);
    }

    @Override // defpackage.jd0
    public final void a(ReadableMap readableMap) {
        this.g = readableMap.getInt("r");
        this.h = readableMap.getInt("g");
        this.i = readableMap.getInt("b");
        this.j = readableMap.getInt("a");
        this.k = readableMap.getMap("nativeColor");
        this.l = false;
        g();
    }

    @Override // defpackage.hd0
    public final String d() {
        int i = this.d;
        int i2 = this.g;
        int i3 = this.h;
        int i4 = this.i;
        int i5 = this.j;
        StringBuilder sbF = uz.f("ColorAnimatedNode[", i, "]: r: ", i2, "  g: ");
        uz.i(sbF, i3, " b: ", i4, " a: ");
        sbF.append(i5);
        return sbF.toString();
    }

    public final int f() {
        g();
        int i = this.g;
        d9a d9aVar = this.e;
        elg elgVar = (elg) d9aVar.j(i);
        elg elgVar2 = (elg) d9aVar.j(this.h);
        elg elgVar3 = (elg) d9aVar.j(this.i);
        elg elgVar4 = (elg) d9aVar.j(this.j);
        return (Math.max(0, Math.min(255, gf9.a((elgVar4 != null ? elgVar4.e : 0.0d) * 255.0d))) << 24) | (Math.max(0, Math.min(255, gf9.a(elgVar != null ? elgVar.e : 0.0d))) << 16) | (Math.max(0, Math.min(255, gf9.a(elgVar2 != null ? elgVar2.e : 0.0d))) << 8) | Math.max(0, Math.min(255, gf9.a(elgVar3 != null ? elgVar3.e : 0.0d)));
    }

    public final void g() {
        Integer color;
        if (this.k == null || this.l) {
            return;
        }
        Context currentActivity = this.f.getCurrentActivity();
        if (currentActivity == null) {
            currentActivity = a.a(this);
        }
        if (currentActivity == null || (color = ColorPropConverter.getColor(this.k, currentActivity)) == null) {
            return;
        }
        int iIntValue = color.intValue();
        int i = this.g;
        d9a d9aVar = this.e;
        elg elgVar = (elg) d9aVar.j(i);
        elg elgVar2 = (elg) d9aVar.j(this.h);
        elg elgVar3 = (elg) d9aVar.j(this.i);
        elg elgVar4 = (elg) d9aVar.j(this.j);
        if (elgVar != null) {
            elgVar.e = Color.red(iIntValue);
        }
        if (elgVar2 != null) {
            elgVar2.e = Color.green(iIntValue);
        }
        if (elgVar3 != null) {
            elgVar3.e = Color.blue(iIntValue);
        }
        if (elgVar4 != null) {
            elgVar4.e = ((double) Color.alpha(iIntValue)) / 255.0d;
        }
        this.l = true;
    }
}
