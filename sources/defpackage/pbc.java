package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class pbc implements obc, qbc {
    public final nde a = wg2.d(0, 0, null, 7);
    public final nde b = wg2.d(0, 16, null, 5);
    public WritableMap c;

    @uh3(c = "com.indeed.android.reactnative.rntarebridge.nav.rnbottomsheet.RNBottomSheetEventsManager$hideRnBottomSheetContainer$1", f = "RNBottomSheetEventsManager.kt", l = {53}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return pbc.this.new a(lu2Var);
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
                pbc.this.a.i();
                nde ndeVar = pbc.this.a;
                Boolean bool = Boolean.FALSE;
                this.label = 1;
                Object objA = ndeVar.a(bool, this);
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

    @uh3(c = "com.indeed.android.reactnative.rntarebridge.nav.rnbottomsheet.RNBottomSheetEventsManager$publishEmitShowRnModalAfterVisible$1", f = "RNBottomSheetEventsManager.kt", l = {68}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ WritableMap $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WritableMap writableMap, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$params = writableMap;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return pbc.this.new b(this.$params, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                nde ndeVar = pbc.this.b;
                WritableMap writableMap = this.$params;
                this.label = 1;
                Object objA = ndeVar.a(writableMap, this);
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

    @uh3(c = "com.indeed.android.reactnative.rntarebridge.nav.rnbottomsheet.RNBottomSheetEventsManager$showRnBottomSheetContainer$2", f = "RNBottomSheetEventsManager.kt", l = {43}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public c(lu2<? super c> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return pbc.this.new c(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                pbc.this.a.i();
                nde ndeVar = pbc.this.a;
                Boolean bool = Boolean.TRUE;
                this.label = 1;
                Object objA = ndeVar.a(bool, this);
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

    @Override // defpackage.qbc
    public final void a() {
        ((np7) cr8.p(np7.class)).a("RNBottomSheetEventsManager", "hideRnBottomSheetContainer()");
        this.c = null;
        u63.Y(f13.b(), null, null, new a(null), 3);
    }

    @Override // defpackage.qbc
    public final void b(WritableMap writableMap) {
        ((np7) cr8.p(np7.class)).a("RNBottomSheetEventsManager", "showRnBottomSheetContainer()");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.merge(writableMap);
        this.c = writableMapCreateMap;
        u63.Y(f13.b(), null, null, new c(null), 3);
    }

    @Override // defpackage.obc
    public final nde c() {
        return this.b;
    }

    @Override // defpackage.obc
    public final nde d() {
        return this.a;
    }

    @Override // defpackage.qbc
    public final void e() {
        ((np7) cr8.p(np7.class)).a("RNBottomSheetEventsManager", "publishEmitShowRnModalAfterVisible()");
        WritableMap writableMap = this.c;
        if (writableMap == null) {
            ((np7) cr8.p(np7.class)).a("RNBottomSheetEventsManager", "params are null -> skipping event emission");
        } else {
            this.c = null;
            u63.Y(f13.b(), null, null, new b(writableMap, null), 3);
        }
    }
}
