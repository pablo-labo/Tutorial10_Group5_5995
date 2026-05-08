package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import com.indeed.android.myjobs.data.model.UserJobStatus;
import com.indeed.android.myjobs.data.model.dto.BrandedAdsDto;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.af1;
import defpackage.b5a;
import defpackage.c20;
import defpackage.gl2;
import defpackage.jq7;
import defpackage.mld;
import defpackage.o97;
import defpackage.pld;
import defpackage.pm8;
import defpackage.ude;
import defpackage.vs0;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class mld {

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.SavedTabKt$DisplayErrorState$errorStateConfig$1$1$1", f = "SavedTab.kt", l = {}, m = "invokeSuspend")
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
            this.$myJobsViewModel.a0.k(new b5a.d(n7g.a(ie7.c0, "app-tracker-saved-emptytabmodalcta")));
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.SavedTabKt$DisplayJobList$1$1$1$2$1$1$1", f = "SavedTab.kt", l = {}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ SavedJobsDto $job;
        final /* synthetic */ e8a $myJobsViewModel;
        final /* synthetic */ ude $sharedViewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e8a e8aVar, SavedJobsDto savedJobsDto, ude udeVar, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$myJobsViewModel = e8aVar;
            this.$job = savedJobsDto;
            this.$sharedViewModel = udeVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$myJobsViewModel, this.$job, this.$sharedViewModel, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            this.$myJobsViewModel.a0.k(new b5a.d(n7g.a(this.$job.getJobUrl(), "app-tracker-saved-applybtn")));
            ude udeVar = this.$sharedViewModel;
            UserJobStatus userJobStatus = this.$job.getUserJobStatus();
            udeVar.m(new ude.c.d(userJobStatus != null ? userJobStatus.getStatus() : null, this.$job.getAppTk()));
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.SavedTabKt$DisplayJobList$1$1$1$2$2$1$1", f = "SavedTab.kt", l = {}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ SavedJobsDto $job;
        final /* synthetic */ e8a $myJobsViewModel;
        final /* synthetic */ ude $sharedViewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e8a e8aVar, SavedJobsDto savedJobsDto, ude udeVar, lu2<? super c> lu2Var) {
            super(2, lu2Var);
            this.$myJobsViewModel = e8aVar;
            this.$job = savedJobsDto;
            this.$sharedViewModel = udeVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new c(this.$myJobsViewModel, this.$job, this.$sharedViewModel, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            this.$myJobsViewModel.a0.k(new b5a.d(n7g.a(this.$job.getJobUrl(), "app-tracker-saved-appcard")));
            ude udeVar = this.$sharedViewModel;
            UserJobStatus userJobStatus = this.$job.getUserJobStatus();
            udeVar.m(new ude.c.C0432c(this.$job, "Saved", userJobStatus != null ? userJobStatus.getStatus() : null, this.$job.getAppTk()));
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.SavedTabKt$DisplayJobList$1$1$1$2$3$1$1", f = "SavedTab.kt", l = {}, m = "invokeSuspend")
    public static final class d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ SavedJobsDto $job;
        final /* synthetic */ ude $sharedViewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ude udeVar, SavedJobsDto savedJobsDto, Context context, lu2<? super d> lu2Var) {
            super(2, lu2Var);
            this.$sharedViewModel = udeVar;
            this.$job = savedJobsDto;
            this.$context = context;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new d(this.$sharedViewModel, this.$job, this.$context, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            this.$sharedViewModel.m(new ude.c.i0(this.$job.getJobkey(), this.$job, this.$context));
            this.$sharedViewModel.m(new ude.c.n("Saved", this.$job.getAppTk()));
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.SavedTabKt$SavedTab$1$1", f = "SavedTab.kt", l = {105}, m = "invokeSuspend")
    public static final class e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ androidx.fragment.app.g $activity;
        final /* synthetic */ iba $navController;
        final /* synthetic */ pld $savedTabViewModel;
        int label;

        public static final class a<T> implements wi5 {
            public final /* synthetic */ androidx.fragment.app.g a;
            public final /* synthetic */ iba b;

            public a(androidx.fragment.app.g gVar, iba ibaVar) {
                this.a = gVar;
                this.b = ibaVar;
            }

            @Override // defpackage.wi5
            public final Object a(Object obj, lu2 lu2Var) {
                pld.b bVar = (pld.b) obj;
                if (!(bVar instanceof pld.b.a)) {
                    l.g();
                    return null;
                }
                androidx.fragment.app.g gVar = this.a;
                if (gVar != null) {
                    rq7 rq7Var = (rq7) cr8.p(rq7.class);
                    lr5 lr5VarU = gVar.u();
                    lr5VarU.getClass();
                    pld.b.a aVar = (pld.b.a) bVar;
                    rq7Var.f(lr5VarU, this.b, new jq7.h(aVar.a), aVar.b);
                }
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(pld pldVar, androidx.fragment.app.g gVar, iba ibaVar, lu2<? super e> lu2Var) {
            super(2, lu2Var);
            this.$savedTabViewModel = pldVar;
            this.$activity = gVar;
            this.$navController = ibaVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new e(this.$savedTabViewModel, this.$activity, this.$navController, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) throws Throwable {
            ((e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            return g13.a;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    throw s6.e(obj);
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            pqc pqcVar = this.$savedTabViewModel.l0;
            a aVar = new a(this.$activity, this.$navController);
            this.label = 1;
            pqcVar.a.e(aVar, this);
            return g13.a;
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.SavedTabKt$SavedTab$3$1", f = "SavedTab.kt", l = {}, m = "invokeSuspend")
    public static final class f extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ e8a $myJobsViewModel;
        final /* synthetic */ pld $savedTabViewModel;
        final /* synthetic */ e13 $scope;
        final /* synthetic */ old $viewState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(pld pldVar, e8a e8aVar, e13 e13Var, old oldVar, lu2<? super f> lu2Var) {
            super(2, lu2Var);
            this.$savedTabViewModel = pldVar;
            this.$myJobsViewModel = e8aVar;
            this.$scope = e13Var;
            this.$viewState = oldVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new f(this.$savedTabViewModel, this.$myJobsViewModel, this.$scope, this.$viewState, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((f) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            if (this.$savedTabViewModel.i0 && ((gme) this.$myJobsViewModel.V).getValue() == j7f.a) {
                this.$myJobsViewModel.i("Saved", this.$scope);
                e8a e8aVar = this.$myJobsViewModel;
                e13 e13Var = this.$scope;
                old oldVar = this.$viewState;
                e8aVar.h("Saved", e13Var, oldVar.a, oldVar.g);
            }
            return j6g.a;
        }
    }

    public static final class g<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ak2.i(Long.valueOf(((SavedJobsDto) t2).getTimeStamp()), Long.valueOf(((SavedJobsDto) t).getTimeStamp()));
        }
    }

    public static final class h<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ak2.i(Long.valueOf(((SavedJobsDto) t2).getTimeStamp()), Long.valueOf(((SavedJobsDto) t).getTimeStamp()));
        }
    }

    public static final class i implements l74 {
        public final /* synthetic */ zv8 a;
        public final /* synthetic */ vf2 b;

        public i(zv8 zv8Var, vf2 vf2Var) {
            this.a = zv8Var;
            this.b = vf2Var;
        }

        @Override // defpackage.l74
        public final void dispose() {
            this.a.getLifecycle().c(this.b);
        }
    }

    public static final /* synthetic */ class j extends fa implements gu5<j6g> {
        final /* synthetic */ g4a<Boolean> $refreshing$delegate;
        final /* synthetic */ pld $savedTabViewModel;
        final /* synthetic */ e13 $scope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(e13 e13Var, pld pldVar, g4a<Boolean> g4aVar) {
            super("SavedTab$refresh(Lkotlinx/coroutines/CoroutineScope;Lcom/indeed/android/myjobs/presentation/tabs/SavedTabViewModel;Landroidx/compose/runtime/MutableState;)Lkotlinx/coroutines/Job;");
            this.$scope = e13Var;
            this.$savedTabViewModel = pldVar;
            this.$refreshing$delegate = g4aVar;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            u63.Y(this.$scope, null, null, new nld(this.$savedTabViewModel, this.$refreshing$delegate, null), 3);
            return j6g.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final pld pldVar, androidx.compose.ui.e eVar, androidx.compose.runtime.b bVar, final int i2) {
        int i3;
        final androidx.compose.ui.e eVar2;
        Float f2;
        androidx.compose.runtime.c cVarH = bVar.h(-1879810317);
        if ((i2 & 6) == 0) {
            i3 = (cVarH.x(pldVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if (cVarH.o(i4 & 1, (i4 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            BrandedAdsDto brandedAdsDto = ((old) r.a(pldVar.c, cVarH).getValue()).j;
            eVar2 = e.a.b;
            if (brandedAdsDto == null) {
                cVarH.L(649688095);
            } else {
                cVarH.L(649688096);
                String imageUrl = brandedAdsDto.getImageUrl();
                String logoUrl = brandedAdsDto.getLogoUrl();
                String companyName = brandedAdsDto.getCompanyName();
                String companyDescription = brandedAdsDto.getCompanyDescription();
                String gotoText = brandedAdsDto.getGotoText();
                String gotoUrl = brandedAdsDto.getGotoUrl();
                String companyRating = brandedAdsDto.getCompanyRating();
                if (companyRating != null) {
                    Float fValueOf = vve.y(companyRating) ? Float.valueOf(Float.parseFloat(companyRating)) : null;
                    f2 = fValueOf;
                } else {
                    f2 = null;
                }
                String numReviews = brandedAdsDto.getNumReviews();
                s9 s9Var = new s9(imageUrl, logoUrl, companyName, companyDescription, gotoText, gotoUrl, f2, numReviews != null ? vve.B(10, numReviews) : null, brandedAdsDto.getAdvParentCompanyName(), brandedAdsDto.getTargetingCriteria());
                androidx.compose.ui.e eVarF = androidx.compose.foundation.layout.g.f(eVar2, 1.0f);
                o97.g gVar = o97Var.i;
                androidx.compose.ui.e eVarI = androidx.compose.foundation.layout.f.i(eVarF, 16.0f, 16.0f, 16.0f, 0.0f);
                boolean zX = cVarH.x(pldVar) | cVarH.x(s9Var);
                Object objV = cVarH.v();
                b.a.C0020a c0020a = b.a.a;
                if (zX || objV == c0020a) {
                    objV = new s71(6, pldVar, s9Var);
                    cVarH.p(objV);
                }
                gu5 gu5Var = (gu5) objV;
                boolean zX2 = cVarH.x(pldVar);
                Object objV2 = cVarH.v();
                if (zX2 || objV2 == c0020a) {
                    objV2 = new o91(pldVar, 20);
                    cVarH.p(objV2);
                }
                gu5 gu5Var2 = (gu5) objV2;
                boolean zX3 = cVarH.x(pldVar);
                Object objV3 = cVarH.v();
                if (zX3 || objV3 == c0020a) {
                    objV3 = new oq(pldVar, 24);
                    cVarH.p(objV3);
                }
                gu5 gu5Var3 = (gu5) objV3;
                boolean zX4 = cVarH.x(pldVar);
                Object objV4 = cVarH.v();
                if (zX4 || objV4 == c0020a) {
                    objV4 = new pq(pldVar, 15);
                    cVarH.p(objV4);
                }
                aa.a(s9Var, eVarI, gu5Var, gu5Var2, gu5Var3, (Function1) objV4, cVarH, 0);
            }
            cVarH.U(false);
        } else {
            cVarH.D();
            eVar2 = eVar;
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: lld
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i2 | 1);
                    mld.a(pldVar, eVar2, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(e8a e8aVar, pld pldVar, androidx.compose.runtime.b bVar, int i2) {
        Bundle bundleA;
        androidx.compose.runtime.c cVarH = bVar.h(-84282559);
        int i3 = (cVarH.x(e8aVar) ? 4 : 2) | i2 | (cVarH.x(pldVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarH.o(i3 & 1, (i3 & 147) != 146)) {
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
            x2b x2bVarA = z2b.a(R.drawable.savedemptystate, 0, cVarH);
            String strI = ak2.I(R.string.empty_screen_icon, cVarH);
            String strI2 = ak2.I(R.string.saved_tab_empty_screen_title, cVarH);
            String strI3 = ak2.I(R.string.saved_tab_empty_screen_sub_title, cVarH);
            String strI4 = ak2.I(R.string.saved_tab_find_job_btn_text, cVarH);
            String strI5 = ak2.I(R.string.not_seeing_a_job, cVarH);
            boolean zX = cVarH.x(udeVar) | cVarH.x(context);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new qj(12, udeVar, context);
                cVarH.p(objV);
            }
            gu5 gu5Var = (gu5) objV;
            boolean zX2 = cVarH.x(e8aVar) | cVarH.x(udeVar);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new a10(4, e8aVar, udeVar);
                cVarH.p(objV2);
            }
            os4.a(new ks4(x2bVarA, strI, strI2, strI3, strI5, gu5Var, strI4, (gu5) objV2, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER), true, !i6a.k(), cVarH, 48, 0);
            if (i6a.k()) {
                cVarH.L(1696207673);
                a(pldVar, null, cVarH, (i3 >> 6) & 14);
                e(udeVar, context, cVarH, 0);
            } else {
                cVarH.L(1677093569);
            }
            cVarH.U(false);
        } else {
            cVarH.D();
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new o61(e8aVar, i2, 5, pldVar);
        }
    }

    public static final void c(e8a e8aVar, pld pldVar, androidx.compose.runtime.b bVar, int i2) {
        androidx.compose.runtime.c cVarH = bVar.h(-391348726);
        int i3 = (cVarH.x(e8aVar) ? 4 : 2) | i2 | (cVarH.x(pldVar) ? 32 : 16);
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
                objV2 = new ro2(11, e13Var, e8aVar);
                cVarH.p(objV2);
            }
            gu5 gu5Var = (gu5) objV2;
            boolean zX2 = cVarH.x(pldVar);
            Object objV3 = cVarH.v();
            if (zX2 || objV3 == c0020a) {
                objV3 = new ye(pldVar, 20);
                cVarH.p(objV3);
            }
            cx4.a(new gx4(x2bVarA, strI, strI2, strI3, strI5, strI6, gu5Var, strI4, (gu5) objV3), cVarH, 0);
        } else {
            cVarH.D();
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new gh(e8aVar, i2, 9, pldVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final List<SavedJobsDto> list, final List<SavedJobsDto> list2, final pld pldVar, final e8a e8aVar, final ss8 ss8Var, androidx.compose.runtime.b bVar, final int i2) {
        int i3;
        androidx.compose.runtime.c cVar;
        Bundle bundleA;
        androidx.compose.runtime.c cVarH = bVar.h(-231245465);
        if ((i2 & 6) == 0) {
            i3 = (cVarH.x(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= cVarH.x(list2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= cVarH.x(pldVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i2 & 3072) == 0) {
            i3 |= cVarH.x(e8aVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i2 & 24576) == 0) {
            i3 |= cVarH.K(ss8Var) ? 16384 : 8192;
        }
        int i4 = i3;
        if (cVarH.o(i4 & 1, (i4 & 9363) != 9362)) {
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
            p63 p63VarQ = null;
            androidx.navigation.d dVar = jrgVarA instanceof androidx.navigation.d ? (androidx.navigation.d) jrgVarA : null;
            if (dVar != null && (bundleA = dVar.a()) != null) {
                p63VarQ = pnb.Q(bundleA, jrgVarA);
            }
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
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(Boolean.FALSE);
                cVarH.p(objV2);
            }
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
            boolean zX = cVarH.x(list2) | cVarH.x(pldVar) | cVarH.x(list) | cVarH.x(context) | cVarH.x(e13Var) | cVarH.x(e8aVar) | cVarH.x(udeVar);
            Object objV3 = cVarH.v();
            if (zX || objV3 == c0020a) {
                Function1 function1 = new Function1() { // from class: jld
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ls8 ls8Var = (ls8) obj;
                        ls8Var.getClass();
                        List list3 = list2;
                        boolean zIsEmpty = list3.isEmpty();
                        final pld pldVar2 = pldVar;
                        if (!zIsEmpty) {
                            ls8.e(ls8Var, null, new ah2(542711169, new vl4(2, list3, pldVar2), true), 3);
                        }
                        final List list4 = list;
                        int size = list4.size();
                        final Context context2 = context;
                        final e13 e13Var2 = e13Var;
                        final e8a e8aVar2 = e8aVar;
                        final ude udeVar2 = udeVar;
                        ls8.d(ls8Var, size, null, new ah2(-1453540269, new xu5() { // from class: ild
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                int iIntValue = ((Integer) obj3).intValue();
                                b bVar2 = (b) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((xo8) obj2).getClass();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= bVar2.d(iIntValue) ? 32 : 16;
                                }
                                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                    List list5 = list4;
                                    final SavedJobsDto savedJobsDto = (SavedJobsDto) list5.get(iIntValue);
                                    String jobkey = savedJobsDto.getJobkey();
                                    String title = savedJobsDto.getTitle();
                                    String description = savedJobsDto.getDescription();
                                    String location = savedJobsDto.getLocation();
                                    UserJobStatus userJobStatus = savedJobsDto.getUserJobStatus();
                                    long timestamp = userJobStatus != null ? userJobStatus.getTimestamp() : 0L;
                                    String strI = ak2.I(R.string.pretext_saved, bVar2);
                                    final Context context3 = context2;
                                    String strC = u63.C(context3, timestamp, strI);
                                    boolean zIsJobExpired = savedJobsDto.isJobExpired();
                                    String strF = u63.F(savedJobsDto);
                                    boolean hasApplicationDraft = savedJobsDto.getHasApplicationDraft();
                                    boolean zIsJobUnSave = savedJobsDto.isJobUnSave();
                                    final e13 e13Var3 = e13Var2;
                                    boolean zX2 = bVar2.x(e13Var3);
                                    final e8a e8aVar3 = e8aVar2;
                                    boolean zX3 = zX2 | bVar2.x(e8aVar3) | bVar2.x(savedJobsDto);
                                    final ude udeVar3 = udeVar2;
                                    boolean zX4 = zX3 | bVar2.x(udeVar3);
                                    Object objV4 = bVar2.v();
                                    b.a.C0020a c0020a2 = b.a.a;
                                    if (zX4 || objV4 == c0020a2) {
                                        objV4 = new gu5() { // from class: gld
                                            @Override // defpackage.gu5
                                            public final Object invoke() {
                                                u63.Y(e13Var3, null, null, new mld.b(e8aVar3, savedJobsDto, udeVar3, null), 3);
                                                return j6g.a;
                                            }
                                        };
                                        bVar2.p(objV4);
                                    }
                                    gu5 gu5Var = (gu5) objV4;
                                    boolean zX5 = bVar2.x(savedJobsDto) | bVar2.x(e13Var3) | bVar2.x(e8aVar3) | bVar2.x(udeVar3);
                                    Object objV5 = bVar2.v();
                                    if (zX5 || objV5 == c0020a2) {
                                        objV5 = new sq7(e13Var3, e8aVar3, udeVar3, savedJobsDto);
                                        bVar2.p(objV5);
                                    }
                                    gu5 gu5Var2 = (gu5) objV5;
                                    boolean zX6 = bVar2.x(e13Var3) | bVar2.x(udeVar3) | bVar2.x(savedJobsDto) | bVar2.x(context3);
                                    Object objV6 = bVar2.v();
                                    if (zX6 || objV6 == c0020a2) {
                                        objV6 = new gu5() { // from class: hld
                                            @Override // defpackage.gu5
                                            public final Object invoke() {
                                                u63.Y(e13Var3, null, null, new mld.d(udeVar3, savedJobsDto, context3, null), 3);
                                                return j6g.a;
                                            }
                                        };
                                        bVar2.p(objV6);
                                    }
                                    gu5 gu5Var3 = (gu5) objV6;
                                    pld pldVar3 = pldVar2;
                                    boolean zX7 = bVar2.x(pldVar3) | bVar2.x(savedJobsDto) | bVar2.x(e8aVar3);
                                    Object objV7 = bVar2.v();
                                    if (zX7 || objV7 == c0020a2) {
                                        objV7 = new yv2(3, pldVar3, savedJobsDto, e8aVar3);
                                        bVar2.p(objV7);
                                    }
                                    gu5 gu5Var4 = (gu5) objV7;
                                    boolean zX8 = bVar2.x(pldVar3) | bVar2.x(savedJobsDto);
                                    Object objV8 = bVar2.v();
                                    if (zX8 || objV8 == c0020a2) {
                                        objV8 = new m72(6, pldVar3, savedJobsDto);
                                        bVar2.p(objV8);
                                    }
                                    Function1 function12 = (Function1) objV8;
                                    boolean zX9 = bVar2.x(pldVar3) | bVar2.x(savedJobsDto);
                                    Object objV9 = bVar2.v();
                                    if (zX9 || objV9 == c0020a2) {
                                        objV9 = new za(15, pldVar3, savedJobsDto);
                                        bVar2.p(objV9);
                                    }
                                    gu5 gu5Var5 = (gu5) objV9;
                                    boolean zX10 = bVar2.x(pldVar3) | bVar2.x(savedJobsDto);
                                    Object objV10 = bVar2.v();
                                    if (zX10 || objV10 == c0020a2) {
                                        objV10 = new pi(9, pldVar3, savedJobsDto);
                                        bVar2.p(objV10);
                                    }
                                    b88.e(new c88(jobkey, title, description, location, strC, ox7.c, zIsJobExpired, false, gu5Var, gu5Var2, gu5Var3, null, gu5Var4, function12, strF, null, null, false, zIsJobUnSave, gu5Var5, (gu5) objV10, hasApplicationDraft, null, false, null, null, false, null, false, null, null, false, null, null, null, false, false, null, null, null, false, null, null, -3962752, 2047), bVar2, 0);
                                    if (i6a.k()) {
                                        bVar2.L(-551927566);
                                        if (list5.size() > 3 || iIntValue != list5.size() - 1) {
                                            if (list5.size() <= 3 || iIntValue != 2) {
                                                bVar2.L(-568583153);
                                            } else {
                                                bVar2.L(-551748417);
                                                mld.a(pldVar3, null, bVar2, 0);
                                            }
                                            bVar2.F();
                                        } else {
                                            bVar2.L(-551866465);
                                            mld.a(pldVar3, null, bVar2, 0);
                                            bVar2.F();
                                        }
                                    } else {
                                        bVar2.L(-568583153);
                                    }
                                    bVar2.F();
                                } else {
                                    bVar2.D();
                                }
                                return j6g.a;
                            }
                        }, true), 6);
                        ls8.e(ls8Var, null, new ah2(-549136516, new ie4(5, udeVar2, context2), true), 3);
                        return j6g.a;
                    }
                };
                cVarH.p(function1);
                objV3 = function1;
            }
            hn8.b(null, ss8Var, null, false, kVar, null, null, false, null, (Function1) objV3, cVarH, ((i4 >> 9) & 112) | 24576, 493);
            cVar = cVarH;
            cVar.U(true);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        androidx.compose.runtime.i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: kld
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mld.d(list, list2, pldVar, e8aVar, ss8Var, (b) obj, ka2.L(i2 | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void e(ude udeVar, Context context, androidx.compose.runtime.b bVar, int i2) {
        androidx.compose.runtime.c cVar;
        udeVar.getClass();
        context.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(1394352058);
        int i3 = (cVarH.x(udeVar) ? 4 : 2) | i2 | (cVarH.x(context) ? 32 : 16);
        if (cVarH.o(i3 & 1, (i3 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e.a aVar = e.a.b;
            androidx.compose.ui.e eVarF = androidx.compose.foundation.layout.g.f(aVar, 1.0f);
            ag9 ag9VarD = hl1.d(c20.a.e, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(cVarH, eVarF);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            String strI = ak2.I(R.string.not_seeing_a_job, cVarH);
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.f.j(aVar, 0.0f, 16.0f, 0.0f, 32.0f, 5);
            boolean zX = cVarH.x(udeVar) | cVarH.x(context);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                objV = new aq0(8, udeVar, context);
                cVarH.p(objV);
            }
            cif.b(strI, androidx.compose.foundation.b.d(eVarJ, false, null, null, (gu5) objV, 15), o97Var.c.b.g.g.a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.g, cVarH, 0, 0, 65528);
            cVar = cVarH;
            cVar.U(true);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        androidx.compose.runtime.i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new n91(udeVar, i2, 5, context);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0293  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(defpackage.e8a r31, defpackage.ss8 r32, androidx.compose.runtime.b r33, int r34) {
        /*
            Method dump skipped, instruction units count: 1331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mld.f(e8a, ss8, androidx.compose.runtime.b, int):void");
    }
}
