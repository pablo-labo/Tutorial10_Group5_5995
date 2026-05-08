package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.EnumSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gpf {
    public static final float[] a = new float[2];
    public static final PointF b = new PointF();
    public static final float[] c = new float[2];
    public static final Matrix d = new Matrix();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("SELF", 0);
            a = aVar;
            a aVar2 = new a("CHILD", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public static final class b {
        public final int a;
        public final View b;

        public b(View view, int i) {
            this.a = i;
            this.b = view;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && ((b) obj).a == this.a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int a(float f, float f2, ViewGroup viewGroup, float[] fArr) {
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        fArr[0] = f;
        fArr[1] = f2;
        View viewC = c(fArr, viewGroup, null);
        if (viewC != 0) {
            while (viewC != 0 && viewC.getId() <= 0) {
                Object parent = viewC.getParent();
                viewC = parent instanceof View ? (View) parent : 0;
            }
            if (viewC != 0) {
                return viewC instanceof yjc ? ((yjc) viewC).reactTagForTouch(fArr[0], fArr[1]) : viewC.getId();
            }
        }
        return id;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (((android.view.ViewGroup) r12).getClipChildren() != false) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.view.View b(float[] r11, android.view.View r12, java.util.EnumSet r13, java.util.List r14) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gpf.b(float[], android.view.View, java.util.EnumSet, java.util.List):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static View c(float[] fArr, View view, List list) {
        boolean z = view instanceof rnc;
        qeb qebVar = qeb.e;
        qeb pointerEvents = z ? ((rnc) view).getPointerEvents() : qebVar;
        if (!view.isEnabled()) {
            int iOrdinal = pointerEvents.ordinal();
            if (iOrdinal == 2) {
                pointerEvents = qeb.b;
            } else if (iOrdinal == 3) {
                pointerEvents = qeb.c;
            }
        }
        int iOrdinal2 = pointerEvents.ordinal();
        if (iOrdinal2 == 0) {
            return null;
        }
        a aVar = a.b;
        if (iOrdinal2 != 1) {
            a aVar2 = a.a;
            if (iOrdinal2 == 2) {
                EnumSet enumSetOf = EnumSet.of(aVar2);
                enumSetOf.getClass();
                View viewB = b(fArr, view, enumSetOf, list);
                if (viewB != null && list != null) {
                    list.add(new b(view, view.getId()));
                }
                return viewB;
            }
            if (pointerEvents != qebVar) {
                s55.n("ReactNative", "Unknown pointer event type: " + pointerEvents);
            }
            if (!(view instanceof zjc) || !d(view, fArr[0], fArr[1]) || !((zjc) view).interceptsTouchEvent(fArr[0], fArr[1])) {
                EnumSet enumSetOf2 = EnumSet.of(aVar2, aVar);
                enumSetOf2.getClass();
                View viewB2 = b(fArr, view, enumSetOf2, list);
                if (viewB2 != null && list != null) {
                    list.add(new b(view, view.getId()));
                }
                return viewB2;
            }
            if (list != null) {
                list.add(new b(view, view.getId()));
                return view;
            }
        } else {
            EnumSet enumSetOf3 = EnumSet.of(aVar);
            enumSetOf3.getClass();
            View viewB3 = b(fArr, view, enumSetOf3, list);
            if (viewB3 != null) {
                if (list != null) {
                    list.add(new b(view, view.getId()));
                }
                return viewB3;
            }
            if (!(view instanceof yjc) || !d(view, fArr[0], fArr[1]) || ((yjc) view).reactTagForTouch(fArr[0], fArr[1]) == view.getId()) {
                return null;
            }
            if (list != null) {
                list.add(new b(view, view.getId()));
            }
        }
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(View view, float f, float f2) {
        pkc pkcVar = view instanceof pkc ? (pkc) view : null;
        Rect hitSlopRect = pkcVar != null ? pkcVar.getHitSlopRect() : null;
        return hitSlopRect != null ? f >= ((float) (-hitSlopRect.left)) && f < ((float) (view.getWidth() + hitSlopRect.right)) && f2 >= ((float) (-hitSlopRect.top)) && f2 < ((float) (view.getHeight() + hitSlopRect.bottom)) : f >= 0.0f && f < ((float) view.getWidth()) && f2 >= 0.0f && f2 < ((float) view.getHeight());
    }
}
