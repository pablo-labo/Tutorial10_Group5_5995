package defpackage;

import com.indeed.android.myjobs.data.model.CancelOrRescheduleUrlParams;
import com.indeed.android.myjobs.data.model.Interview;
import com.indeed.android.myjobs.data.model.InterviewBody;
import com.indeed.android.myjobs.data.model.Response;
import com.indeed.android.myjobs.data.model.dto.DtoExtensionKt;
import com.indeed.android.myjobs.data.model.dto.InterviewJobsDto;
import defpackage.hf3;
import defpackage.hva;
import defpackage.v43;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class mk7 extends xb1<ml7, a> {
    public final ow5 V;
    public final v43 W;
    public final c39 X;
    public boolean Y;
    public int Z = -1;
    public final rj7 f;

    public static abstract class a implements uo6 {

        /* JADX INFO: renamed from: mk7$a$a, reason: collision with other inner class name */
        public static final class C0319a extends a {
            public final InterviewJobsDto a;

            public C0319a(InterviewJobsDto interviewJobsDto) {
                interviewJobsDto.getClass();
                this.a = interviewJobsDto;
            }
        }

        public static final class b extends a {
            public final InterviewJobsDto a;

            public b(InterviewJobsDto interviewJobsDto) {
                interviewJobsDto.getClass();
                this.a = interviewJobsDto;
            }
        }

        public static final class c extends a {
            public static final c a = new c();
        }

        public static final class d extends a {
            public final InterviewJobsDto a;

            public d(InterviewJobsDto interviewJobsDto) {
                interviewJobsDto.getClass();
                this.a = interviewJobsDto;
            }
        }

        public static final class e extends a {
            public final String a;

            public e(String str) {
                this.a = str;
            }
        }

        public static final class f extends a {
            public static final f a = new f();
        }

        public static final class g extends a {
            public final InterviewJobsDto a;

            public g(InterviewJobsDto interviewJobsDto) {
                interviewJobsDto.getClass();
                this.a = interviewJobsDto;
            }
        }

        public static final class h extends a {
            public final InterviewJobsDto a;

            public h(InterviewJobsDto interviewJobsDto) {
                interviewJobsDto.getClass();
                this.a = interviewJobsDto;
            }
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.InterviewTabViewModel$loadData$1", f = "InterviewTabViewModel.kt", l = {343, 351}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.InterviewTabViewModel$loadData$1$1", f = "InterviewTabViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<hf3<Response>, lu2<? super j6g>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ mk7 this$0;

            /* JADX INFO: renamed from: mk7$b$a$a, reason: collision with other inner class name */
            public static final class C0320a<T> implements Comparator {
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ak2.i(Long.valueOf(((InterviewJobsDto) t).getTimeStamp()), Long.valueOf(((InterviewJobsDto) t2).getTimeStamp()));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(mk7 mk7Var, lu2<? super a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = mk7Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                a aVar = new a(this.this$0, lu2Var);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(hf3<Response> hf3Var, lu2<? super j6g> lu2Var) {
                return ((a) create(hf3Var, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                List listP1;
                int i;
                List<Interview> interviews;
                List<Interview> interviews2;
                InterviewJobsDto interviewJobDto;
                hf3 hf3Var = (hf3) this.L$0;
                if (this.label != 0) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                if (hf3Var instanceof hf3.c) {
                    Response response = (Response) ((hf3.c) hf3Var).a;
                    InterviewBody body = response.getBody();
                    if (body == null || (interviews2 = body.getInterviews()) == null) {
                        listP1 = null;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = interviews2.iterator();
                        while (it.hasNext()) {
                            try {
                                interviewJobDto = DtoExtensionKt.toInterviewJobDto((Interview) it.next());
                            } catch (Exception e) {
                                ArrayList arrayList2 = lz2.a;
                                lz2.b("InterviewTabViewModel", "Issue in parsing Interview DTO ", false, e);
                                interviewJobDto = null;
                            }
                            if (interviewJobDto != null) {
                                arrayList.add(interviewJobDto);
                            }
                        }
                        listP1 = z92.p1(arrayList, new C0320a());
                    }
                    List list = listP1 == null ? zr4.a : listP1;
                    System.currentTimeMillis();
                    List list2 = list;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it2 = list2.iterator();
                        i = 0;
                        while (it2.hasNext()) {
                            String upperCase = ((InterviewJobsDto) it2.next()).getStatus().toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                            if (upperCase.equals("EMP_INVITE") && (i = i + 1) < 0) {
                                u63.n0();
                                throw null;
                            }
                        }
                    }
                    int i2 = i > 0 ? 1 : 0;
                    mk7 mk7Var = this.this$0;
                    mk7Var.getClass();
                    mk7Var.i();
                    ml7 ml7VarA = ml7.a(mk7Var.i(), listP1, false, null, i2, 18);
                    gse gseVar = mk7Var.b;
                    gseVar.getClass();
                    gseVar.m(null, ml7VarA);
                    List<InterviewJobsDto> list3 = this.this$0.i().a;
                    int size = list3 != null ? list3.size() : 0;
                    InterviewBody body2 = response.getBody();
                    if (size < ((body2 == null || (interviews = body2.getInterviews()) == null) ? 0 : interviews.size())) {
                        ArrayList arrayList3 = lz2.a;
                        w40.n("Parsed interview list is smaller than original interviews from backend ", "InterviewTabViewModel", "Parsed interview list is smaller than original interviews from backend ", false);
                    }
                    List<InterviewJobsDto> list4 = this.this$0.i().a;
                    int size2 = list4 != null ? list4.size() : 0;
                    mk7 mk7Var2 = this.this$0;
                    if (mk7Var2.Y && size2 != mk7Var2.Z) {
                        Function1<lx5, j6g> function1 = c05.a;
                        c05.d(size2, "Interview");
                        this.this$0.Z = size2;
                    }
                } else if (hf3Var instanceof hf3.b) {
                    mk7 mk7Var3 = this.this$0;
                    mk7Var3.getClass();
                    mk7Var3.i();
                    ml7 ml7VarA2 = ml7.a(mk7Var3.i(), null, true, null, 0, 51);
                    gse gseVar2 = mk7Var3.b;
                    gseVar2.getClass();
                    gseVar2.m(null, ml7VarA2);
                } else {
                    if (!(hf3Var instanceof hf3.a)) {
                        l.g();
                        return null;
                    }
                    mk7 mk7Var4 = this.this$0;
                    mk7Var4.getClass();
                    mk7Var4.i();
                    ml7 ml7VarA3 = ml7.a(mk7Var4.i(), null, false, ((hf3.a) hf3Var).a, 0, 51);
                    gse gseVar3 = mk7Var4.b;
                    gseVar3.getClass();
                    gseVar3.m(null, ml7VarA3);
                }
                return j6g.a;
            }
        }

        public b(lu2<? super b> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return mk7.this.new b(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
        
            if (defpackage.wg2.q((defpackage.vi5) r14, r13, r12) == r4) goto L24;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                int r0 = r13.label
                r1 = 0
                r2 = 2
                r3 = 1
                g13 r4 = defpackage.g13.a
                if (r0 == 0) goto L1f
                if (r0 == r3) goto L1a
                if (r0 != r2) goto L14
                defpackage.r7d.b(r14)     // Catch: java.lang.Exception -> L12
                goto L89
            L12:
                r12 = r13
                goto L64
            L14:
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r13)
                return r1
            L1a:
                defpackage.r7d.b(r14)     // Catch: java.lang.Exception -> L12
                r12 = r13
                goto L52
            L1f:
                defpackage.r7d.b(r14)
                mk7 r14 = defpackage.mk7.this     // Catch: java.lang.Exception -> L12
                rj7 r14 = r14.f     // Catch: java.lang.Exception -> L12
                rqc r0 = defpackage.v0b.b     // Catch: java.lang.Exception -> L12
                fse<T> r0 = r0.a     // Catch: java.lang.Exception -> L12
                java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L12
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L12
                if (r0 != 0) goto L34
                java.lang.String r0 = defpackage.ie7.Z     // Catch: java.lang.Exception -> L12
            L34:
                r10 = r0
                long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L12
                r7 = 15552000000(0x39ef8b000, double:7.683708924E-314)
                long r8 = r5 - r7
                java.lang.String r6 = "JS_CONFIRM,JS_CANCEL,EMP_CANCEL,EMP_INVITE"
                java.lang.String r7 = "IN_PERSON,PHONE,THIRD_PARTY_VIDEO,INDEED_VIDEO"
                java.lang.String r11 = "app-tracker"
                r13.label = r3     // Catch: java.lang.Exception -> L12
                i88 r5 = r14.a     // Catch: java.lang.Exception -> L12
                r12 = r13
                vi5 r14 = r5.k(r6, r7, r8, r10, r11, r12)     // Catch: java.lang.Exception -> L64
                if (r14 != r4) goto L52
                goto L63
            L52:
                vi5 r14 = (defpackage.vi5) r14     // Catch: java.lang.Exception -> L64
                mk7$b$a r13 = new mk7$b$a     // Catch: java.lang.Exception -> L64
                mk7 r0 = defpackage.mk7.this     // Catch: java.lang.Exception -> L64
                r13.<init>(r0, r1)     // Catch: java.lang.Exception -> L64
                r12.label = r2     // Catch: java.lang.Exception -> L64
                java.lang.Object r13 = defpackage.wg2.q(r14, r13, r12)     // Catch: java.lang.Exception -> L64
                if (r13 != r4) goto L89
            L63:
                return r4
            L64:
                mk7 r13 = defpackage.mk7.this
                xo6 r14 = r13.i()
                ml7 r14 = (defpackage.ml7) r14
                xo6 r14 = r13.i()
                r0 = r14
                ml7 r0 = (defpackage.ml7) r0
                com.indeed.android.myjobs.data.model.APIError r3 = new com.indeed.android.myjobs.data.model.APIError
                r14 = -1
                java.lang.String r1 = "Something went wrong"
                r3.<init>(r14, r1)
                r4 = 0
                r5 = 51
                r1 = 0
                r2 = 0
                ml7 r14 = defpackage.ml7.a(r0, r1, r2, r3, r4, r5)
                gse r13 = r13.b
                r13.setValue(r14)
            L89:
                j6g r13 = defpackage.j6g.a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: mk7.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.InterviewTabViewModel$onTriggerEvent$1", f = "InterviewTabViewModel.kt", l = {101, 103, 108, 162, 164, 172, 225, 227, 235, 287, 289, 297}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ a $event;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ mk7 this$0;

        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.InterviewTabViewModel$onTriggerEvent$1$3$2", f = "InterviewTabViewModel.kt", l = {120}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ a $event;
            int label;
            final /* synthetic */ mk7 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(lu2 lu2Var, a aVar, mk7 mk7Var) {
                super(2, lu2Var);
                this.this$0 = mk7Var;
                this.$event = aVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new a(lu2Var, this.$event, this.this$0);
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
                    this.label = 1;
                    Object objB = ls3.b(500L, this);
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
                mk7.n(this.this$0, ((a.g) this.$event).a.getId(), false);
                return j6g.a;
            }
        }

        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.InterviewTabViewModel$onTriggerEvent$1$4$2", f = "InterviewTabViewModel.kt", l = {184}, m = "invokeSuspend")
        public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ a $event;
            int label;
            final /* synthetic */ mk7 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(lu2 lu2Var, a aVar, mk7 mk7Var) {
                super(2, lu2Var);
                this.this$0 = mk7Var;
                this.$event = aVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new b(lu2Var, this.$event, this.this$0);
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
                    this.label = 1;
                    Object objB = ls3.b(500L, this);
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
                mk7.m(this.this$0, ((a.C0319a) this.$event).a.getId(), false);
                return j6g.a;
            }
        }

        /* JADX INFO: renamed from: mk7$c$c, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.InterviewTabViewModel$onTriggerEvent$1$5$2", f = "InterviewTabViewModel.kt", l = {247}, m = "invokeSuspend")
        public static final class C0321c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ a $event;
            int label;
            final /* synthetic */ mk7 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0321c(lu2 lu2Var, a aVar, mk7 mk7Var) {
                super(2, lu2Var);
                this.this$0 = mk7Var;
                this.$event = aVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0321c(lu2Var, this.$event, this.this$0);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0321c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    r7d.b(obj);
                    this.label = 1;
                    Object objB = ls3.b(500L, this);
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
                mk7.m(this.this$0, ((a.b) this.$event).a.getId(), false);
                return j6g.a;
            }
        }

        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.InterviewTabViewModel$onTriggerEvent$1$6$2", f = "InterviewTabViewModel.kt", l = {309}, m = "invokeSuspend")
        public static final class d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ a $event;
            int label;
            final /* synthetic */ mk7 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(lu2 lu2Var, a aVar, mk7 mk7Var) {
                super(2, lu2Var);
                this.this$0 = mk7Var;
                this.$event = aVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new d(lu2Var, this.$event, this.this$0);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    r7d.b(obj);
                    this.label = 1;
                    Object objB = ls3.b(500L, this);
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
                mk7.n(this.this$0, ((a.h) this.$event).a.getId(), false);
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(lu2 lu2Var, a aVar, mk7 mk7Var) {
            super(2, lu2Var);
            this.$event = aVar;
            this.this$0 = mk7Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new c(lu2Var, this.$event, this.this$0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:109:0x0452, code lost:
        
            if (r1 == r7) goto L118;
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x047d, code lost:
        
            if (r1 == r7) goto L118;
         */
        /* JADX WARN: Code restructure failed: missing block: B:117:0x049e, code lost:
        
            if (defpackage.xb1.g(r1, r5, r22) != r7) goto L125;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x019c, code lost:
        
            if (r1 == r7) goto L118;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x01c4, code lost:
        
            if (r1 == r7) goto L118;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x01e2, code lost:
        
            if (defpackage.xb1.g(r1, r8, r22) != r7) goto L125;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x027e, code lost:
        
            if (r1 == r7) goto L118;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x02a9, code lost:
        
            if (r1 == r7) goto L118;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x02c9, code lost:
        
            if (defpackage.xb1.g(r1, r8, r22) != r7) goto L125;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x0366, code lost:
        
            if (r1 == r7) goto L118;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x0392, code lost:
        
            if (r1 == r7) goto L118;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x03b4, code lost:
        
            if (defpackage.xb1.g(r1, r5, r22) != r7) goto L125;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 1240
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: mk7.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public mk7(rj7 rj7Var, ow5 ow5Var, v43 v43Var, c39 c39Var) {
        this.f = rj7Var;
        this.V = ow5Var;
        this.W = v43Var;
        this.X = c39Var;
    }

    public static final v43.b l(mk7 mk7Var, qj7 qj7Var, InterviewJobsDto interviewJobsDto) {
        ce2 ce2Var;
        mk7Var.getClass();
        int iOrdinal = qj7Var.ordinal();
        if (iOrdinal == 0) {
            ce2Var = ce2.c;
        } else if (iOrdinal == 1) {
            ce2Var = ce2.d;
        } else if (iOrdinal == 2) {
            ce2Var = ce2.b;
        } else {
            if (iOrdinal != 3) {
                l.g();
                return null;
            }
            ce2Var = ce2.c;
        }
        String str = interviewJobsDto.isIHP() ? "myjobs-ihp" : "myjobs";
        String strB = ((bp7) cr8.p(bp7.class)).b();
        return new v43.b(new CancelOrRescheduleUrlParams(oe2.INDEED, new hva.c(str), null, interviewJobsDto.getTitle(), new hva.c(interviewJobsDto.getDescription()), null, null, null, new hva.c(new te2(new hva.c(strB), 3)), null, null, null, null, null, new hva.c(new fe2(new hva.c(new je2(new hva.c(interviewJobsDto.getId()), new hva.c(ce2Var), new hva.c(interviewJobsDto.getId()), 46)), 1)), null, null, ie7.a0, 114404, null));
    }

    public static final void m(mk7 mk7Var, String str, boolean z) {
        ArrayList arrayList;
        List<InterviewJobsDto> list = mk7Var.i().a;
        if (list != null) {
            List<InterviewJobsDto> list2 = list;
            arrayList = new ArrayList(t92.r0(list2, 10));
            for (InterviewJobsDto interviewJobsDtoCopy$default : list2) {
                if (wl7.b(interviewJobsDtoCopy$default.getId(), str)) {
                    interviewJobsDtoCopy$default = InterviewJobsDto.copy$default(interviewJobsDtoCopy$default, null, null, null, null, null, 0L, null, null, null, null, 0L, 0L, false, null, null, null, null, null, null, z, false, null, 3670015, null);
                }
                arrayList.add(interviewJobsDtoCopy$default);
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = arrayList;
        mk7Var.i().getClass();
        mk7Var.b.setValue(ml7.a(mk7Var.i(), arrayList2, false, null, 0, 62));
    }

    public static final void n(mk7 mk7Var, String str, boolean z) {
        ArrayList arrayList;
        List<InterviewJobsDto> list = mk7Var.i().a;
        if (list != null) {
            List<InterviewJobsDto> list2 = list;
            arrayList = new ArrayList(t92.r0(list2, 10));
            for (InterviewJobsDto interviewJobsDtoCopy$default : list2) {
                if (wl7.b(interviewJobsDtoCopy$default.getId(), str)) {
                    interviewJobsDtoCopy$default = InterviewJobsDto.copy$default(interviewJobsDtoCopy$default, null, null, null, null, null, 0L, null, null, null, null, 0L, 0L, false, null, null, null, null, null, null, false, z, null, 3145727, null);
                }
                arrayList.add(interviewJobsDtoCopy$default);
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = arrayList;
        mk7Var.i().getClass();
        mk7Var.b.setValue(ml7.a(mk7Var.i(), arrayList2, false, null, 0, 62));
    }

    @Override // defpackage.xb1
    public final xo6 h() {
        return new ml7(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(int r19, int r20, defpackage.pu2 r21) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mk7.o(int, int, pu2):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        if (r9 == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(int r8, defpackage.pu2 r9) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mk7.p(int, pu2):java.lang.Object");
    }

    public final void q(boolean z) {
        boolean z2 = this.Y;
        this.Y = true;
        this.Z = -1;
        u63.Y(ee3.p(this), null, null, new b(null), 3);
        if (z && z2) {
            this.X.b("Interviews", ee3.p(this));
        }
    }

    public final void r(a aVar) {
        aVar.getClass();
        u63.Y(ee3.p(this), null, null, new c(null, aVar, this), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0051 -> B:21:0x0054). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(defpackage.pu2 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.pk7
            if (r0 == 0) goto L13
            r0 = r7
            pk7 r0 = (defpackage.pk7) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            pk7 r0 = new pk7
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            int r1 = r0.I$1
            int r3 = r0.I$0
            defpackage.r7d.b(r7)
            goto L54
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            r6 = 0
            return r6
        L30:
            defpackage.r7d.b(r7)
            r7 = 0
            r1 = 100
            r3 = r7
        L37:
            xo6 r7 = r6.i()
            ml7 r7 = (defpackage.ml7) r7
            boolean r7 = r7.b
            if (r7 == 0) goto L56
            if (r3 >= r1) goto L56
            r0.I$0 = r3
            r0.I$1 = r1
            r0.label = r2
            r4 = 100
            java.lang.Object r7 = defpackage.ls3.b(r4, r0)
            g13 r4 = defpackage.g13.a
            if (r7 != r4) goto L54
            return r4
        L54:
            int r3 = r3 + r2
            goto L37
        L56:
            xo6 r6 = r6.i()
            ml7 r6 = (defpackage.ml7) r6
            boolean r6 = r6.b
            r6 = r6 ^ r2
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mk7.s(pu2):java.lang.Object");
    }
}
