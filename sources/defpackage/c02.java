package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c02 extends esf {
    public static final String[] m0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final b n0;
    public static final c o0;
    public static final d p0;
    public static final e q0;
    public static final f r0;

    public class a extends Property<Drawable, PointF> {
        public Rect a;

        @Override // android.util.Property
        public final PointF get(Drawable drawable) {
            drawable.copyBounds(this.a);
            return new PointF(r1.left, r1.top);
        }

        @Override // android.util.Property
        public final void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            Rect rect = this.a;
            drawable2.copyBounds(rect);
            rect.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(rect);
        }
    }

    public class b extends Property<i, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.a = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            iVar2.b = iRound;
            int i = iVar2.f + 1;
            iVar2.f = i;
            if (i == iVar2.g) {
                jsg.a(iVar2.e, iVar2.a, iRound, iVar2.c, iVar2.d);
                iVar2.f = 0;
                iVar2.g = 0;
            }
        }
    }

    public class c extends Property<i, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.c = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            iVar2.d = iRound;
            int i = iVar2.g + 1;
            iVar2.g = i;
            if (iVar2.f == i) {
                jsg.a(iVar2.e, iVar2.a, iVar2.b, iVar2.c, iRound);
                iVar2.f = 0;
                iVar2.g = 0;
            }
        }
    }

    public class d extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            jsg.a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    public class e extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            jsg.a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    public class f extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int iRound = Math.round(pointF2.x);
            int iRound2 = Math.round(pointF2.y);
            jsg.a(view2, iRound, iRound2, view2.getWidth() + iRound, view2.getHeight() + iRound2);
        }
    }

    public class g extends AnimatorListenerAdapter {
        private i mViewBounds;

        public g(i iVar) {
            this.mViewBounds = iVar;
        }
    }

    public class h extends nsf {
        public boolean a = false;
        public final /* synthetic */ ViewGroup b;

        public h(ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // defpackage.nsf, esf.d
        public final void a() {
            bqg.a(this.b, false);
        }

        @Override // defpackage.nsf, esf.d
        public final void b() {
            bqg.a(this.b, false);
            this.a = true;
        }

        @Override // defpackage.nsf, esf.d
        public final void c() {
            bqg.a(this.b, true);
        }

        @Override // esf.d
        public final void d(esf esfVar) {
            if (!this.a) {
                bqg.a(this.b, false);
            }
            esfVar.x(this);
        }
    }

    public static class i {
        public int a;
        public int b;
        public int c;
        public int d;
        public View e;
        public int f;
        public int g;
    }

    static {
        new a(PointF.class, "boundsOrigin").a = new Rect();
        n0 = new b(PointF.class, "topLeft");
        o0 = new c(PointF.class, "bottomRight");
        p0 = new d(PointF.class, "bottomRight");
        q0 = new e(PointF.class, "topLeft");
        r0 = new f(PointF.class, "position");
    }

    public static void J(usf usfVar) {
        View view = usfVar.b;
        HashMap map = usfVar.a;
        WeakHashMap<View, prg> weakHashMap = epg.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // defpackage.esf
    public final void f(usf usfVar) {
        J(usfVar);
    }

    @Override // defpackage.esf
    public final void i(usf usfVar) {
        J(usfVar);
    }

    @Override // defpackage.esf
    public final Animator m(ViewGroup viewGroup, usf usfVar, usf usfVar2) {
        int i2;
        c02 c02Var;
        Animator animatorOfObject;
        if (usfVar == null) {
            return null;
        }
        HashMap map = usfVar.a;
        if (usfVar2 == null) {
            return null;
        }
        HashMap map2 = usfVar2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = usfVar2.b;
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i3 = rect.left;
        int i4 = rect2.left;
        int i5 = rect.top;
        int i6 = rect2.top;
        int i7 = rect.right;
        int i8 = rect2.right;
        int i9 = rect.bottom;
        int i10 = rect2.bottom;
        int i11 = i7 - i3;
        int i12 = i9 - i5;
        int i13 = i8 - i4;
        int i14 = i10 - i6;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
            i2 = 0;
        } else {
            i2 = (i3 == i4 && i5 == i6) ? 0 : 1;
            if (i7 != i8 || i9 != i10) {
                i2++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i2++;
        }
        int i15 = i2;
        if (i15 <= 0) {
            return null;
        }
        jsg.a(view, i3, i5, i7, i9);
        if (i15 != 2) {
            c02Var = this;
            animatorOfObject = (i3 == i4 && i5 == i6) ? ObjectAnimator.ofObject(view, p0, (TypeConverter) null, c02Var.i0.Z(i7, i9, i8, i10)) : ObjectAnimator.ofObject(view, q0, (TypeConverter) null, c02Var.i0.Z(i3, i5, i4, i6));
        } else if (i11 == i13 && i12 == i14) {
            c02Var = this;
            animatorOfObject = ObjectAnimator.ofObject(view, r0, (TypeConverter) null, c02Var.i0.Z(i3, i5, i4, i6));
        } else {
            c02Var = this;
            i iVar = new i();
            iVar.e = view;
            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(iVar, n0, (TypeConverter) null, c02Var.i0.Z(i3, i5, i4, i6));
            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(iVar, o0, (TypeConverter) null, c02Var.i0.Z(i7, i9, i8, i10));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
            animatorSet.addListener(new g(iVar));
            animatorOfObject = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            bqg.a(viewGroup4, true);
            c02Var.c(new h(viewGroup4));
        }
        return animatorOfObject;
    }

    @Override // defpackage.esf
    public final String[] r() {
        return m0;
    }
}
