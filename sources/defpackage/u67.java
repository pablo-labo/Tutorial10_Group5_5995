package defpackage;

import android.util.Log;
import com.indeed.android.messaging.data.conversations.ConversationWithDraft;
import com.indeed.android.messaging.data.conversations.ConversationsRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class u67 extends brg {
    public final f22 V;
    public final vi5<Integer> W;
    public final gse X;
    public final gse Y;
    public final g3a<jz2<j6g>> Z;
    public final g3a a0;
    public final ConversationsRepository b;
    public final int b0;
    public final h02 c;
    public final lr9 d;
    public final j7d e;
    public final gse f;

    @uh3(c = "com.indeed.android.messaging.ui.inbox.InboxViewModel$1", f = "InboxViewModel.kt", l = {76}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;
        final /* synthetic */ u67 this$0;

        /* JADX INFO: renamed from: u67$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.messaging.ui.inbox.InboxViewModel$1$1", f = "InboxViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class C0428a extends c1f implements xu5<w47, List<? extends ConversationWithDraft>, t67, lu2<? super t67>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            /* synthetic */ Object L$2;
            int label;

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                w47 w47Var = (w47) this.L$0;
                List list = (List) this.L$1;
                t67 t67Var = (t67) this.L$2;
                if (this.label == 0) {
                    r7d.b(obj);
                    return t67.a(t67Var, null, false, null, list, w47Var, 39);
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }

            @Override // defpackage.xu5
            public final Object j(w47 w47Var, List<? extends ConversationWithDraft> list, t67 t67Var, lu2<? super t67> lu2Var) {
                C0428a c0428a = new C0428a(4, lu2Var);
                c0428a.L$0 = w47Var;
                c0428a.L$1 = list;
                c0428a.L$2 = t67Var;
                return c0428a.invokeSuspend(j6g.a);
            }
        }

        public static final class b<T> implements wi5 {
            public final /* synthetic */ u67 a;

            public b(u67 u67Var) {
                this.a = u67Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.wi5
            public final Object a(Object obj, lu2 lu2Var) {
                Object value;
                t67 t67Var = (t67) obj;
                gse gseVar = this.a.X;
                do {
                    value = gseVar.getValue();
                } while (!gseVar.h(value, t67Var));
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lu2 lu2Var, u67 u67Var) {
            super(2, lu2Var);
            this.this$0 = u67Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(lu2Var, this.this$0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            return g13.a;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type lu2 to u67$a for r9v2 'this'  lu2
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.x81
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                int r0 = r9.label
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L12
                if (r0 == r2) goto Le
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r9)
                return r1
            Le:
                defpackage.r7d.b(r10)
                goto L62
            L12:
                defpackage.r7d.b(r10)
                u67 r10 = r9.this$0
                gse r0 = r10.f
                f22 r3 = r10.V
                gse r10 = r10.X
                u67$a$a r4 = new u67$a$a
                r5 = 4
                r4.<init>(r5, r1)
                r5 = 3
                vi5[] r5 = new defpackage.vi5[r5]
                r6 = 0
                r5[r6] = r0
                r5[r2] = r3
                r0 = 2
                r5[r0] = r10
                rk5 r10 = new rk5
                r10.<init>(r5, r4)
                u67 r0 = r9.this$0
                k82 r0 = defpackage.ee3.p(r0)
                xre r3 = new xre
                r4 = 0
                r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.<init>(r4, r7)
                t67 r4 = new t67
                r4.<init>(r6)
                rqc r10 = defpackage.wg2.Z(r10, r0, r3, r4)
                u67$a$b r0 = new u67$a$b
                u67 r3 = r9.this$0
                r0.<init>(r3)
                r9.label = r2
                fse<T> r10 = r10.a
                java.lang.Object r9 = r10.e(r0, r9)
                g13 r10 = defpackage.g13.a
                if (r9 != r10) goto L62
                return r10
            L62:
                defpackage.r40.e()
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: u67.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.indeed.android.messaging.ui.inbox.InboxViewModel$2", f = "InboxViewModel.kt", l = {83}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;
        final /* synthetic */ u67 this$0;

        @uh3(c = "com.indeed.android.messaging.ui.inbox.InboxViewModel$2$1", f = "InboxViewModel.kt", l = {86}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<Integer, lu2<? super j6g>, Object> {
            /* synthetic */ int I$0;
            int label;
            final /* synthetic */ u67 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(lu2 lu2Var, u67 u67Var) {
                super(2, lu2Var);
                this.this$0 = u67Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                a aVar = new a(lu2Var, this.this$0);
                aVar.I$0 = ((Number) obj).intValue();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Integer num, lu2<? super j6g> lu2Var) {
                return ((a) create(Integer.valueOf(num.intValue()), lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.I$0;
                int i2 = this.label;
                if (i2 == 0) {
                    r7d.b(obj);
                    ArrayList arrayList = lz2.a;
                    Log.d("InboxViewModel", "RequireResponse count changed to: " + i + ", " + (this.this$0.e == null), null);
                    this.I$0 = i;
                    this.label = 1;
                    Object objB = ls3.b(2000L, this);
                    g13 g13Var = g13.a;
                    if (objB == g13Var) {
                        return g13Var;
                    }
                } else {
                    if (i2 != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                }
                j7d j7dVar = this.this$0.e;
                if (j7dVar != null) {
                    j7dVar.g();
                }
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(lu2 lu2Var, u67 u67Var) {
            super(2, lu2Var);
            this.this$0 = u67Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(lu2Var, this.this$0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                u67 u67Var = this.this$0;
                vi5<Integer> vi5Var = u67Var.W;
                a aVar = new a(null, u67Var);
                this.label = 1;
                Object objQ = wg2.q(vi5Var, aVar, this);
                g13 g13Var = g13.a;
                if (objQ == g13Var) {
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

    @uh3(c = "com.indeed.android.messaging.ui.inbox.InboxViewModel$requireResponseCountFlow$3", f = "InboxViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<List<? extends ConversationWithDraft>, lu2<? super Integer>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            c cVar = new c(2, lu2Var);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends ConversationWithDraft> list, lu2<? super Integer> lu2Var) {
            return ((c) create(list, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            List list2 = list;
            int i = 0;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((ConversationWithDraft) it.next()).getConversation().getAwaitingJobSeekerResponse() && (i = i + 1) < 0) {
                        u63.n0();
                        throw null;
                    }
                }
            }
            return new Integer(i);
        }
    }

    public static final class d implements vi5<w47> {
        public final /* synthetic */ gse a;

        public static final class a<T> implements wi5 {
            public final /* synthetic */ wi5 a;

            /* JADX INFO: renamed from: u67$d$a$a, reason: collision with other inner class name */
            @uh3(c = "com.indeed.android.messaging.ui.inbox.InboxViewModel$special$$inlined$filter$1$2", f = "InboxViewModel.kt", l = {50}, m = "emit")
            public static final class C0429a extends pu2 {
                int I$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                /* synthetic */ Object result;

                public C0429a(lu2 lu2Var) {
                    super(lu2Var);
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return a.this.a(null, this);
                }
            }

            public a(wi5 wi5Var) {
                this.a = wi5Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // defpackage.wi5
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r5, defpackage.lu2 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof u67.d.a.C0429a
                    if (r0 == 0) goto L13
                    r0 = r6
                    u67$d$a$a r0 = (u67.d.a.C0429a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    u67$d$a$a r0 = new u67$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.result
                    int r1 = r0.label
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L34
                    if (r1 != r2) goto L2e
                    java.lang.Object r4 = r0.L$3
                    wi5 r4 = (defpackage.wi5) r4
                    java.lang.Object r4 = r0.L$1
                    u67$d$a$a r4 = (u67.d.a.C0429a) r4
                    defpackage.r7d.b(r6)
                    goto L56
                L2e:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r4)
                    return r3
                L34:
                    defpackage.r7d.b(r6)
                    r6 = r5
                    w47 r6 = (defpackage.w47) r6
                    w47 r1 = defpackage.w47.INBOX
                    if (r6 != r1) goto L56
                    r0.L$0 = r3
                    r0.L$1 = r3
                    r0.L$2 = r3
                    r0.L$3 = r3
                    r6 = 0
                    r0.I$0 = r6
                    r0.label = r2
                    wi5 r4 = r4.a
                    java.lang.Object r4 = r4.a(r5, r0)
                    g13 r5 = defpackage.g13.a
                    if (r4 != r5) goto L56
                    return r5
                L56:
                    j6g r4 = defpackage.j6g.a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: u67.d.a.a(java.lang.Object, lu2):java.lang.Object");
            }
        }

        public d(gse gseVar) {
            this.a = gseVar;
        }

        @Override // defpackage.vi5
        public final Object e(wi5<? super w47> wi5Var, lu2 lu2Var) throws Throwable {
            this.a.e(new a(wi5Var), lu2Var);
            return g13.a;
        }
    }

    @uh3(c = "com.indeed.android.messaging.ui.inbox.InboxViewModel$special$$inlined$flatMapLatest$1", f = "InboxViewModel.kt", l = {189}, m = "invokeSuspend")
    public static final class e extends c1f implements wu5<wi5<? super List<? extends ConversationWithDraft>>, w47, lu2<? super j6g>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ u67 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(lu2 lu2Var, u67 u67Var) {
            super(3, lu2Var);
            this.this$0 = u67Var;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                wi5 wi5Var = (wi5) this.L$0;
                vi5<List<ConversationWithDraft>> vi5VarObserveList = this.this$0.b.observeList((w47) this.L$1);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                Object objX = wg2.x(wi5Var, vi5VarObserveList, this);
                g13 g13Var = g13.a;
                if (objX == g13Var) {
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

        @Override // defpackage.wu5
        public final Object q(wi5<? super List<? extends ConversationWithDraft>> wi5Var, w47 w47Var, lu2<? super j6g> lu2Var) {
            e eVar = new e(lu2Var, this.this$0);
            eVar.L$0 = wi5Var;
            eVar.L$1 = w47Var;
            return eVar.invokeSuspend(j6g.a);
        }
    }

    @uh3(c = "com.indeed.android.messaging.ui.inbox.InboxViewModel$special$$inlined$flatMapLatest$2", f = "InboxViewModel.kt", l = {189}, m = "invokeSuspend")
    public static final class f extends c1f implements wu5<wi5<? super List<? extends ConversationWithDraft>>, w47, lu2<? super j6g>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ u67 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(lu2 lu2Var, u67 u67Var) {
            super(3, lu2Var);
            this.this$0 = u67Var;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                wi5 wi5Var = (wi5) this.L$0;
                vi5<List<ConversationWithDraft>> vi5VarObserveList = this.this$0.b.observeList((w47) this.L$1);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                Object objX = wg2.x(wi5Var, vi5VarObserveList, this);
                g13 g13Var = g13.a;
                if (objX == g13Var) {
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

        @Override // defpackage.wu5
        public final Object q(wi5<? super List<? extends ConversationWithDraft>> wi5Var, w47 w47Var, lu2<? super j6g> lu2Var) {
            f fVar = new f(lu2Var, this.this$0);
            fVar.L$0 = wi5Var;
            fVar.L$1 = w47Var;
            return fVar.invokeSuspend(j6g.a);
        }
    }

    public u67(ConversationsRepository conversationsRepository, h02 h02Var, lr9 lr9Var, j7d j7dVar) {
        this.b = conversationsRepository;
        this.c = h02Var;
        this.d = lr9Var;
        this.e = j7dVar;
        gse gseVarE = hh2.e(w47.INBOX);
        this.f = gseVarE;
        this.V = wg2.c0(gseVarE, new e(null, this));
        f22 f22VarC0 = wg2.c0(new d(gseVarE), new f(null, this));
        c cVar = new c(2, null);
        int i = zj5.a;
        this.W = wg2.v(wg2.c0(f22VarC0, new yj5(cVar, null)));
        gse gseVarE2 = hh2.e(new t67(0));
        this.X = gseVarE2;
        this.Y = gseVarE2;
        u63.Y(ee3.p(this), null, null, new a(null, this), 3);
        u63.Y(ee3.p(this), null, null, new b(null, this), 3);
        g3a<jz2<j6g>> g3aVar = new g3a<>();
        this.Z = g3aVar;
        this.a0 = g3aVar;
        this.b0 = 20;
    }

    public static void g(u67 u67Var) {
        l7 l7Var = new l7(7);
        u67Var.getClass();
        u63.Y(ee3.p(u67Var), null, null, new v67(u67Var, l7Var, null), 3);
    }

    public final void h(w47 w47Var) {
        w47Var.getClass();
        u63.Y(ee3.p(this), null, null, new y67(w47Var, this, null), 3);
    }
}
