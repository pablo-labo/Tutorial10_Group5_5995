package defpackage;

import android.util.Log;
import defpackage.xh8;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class z1g implements w1g, xh8 {
    public final nde V;
    public final eu2 W;
    public ta9 X;
    public final y03 a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public int e;
    public final g3a<Integer> f;

    @uh3(c = "com.indeed.android.jobsearch.tare.uiplugin.UIPMessagingEventsImpl$fireMessageReceivedEvent$1", f = "UIPMessagingEventsImpl.kt", l = {190}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return z1g.this.new a(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                z1g.this.V.i();
                nde ndeVar = z1g.this.V;
                j6g j6gVar = j6g.a;
                this.label = 1;
                Object objA = ndeVar.a(j6gVar, this);
                g13 g13Var = g13.a;
                if (objA == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.jobsearch.tare.uiplugin.UIPMessagingEventsImpl$kickoffRefreshUnreadMessagesCountJob$1", f = "UIPMessagingEventsImpl.kt", l = {172}, m = "invokeSuspend")
    public static final class b extends c1f implements Function1<lu2<? super j6g>, Object> {
        final /* synthetic */ gu5<j6g> $onError;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gu5<j6g> gu5Var, lu2<? super b> lu2Var) {
            super(1, lu2Var);
            this.$onError = gu5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(lu2<?> lu2Var) {
            return z1g.this.new b(this.$onError, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(lu2<? super j6g> lu2Var) {
            return ((b) create(lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                z1g z1gVar = z1g.this;
                gu5<j6g> gu5Var = this.$onError;
                this.label = 1;
                Object objF = z1gVar.f(gu5Var, this);
                g13 g13Var = g13.a;
                if (objF == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    public z1g(int i) {
        eq3 eq3Var = a74.a;
        no3 no3Var = no3.c;
        no3Var.getClass();
        this.a = no3Var;
        b2g b2gVar = new b2g(this);
        qt8 qt8Var = qt8.a;
        this.b = boa.E(qt8Var, b2gVar);
        this.c = boa.E(qt8Var, new c2g(this));
        this.d = boa.E(qt8Var, new d2g(this));
        Integer numC = ((kq7) cr8.p(kq7.class)).c("android-core-app-messaging", 0, "UNREAD_MESSAGES_COUNT");
        int iIntValue = numC != null ? numC.intValue() : 0;
        this.e = iIntValue;
        this.f = new g3a<>(Integer.valueOf(iIntValue));
        this.V = wg2.d(0, 0, null, 7);
        wg2.d(0, 0, null, 7);
        this.W = f13.a(no3Var);
        u63.Y(f13.a(m89.a), null, null, new y1g(this, null), 3);
    }

    @Override // defpackage.w1g
    public final void a(e13 e13Var, gu5<j6g> gu5Var) {
        e13Var.getClass();
        ArrayList arrayList = lz2.a;
        Log.d("UIPMessagingEventsImpl", "kickoffRefreshUnreadMessagesCountJob() -> starting async refreshUnreadMessagesCount()", null);
        ta9 ta9Var = this.X;
        if (ta9Var != null) {
            ta9Var.b.h(null);
        }
        b bVar = new b(gu5Var, null);
        ta9 ta9Var2 = new ta9();
        ta9Var2.a = bVar;
        ta9Var2.b = u63.Y(e13Var, null, null, new sa9(ta9Var2, null), 3);
        this.X = ta9Var2;
    }

    @Override // defpackage.w1g
    public final void b() {
        ta9 ta9Var = this.X;
        if (ta9Var != null) {
            ta9Var.b.h(null);
        }
        this.X = null;
    }

    @Override // defpackage.w1g
    public final void c() {
        eq3 eq3Var = a74.a;
        u63.Y(f13.a(m89.a), null, null, new a(null), 3);
    }

    @Override // defpackage.w1g
    public final nde e() {
        return this.V;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.w1g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.gu5 r8, defpackage.pu2 r9) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z1g.f(gu5, pu2):java.lang.Object");
    }

    @Override // defpackage.w1g
    public final g3a g() {
        return this.f;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    public final void h(int i) {
        ArrayList arrayList = lz2.a;
        Log.d("UIPMessagingEventsImpl", "updateUnreadMessagesCount(" + i + ")", null);
        ((kq7) cr8.p(kq7.class)).a(i, "android-core-app-messaging", "UNREAD_MESSAGES_COUNT");
        this.e = i;
        this.f.k(Integer.valueOf(i));
    }

    public z1g() {
        this(0);
    }
}
