package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.widget.ActionBarContextView;
import com.indeed.android.jobsearch.R;
import defpackage.epg;
import defpackage.isg;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hj0 implements tpa {
    public final /* synthetic */ AppCompatDelegateImpl a;

    public hj0(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.a = appCompatDelegateImpl;
    }

    @Override // defpackage.tpa
    public final rzg b(View view, rzg rzgVar) {
        boolean z;
        boolean z2;
        int iD = rzgVar.d();
        AppCompatDelegateImpl appCompatDelegateImpl = this.a;
        Context context = appCompatDelegateImpl.Z;
        int iD2 = rzgVar.d();
        ActionBarContextView actionBarContextView = appCompatDelegateImpl.k0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) appCompatDelegateImpl.k0.getLayoutParams();
            if (appCompatDelegateImpl.k0.isShown()) {
                if (appCompatDelegateImpl.S0 == null) {
                    appCompatDelegateImpl.S0 = new Rect();
                    appCompatDelegateImpl.T0 = new Rect();
                }
                Rect rect = appCompatDelegateImpl.S0;
                Rect rect2 = appCompatDelegateImpl.T0;
                rect.set(rzgVar.b(), rzgVar.d(), rzgVar.c(), rzgVar.a());
                ViewGroup viewGroup = appCompatDelegateImpl.q0;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z3 = isg.a;
                    isg.a.a(viewGroup, rect, rect2);
                } else {
                    if (!isg.a) {
                        isg.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            isg.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                isg.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = isg.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                ViewGroup viewGroup2 = appCompatDelegateImpl.q0;
                WeakHashMap<View, prg> weakHashMap = epg.a;
                rzg rzgVarA = epg.e.a(viewGroup2);
                int iB = rzgVarA == null ? 0 : rzgVarA.b();
                int iC = rzgVarA == null ? 0 : rzgVarA.c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                if (i <= 0 || appCompatDelegateImpl.s0 != null) {
                    View view2 = appCompatDelegateImpl.s0;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            appCompatDelegateImpl.s0.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    appCompatDelegateImpl.s0 = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    appCompatDelegateImpl.q0.addView(appCompatDelegateImpl.s0, -1, layoutParams);
                }
                View view4 = appCompatDelegateImpl.s0;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = appCompatDelegateImpl.s0;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!appCompatDelegateImpl.x0 && z) {
                    iD2 = 0;
                }
                z = z;
                z = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z = false;
            }
            if (z) {
                appCompatDelegateImpl.k0.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = appCompatDelegateImpl.s0;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        return epg.i(view, iD != iD2 ? rzgVar.f(rzgVar.b(), iD2, rzgVar.c(), rzgVar.a()) : rzgVar);
    }
}
