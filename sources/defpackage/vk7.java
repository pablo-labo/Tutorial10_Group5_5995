package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import com.indeed.android.myjobs.data.model.dto.InterviewJobsDto;
import defpackage.af1;
import defpackage.b5a;
import defpackage.c20;
import defpackage.gl2;
import defpackage.mk7;
import defpackage.pm8;
import defpackage.ude;
import defpackage.vk7;
import defpackage.vs0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class vk7 {

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.InterviewsTabKt$DisplayErrorState$errorStateConfig$1$1$1", f = "InterviewsTab.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ e8a $myJobsViewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e8a e8aVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$myJobsViewModel = e8aVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$myJobsViewModel, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            this.$myJobsViewModel.a0.k(new b5a.d(n7g.a(ie7.c0, "app-tracker-interviews-emptytabmodalcta")));
            return j6g.a;
        }
    }

    public static final class a0 implements xu5<xo8, Integer, androidx.compose.runtime.b, Integer, j6g> {
        public final /* synthetic */ ArrayList a;
        public final /* synthetic */ e13 b;
        public final /* synthetic */ mk7 c;
        public final /* synthetic */ ude d;
        public final /* synthetic */ e8a e;
        public final /* synthetic */ Context f;

        public a0(ArrayList arrayList, e13 e13Var, mk7 mk7Var, ude udeVar, e8a e8aVar, Context context) {
            this.a = arrayList;
            this.b = e13Var;
            this.c = mk7Var;
            this.d = udeVar;
            this.e = e8aVar;
            this.f = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0126  */
        @Override // defpackage.xu5
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final defpackage.j6g j(defpackage.xo8 r23, java.lang.Integer r24, androidx.compose.runtime.b r25, java.lang.Integer r26) {
            /*
                Method dump skipped, instruction units count: 325
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: vk7.a0.j(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ak2.i(Long.valueOf(((InterviewJobsDto) t2).getTimeStamp()), Long.valueOf(((InterviewJobsDto) t).getTimeStamp()));
        }
    }

    public static final class b0 implements Function1<Integer, Object> {
        public final /* synthetic */ ArrayList a;

        public b0(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.a.get(num.intValue());
            return null;
        }
    }

    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ak2.i(Long.valueOf(((InterviewJobsDto) t2).getTimeStamp()), Long.valueOf(((InterviewJobsDto) t).getTimeStamp()));
        }
    }

    public static final class c0 implements xu5<xo8, Integer, androidx.compose.runtime.b, Integer, j6g> {
        public final /* synthetic */ androidx.fragment.app.g V;
        public final /* synthetic */ iba W;
        public final /* synthetic */ e8a X;
        public final /* synthetic */ ArrayList a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ e13 c;
        public final /* synthetic */ mhg d;
        public final /* synthetic */ ude e;
        public final /* synthetic */ mk7 f;

        public c0(ArrayList arrayList, Context context, e13 e13Var, mhg mhgVar, ude udeVar, mk7 mk7Var, androidx.fragment.app.g gVar, iba ibaVar, e8a e8aVar) {
            this.a = arrayList;
            this.b = context;
            this.c = e13Var;
            this.d = mhgVar;
            this.e = udeVar;
            this.f = mk7Var;
            this.V = gVar;
            this.W = ibaVar;
            this.X = e8aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x014b  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x017e  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01ab  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01f5 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01f7  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0220  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0247  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0277  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x02a9  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x02c6  */
        @Override // defpackage.xu5
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final defpackage.j6g j(defpackage.xo8 r38, java.lang.Integer r39, androidx.compose.runtime.b r40, java.lang.Integer r41) {
            /*
                Method dump skipped, instruction units count: 747
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: vk7.c0.j(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.InterviewsTabKt$DisplayJobList$1$1", f = "InterviewsTab.kt", l = {211}, m = "invokeSuspend")
    public static final class d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ mk7 $interviewTabViewmodel;
        final /* synthetic */ e8a $myJobsViewModel;
        int label;

        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.InterviewsTabKt$DisplayJobList$1$1$1", f = "InterviewsTab.kt", l = {}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<mk7.a, lu2<? super j6g>, Object> {
            final /* synthetic */ e8a $myJobsViewModel;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e8a e8aVar, lu2<? super a> lu2Var) {
                super(2, lu2Var);
                this.$myJobsViewModel = e8aVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                a aVar = new a(this.$myJobsViewModel, lu2Var);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(mk7.a aVar, lu2<? super j6g> lu2Var) {
                return ((a) create(aVar, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                mk7.a aVar = (mk7.a) this.L$0;
                if (this.label != 0) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                if (aVar instanceof mk7.a.e) {
                    this.$myJobsViewModel.a0.k(new b5a.d(((mk7.a.e) aVar).a));
                }
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(mk7 mk7Var, e8a e8aVar, lu2<? super d> lu2Var) {
            super(2, lu2Var);
            this.$interviewTabViewmodel = mk7Var;
            this.$myJobsViewModel = e8aVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new d(this.$interviewTabViewmodel, this.$myJobsViewModel, lu2Var);
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
                pqc pqcVar = this.$interviewTabViewmodel.e;
                a aVar = new a(this.$myJobsViewModel, null);
                this.label = 1;
                Object objQ = wg2.q(pqcVar, aVar, this);
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

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.InterviewsTabKt$InterviewsTab$1$1", f = "InterviewsTab.kt", l = {}, m = "invokeSuspend")
    public static final class d0 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ mk7 $interviewTabViewmodel;
        final /* synthetic */ e8a $myJobsViewModel;
        final /* synthetic */ e13 $scope;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(mk7 mk7Var, e8a e8aVar, e13 e13Var, lu2<? super d0> lu2Var) {
            super(2, lu2Var);
            this.$interviewTabViewmodel = mk7Var;
            this.$myJobsViewModel = e8aVar;
            this.$scope = e13Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new d0(this.$interviewTabViewmodel, this.$myJobsViewModel, this.$scope, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((d0) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            if (this.$interviewTabViewmodel.Y && ((gme) this.$myJobsViewModel.V).getValue() == j7f.d) {
                this.$myJobsViewModel.i("Interviews", this.$scope);
            }
            return j6g.a;
        }
    }

    public static final class e implements gu5<j6g> {
        public final /* synthetic */ e8a a;
        public final /* synthetic */ InterviewJobsDto b;

        public e(e8a e8aVar, InterviewJobsDto interviewJobsDto) {
            this.a = e8aVar;
            this.b = interviewJobsDto;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            g3a<b5a> g3aVar = this.a.a0;
            String joinLink = this.b.getJoinLink();
            g3aVar.j(joinLink != null ? new b5a.d(joinLink) : null);
            return j6g.a;
        }
    }

    public static final /* synthetic */ class e0 extends fa implements gu5<j6g> {
        final /* synthetic */ mk7 $interviewTabViewmodel;
        final /* synthetic */ g4a<Boolean> $refreshing$delegate;
        final /* synthetic */ e13 $scope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(e13 e13Var, mk7 mk7Var, g4a<Boolean> g4aVar) {
            super("InterviewsTab$refresh(Lkotlinx/coroutines/CoroutineScope;Lcom/indeed/android/myjobs/presentation/tabs/InterviewTabViewModel;Landroidx/compose/runtime/MutableState;)Lkotlinx/coroutines/Job;");
            this.$scope = e13Var;
            this.$interviewTabViewmodel = mk7Var;
            this.$refreshing$delegate = g4aVar;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            u63.Y(this.$scope, null, null, new ll7(this.$interviewTabViewmodel, this.$refreshing$delegate, null), 3);
            return j6g.a;
        }
    }

    public static final class f implements gu5<j6g> {
        public final /* synthetic */ e8a a;
        public final /* synthetic */ InterviewJobsDto b;

        public f(e8a e8aVar, InterviewJobsDto interviewJobsDto) {
            this.a = e8aVar;
            this.b = interviewJobsDto;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            g3a<b5a> g3aVar = this.a.a0;
            String rescheduleLink = this.b.getRescheduleLink();
            g3aVar.j(rescheduleLink != null ? new b5a.d(rescheduleLink) : null);
            return j6g.a;
        }
    }

    public static final class g implements gu5<j6g> {
        public final /* synthetic */ e8a a;
        public final /* synthetic */ InterviewJobsDto b;

        public g(e8a e8aVar, InterviewJobsDto interviewJobsDto) {
            this.a = e8aVar;
            this.b = interviewJobsDto;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            g3a<b5a> g3aVar = this.a.a0;
            String cancelLink = this.b.getCancelLink();
            g3aVar.j(cancelLink != null ? new b5a.d(cancelLink) : null);
            return j6g.a;
        }
    }

    public static final class h implements gu5<j6g> {
        public final /* synthetic */ e13 a;
        public final /* synthetic */ e8a b;
        public final /* synthetic */ InterviewJobsDto c;
        public final /* synthetic */ ude d;

        public h(e13 e13Var, e8a e8aVar, InterviewJobsDto interviewJobsDto, ude udeVar) {
            this.a = e13Var;
            this.b = e8aVar;
            this.c = interviewJobsDto;
            this.d = udeVar;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            u63.Y(this.a, null, null, new wk7(this.b, this.c, this.d, null), 3);
            return j6g.a;
        }
    }

    public static final class i implements gu5<j6g> {
        public final /* synthetic */ e13 a;
        public final /* synthetic */ mk7 b;
        public final /* synthetic */ InterviewJobsDto c;

        public i(e13 e13Var, mk7 mk7Var, InterviewJobsDto interviewJobsDto) {
            this.a = e13Var;
            this.b = mk7Var;
            this.c = interviewJobsDto;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            u63.Y(this.a, null, null, new xk7(this.b, this.c, null), 3);
            return j6g.a;
        }
    }

    public static final class j implements gu5<j6g> {
        public final /* synthetic */ e13 a;
        public final /* synthetic */ mk7 b;
        public final /* synthetic */ InterviewJobsDto c;

        public j(e13 e13Var, mk7 mk7Var, InterviewJobsDto interviewJobsDto) {
            this.a = e13Var;
            this.b = mk7Var;
            this.c = interviewJobsDto;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            u63.Y(this.a, null, null, new yk7(this.b, this.c, null), 3);
            return j6g.a;
        }
    }

    public static final class k implements gu5<j6g> {
        public final /* synthetic */ e13 a;
        public final /* synthetic */ mk7 b;
        public final /* synthetic */ InterviewJobsDto c;

        public k(e13 e13Var, mk7 mk7Var, InterviewJobsDto interviewJobsDto) {
            this.a = e13Var;
            this.b = mk7Var;
            this.c = interviewJobsDto;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            u63.Y(this.a, null, null, new zk7(this.b, this.c, null), 3);
            return j6g.a;
        }
    }

    public static final class l implements gu5<j6g> {
        public final /* synthetic */ e13 a;
        public final /* synthetic */ e8a b;
        public final /* synthetic */ InterviewJobsDto c;
        public final /* synthetic */ ude d;

        public l(e13 e13Var, e8a e8aVar, InterviewJobsDto interviewJobsDto, ude udeVar) {
            this.a = e13Var;
            this.b = e8aVar;
            this.c = interviewJobsDto;
            this.d = udeVar;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            u63.Y(this.a, null, null, new al7(this.b, this.c, this.d, null), 3);
            return j6g.a;
        }
    }

    public static final class m implements gu5<j6g> {
        public final /* synthetic */ e13 a;
        public final /* synthetic */ mk7 b;
        public final /* synthetic */ InterviewJobsDto c;
        public final /* synthetic */ ude d;

        public m(e13 e13Var, mk7 mk7Var, InterviewJobsDto interviewJobsDto, ude udeVar) {
            this.a = e13Var;
            this.b = mk7Var;
            this.c = interviewJobsDto;
            this.d = udeVar;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            u63.Y(this.a, null, null, new bl7(this.b, this.c, this.d, null), 3);
            return j6g.a;
        }
    }

    public static final class n implements gu5<j6g> {
        public final /* synthetic */ e13 a;
        public final /* synthetic */ mk7 b;
        public final /* synthetic */ InterviewJobsDto c;
        public final /* synthetic */ ude d;

        public n(e13 e13Var, mk7 mk7Var, InterviewJobsDto interviewJobsDto, ude udeVar) {
            this.a = e13Var;
            this.b = mk7Var;
            this.c = interviewJobsDto;
            this.d = udeVar;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            u63.Y(this.a, null, null, new cl7(this.b, this.c, this.d, null), 3);
            return j6g.a;
        }
    }

    public static final class o implements gu5<j6g> {
        public final /* synthetic */ e13 a;
        public final /* synthetic */ e8a b;
        public final /* synthetic */ InterviewJobsDto c;
        public final /* synthetic */ ude d;

        public o(e13 e13Var, e8a e8aVar, InterviewJobsDto interviewJobsDto, ude udeVar) {
            this.a = e13Var;
            this.b = e8aVar;
            this.c = interviewJobsDto;
            this.d = udeVar;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            u63.Y(this.a, null, null, new dl7(this.b, this.c, this.d, null), 3);
            return j6g.a;
        }
    }

    public static final class p implements gu5<j6g> {
        public final /* synthetic */ e13 a;
        public final /* synthetic */ ude b;
        public final /* synthetic */ InterviewJobsDto c;
        public final /* synthetic */ mhg d;

        public p(e13 e13Var, ude udeVar, InterviewJobsDto interviewJobsDto, mhg mhgVar) {
            this.a = e13Var;
            this.b = udeVar;
            this.c = interviewJobsDto;
            this.d = mhgVar;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            mhg mhgVar = this.d;
            InterviewJobsDto interviewJobsDto = this.c;
            ude udeVar = this.b;
            u63.Y(this.a, null, null, new el7(interviewJobsDto, udeVar, mhgVar, null), 3);
            udeVar.m(new ude.c.j(interviewJobsDto.getId()));
            return j6g.a;
        }
    }

    public static final class q implements gu5<j6g> {
        public final /* synthetic */ e13 a;
        public final /* synthetic */ mk7 b;
        public final /* synthetic */ InterviewJobsDto c;
        public final /* synthetic */ ude d;

        public q(e13 e13Var, mk7 mk7Var, InterviewJobsDto interviewJobsDto, ude udeVar) {
            this.a = e13Var;
            this.b = mk7Var;
            this.c = interviewJobsDto;
            this.d = udeVar;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            u63.Y(this.a, null, null, new fl7(this.b, this.c, this.d, null), 3);
            return j6g.a;
        }
    }

    public static final class r implements gu5<j6g> {
        public final /* synthetic */ e13 a;
        public final /* synthetic */ mk7 b;
        public final /* synthetic */ InterviewJobsDto c;
        public final /* synthetic */ ude d;

        public r(e13 e13Var, mk7 mk7Var, InterviewJobsDto interviewJobsDto, ude udeVar) {
            this.a = e13Var;
            this.b = mk7Var;
            this.c = interviewJobsDto;
            this.d = udeVar;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            u63.Y(this.a, null, null, new gl7(this.b, this.c, this.d, null), 3);
            return j6g.a;
        }
    }

    public static final class s implements gu5<j6g> {
        public final /* synthetic */ e13 a;
        public final /* synthetic */ ude b;
        public final /* synthetic */ androidx.fragment.app.g c;
        public final /* synthetic */ iba d;
        public final /* synthetic */ InterviewJobsDto e;

        public s(e13 e13Var, ude udeVar, androidx.fragment.app.g gVar, iba ibaVar, InterviewJobsDto interviewJobsDto) {
            this.a = e13Var;
            this.b = udeVar;
            this.c = gVar;
            this.d = ibaVar;
            this.e = interviewJobsDto;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            androidx.fragment.app.g gVar = this.c;
            iba ibaVar = this.d;
            InterviewJobsDto interviewJobsDto = this.e;
            u63.Y(this.a, null, null, new hl7(gVar, ibaVar, interviewJobsDto, null), 3);
            this.b.m(new ude.c.k(new il7(interviewJobsDto)));
            return j6g.a;
        }
    }

    public static final class t implements gu5<j6g> {
        public final /* synthetic */ e13 a;
        public final /* synthetic */ e8a b;
        public final /* synthetic */ InterviewJobsDto c;
        public final /* synthetic */ ude d;

        public t(e13 e13Var, e8a e8aVar, InterviewJobsDto interviewJobsDto, ude udeVar) {
            this.a = e13Var;
            this.b = e8aVar;
            this.c = interviewJobsDto;
            this.d = udeVar;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            u63.Y(this.a, null, null, new jl7(this.b, this.c, this.d, null), 3);
            return j6g.a;
        }
    }

    public static final class u implements gu5<j6g> {
        public final /* synthetic */ ude a;
        public final /* synthetic */ InterviewJobsDto b;

        public u(ude udeVar, InterviewJobsDto interviewJobsDto) {
            this.a = udeVar;
            this.b = interviewJobsDto;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            this.a.m(new ude.c.l(new kl7(this.b)));
            return j6g.a;
        }
    }

    public static final class v implements Function1<Integer, Object> {
        public final /* synthetic */ List a;

        public v(List list) {
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.a.get(num.intValue());
            return null;
        }
    }

    public static final class w implements xu5<xo8, Integer, androidx.compose.runtime.b, Integer, j6g> {
        public final /* synthetic */ List a;
        public final /* synthetic */ e8a b;
        public final /* synthetic */ e13 c;
        public final /* synthetic */ ude d;

        public w(List list, e8a e8aVar, e13 e13Var, ude udeVar) {
            this.a = list;
            this.b = e8aVar;
            this.c = e13Var;
            this.d = udeVar;
        }

        @Override // defpackage.xu5
        public final j6g j(xo8 xo8Var, Integer num, androidx.compose.runtime.b bVar, Integer num2) {
            int i;
            xo8 xo8Var2 = xo8Var;
            int iIntValue = num.intValue();
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i = (bVar2.K(xo8Var2) ? 4 : 2) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= bVar2.d(iIntValue) ? 32 : 16;
            }
            if (bVar2.o(i & 1, (i & 147) != 146)) {
                InterviewJobsDto interviewJobsDto = (InterviewJobsDto) this.a.get(iIntValue);
                bVar2.L(-398884419);
                String title = interviewJobsDto.getTitle();
                String description = interviewJobsDto.getDescription();
                String location = interviewJobsDto.getLocation();
                if (location == null) {
                    location = "";
                }
                String str = location;
                String strB = u63.B(interviewJobsDto.getTimeStamp());
                String strE = vk7.e(interviewJobsDto.getStartTime(), interviewJobsDto.getEndTime());
                nl7 formatType = interviewJobsDto.getFormatType();
                String phoneNumber = interviewJobsDto.getPhoneNumber();
                String address = interviewJobsDto.getAddress();
                String status = interviewJobsDto.getStatus();
                e8a e8aVar = this.b;
                boolean zX = bVar2.x(e8aVar) | bVar2.x(interviewJobsDto);
                Object objV = bVar2.v();
                b.a.C0020a c0020a = b.a.a;
                if (zX || objV == c0020a) {
                    objV = new e(e8aVar, interviewJobsDto);
                    bVar2.p(objV);
                }
                gu5 gu5Var = (gu5) objV;
                boolean zX2 = bVar2.x(e8aVar) | bVar2.x(interviewJobsDto);
                Object objV2 = bVar2.v();
                if (zX2 || objV2 == c0020a) {
                    objV2 = new f(e8aVar, interviewJobsDto);
                    bVar2.p(objV2);
                }
                gu5 gu5Var2 = (gu5) objV2;
                boolean zX3 = bVar2.x(e8aVar) | bVar2.x(interviewJobsDto);
                Object objV3 = bVar2.v();
                if (zX3 || objV3 == c0020a) {
                    objV3 = new g(e8aVar, interviewJobsDto);
                    bVar2.p(objV3);
                }
                gu5 gu5Var3 = (gu5) objV3;
                e13 e13Var = this.c;
                boolean zX4 = bVar2.x(e13Var) | bVar2.x(e8aVar) | bVar2.x(interviewJobsDto);
                ude udeVar = this.d;
                boolean zX5 = zX4 | bVar2.x(udeVar);
                Object objV4 = bVar2.v();
                if (zX5 || objV4 == c0020a) {
                    objV4 = new h(e13Var, e8aVar, interviewJobsDto, udeVar);
                    bVar2.p(objV4);
                }
                vj7.e(new wj7(title, description, str, strB, gu5Var, gu5Var2, gu5Var3, null, strE, formatType, phoneNumber, address, null, lk7.b, (gu5) objV4, false, status, false, false, false, null, 16024688), bVar2, 0);
                bVar2.F();
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public static final class x implements Function1<Integer, Object> {
        public final /* synthetic */ List a;

        public x(List list) {
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.a.get(num.intValue());
            return null;
        }
    }

    public static final class y implements xu5<xo8, Integer, androidx.compose.runtime.b, Integer, j6g> {
        public final /* synthetic */ List a;
        public final /* synthetic */ e13 b;
        public final /* synthetic */ mk7 c;
        public final /* synthetic */ e8a d;
        public final /* synthetic */ ude e;

        public y(List list, e13 e13Var, mk7 mk7Var, e8a e8aVar, ude udeVar) {
            this.a = list;
            this.b = e13Var;
            this.c = mk7Var;
            this.d = e8aVar;
            this.e = udeVar;
        }

        @Override // defpackage.xu5
        public final j6g j(xo8 xo8Var, Integer num, androidx.compose.runtime.b bVar, Integer num2) {
            int i;
            xo8 xo8Var2 = xo8Var;
            int iIntValue = num.intValue();
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i = (bVar2.K(xo8Var2) ? 4 : 2) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= bVar2.d(iIntValue) ? 32 : 16;
            }
            if (bVar2.o(i & 1, (i & 147) != 146)) {
                InterviewJobsDto interviewJobsDto = (InterviewJobsDto) this.a.get(iIntValue);
                bVar2.L(2031886134);
                String title = interviewJobsDto.getTitle();
                String description = interviewJobsDto.getDescription();
                String location = interviewJobsDto.getLocation();
                if (location == null) {
                    location = "";
                }
                String str = location;
                String strB = u63.B(interviewJobsDto.getTimeStamp());
                String strE = vk7.e(interviewJobsDto.getStartTime(), interviewJobsDto.getEndTime());
                nl7 formatType = interviewJobsDto.getFormatType();
                String phoneNumber = interviewJobsDto.getPhoneNumber();
                String address = interviewJobsDto.getAddress();
                String status = interviewJobsDto.getStatus();
                e13 e13Var = this.b;
                boolean zX = bVar2.x(e13Var);
                mk7 mk7Var = this.c;
                boolean zX2 = zX | bVar2.x(mk7Var) | bVar2.x(interviewJobsDto);
                Object objV = bVar2.v();
                b.a.C0020a c0020a = b.a.a;
                if (zX2 || objV == c0020a) {
                    objV = new i(e13Var, mk7Var, interviewJobsDto);
                    bVar2.p(objV);
                }
                gu5 gu5Var = (gu5) objV;
                boolean zX3 = bVar2.x(e13Var) | bVar2.x(mk7Var) | bVar2.x(interviewJobsDto);
                Object objV2 = bVar2.v();
                if (zX3 || objV2 == c0020a) {
                    objV2 = new j(e13Var, mk7Var, interviewJobsDto);
                    bVar2.p(objV2);
                }
                gu5 gu5Var2 = (gu5) objV2;
                boolean zX4 = bVar2.x(e13Var) | bVar2.x(mk7Var) | bVar2.x(interviewJobsDto);
                Object objV3 = bVar2.v();
                if (zX4 || objV3 == c0020a) {
                    objV3 = new k(e13Var, mk7Var, interviewJobsDto);
                    bVar2.p(objV3);
                }
                gu5 gu5Var3 = (gu5) objV3;
                boolean zX5 = bVar2.x(e13Var);
                e8a e8aVar = this.d;
                boolean zX6 = zX5 | bVar2.x(e8aVar) | bVar2.x(interviewJobsDto);
                ude udeVar = this.e;
                boolean zX7 = zX6 | bVar2.x(udeVar);
                Object objV4 = bVar2.v();
                if (zX7 || objV4 == c0020a) {
                    objV4 = new l(e13Var, e8aVar, interviewJobsDto, udeVar);
                    bVar2.p(objV4);
                }
                vj7.e(new wj7(title, description, str, strB, gu5Var, gu5Var2, gu5Var3, null, strE, formatType, phoneNumber, address, null, lk7.c, (gu5) objV4, false, status, false, false, false, null, 16024688), bVar2, 0);
                bVar2.F();
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public static final class z implements Function1<Integer, Object> {
        public final /* synthetic */ ArrayList a;

        public z(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.a.get(num.intValue());
            return null;
        }
    }

    public static final void a(int i2, androidx.compose.runtime.b bVar) {
        Bundle bundleA;
        androidx.compose.runtime.c cVarH = bVar.h(358663364);
        if (cVarH.o(i2 & 1, i2 != 0)) {
            cVarH.u(-1072256281);
            jrg jrgVarA = z09.a(cVarH);
            if (jrgVarA == null) {
                r6.g("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            p63 p63VarA = ojd.a(jrgVarA, cVarH);
            vh8 vh8Var = web.d;
            if (vh8Var == null) {
                r6.g("KoinApplication has not been started");
                return;
            }
            qpd qpdVar = (qpd) vh8Var.a.b;
            androidx.navigation.d dVar = jrgVarA instanceof androidx.navigation.d ? (androidx.navigation.d) jrgVarA : null;
            p63 p63VarQ = (dVar == null || (bundleA = dVar.a()) == null) ? null : pnb.Q(bundleA, jrgVarA);
            yd8 yd8VarB = fwc.a.b(ude.class);
            irg viewModelStore = jrgVarA.getViewModelStore();
            viewModelStore.getClass();
            brg brgVarA = p66.a(yd8VarB, viewModelStore, p63VarQ == null ? p63VarA : p63VarQ, null, qpdVar, null);
            cVarH.U(false);
            ude udeVar = (ude) brgVarA;
            Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            androidx.fragment.app.g gVar = context instanceof androidx.fragment.app.g ? (androidx.fragment.app.g) context : null;
            iba ibaVarB = q92.B(new androidx.navigation.s[0], cVarH);
            x2b x2bVarA = z2b.a(R.drawable.interviewsemptystate, 0, cVarH);
            String strI = ak2.I(R.string.empty_screen_icon, cVarH);
            String strI2 = ak2.I(R.string.interview_tab_empty_screen_title, cVarH);
            String strI3 = ak2.I(R.string.interview_tab_empty_screen_sub_title, cVarH);
            String strI4 = ak2.I(R.string.interview_tab_empty_screen_link, cVarH);
            boolean zX = cVarH.x(udeVar) | cVarH.x(context);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new rr(7, udeVar, context);
                cVarH.p(objV);
            }
            ks4 ks4Var = new ks4(x2bVarA, strI, strI2, strI3, strI4, (gu5) objV, (String) null, (gu5) null, 384);
            String strI5 = ak2.I(R.string.interview_tab_empty_state_interview_prep_sub_title, cVarH);
            String strI6 = ak2.I(R.string.interview_tab_empty_state_interview_prep_cta, cVarH);
            boolean zX2 = cVarH.x(gVar) | cVarH.x(ibaVarB);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new oa0(4, gVar, ibaVarB);
                cVarH.p(objV2);
            }
            strI.getClass();
            strI2.getClass();
            strI5.getClass();
            ks4 ks4Var2 = new ks4(x2bVarA, strI, strI2, strI5, (String) null, (gu5<j6g>) null, strI6, (gu5<j6g>) objV2, true);
            ra8 ra8Var = i6a.a;
            if (((kr7) cr8.p(kr7.class)).e("ace_interview_prep_empty_state_cta_tog").a >= 1) {
                ks4Var = ks4Var2;
            }
            os4.a(ks4Var, false, false, cVarH, 0, 6);
        } else {
            cVarH.D();
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new mj2(i2);
        }
    }

    public static final void b(e8a e8aVar, mk7 mk7Var, androidx.compose.runtime.b bVar, int i2) {
        androidx.compose.runtime.c cVarH = bVar.h(844341177);
        int i3 = (cVarH.x(e8aVar) ? 4 : 2) | i2 | (cVarH.x(mk7Var) ? 32 : 16);
        if (cVarH.o(i3 & 1, (i3 & 19) != 18)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                m74 m74Var = to4.a;
                objV = v40.b(cVarH.l(), cVarH);
            }
            e13 e13Var = (e13) objV;
            x2b x2bVarA = z2b.a(R.drawable.error_image, 0, cVarH);
            String strI = ak2.I(R.string.error_screen_icon, cVarH);
            String strI2 = ak2.I(R.string.error_screen_title, cVarH);
            String strI3 = ak2.I(R.string.error_screen_sub_title, cVarH);
            String strI4 = ak2.I(R.string.error_button_refresh, cVarH);
            String strI5 = ak2.I(R.string.error_footer_link_text, cVarH);
            String strI6 = ak2.I(R.string.error_footer_normal_text, cVarH);
            boolean zX = cVarH.x(e13Var) | cVarH.x(e8aVar);
            Object objV2 = cVarH.v();
            if (zX || objV2 == c0020a) {
                objV2 = new qe(7, e13Var, e8aVar);
                cVarH.p(objV2);
            }
            gu5 gu5Var = (gu5) objV2;
            boolean zX2 = cVarH.x(mk7Var);
            Object objV3 = cVarH.v();
            if (zX2 || objV3 == c0020a) {
                objV3 = new nv(mk7Var, 11);
                cVarH.p(objV3);
            }
            cx4.a(new gx4(x2bVarA, strI, strI2, strI3, strI5, strI6, gu5Var, strI4, (gu5) objV3), cVarH, 0);
        } else {
            cVarH.D();
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new gt(e8aVar, i2, 2, mk7Var);
        }
    }

    public static final void c(List<InterviewJobsDto> list, final e8a e8aVar, final mk7 mk7Var, ss8 ss8Var, androidx.compose.runtime.b bVar, int i2) {
        androidx.compose.runtime.c cVar;
        boolean z2;
        Bundle bundleA;
        androidx.compose.runtime.c cVarH = bVar.h(-1459509816);
        int i3 = (i2 & 6) == 0 ? (cVarH.x(list) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= cVarH.x(e8aVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= cVarH.x(mk7Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i2 & 3072) == 0) {
            i3 |= cVarH.K(ss8Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if (cVarH.o(i3 & 1, (i3 & 1171) != 1170)) {
            final o97 o97Var = (o97) cVarH.M(p97.a);
            cVarH.u(-1072256281);
            jrg jrgVarA = z09.a(cVarH);
            if (jrgVarA == null) {
                r6.g("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            p63 p63VarA = ojd.a(jrgVarA, cVarH);
            vh8 vh8Var = web.d;
            if (vh8Var == null) {
                r6.g("KoinApplication has not been started");
                return;
            }
            qpd qpdVar = (qpd) vh8Var.a.b;
            androidx.navigation.d dVar = jrgVarA instanceof androidx.navigation.d ? (androidx.navigation.d) jrgVarA : null;
            p63 p63VarQ = (dVar == null || (bundleA = dVar.a()) == null) ? null : pnb.Q(bundleA, jrgVarA);
            yd8 yd8VarB = fwc.a.b(ude.class);
            irg viewModelStore = jrgVarA.getViewModelStore();
            viewModelStore.getClass();
            brg brgVarA = p66.a(yd8VarB, viewModelStore, p63VarQ == null ? p63VarA : p63VarQ, null, qpdVar, null);
            cVarH.U(false);
            final ude udeVar = (ude) brgVarA;
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                m74 m74Var = to4.a;
                objV = v40.b(cVarH.l(), cVarH);
            }
            final e13 e13Var = (e13) objV;
            final Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            androidx.fragment.app.g gVar = context instanceof androidx.fragment.app.g ? (androidx.fragment.app.g) context : null;
            iba ibaVarB = q92.B(new androidx.navigation.s[0], cVarH);
            final mhg mhgVar = (mhg) cVarH.M(um2.r);
            List<InterviewJobsDto> list2 = list;
            final ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                int i4 = i3;
                if (wl7.b(((InterviewJobsDto) obj).getStatus(), "EMP_INVITE")) {
                    arrayList.add(obj);
                }
                i3 = i4;
            }
            int i5 = i3;
            final ArrayList arrayList2 = new ArrayList();
            Iterator it = list2.iterator();
            while (true) {
                Iterator it2 = it;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it2.next();
                InterviewJobsDto interviewJobsDto = (InterviewJobsDto) next;
                if (wl7.b(interviewJobsDto.getStatus(), "JS_CONFIRM") && interviewJobsDto.getEndTime() >= System.currentTimeMillis()) {
                    arrayList2.add(next);
                }
                it = it2;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                Iterator it4 = it3;
                Object next2 = it4.next();
                InterviewJobsDto interviewJobsDto2 = (InterviewJobsDto) next2;
                iba ibaVar = ibaVarB;
                if (wl7.b(interviewJobsDto2.getStatus(), "JS_CONFIRM") && interviewJobsDto2.getEndTime() < System.currentTimeMillis()) {
                    arrayList3.add(next2);
                }
                it3 = it4;
                ibaVarB = ibaVar;
            }
            final iba ibaVar2 = ibaVarB;
            List listP1 = z92.p1(arrayList3, new b());
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = list2.iterator();
            while (it5.hasNext()) {
                Object next3 = it5.next();
                InterviewJobsDto interviewJobsDto3 = (InterviewJobsDto) next3;
                Iterator it6 = it5;
                List list3 = listP1;
                if (wl7.b(interviewJobsDto3.getStatus(), "JS_CANCEL") || wl7.b(interviewJobsDto3.getStatus(), "EMP_CANCEL")) {
                    arrayList4.add(next3);
                }
                it5 = it6;
                listP1 = list3;
            }
            final List list4 = listP1;
            final List listP12 = z92.p1(arrayList4, new c());
            pqc pqcVar = mk7Var.e;
            boolean zX = cVarH.x(mk7Var) | cVarH.x(e8aVar);
            Object objV2 = cVarH.v();
            if (zX || objV2 == c0020a) {
                objV2 = new d(mk7Var, e8aVar, null);
                cVarH.p(objV2);
            }
            to4.d(cVarH, pqcVar, (Function2) objV2);
            af1.a aVar = c20.a.m;
            vs0.k kVar = vs0.c;
            ob2 ob2VarA = mb2.a(kVar, aVar, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(cVarH, e.a.b);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            boolean zX2 = cVarH.x(arrayList) | cVarH.x(o97Var) | cVarH.x(context) | cVarH.x(e13Var) | cVarH.x(mk7Var) | cVarH.x(udeVar) | cVarH.x(e8aVar) | cVarH.x(arrayList2) | cVarH.x(mhgVar) | cVarH.x(gVar) | cVarH.x(ibaVar2) | cVarH.x(list4) | cVarH.x(listP12);
            Object objV3 = cVarH.v();
            if (zX2 || objV3 == c0020a) {
                cVar = cVarH;
                final androidx.fragment.app.g gVar2 = gVar;
                z2 = true;
                Function1 function1 = new Function1() { // from class: qk7
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v2 */
                    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String, kotlin.jvm.functions.Function1] */
                    /* JADX WARN: Type inference failed for: r2v4 */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        mk7 mk7Var2;
                        ude udeVar2;
                        e13 e13Var2;
                        e8a e8aVar2;
                        e13 e13Var3;
                        int i6;
                        ?? r2;
                        boolean z3;
                        e8a e8aVar3;
                        ude udeVar3;
                        ls8 ls8Var = (ls8) obj2;
                        ls8Var.getClass();
                        ArrayList arrayList5 = arrayList;
                        boolean zIsEmpty = arrayList5.isEmpty();
                        o97 o97Var2 = o97Var;
                        e13 e13Var4 = e13Var;
                        mk7 mk7Var3 = mk7Var;
                        ude udeVar4 = udeVar;
                        e8a e8aVar4 = e8aVar;
                        Context context2 = context;
                        if (zIsEmpty) {
                            mk7Var2 = mk7Var3;
                            udeVar2 = udeVar4;
                            e13Var2 = e13Var4;
                            e8aVar2 = e8aVar4;
                        } else {
                            ls8.e(ls8Var, null, new ah2(-417354526, new qt5(o97Var2, 1), true), 3);
                            e13Var2 = e13Var4;
                            mk7Var2 = mk7Var3;
                            udeVar2 = udeVar4;
                            e8aVar2 = e8aVar4;
                            ls8Var.c(arrayList5.size(), null, new vk7.z(arrayList5), new ah2(802480018, new vk7.a0(arrayList5, e13Var2, mk7Var3, udeVar4, e8aVar4, context2), true));
                        }
                        ArrayList arrayList6 = arrayList2;
                        if (arrayList6.isEmpty()) {
                            e13Var3 = e13Var2;
                            i6 = 802480018;
                            r2 = 0;
                            z3 = true;
                            e8aVar3 = e8aVar2;
                            udeVar3 = udeVar2;
                            ra8 ra8Var = i6a.a;
                            if (((kr7) cr8.p(kr7.class)).e("ace_interview_prep_bannar_myjobs_interviews_tst").a >= 1) {
                                ls8.e(ls8Var, null, r03.d, 3);
                            }
                            ls8.e(ls8Var, null, new ah2(59677026, new dl6(1, context2, o97Var2), true), 3);
                            ls8.e(ls8Var, null, new ah2(-515102389, new op6(o97Var2, 1), true), 3);
                            ls8.e(ls8Var, null, new ah2(-756799702, new j12(o97Var2, udeVar3, context2), true), 3);
                        } else {
                            ls8.e(ls8Var, null, new ah2(-590704949, new sk7(o97Var2, 0), true), 3);
                            int size = arrayList6.size();
                            vk7.b0 b0Var = new vk7.b0(arrayList6);
                            r2 = 0;
                            i6 = 802480018;
                            e13Var3 = e13Var2;
                            z3 = true;
                            vk7.c0 c0Var = new vk7.c0(arrayList6, context2, e13Var3, mhgVar, udeVar2, mk7Var2, gVar2, ibaVar2, e8aVar2);
                            udeVar3 = udeVar2;
                            e8aVar3 = e8aVar2;
                            ls8Var.c(size, null, b0Var, new ah2(802480018, c0Var, true));
                            ls8.e(ls8Var, null, new ah2(1097058420, new z00(1, o97Var2, udeVar3, context2), true), 3);
                        }
                        List list5 = list4;
                        if (!list5.isEmpty()) {
                            ls8.e(ls8Var, r2, new ah2(-106068118, new tk7(o97Var2, 0), z3), 3);
                            ls8Var.c(list5.size(), r2, new vk7.v(list5), new ah2(i6, new vk7.w(list5, e8aVar3, e13Var3, udeVar3), z3));
                        }
                        List list6 = listP12;
                        if (!list6.isEmpty()) {
                            ls8.e(ls8Var, r2, new ah2(378568713, new uk7(o97Var2, 0), z3), 3);
                            ls8Var.c(list6.size(), r2, new vk7.x(list6), new ah2(i6, new vk7.y(list6, e13Var3, mk7Var2, e8aVar3, udeVar3), z3));
                        }
                        ls8.e(ls8Var, r2, new ah2(1968697693, new n03(o97Var2, 2), z3), 3);
                        return j6g.a;
                    }
                };
                cVar.p(function1);
                objV3 = function1;
            } else {
                cVar = cVarH;
                z2 = true;
            }
            hn8.b(null, ss8Var, null, false, kVar, null, null, false, null, (Function1) objV3, cVar, ((i5 >> 6) & 112) | 24576, 493);
            cVar.U(z2);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        androidx.compose.runtime.i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new rk7(list, e8aVar, mk7Var, ss8Var, i2, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(defpackage.e8a r21, defpackage.ss8 r22, androidx.compose.runtime.b r23, int r24) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk7.d(e8a, ss8, androidx.compose.runtime.b, int):void");
    }

    public static String e(long j2, long j3) {
        Locale locale = Locale.getDefault();
        locale.getClass();
        TimeZone timeZone = TimeZone.getDefault();
        timeZone.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm a", locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j2);
        String str = simpleDateFormat.format(calendar.getTime());
        calendar.setTimeInMillis(j3);
        return str + " - " + simpleDateFormat.format(calendar.getTime()) + " " + timeZone.getDisplayName(timeZone.inDaylightTime(calendar.getTime()), 0);
    }
}
