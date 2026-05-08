package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.h;
import androidx.fragment.app.r;
import defpackage.ds5;
import defpackage.epg;
import defpackage.es5;
import defpackage.ht0;
import defpackage.is5;
import defpackage.l5;
import defpackage.p6;
import defpackage.prg;
import defpackage.t40;
import defpackage.tw1;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c extends r {

    public static final class a extends b {
        public final boolean c;
        public boolean d;
        public h.a e;

        public a(r.b bVar, tw1 tw1Var, boolean z) {
            super(bVar, tw1Var);
            this.c = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:74:0x00f5 A[Catch: RuntimeException -> 0x00fb, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00fb, blocks: (B:72:0x00ef, B:74:0x00f5), top: B:85:0x00ef }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.fragment.app.h.a c(android.content.Context r9) {
            /*
                Method dump skipped, instruction units count: 272
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c.a.c(android.content.Context):androidx.fragment.app.h$a");
        }
    }

    public static class b {
        public final r.b a;
        public final tw1 b;

        public b(r.b bVar, tw1 tw1Var) {
            this.a = bVar;
            this.b = tw1Var;
        }

        public final void a() {
            r.b bVar = this.a;
            LinkedHashSet linkedHashSet = bVar.e;
            if (linkedHashSet.remove(this.b) && linkedHashSet.isEmpty()) {
                bVar.b();
            }
        }

        public final boolean b() {
            r.b bVar = this.a;
            View view = bVar.c.mView;
            view.getClass();
            float alpha = view.getAlpha();
            r.b.EnumC0035b enumC0035b = r.b.EnumC0035b.b;
            r.b.EnumC0035b enumC0035b2 = r.b.EnumC0035b.d;
            if (alpha != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    enumC0035b2 = enumC0035b;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        l5.q(p6.c(visibility, "Unknown visibility "));
                        return false;
                    }
                    enumC0035b2 = r.b.EnumC0035b.c;
                }
            }
            r.b.EnumC0035b enumC0035b3 = bVar.a;
            if (enumC0035b2 != enumC0035b3) {
                return (enumC0035b2 == enumC0035b || enumC0035b3 == enumC0035b) ? false : true;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$c, reason: collision with other inner class name */
    public static final class C0034c extends b {
        public final Object c;
        public final boolean d;
        public final Object e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0034c(r.b bVar, tw1 tw1Var, boolean z, boolean z2) {
            super(bVar, tw1Var);
            Fragment fragment = bVar.c;
            r.b.EnumC0035b enumC0035b = bVar.a;
            r.b.EnumC0035b enumC0035b2 = r.b.EnumC0035b.b;
            this.c = enumC0035b == enumC0035b2 ? z ? fragment.getReenterTransition() : fragment.getEnterTransition() : z ? fragment.getReturnTransition() : fragment.getExitTransition();
            this.d = bVar.a == enumC0035b2 ? z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
            this.e = z2 ? z ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
        }

        public final is5 c() {
            Object obj = this.c;
            is5 is5VarD = d(obj);
            Object obj2 = this.e;
            is5 is5VarD2 = d(obj2);
            if (is5VarD == null || is5VarD2 == null || is5VarD == is5VarD2) {
                return is5VarD == null ? is5VarD2 : is5VarD;
            }
            t40.o("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ", this.a.c, " returned Transition ", obj, " which uses a different Transition  type than its shared element transition ", obj2);
            return null;
        }

        public final is5 d(Object obj) {
            if (obj == null) {
                return null;
            }
            es5 es5Var = ds5.a;
            if (es5Var != null && (obj instanceof Transition)) {
                return es5Var;
            }
            is5 is5Var = ds5.b;
            if (is5Var != null && is5Var.e(obj)) {
                return is5Var;
            }
            StringBuilder sb = new StringBuilder("Transition ");
            sb.append(obj);
            Fragment fragment = this.a.c;
            sb.append(" for fragment ");
            sb.append(fragment);
            sb.append(" is not a valid framework Transition or AndroidX Transition");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static void i(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                i(childAt, arrayList);
            }
        }
    }

    public static void j(ht0 ht0Var, View view) {
        WeakHashMap<View, prg> weakHashMap = epg.a;
        String strF = epg.d.f(view);
        if (strF != null) {
            ht0Var.put(strF, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    j(ht0Var, childAt);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x09d4 A[LOOP:10: B:350:0x09ce->B:352:0x09d4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:453:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    @Override // androidx.fragment.app.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.ArrayList r41, final boolean r42) {
        /*
            Method dump skipped, instruction units count: 2570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c.b(java.util.ArrayList, boolean):void");
    }
}
