package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.indeed.android.jobsearch.R;
import defpackage.epg;
import defpackage.rzg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class nzg {
    public e a;

    public static abstract class b {
        public WindowInsets a;
        public final int b;

        public b(int i) {
            this.b = i;
        }

        public void a(nzg nzgVar) {
        }

        public void c() {
        }

        public abstract rzg d(rzg rzgVar, List<nzg> list);

        public a e(nzg nzgVar, a aVar) {
            return aVar;
        }
    }

    public static class c extends e {
        public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
        public static final r65 f = new r65();
        public static final DecelerateInterpolator g = new DecelerateInterpolator();

        public static class a implements View.OnApplyWindowInsetsListener {
            public final b a;
            public rzg b;

            /* JADX INFO: renamed from: nzg$c$a$a, reason: collision with other inner class name */
            public class C0337a implements ValueAnimator.AnimatorUpdateListener {
                public final /* synthetic */ nzg a;
                public final /* synthetic */ rzg b;
                public final /* synthetic */ rzg c;
                public final /* synthetic */ int d;
                public final /* synthetic */ View e;

                public C0337a(nzg nzgVar, rzg rzgVar, rzg rzgVar2, int i, View view) {
                    this.a = nzgVar;
                    this.b = rzgVar;
                    this.c = rzgVar2;
                    this.d = i;
                    this.e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    nzg nzgVar = this.a;
                    e eVar = nzgVar.a;
                    eVar.d(animatedFraction);
                    float fB = eVar.b();
                    PathInterpolator pathInterpolator = c.e;
                    int i = Build.VERSION.SDK_INT;
                    rzg rzgVar = this.b;
                    rzg.d cVar = i >= 30 ? new rzg.c(rzgVar) : i >= 29 ? new rzg.b(rzgVar) : new rzg.a(rzgVar);
                    for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                        int i3 = this.d & i2;
                        rzg.j jVar = rzgVar.a;
                        if (i3 == 0) {
                            cVar.c(i2, jVar.g(i2));
                        } else {
                            kf7 kf7VarG = jVar.g(i2);
                            kf7 kf7VarG2 = this.c.a.g(i2);
                            float f = 1.0f - fB;
                            cVar.c(i2, rzg.e(kf7VarG, (int) (((double) ((kf7VarG.a - kf7VarG2.a) * f)) + 0.5d), (int) (((double) ((kf7VarG.b - kf7VarG2.b) * f)) + 0.5d), (int) (((double) ((kf7VarG.c - kf7VarG2.c) * f)) + 0.5d), (int) (((double) ((kf7VarG.d - kf7VarG2.d) * f)) + 0.5d)));
                        }
                    }
                    c.g(this.e, cVar.b(), Collections.singletonList(nzgVar));
                }
            }

            public class b extends AnimatorListenerAdapter {
                public final /* synthetic */ nzg a;
                public final /* synthetic */ View b;

                public b(nzg nzgVar, View view) {
                    this.a = nzgVar;
                    this.b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    nzg nzgVar = this.a;
                    nzgVar.a.d(1.0f);
                    c.e(nzgVar, this.b);
                }
            }

            /* JADX INFO: renamed from: nzg$c$a$c, reason: collision with other inner class name */
            public class RunnableC0338c implements Runnable {
                public final /* synthetic */ View a;
                public final /* synthetic */ nzg b;
                public final /* synthetic */ a c;
                public final /* synthetic */ ValueAnimator d;

                public RunnableC0338c(View view, nzg nzgVar, a aVar, ValueAnimator valueAnimator) {
                    this.a = view;
                    this.b = nzgVar;
                    this.c = aVar;
                    this.d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c.h(this.a, this.b, this.c);
                    this.d.start();
                }
            }

            public a(View view, b bVar) {
                rzg rzgVarB;
                this.a = bVar;
                WeakHashMap<View, prg> weakHashMap = epg.a;
                rzg rzgVarA = epg.e.a(view);
                if (rzgVarA != null) {
                    int i = Build.VERSION.SDK_INT;
                    rzgVarB = (i >= 30 ? new rzg.c(rzgVarA) : i >= 29 ? new rzg.b(rzgVarA) : new rzg.a(rzgVarA)).b();
                } else {
                    rzgVarB = null;
                }
                this.b = rzgVarB;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.b = rzg.h(view, windowInsets);
                    return c.i(view, windowInsets);
                }
                rzg rzgVarH = rzg.h(view, windowInsets);
                rzg.j jVar = rzgVarH.a;
                if (this.b == null) {
                    WeakHashMap<View, prg> weakHashMap = epg.a;
                    this.b = epg.e.a(view);
                }
                if (this.b == null) {
                    this.b = rzgVarH;
                    return c.i(view, windowInsets);
                }
                b bVarJ = c.j(view);
                if (bVarJ != null && Objects.equals(bVarJ.a, windowInsets)) {
                    return c.i(view, windowInsets);
                }
                rzg rzgVar = this.b;
                int i = 0;
                for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                    if (!jVar.g(i2).equals(rzgVar.a.g(i2))) {
                        i |= i2;
                    }
                }
                if (i == 0) {
                    return c.i(view, windowInsets);
                }
                rzg rzgVar2 = this.b;
                nzg nzgVar = new nzg(i, (i & 8) != 0 ? jVar.g(8).d > rzgVar2.a.g(8).d ? c.e : c.f : c.g, 160L);
                nzgVar.a.d(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(nzgVar.a.a());
                kf7 kf7VarG = jVar.g(i);
                kf7 kf7VarG2 = rzgVar2.a.g(i);
                int iMin = Math.min(kf7VarG.a, kf7VarG2.a);
                int i3 = kf7VarG.b;
                int i4 = kf7VarG2.b;
                int iMin2 = Math.min(i3, i4);
                int i5 = kf7VarG.c;
                int i6 = kf7VarG2.c;
                int iMin3 = Math.min(i5, i6);
                int i7 = kf7VarG.d;
                int i8 = i;
                int i9 = kf7VarG2.d;
                a aVar = new a(kf7.b(iMin, iMin2, iMin3, Math.min(i7, i9)), kf7.b(Math.max(kf7VarG.a, kf7VarG2.a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
                c.f(view, nzgVar, windowInsets, false);
                duration.addUpdateListener(new C0337a(nzgVar, rzgVarH, rzgVar2, i8, view));
                duration.addListener(new b(nzgVar, view));
                esa.a(view, new RunnableC0338c(view, nzgVar, aVar, duration));
                this.b = rzgVarH;
                return c.i(view, windowInsets);
            }
        }

        public static void e(nzg nzgVar, View view) {
            b bVarJ = j(view);
            if (bVarJ != null) {
                bVarJ.a(nzgVar);
                if (bVarJ.b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    e(nzgVar, viewGroup.getChildAt(i));
                }
            }
        }

        public static void f(View view, nzg nzgVar, WindowInsets windowInsets, boolean z) {
            b bVarJ = j(view);
            if (bVarJ != null) {
                bVarJ.a = windowInsets;
                if (!z) {
                    bVarJ.c();
                    z = bVarJ.b == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    f(viewGroup.getChildAt(i), nzgVar, windowInsets, z);
                }
            }
        }

        public static void g(View view, rzg rzgVar, List<nzg> list) {
            b bVarJ = j(view);
            if (bVarJ != null) {
                rzgVar = bVarJ.d(rzgVar, list);
                if (bVarJ.b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    g(viewGroup.getChildAt(i), rzgVar, list);
                }
            }
        }

        public static void h(View view, nzg nzgVar, a aVar) {
            b bVarJ = j(view);
            if (bVarJ != null) {
                bVarJ.e(nzgVar, aVar);
                if (bVarJ.b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    h(viewGroup.getChildAt(i), nzgVar, aVar);
                }
            }
        }

        public static WindowInsets i(View view, WindowInsets windowInsets) {
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static b j(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).a;
            }
            return null;
        }
    }

    public static class d extends e {
        public final WindowInsetsAnimation e;

        public static class a extends WindowInsetsAnimation$Callback {
            public final b a;
            public List<nzg> b;
            public ArrayList<nzg> c;
            public final HashMap<WindowInsetsAnimation, nzg> d;

            public a(b bVar) {
                super(bVar.b);
                this.d = new HashMap<>();
                this.a = bVar;
            }

            public final nzg a(WindowInsetsAnimation windowInsetsAnimation) {
                HashMap<WindowInsetsAnimation, nzg> map = this.d;
                nzg nzgVar = map.get(windowInsetsAnimation);
                if (nzgVar == null) {
                    nzgVar = new nzg(0, null, 0L);
                    if (Build.VERSION.SDK_INT >= 30) {
                        nzgVar.a = new d(windowInsetsAnimation);
                    }
                    map.put(windowInsetsAnimation, nzgVar);
                }
                return nzgVar;
            }

            public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.a(a(windowInsetsAnimation));
                this.d.remove(windowInsetsAnimation);
            }

            public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                a(windowInsetsAnimation);
                this.a.c();
            }

            public final WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<nzg> arrayList = this.c;
                if (arrayList == null) {
                    ArrayList<nzg> arrayList2 = new ArrayList<>(list.size());
                    this.c = arrayList2;
                    this.b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                    nzg nzgVarA = a(windowInsetsAnimation);
                    nzgVarA.a.d(windowInsetsAnimation.getFraction());
                    this.c.add(nzgVarA);
                }
                return this.a.d(rzg.h(null, windowInsets), this.b).g();
            }

            public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                a aVarE = this.a.e(a(windowInsetsAnimation), new a(bounds));
                aVarE.getClass();
                qzg.a();
                return pzg.a(aVarE.a.d(), aVarE.b.d());
            }
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.e = windowInsetsAnimation;
        }

        public static kf7 e(WindowInsetsAnimation.Bounds bounds) {
            return kf7.c(bounds.getUpperBound());
        }

        public static kf7 f(WindowInsetsAnimation.Bounds bounds) {
            return kf7.c(bounds.getLowerBound());
        }

        public static void g(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // nzg.e
        public final long a() {
            return this.e.getDurationMillis();
        }

        @Override // nzg.e
        public final float b() {
            return this.e.getInterpolatedFraction();
        }

        @Override // nzg.e
        public final int c() {
            return this.e.getTypeMask();
        }

        @Override // nzg.e
        public final void d(float f) {
            this.e.setFraction(f);
        }
    }

    public static class e {
        public final int a;
        public float b;
        public final Interpolator c;
        public final long d;

        public e(int i, Interpolator interpolator, long j) {
            this.a = i;
            this.c = interpolator;
            this.d = j;
        }

        public long a() {
            return this.d;
        }

        public float b() {
            float f = this.b;
            Interpolator interpolator = this.c;
            return interpolator != null ? interpolator.getInterpolation(f) : f;
        }

        public int c() {
            return this.a;
        }

        public void d(float f) {
            this.b = f;
        }
    }

    public nzg(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(ozg.a(i, interpolator, j));
        } else {
            this.a = new c(i, interpolator, j);
        }
    }

    public static final class a {
        public final kf7 a;
        public final kf7 b;

        public a(WindowInsetsAnimation.Bounds bounds) {
            this.a = d.f(bounds);
            this.b = d.e(bounds);
        }

        public final String toString() {
            return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
        }

        public a(kf7 kf7Var, kf7 kf7Var2) {
            this.a = kf7Var;
            this.b = kf7Var2;
        }
    }
}
