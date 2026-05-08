package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class tl5 {
    public static final a f = new a();
    public final Rect a = new Rect();
    public final Rect b = new Rect();
    public final Rect c = new Rect();
    public final b d = new b(new v40(this, 8));
    public final ArrayList<View> e = new ArrayList<>();

    public static final class a extends ThreadLocal<tl5> {
        @Override // java.lang.ThreadLocal
        public final tl5 initialValue() {
            return new tl5();
        }
    }

    public static final class b implements Comparator<View> {
        public final z3a<View, View> a = lnd.b();
        public final a4a<View> b = nnd.a();
        public final z3a<View, View> c = lnd.b();
        public final o3a<View> d = mna.a();
        public View e;

        public b(v40 v40Var) {
        }

        public final void a(ArrayList arrayList, ViewGroup viewGroup) {
            o3a<View> o3aVar;
            this.e = viewGroup;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                o3aVar = this.d;
                if (i >= size) {
                    break;
                }
                o3aVar.h(i, (View) arrayList.get(i));
                i++;
            }
            int size2 = arrayList.size() - 1;
            a4a<View> a4aVar = this.b;
            z3a<View, View> z3aVar = this.a;
            if (size2 >= 0) {
                while (true) {
                    int i2 = size2 - 1;
                    View view = (View) arrayList.get(size2);
                    int nextFocusForwardId = view.getNextFocusForwardId();
                    View viewA = (nextFocusForwardId == 0 || nextFocusForwardId == -1) ? null : wl5.a(view, viewGroup, 2);
                    if (viewA != null && o3aVar.d(viewA) >= 0) {
                        z3aVar.m(view, viewA);
                        a4aVar.d(viewA);
                    }
                    if (i2 < 0) {
                        break;
                    } else {
                        size2 = i2;
                    }
                }
            }
            int size3 = arrayList.size() - 1;
            if (size3 < 0) {
                return;
            }
            while (true) {
                int i3 = size3 - 1;
                View viewD = (View) arrayList.get(size3);
                if (z3aVar.d(viewD) != null && !a4aVar.a(viewD)) {
                    View view2 = viewD;
                    while (viewD != null) {
                        z3a<View, View> z3aVar2 = this.c;
                        View viewD2 = z3aVar2.d(viewD);
                        if (viewD2 != null) {
                            if (viewD2 == view2) {
                                break;
                            }
                            viewD = view2;
                            view2 = viewD2;
                        }
                        z3aVar2.m(viewD, view2);
                        viewD = z3aVar.d(viewD);
                    }
                }
                if (i3 < 0) {
                    return;
                } else {
                    size3 = i3;
                }
            }
        }

        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            View view3 = view;
            View view4 = view2;
            if (view3 == view4) {
                return 0;
            }
            if (view3 == null) {
                return -1;
            }
            if (view4 == null) {
                return 1;
            }
            z3a<View, View> z3aVar = this.c;
            View viewD = z3aVar.d(view3);
            View viewD2 = z3aVar.d(view4);
            if (viewD == viewD2 && viewD != null) {
                if (view3 == viewD) {
                    return -1;
                }
                return (view4 == viewD || this.a.d(view3) == null) ? 1 : -1;
            }
            if (viewD != null) {
                view3 = viewD;
            }
            if (viewD2 != null) {
                view4 = viewD2;
            }
            if (viewD == null && viewD2 == null) {
                return 0;
            }
            o3a<View> o3aVar = this.d;
            return o3aVar.e(view3) < o3aVar.e(view4) ? -1 : 1;
        }
    }

    public static void d(ViewGroup viewGroup, Rect rect) {
        int height = viewGroup.getHeight() + viewGroup.getScrollY();
        int width = viewGroup.getWidth() + viewGroup.getScrollX();
        rect.set(width, height, width, height);
    }

    public final View a(int i, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        ArrayList arrayList2;
        int iIndexOf;
        int iLastIndexOf;
        int i2;
        Rect rect2 = this.a;
        if (view != null) {
            view.getFocusedRect(rect2);
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        } else if (rect != null) {
            rect2.set(rect);
        } else if (i != 1) {
            if (i != 2) {
                if (i == 17 || i == 33) {
                    d(viewGroup, rect2);
                } else if (i == 66 || i == 130) {
                    int scrollY = viewGroup.getScrollY();
                    int scrollX = viewGroup.getScrollX();
                    rect2.set(scrollX, scrollY, scrollX, scrollY);
                }
            } else if (viewGroup.getLayoutDirection() == 1) {
                d(viewGroup, rect2);
            } else {
                int scrollY2 = viewGroup.getScrollY();
                int scrollX2 = viewGroup.getScrollX();
                rect2.set(scrollX2, scrollY2, scrollX2, scrollY2);
            }
        } else if (viewGroup.getLayoutDirection() == 1) {
            int scrollY3 = viewGroup.getScrollY();
            int scrollX3 = viewGroup.getScrollX();
            rect2.set(scrollX3, scrollY3, scrollX3, scrollY3);
        } else {
            d(viewGroup, rect2);
        }
        View viewC = null;
        if (i != 1 && i != 2) {
            if (i == 17 || i == 33 || i == 66 || i == 130) {
                return c(i, rect2, view, viewGroup, arrayList);
            }
            l5.q(p6.c(i, "Unknown direction: "));
            return null;
        }
        b bVar = this.d;
        try {
            bVar.a(arrayList, viewGroup);
            Collections.sort(arrayList, bVar);
            bVar.c.g();
            bVar.b.e();
            bVar.d.a();
            bVar.a.g();
            int size = arrayList.size();
            if (size < 2) {
                return null;
            }
            if (i == 1) {
                arrayList2 = arrayList;
                if (size >= 2) {
                    viewC = (view == null || (iIndexOf = arrayList2.indexOf(view)) <= 0) ? (View) arrayList2.get(size - 1) : (View) arrayList2.get(iIndexOf - 1);
                }
            } else if (i == 2) {
                arrayList2 = arrayList;
                if (size >= 2) {
                    viewC = (view == null || (iLastIndexOf = arrayList2.lastIndexOf(view)) < 0 || (i2 = iLastIndexOf + 1) >= size) ? (View) arrayList2.get(0) : (View) arrayList2.get(i2);
                }
            } else if (i == 17 || i == 33 || i == 66 || i == 130) {
                arrayList2 = arrayList;
                viewC = c(i, this.a, view, viewGroup, arrayList2);
            } else {
                arrayList2 = arrayList;
            }
            return viewC == null ? (View) arrayList2.get(size - 1) : viewC;
        } catch (Throwable th) {
            bVar.c.g();
            bVar.b.e();
            bVar.d.a();
            bVar.a.g();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View b(ViewGroup viewGroup, View view, int i) {
        ViewGroup viewGroup2;
        View viewA = null;
        if (view == null || view == viewGroup) {
            viewGroup2 = viewGroup;
        } else {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup3 = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent != viewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) parent;
                    if (viewGroup4.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                        viewGroup3 = viewGroup4;
                    }
                    parent = viewGroup4.getParent();
                } else {
                    if (viewGroup3 == null) {
                        break;
                    }
                    viewGroup2 = viewGroup3;
                }
            }
            viewGroup2 = viewGroup;
        }
        View viewA2 = wl5.a(view, viewGroup2, i);
        int i2 = true;
        View viewA3 = viewA2;
        while (viewA2 != null) {
            if (viewA2.isFocusable() && viewA2.getVisibility() == 0 && (!viewA2.isInTouchMode() || viewA2.isFocusableInTouchMode())) {
                viewA = viewA2;
                break;
            }
            viewA2 = wl5.a(viewA2, viewGroup2, i);
            int i3 = i2 ^ true;
            if (i2 == false) {
                viewA3 = viewA3 != null ? wl5.a(viewA3, viewGroup2, i) : null;
                if (viewA3 == viewA2) {
                    break;
                }
            }
            i2 = i3;
        }
        if (viewA != null) {
            return viewA;
        }
        ArrayList<View> arrayList = this.e;
        try {
            arrayList.clear();
            viewGroup2.addFocusables(arrayList, i, viewGroup2.isInTouchMode() ? 1 : 0);
            if (!arrayList.isEmpty()) {
                viewA = a(i, null, view, viewGroup2, arrayList);
            }
            arrayList.clear();
            return viewA;
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }

    public final View c(int i, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        Rect rect2 = this.b;
        rect2.set(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset((-rect.width()) - 1, 0);
        } else if (i == 130) {
            rect2.offset(0, (-rect.height()) - 1);
        }
        int size = arrayList.size();
        View view2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = (View) arrayList.get(i2);
            if (!wl7.b(view3, view) && !wl7.b(view3, viewGroup)) {
                Rect rect3 = this.c;
                view3.getFocusedRect(rect3);
                viewGroup.offsetDescendantRectToMyCoords(view3, rect3);
                qtc qtcVarB = wab.B(rect3);
                qtc qtcVarB2 = wab.B(rect2);
                qtc qtcVarB3 = wab.B(rect);
                ol5 ol5VarH = cr8.H(i);
                if (gvf.g(qtcVarB, qtcVarB2, qtcVarB3, ol5VarH != null ? ol5VarH.a : 1)) {
                    rect2.set(rect3);
                    view2 = view3;
                }
            }
        }
        return view2;
    }
}
