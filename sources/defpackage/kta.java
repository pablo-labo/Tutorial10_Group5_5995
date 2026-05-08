package defpackage;

import app.rive.runtime.kotlin.renderers.RendererMetrics;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import com.indeed.android.messaging.data.conversations.OnlineStatusRepository;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class kta extends brg {
    public final AtomicLong V;
    public final OnlineStatusRepository b;
    public final gse c;
    public uqe d;
    public final gse e;
    public final long f;

    @uh3(c = "com.indeed.android.messaging.ui.common.OnlineStatusViewModel$1", f = "OnlineStatusViewModel.kt", l = {RendererMetrics.SAMPLES}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        /* JADX INFO: renamed from: kta$a$a, reason: collision with other inner class name */
        public static final class C0298a<T> implements wi5 {
            public final /* synthetic */ kta a;

            public C0298a(kta ktaVar) {
                this.a = ktaVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.wi5
            public final Object a(Object obj, lu2 lu2Var) {
                Object value;
                Set set = (Set) obj;
                gse gseVar = this.a.c;
                do {
                    value = gseVar.getValue();
                } while (!gseVar.h(value, jta.a((jta) value, set, false, 2)));
                return j6g.a;
            }
        }

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return kta.this.new a(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                vi5<Set<String>> vi5VarObserveOnlineEmployerIds = kta.this.b.observeOnlineEmployerIds();
                C0298a c0298a = new C0298a(kta.this);
                this.label = 1;
                Object objE = vi5VarObserveOnlineEmployerIds.e(c0298a, this);
                g13 g13Var = g13.a;
                if (objE == g13Var) {
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

    @uh3(c = "com.indeed.android.messaging.ui.common.OnlineStatusViewModel$refreshOnlineStatus$1", f = "OnlineStatusViewModel.kt", l = {58, 61}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ List<ConversationRecord> $conversations;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<ConversationRecord> list, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$conversations = list;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return kta.this.new b(this.$conversations, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        
            if (r0.registerTargetsForConversations(r1, r7) == r4) goto L19;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                int r0 = r7.label
                r1 = 0
                r2 = 2
                r3 = 1
                g13 r4 = defpackage.g13.a
                if (r0 == 0) goto L1b
                if (r0 == r3) goto L17
                if (r0 != r2) goto L11
                defpackage.r7d.b(r8)
                goto L59
            L11:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r7)
                return r1
            L17:
                defpackage.r7d.b(r8)
                goto L2b
            L1b:
                defpackage.r7d.b(r8)
                kta r8 = defpackage.kta.this
                com.indeed.android.messaging.data.conversations.OnlineStatusRepository r8 = r8.b
                r7.label = r3
                java.lang.Object r8 = r8.checkJSOnlineStatusPreference(r7)
                if (r8 != r4) goto L2b
                goto L58
            L2b:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                kta r0 = defpackage.kta.this
                gse r0 = r0.c
            L35:
                java.lang.Object r5 = r0.getValue()
                r6 = r5
                jta r6 = (defpackage.jta) r6
                jta r6 = defpackage.jta.a(r6, r1, r8, r3)
                boolean r5 = r0.h(r5, r6)
                if (r5 == 0) goto L35
                if (r8 == 0) goto L6e
                kta r0 = defpackage.kta.this
                com.indeed.android.messaging.data.conversations.OnlineStatusRepository r0 = r0.b
                java.util.List<com.indeed.android.messaging.data.conversations.ConversationRecord> r1 = r7.$conversations
                r7.Z$0 = r8
                r7.label = r2
                java.lang.Object r8 = r0.registerTargetsForConversations(r1, r7)
                if (r8 != r4) goto L59
            L58:
                return r4
            L59:
                kta r8 = defpackage.kta.this
                java.util.concurrent.atomic.AtomicLong r8 = r8.V
                long r0 = java.lang.System.currentTimeMillis()
                kta r2 = defpackage.kta.this
                long r2 = r2.f
                long r0 = r0 + r2
                r8.set(r0)
                kta r7 = defpackage.kta.this
                r7.h()
            L6e:
                j6g r7 = defpackage.j6g.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kta.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.indeed.android.messaging.ui.common.OnlineStatusViewModel$startRefresh$1", f = "OnlineStatusViewModel.kt", l = {42}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        @uh3(c = "com.indeed.android.messaging.ui.common.OnlineStatusViewModel$startRefresh$1$1", f = "OnlineStatusViewModel.kt", l = {46}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            int label;
            final /* synthetic */ kta this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kta ktaVar, lu2<? super a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = ktaVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new a(this.this$0, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    r7d.b(obj);
                    long jCurrentTimeMillis = this.this$0.V.get() - System.currentTimeMillis();
                    this.label = 1;
                    Object objB = ls3.b(jCurrentTimeMillis, this);
                    g13 g13Var = g13.a;
                    if (objB == g13Var) {
                        return g13Var;
                    }
                } else {
                    if (i != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                }
                this.this$0.h();
                return j6g.a;
            }
        }

        public c(lu2<? super c> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return kta.this.new c(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                uqe uqeVar = kta.this.d;
                if (uqeVar != null) {
                    uqeVar.h(null);
                }
                if (System.currentTimeMillis() >= kta.this.V.get()) {
                    OnlineStatusRepository onlineStatusRepository = kta.this.b;
                    this.label = 1;
                    Object objRefreshRegistration = onlineStatusRepository.refreshRegistration(this);
                    g13 g13Var = g13.a;
                    if (objRefreshRegistration == g13Var) {
                        return g13Var;
                    }
                }
                kta ktaVar = kta.this;
                ktaVar.d = u63.Y(ee3.p(ktaVar), null, null, new a(kta.this, null), 3);
                return j6g.a;
            }
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            AtomicLong atomicLong = kta.this.V;
            long jCurrentTimeMillis = System.currentTimeMillis();
            kta ktaVar2 = kta.this;
            atomicLong.set(Math.max(jCurrentTimeMillis + ktaVar2.f, ktaVar2.V.get()));
            kta ktaVar3 = kta.this;
            ktaVar3.d = u63.Y(ee3.p(ktaVar3), null, null, new a(kta.this, null), 3);
            return j6g.a;
        }
    }

    public kta(OnlineStatusRepository onlineStatusRepository) {
        this.b = onlineStatusRepository;
        gse gseVarE = hh2.e(new jta(0));
        this.c = gseVarE;
        this.e = gseVarE;
        this.f = 300000L;
        this.V = new AtomicLong(System.currentTimeMillis() + 300000);
        u63.Y(ee3.p(this), null, null, new a(null), 3);
    }

    public final void g(List<ConversationRecord> list) {
        u63.Y(ee3.p(this), null, null, new b(list, null), 3);
    }

    public final void h() {
        u63.Y(ee3.p(this), null, null, new c(null), 3);
    }
}
