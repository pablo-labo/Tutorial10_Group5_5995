package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.NoSuchNativeViewException;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class haa {
    public static final String k = haa.class.getSimpleName();
    public final SparseArray<View> a;
    public final SparseArray<ViewManager> b;
    public final SparseBooleanArray c;
    public final vqg d;
    public final zo7 e;
    public final RootViewManager f;
    public final ol8 g;
    public final RectF h;
    public volatile boolean i;
    public HashMap<Integer, Set<Integer>> j;

    public haa(vqg vqgVar) {
        RootViewManager rootViewManager = new RootViewManager();
        this.e = new zo7();
        this.g = new ol8();
        this.h = new RectF();
        this.d = vqgVar;
        this.a = new SparseArray<>();
        this.b = new SparseArray<>();
        this.c = new SparseBooleanArray();
        this.f = rootViewManager;
    }

    public static String c(ViewGroup viewGroup, ViewGroupManager viewGroupManager, int[] iArr, xog[] xogVarArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        if (viewGroup != null) {
            sb.append("View tag:" + viewGroup.getId() + " View Type:" + viewGroup.getClass().toString() + "\n");
            StringBuilder sb2 = new StringBuilder("  children(");
            sb2.append(viewGroupManager.getChildCount(viewGroup));
            sb2.append("): [\n");
            sb.append(sb2.toString());
            for (int i = 0; viewGroupManager.getChildAt(viewGroup, i) != null; i += 16) {
                int i2 = 0;
                while (true) {
                    int i3 = i + i2;
                    if (viewGroupManager.getChildAt(viewGroup, i3) == null || i2 >= 16) {
                        break;
                    }
                    sb.append(viewGroupManager.getChildAt(viewGroup, i3).getId() + ",");
                    i2++;
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr != null) {
            sb.append("  indicesToRemove(" + iArr.length + "): [\n");
            for (int i4 = 0; i4 < iArr.length; i4 += 16) {
                int i5 = 0;
                while (true) {
                    int i6 = i4 + i5;
                    if (i6 >= iArr.length || i5 >= 16) {
                        break;
                    }
                    sb.append(iArr[i6] + ",");
                    i5++;
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (xogVarArr != null) {
            sb.append("  viewsToAdd(" + xogVarArr.length + "): [\n");
            for (int i7 = 0; i7 < xogVarArr.length; i7 += 16) {
                int i8 = 0;
                while (true) {
                    int i9 = i7 + i8;
                    if (i9 >= xogVarArr.length || i8 >= 16) {
                        break;
                    }
                    sb.append("[" + xogVarArr[i9].b + "," + xogVarArr[i9].a + "],");
                    i8++;
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr2 != null) {
            sb.append("  tagsToDelete(" + iArr2.length + "): [\n");
            for (int i10 = 0; i10 < iArr2.length; i10 += 16) {
                int i11 = 0;
                while (true) {
                    int i12 = i10 + i11;
                    if (i12 >= iArr2.length || i11 >= 16) {
                        break;
                    }
                    sb.append(iArr2[i12] + ",");
                    i11++;
                }
                sb.append("\n");
            }
            sb.append(" ]\n");
        }
        return sb.toString();
    }

    public final synchronized void a(View view, int i) {
        try {
            if (view.getId() != -1) {
                s55.f(k, "Trying to add a root view with an explicit id (" + view.getId() + ") already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
            }
            this.a.put(i, view);
            this.b.put(i, this.f);
            this.c.put(i, true);
            view.setId(i);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(View view, int[] iArr) {
        float width = view.getWidth();
        float height = view.getHeight();
        RectF rectF = this.h;
        rectF.set(0.0f, 0.0f, width, height);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        rectF.offset(view.getLeft(), view.getTop());
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            Matrix matrix2 = view2.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rectF);
            }
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
        iArr[0] = Math.round(rectF.left);
        iArr[1] = Math.round(rectF.top);
        iArr[2] = Math.round(rectF.right - rectF.left);
        iArr[3] = Math.round(rectF.bottom - rectF.top);
    }

    @Deprecated
    public final synchronized void d(int i, int i2, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        View view = this.a.get(i);
        if (view == null) {
            throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i + "] and command " + i2);
        }
        k(i).receiveCommand(view, i2, readableArray);
    }

    public final synchronized void e(int i, String str, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        View view = this.a.get(i);
        if (view == null) {
            throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i + "] and command " + str);
        }
        k(i).receiveCommand(view, str, readableArray);
    }

    public final synchronized void f(View view) {
        try {
            UiThreadUtil.assertOnUiThread();
            if (view == null) {
                return;
            }
            if (this.b.get(view.getId()) == null) {
                return;
            }
            if (!this.c.get(view.getId())) {
                k(view.getId()).onDropViewInstance(view);
            }
            ViewManager viewManager = this.b.get(view.getId());
            if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
                ViewGroup viewGroup = (ViewGroup) view;
                ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
                for (int childCount = viewGroupManager.getChildCount(viewGroup) - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                    if (childAt == null) {
                        s55.f(k, "Unable to drop null child view");
                    } else if (this.a.get(childAt.getId()) != null) {
                        f(childAt);
                    }
                }
                viewGroupManager.removeAllViews(viewGroup);
            }
            this.a.remove(view.getId());
            this.b.remove(view.getId());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Set<Integer> g(int i) {
        if (this.j == null) {
            this.j = new HashMap<>();
        }
        if (!this.j.containsKey(Integer.valueOf(i))) {
            this.j.put(Integer.valueOf(i), new HashSet());
        }
        return this.j.get(Integer.valueOf(i));
    }

    public final synchronized void h(int i, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = this.a.get(i);
        if (view == null) {
            throw new NoSuchNativeViewException("No native view for " + i + " currently exists");
        }
        View view2 = (View) pyd.x(view);
        if (view2 == null) {
            throw new NoSuchNativeViewException("Native view " + i + " is no longer on screen");
        }
        b(view2, iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        b(view, iArr);
        iArr[0] = iArr[0] - i2;
        iArr[1] = iArr[1] - i3;
    }

    public final synchronized void i(int i, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = this.a.get(i);
        if (view == null) {
            throw new NoSuchNativeViewException("No native view for " + i + " currently exists");
        }
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        iArr[2] = view.getWidth();
        iArr[3] = view.getHeight();
    }

    public final synchronized View j(int i) {
        View view;
        view = this.a.get(i);
        if (view == null) {
            throw new IllegalViewOperationException("Trying to resolve view with tag " + i + " which doesn't exist");
        }
        return view;
    }

    public final synchronized ViewManager k(int i) {
        ViewManager viewManager;
        viewManager = this.b.get(i);
        if (viewManager == null) {
            throw new IllegalViewOperationException("ViewManager for tag " + i + " could not be found.\n");
        }
        return viewManager;
    }

    public final synchronized void l(int i, int i2) {
        View view = this.a.get(i);
        if (view == null) {
            throw new RetryableMountingLayerException("Could not find view with tag " + i);
        }
        view.sendAccessibilityEvent(i2);
    }

    public final void m(View view, int i, int i2, int i3, int i4) {
        if (!this.i || !this.g.e(view)) {
            view.layout(i, i2, i + i3, i2 + i4);
            return;
        }
        ol8 ol8Var = this.g;
        ol8Var.getClass();
        UiThreadUtil.assertOnUiThread();
        int id = view.getId();
        SparseArray<xl8> sparseArray = ol8Var.d;
        xl8 xl8Var = sparseArray.get(id);
        if (xl8Var != null) {
            if (xl8Var.isValid()) {
                xl8Var.c(i, i2, i3, i4);
                return;
            }
            sparseArray.remove(id);
        }
        Animation animationA = ((view.getWidth() == 0 || view.getHeight() == 0) ? ol8Var.a : ol8Var.b).a(view, i, i2, i3, i4);
        if (animationA instanceof xl8) {
            animationA.setAnimationListener(new ml8(ol8Var, id));
        } else {
            view.layout(i, i2, i + i3, i2 + i4);
        }
        if (animationA != null) {
            long duration = animationA.getDuration();
            if (duration > ol8Var.f) {
                ol8Var.f = duration;
                if (ol8Var.g != null) {
                    Handler uiThreadHandler = UiThreadUtil.getUiThreadHandler();
                    xn0 xn0Var = ol8Var.g;
                    xn0Var.getClass();
                    uiThreadHandler.removeCallbacks(xn0Var);
                    xn0 xn0Var2 = ol8Var.g;
                    xn0Var2.getClass();
                    uiThreadHandler.postDelayed(xn0Var2, duration);
                }
            }
            view.startAnimation(animationA);
        }
    }

    public final synchronized void n(int i, noc nocVar) {
        UiThreadUtil.assertOnUiThread();
        try {
            k(i).updateProperties(j(i), nocVar);
        } catch (IllegalViewOperationException e) {
            s55.g(k, "Unable to update properties for view tag " + i, e);
        }
    }
}
