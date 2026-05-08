package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.media3.ui.c;
import com.indeed.android.jobsearch.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class rdb {
    public boolean A;
    public boolean B;
    public final androidx.media3.ui.c a;
    public final View b;
    public final ViewGroup c;
    public final ViewGroup d;
    public final ViewGroup e;
    public final ViewGroup f;
    public final ViewGroup g;
    public final ViewGroup h;
    public final ViewGroup i;
    public final View j;
    public final View k;
    public final AnimatorSet l;
    public final AnimatorSet m;
    public final AnimatorSet n;
    public final AnimatorSet o;
    public final AnimatorSet p;
    public final ValueAnimator q;
    public final ValueAnimator r;
    public final l60 w;
    public final gg2 s = new gg2(this, 8);
    public final qa0 t = new qa0(this, 4);
    public final z84 u = new z84(this, 6);
    public final f35 v = new f35(this, 2);
    public final odb x = new View.OnLayoutChangeListener() { // from class: odb
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            int height;
            int height2;
            rdb rdbVar = this.a;
            c cVar = rdbVar.a;
            int width = (cVar.getWidth() - cVar.getPaddingLeft()) - cVar.getPaddingRight();
            int height3 = (cVar.getHeight() - cVar.getPaddingBottom()) - cVar.getPaddingTop();
            ViewGroup viewGroup = rdbVar.c;
            int iC = rdb.c(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
            if (viewGroup == null) {
                height = 0;
            } else {
                height = viewGroup.getHeight();
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                }
            }
            int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
            int iMax = Math.max(iC, rdb.c(rdbVar.k) + rdb.c(rdbVar.i));
            ViewGroup viewGroup2 = rdbVar.d;
            if (viewGroup2 == null) {
                height2 = 0;
            } else {
                height2 = viewGroup2.getHeight();
                ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                }
            }
            boolean z = width <= iMax || height3 <= (height2 * 2) + paddingBottom;
            if (rdbVar.A != z) {
                rdbVar.A = z;
                view.post(new qx0(rdbVar, 10));
            }
            boolean z2 = i4 - i2 != i8 - i6;
            if (rdbVar.A || !z2) {
                return;
            }
            view.post(new rx0(rdbVar, 6));
        }
    };
    public boolean C = true;
    public int z = 0;
    public final ArrayList y = new ArrayList();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            rdb rdbVar = rdb.this;
            View view = rdbVar.b;
            if (view != null) {
                view.setVisibility(4);
            }
            ViewGroup viewGroup = rdbVar.c;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
            ViewGroup viewGroup2 = rdbVar.e;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            rdb rdbVar = rdb.this;
            View view = rdbVar.j;
            if (!(view instanceof androidx.media3.ui.b) || rdbVar.A) {
                return;
            }
            androidx.media3.ui.b bVar = (androidx.media3.ui.b) view;
            ValueAnimator valueAnimator = bVar.w0;
            if (valueAnimator.isStarted()) {
                valueAnimator.cancel();
            }
            valueAnimator.setFloatValues(bVar.x0, 0.0f);
            valueAnimator.setDuration(250L);
            valueAnimator.start();
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            rdb rdbVar = rdb.this;
            View view = rdbVar.b;
            if (view != null) {
                view.setVisibility(0);
            }
            ViewGroup viewGroup = rdbVar.c;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            ViewGroup viewGroup2 = rdbVar.e;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(rdbVar.A ? 0 : 4);
            }
            View view2 = rdbVar.j;
            if (!(view2 instanceof androidx.media3.ui.b) || rdbVar.A) {
                return;
            }
            androidx.media3.ui.b bVar = (androidx.media3.ui.b) view2;
            ValueAnimator valueAnimator = bVar.w0;
            if (valueAnimator.isStarted()) {
                valueAnimator.cancel();
            }
            bVar.y0 = false;
            valueAnimator.setFloatValues(bVar.x0, 1.0f);
            valueAnimator.setDuration(250L);
            valueAnimator.start();
        }
    }

    public class c extends AnimatorListenerAdapter {
        public final /* synthetic */ androidx.media3.ui.c a;

        public c(androidx.media3.ui.c cVar) {
            this.a = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            rdb rdbVar = rdb.this;
            rdbVar.i(1);
            if (rdbVar.B) {
                this.a.post(rdbVar.s);
                rdbVar.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            rdb.this.i(3);
        }
    }

    public class d extends AnimatorListenerAdapter {
        public final /* synthetic */ androidx.media3.ui.c a;

        public d(androidx.media3.ui.c cVar) {
            this.a = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            rdb rdbVar = rdb.this;
            rdbVar.i(2);
            if (rdbVar.B) {
                this.a.post(rdbVar.s);
                rdbVar.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            rdb.this.i(3);
        }
    }

    public class e extends AnimatorListenerAdapter {
        public final /* synthetic */ androidx.media3.ui.c a;

        public e(androidx.media3.ui.c cVar) {
            this.a = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            rdb rdbVar = rdb.this;
            rdbVar.i(2);
            if (rdbVar.B) {
                this.a.post(rdbVar.s);
                rdbVar.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            rdb.this.i(3);
        }
    }

    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            rdb.this.i(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            rdb.this.i(4);
        }
    }

    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            rdb.this.i(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            rdb.this.i(4);
        }
    }

    public class h extends AnimatorListenerAdapter {
        public h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = rdb.this.f;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ViewGroup viewGroup = rdb.this.h;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                viewGroup.setTranslationX(viewGroup.getWidth());
                viewGroup.scrollTo(viewGroup.getWidth(), 0);
            }
        }
    }

    public class i extends AnimatorListenerAdapter {
        public i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = rdb.this.h;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ViewGroup viewGroup = rdb.this.f;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [odb] */
    public rdb(androidx.media3.ui.c cVar) {
        this.a = cVar;
        int i2 = 1;
        this.w = new l60(this, i2);
        this.b = cVar.findViewById(R.id.exo_controls_background);
        this.c = (ViewGroup) cVar.findViewById(R.id.exo_center_controls);
        this.e = (ViewGroup) cVar.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) cVar.findViewById(R.id.exo_bottom_bar);
        this.d = viewGroup;
        this.i = (ViewGroup) cVar.findViewById(R.id.exo_time);
        View viewFindViewById = cVar.findViewById(R.id.exo_progress);
        this.j = viewFindViewById;
        this.f = (ViewGroup) cVar.findViewById(R.id.exo_basic_controls);
        this.g = (ViewGroup) cVar.findViewById(R.id.exo_extra_controls);
        this.h = (ViewGroup) cVar.findViewById(R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = cVar.findViewById(R.id.exo_overflow_show);
        this.k = viewFindViewById2;
        View viewFindViewById3 = cVar.findViewById(R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: pdb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    rdb rdbVar = this.a;
                    rdbVar.g();
                    if (view.getId() == R.id.exo_overflow_show) {
                        rdbVar.q.start();
                    } else if (view.getId() == R.id.exo_overflow_hide) {
                        rdbVar.r.start();
                    }
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: pdb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    rdb rdbVar = this.a;
                    rdbVar.g();
                    if (view.getId() == R.id.exo_overflow_show) {
                        rdbVar.q.start();
                    } else if (view.getId() == R.id.exo_overflow_hide) {
                        rdbVar.r.start();
                    }
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new qdb(this, 0));
        valueAnimatorOfFloat.addListener(new a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new br3(this, i2));
        valueAnimatorOfFloat2.addListener(new b());
        Resources resources = cVar.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(cVar));
        animatorSet.play(valueAnimatorOfFloat).with(d(viewFindViewById, 0.0f, dimension)).with(d(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(cVar));
        animatorSet2.play(d(viewFindViewById, dimension, dimension2)).with(d(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(cVar));
        animatorSet3.play(valueAnimatorOfFloat).with(d(viewFindViewById, 0.0f, dimension2)).with(d(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(valueAnimatorOfFloat2).with(d(viewFindViewById, dimension, 0.0f)).with(d(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(valueAnimatorOfFloat2).with(d(viewFindViewById, dimension2, 0.0f)).with(d(viewGroup, dimension2, 0.0f));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: mdb
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat3.addListener(new h());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ndb
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat4.addListener(new i());
    }

    public static int c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    public static ObjectAnimator d(View view, float f2, float f3) {
        return ObjectAnimator.ofFloat(view, "translationY", f2, f3);
    }

    public static boolean j(View view) {
        int id = view.getId();
        return id == R.id.exo_bottom_bar || id == R.id.exo_prev || id == R.id.exo_next || id == R.id.exo_rew || id == R.id.exo_rew_with_amount || id == R.id.exo_ffwd || id == R.id.exo_ffwd_with_amount;
    }

    public final void a(float f2) {
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f2) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f2);
        }
        ViewGroup viewGroup3 = this.f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f2);
        }
    }

    public final boolean b(View view) {
        return view != null && this.y.contains(view);
    }

    public final void e(Runnable runnable, long j) {
        if (j >= 0) {
            this.a.postDelayed(runnable, j);
        }
    }

    public final void f() {
        l60 l60Var = this.w;
        androidx.media3.ui.c cVar = this.a;
        cVar.removeCallbacks(l60Var);
        cVar.removeCallbacks(this.t);
        cVar.removeCallbacks(this.v);
        cVar.removeCallbacks(this.u);
    }

    public final void g() {
        if (this.z == 3) {
            return;
        }
        f();
        int showTimeoutMs = this.a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                e(this.w, showTimeoutMs);
            } else if (this.z == 1) {
                e(this.u, 2000L);
            } else {
                e(this.v, showTimeoutMs);
            }
        }
    }

    public final void h(View view, boolean z) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.y;
        if (!z) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.A && j(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void i(int i2) {
        int i3 = this.z;
        this.z = i2;
        androidx.media3.ui.c cVar = this.a;
        if (i2 == 2) {
            cVar.setVisibility(8);
        } else if (i3 == 2) {
            cVar.setVisibility(0);
        }
        if (i3 != i2) {
            Iterator<c.l> it = cVar.b0.iterator();
            while (it.hasNext()) {
                it.next().x(cVar.getVisibility());
            }
        }
    }

    public final void k() {
        if (!this.C) {
            i(0);
            g();
            return;
        }
        int i2 = this.z;
        if (i2 == 1) {
            this.o.start();
        } else if (i2 == 2) {
            this.p.start();
        } else if (i2 == 3) {
            this.B = true;
        } else if (i2 == 4) {
            return;
        }
        g();
    }
}
