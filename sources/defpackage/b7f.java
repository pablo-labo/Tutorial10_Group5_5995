package defpackage;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.datadog.android.core.internal.CoreFeature;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class b7f extends ViewGroup implements ur5 {
    public static final /* synthetic */ qf8<Object>[] d0;
    public final c V;
    public final d W;
    public final mkf a;
    public final e a0;
    public WeakReference<c7f> b;
    public final f b0;
    public e7f c;
    public boolean c0;
    public String d;
    public final a e;
    public final b f;

    public static final class a extends zna<String> {
        public a() {
            super(null);
        }

        @Override // defpackage.zna
        public final void a(qf8<?> qf8Var, String str, String str2) {
            qf8Var.getClass();
            b7f b7fVar = b7f.this;
            b7f.a(b7fVar, str, str2);
        }
    }

    public static final class b extends zna<String> {
        public b() {
            super(null);
        }

        @Override // defpackage.zna
        public final void a(qf8<?> qf8Var, String str, String str2) {
            qf8Var.getClass();
            b7f b7fVar = b7f.this;
            b7f.a(b7fVar, str, str2);
        }
    }

    public static final class c extends zna<Integer> {
        public c() {
            super(null);
        }

        @Override // defpackage.zna
        public final void a(qf8<?> qf8Var, Integer num, Integer num2) {
            qf8Var.getClass();
            b7f b7fVar = b7f.this;
            b7f.a(b7fVar, num, num2);
        }
    }

    public static final class d extends zna<Integer> {
        public d() {
            super(null);
        }

        @Override // defpackage.zna
        public final void a(qf8<?> qf8Var, Integer num, Integer num2) {
            qf8Var.getClass();
            b7f b7fVar = b7f.this;
            b7f.a(b7fVar, num, num2);
        }
    }

    public static final class e extends zna<String> {
        public e() {
            super(null);
        }

        @Override // defpackage.zna
        public final void a(qf8<?> qf8Var, String str, String str2) {
            qf8Var.getClass();
            String str3 = str2;
            if (wl7.b(str3, str)) {
                return;
            }
            b7f b7fVar = b7f.this;
            mkf reactContext = b7fVar.getReactContext();
            reactContext.getClass();
            Drawable drawableA = null;
            if (str3 != null) {
                int identifier = reactContext.getResources().getIdentifier(str3, "drawable", reactContext.getPackageName());
                if (identifier > 0) {
                    drawableA = pnb.A(reactContext, identifier);
                } else {
                    int identifier2 = reactContext.getResources().getIdentifier(str3, "drawable", CoreFeature.DEFAULT_SOURCE_NAME);
                    if (identifier2 > 0) {
                        drawableA = pnb.A(reactContext, identifier2);
                    } else {
                        Log.w("TabScreen", "TabScreen could not resolve drawable resource with the name ".concat(str3));
                    }
                }
            }
            b7fVar.setIcon(drawableA);
        }
    }

    public static final class f extends zna<Drawable> {
        public f() {
            super(null);
        }

        @Override // defpackage.zna
        public final void a(qf8<?> qf8Var, Drawable drawable, Drawable drawable2) {
            qf8Var.getClass();
            b7f b7fVar = b7f.this;
            b7f.a(b7fVar, drawable, drawable2);
        }
    }

    static {
        w3a w3aVar = new w3a(b7f.class, "tabTitle", "getTabTitle()Ljava/lang/String;", 0);
        iwc iwcVar = fwc.a;
        d0 = new qf8[]{iwcVar.e(w3aVar), r40.b(b7f.class, "badgeValue", "getBadgeValue()Ljava/lang/String;", 0, iwcVar), r40.b(b7f.class, "tabBarItemBadgeTextColor", "getTabBarItemBadgeTextColor()Ljava/lang/Integer;", 0, iwcVar), r40.b(b7f.class, "tabBarItemBadgeBackgroundColor", "getTabBarItemBadgeBackgroundColor()Ljava/lang/Integer;", 0, iwcVar), r40.b(b7f.class, "iconResourceName", "getIconResourceName()Ljava/lang/String;", 0, iwcVar), r40.b(b7f.class, "icon", "getIcon()Landroid/graphics/drawable/Drawable;", 0, iwcVar)};
    }

    public b7f(mkf mkfVar) {
        super(mkfVar);
        this.a = mkfVar;
        this.b = new WeakReference<>(null);
        this.e = new a();
        this.f = new b();
        this.V = new c();
        this.W = new d();
        this.a0 = new e();
        this.b0 = new f();
    }

    public static final void a(b7f b7fVar, Object obj, Object obj2) {
        c7f c7fVar;
        if (wl7.b(obj2, obj) || (c7fVar = b7fVar.b.get()) == null) {
            return;
        }
        c7fVar.b(b7fVar);
    }

    @Override // defpackage.ur5
    public Fragment getAssociatedFragment() {
        c7f c7fVar = this.b.get();
        if (c7fVar != null) {
            return c7fVar.d(this);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getBadgeValue() {
        qf8<Object> qf8Var = d0[1];
        b bVar = this.f;
        bVar.getClass();
        qf8Var.getClass();
        return (String) bVar.a;
    }

    public final e7f getEventEmitter$react_native_screens_release() {
        e7f e7fVar = this.c;
        if (e7fVar != null) {
            return e7fVar;
        }
        wl7.g("eventEmitter");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable getIcon() {
        qf8<Object> qf8Var = d0[5];
        f fVar = this.b0;
        fVar.getClass();
        qf8Var.getClass();
        return (Drawable) fVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getIconResourceName() {
        qf8<Object> qf8Var = d0[4];
        e eVar = this.a0;
        eVar.getClass();
        qf8Var.getClass();
        return (String) eVar.a;
    }

    public final mkf getReactContext() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer getTabBarItemBadgeBackgroundColor() {
        qf8<Object> qf8Var = d0[3];
        d dVar = this.W;
        dVar.getClass();
        qf8Var.getClass();
        return (Integer) dVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer getTabBarItemBadgeTextColor() {
        qf8<Object> qf8Var = d0[2];
        c cVar = this.V;
        cVar.getClass();
        qf8Var.getClass();
        return (Integer) cVar.a;
    }

    public final String getTabKey() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getTabTitle() {
        qf8<Object> qf8Var = d0[0];
        a aVar = this.e;
        aVar.getClass();
        qf8Var.getClass();
        return (String) aVar.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        getId();
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setBadgeValue(String str) {
        this.f.c(d0[1], this, str);
    }

    public final void setEventEmitter$react_native_screens_release(e7f e7fVar) {
        e7fVar.getClass();
        this.c = e7fVar;
    }

    public final void setFocusedTab(boolean z) {
        if (this.c0 != z) {
            this.c0 = z;
            c7f c7fVar = this.b.get();
            if (c7fVar != null) {
                c7fVar.c(this);
            }
        }
    }

    public final void setIcon(Drawable drawable) {
        this.b0.c(d0[5], this, drawable);
    }

    public final void setIconResourceName(String str) {
        this.a0.c(d0[4], this, str);
    }

    public final void setTabBarItemBadgeBackgroundColor(Integer num) {
        this.W.c(d0[3], this, num);
    }

    public final void setTabBarItemBadgeTextColor(Integer num) {
        this.V.c(d0[2], this, num);
    }

    public final void setTabKey(String str) {
        if (str != null && zve.U(str)) {
            str = null;
        }
        this.d = str;
    }

    public final void setTabScreenDelegate$react_native_screens_release(c7f c7fVar) {
        this.b = new WeakReference<>(c7fVar);
    }

    public final void setTabTitle(String str) {
        this.e.c(d0[0], this, str);
    }
}
