package defpackage;

import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import defpackage.kv8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.bottomnav.IanMainFragment$observePushAuthEvents$1", f = "IanMainFragment.kt", l = {206}, m = "invokeSuspend")
public final class vp6 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ IanMainFragment this$0;

    @uh3(c = "com.indeed.android.jobsearch.bottomnav.IanMainFragment$observePushAuthEvents$1$1", f = "IanMainFragment.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ IanMainFragment this$0;

        /* JADX INFO: renamed from: vp6$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.jobsearch.bottomnav.IanMainFragment$observePushAuthEvents$1$1$1", f = "IanMainFragment.kt", l = {208}, m = "invokeSuspend")
        public static final class C0458a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            int label;
            final /* synthetic */ IanMainFragment this$0;

            /* JADX INFO: renamed from: vp6$a$a$a, reason: collision with other inner class name */
            @uh3(c = "com.indeed.android.jobsearch.bottomnav.IanMainFragment$observePushAuthEvents$1$1$1$1", f = "IanMainFragment.kt", l = {}, m = "invokeSuspend")
            public static final class C0459a extends c1f implements Function2<tee, lu2<? super j6g>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ IanMainFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0459a(IanMainFragment ianMainFragment, lu2<? super C0459a> lu2Var) {
                    super(2, lu2Var);
                    this.this$0 = ianMainFragment;
                }

                @Override // defpackage.x81
                public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                    C0459a c0459a = new C0459a(this.this$0, lu2Var);
                    c0459a.L$0 = obj;
                    return c0459a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(tee teeVar, lu2<? super j6g> lu2Var) {
                    return ((C0459a) create(teeVar, lu2Var)).invokeSuspend(j6g.a);
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    tee teeVar = (tee) this.L$0;
                    if (this.label != 0) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                    d9f d9fVarN = this.this$0.N();
                    teeVar.getClass();
                    gt7 gt7Var = teeVar.a;
                    ht7 ht7Var = teeVar.b;
                    String str = teeVar.c;
                    ((gme) d9fVarN.d).setValue(gt7Var);
                    ((gme) d9fVarN.e).setValue(ht7Var);
                    ((gme) d9fVarN.f).setValue(str);
                    d9fVarN.V = teeVar.d;
                    ((gme) d9fVarN.b).setValue(Boolean.TRUE);
                    ((gme) d9fVarN.c).setValue(Boolean.FALSE);
                    return j6g.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0458a(IanMainFragment ianMainFragment, lu2<? super C0458a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = ianMainFragment;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0458a(this.this$0, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0458a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    r7d.b(obj);
                    nde ndeVarE = ((y7c) this.this$0.w0.getValue()).e();
                    C0459a c0459a = new C0459a(this.this$0, null);
                    this.label = 1;
                    Object objQ = wg2.q(ndeVarE, c0459a, this);
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

        @uh3(c = "com.indeed.android.jobsearch.bottomnav.IanMainFragment$observePushAuthEvents$1$1$2", f = "IanMainFragment.kt", l = {214}, m = "invokeSuspend")
        public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            int label;
            final /* synthetic */ IanMainFragment this$0;

            /* JADX INFO: renamed from: vp6$a$b$a, reason: collision with other inner class name */
            @uh3(c = "com.indeed.android.jobsearch.bottomnav.IanMainFragment$observePushAuthEvents$1$1$2$1", f = "IanMainFragment.kt", l = {}, m = "invokeSuspend")
            public static final class C0460a extends c1f implements Function2<uee, lu2<? super j6g>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ IanMainFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0460a(IanMainFragment ianMainFragment, lu2<? super C0460a> lu2Var) {
                    super(2, lu2Var);
                    this.this$0 = ianMainFragment;
                }

                @Override // defpackage.x81
                public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                    C0460a c0460a = new C0460a(this.this$0, lu2Var);
                    c0460a.L$0 = obj;
                    return c0460a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(uee ueeVar, lu2<? super j6g> lu2Var) {
                    return ((C0460a) create(ueeVar, lu2Var)).invokeSuspend(j6g.a);
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    uee ueeVar = (uee) this.L$0;
                    if (this.label != 0) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                    d9f d9fVarN = this.this$0.N();
                    ueeVar.getClass();
                    gt7 gt7Var = ueeVar.a;
                    ht7 ht7Var = ueeVar.b;
                    String str = ueeVar.c;
                    ((gme) d9fVarN.d).setValue(gt7Var);
                    ((gme) d9fVarN.e).setValue(ht7Var);
                    ((gme) d9fVarN.f).setValue(str);
                    d9fVarN.W = ueeVar.d;
                    ((gme) d9fVarN.c).setValue(Boolean.TRUE);
                    ((gme) d9fVarN.b).setValue(Boolean.FALSE);
                    return j6g.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(IanMainFragment ianMainFragment, lu2<? super b> lu2Var) {
                super(2, lu2Var);
                this.this$0 = ianMainFragment;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new b(this.this$0, lu2Var);
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
                    nde ndeVarD = ((y7c) this.this$0.w0.getValue()).d();
                    C0460a c0460a = new C0460a(this.this$0, null);
                    this.label = 1;
                    Object objQ = wg2.q(ndeVarD, c0460a, this);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(IanMainFragment ianMainFragment, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.this$0 = ianMainFragment;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.this$0, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            e13 e13Var = (e13) this.L$0;
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            u63.Y(e13Var, null, null, new C0458a(this.this$0, null), 3);
            u63.Y(e13Var, null, null, new b(this.this$0, null), 3);
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp6(IanMainFragment ianMainFragment, lu2<? super vp6> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ianMainFragment;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new vp6(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((vp6) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            zv8 viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            a aVar = new a(this.this$0, null);
            this.label = 1;
            Object objB = c2d.b(viewLifecycleOwner, kv8.b.c, aVar, this);
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
        return j6g.a;
    }
}
