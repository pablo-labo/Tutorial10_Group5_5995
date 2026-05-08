package defpackage;

import android.animation.Animator;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.e;

/* JADX INFO: loaded from: classes3.dex */
public final class eqd implements Animator.AnimatorListener {
    public final e a;
    public final hzh b;
    public final a c;
    public b d = b.a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("ENTER", 0);
            a = aVar;
            a aVar2 = new a("EXIT", 1);
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final /* synthetic */ b[] d;

        static {
            b bVar = new b("INITIALIZED", 0);
            a = bVar;
            b bVar2 = new b("START_DISPATCHED", 1);
            b = bVar2;
            b bVar3 = new b("END_DISPATCHED", 2);
            c = bVar3;
            d = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }
    }

    public eqd(e eVar, hzh hzhVar, a aVar) {
        this.a = eVar;
        this.b = hzhVar;
        this.c = aVar;
    }

    public final void a() {
        b bVar;
        int iOrdinal = this.d.ordinal();
        if (iOrdinal != 0) {
            bVar = b.c;
            if (iOrdinal != 1 && iOrdinal != 2) {
                l.g();
                return;
            }
        } else {
            bVar = b.b;
        }
        this.d = bVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        hzh hzhVar = this.b;
        com.swmansion.rnscreens.a aVar = (com.swmansion.rnscreens.a) hzhVar.a;
        animator.getClass();
        if (this.d == b.b) {
            a();
            animator.removeListener(this);
            a aVar2 = this.c;
            int iOrdinal = aVar2.ordinal();
            if (iOrdinal == 0) {
                EventDispatcher reactEventDispatcher = aVar.getReactEventDispatcher();
                if (reactEventDispatcher != null) {
                    reactEventDispatcher.a(new fqd(dmc.h(aVar), aVar.getId()));
                    j6g j6gVar = j6g.a;
                }
            } else {
                if (iOrdinal != 1) {
                    l.g();
                    return;
                }
                EventDispatcher reactEventDispatcher2 = aVar.getReactEventDispatcher();
                if (reactEventDispatcher2 != null) {
                    reactEventDispatcher2.a(new kqd(dmc.h(aVar), aVar.getId(), 0));
                    j6g j6gVar2 = j6g.a;
                }
            }
            boolean z = aVar2 == a.b;
            hzhVar.q(1.0f, z, z);
            com.swmansion.rnscreens.a aVarL = this.a.l();
            if (aVarL.h0) {
                aVarL.h0 = false;
                com.swmansion.rnscreens.a.c(aVarL);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        hzh hzhVar = this.b;
        com.swmansion.rnscreens.a aVar = (com.swmansion.rnscreens.a) hzhVar.a;
        animator.getClass();
        if (this.d == b.a) {
            a();
            a aVar2 = this.c;
            int iOrdinal = aVar2.ordinal();
            if (iOrdinal == 0) {
                EventDispatcher reactEventDispatcher = aVar.getReactEventDispatcher();
                if (reactEventDispatcher != null) {
                    reactEventDispatcher.a(new erd(dmc.h(aVar), aVar.getId()));
                    j6g j6gVar = j6g.a;
                }
            } else {
                if (iOrdinal != 1) {
                    l.g();
                    return;
                }
                EventDispatcher reactEventDispatcher2 = aVar.getReactEventDispatcher();
                if (reactEventDispatcher2 != null) {
                    reactEventDispatcher2.a(new kqd(dmc.h(aVar), aVar.getId(), 1));
                    j6g j6gVar2 = j6g.a;
                }
            }
            boolean z = aVar2 == a.b;
            hzhVar.q(0.0f, z, z);
        }
    }
}
