package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import com.indeed.android.myjobs.data.model.dto.BrandedAdsDto;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.b5a;
import defpackage.c20;
import defpackage.fr0;
import defpackage.gl2;
import defpackage.jq7;
import defpackage.nq7;
import defpackage.o97;
import defpackage.pm8;
import defpackage.qq7;
import defpackage.ude;
import java.util.Comparator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class qq0 {

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabKt$AppliedTab$1$1", f = "AppliedTab.kt", l = {IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ androidx.fragment.app.g $activity;
        final /* synthetic */ fr0 $appliedTabViewModel;
        final /* synthetic */ iba $navController;
        int label;

        /* JADX INFO: renamed from: qq0$a$a, reason: collision with other inner class name */
        public static final class C0396a<T> implements wi5 {
            public final /* synthetic */ androidx.fragment.app.g a;
            public final /* synthetic */ iba b;
            public final /* synthetic */ fr0 c;

            public C0396a(androidx.fragment.app.g gVar, iba ibaVar, fr0 fr0Var) {
                this.a = gVar;
                this.b = ibaVar;
                this.c = fr0Var;
            }

            @Override // defpackage.wi5
            public final Object a(Object obj, lu2 lu2Var) {
                fr0.c cVar = (fr0.c) obj;
                boolean z = cVar instanceof fr0.c.b;
                androidx.fragment.app.g gVar = this.a;
                if (z) {
                    if (gVar != null) {
                        rq7 rq7Var = (rq7) cr8.p(rq7.class);
                        lr5 lr5VarU = gVar.u();
                        lr5VarU.getClass();
                        fr0.c.b bVar = (fr0.c.b) cVar;
                        rq7Var.f(lr5VarU, this.b, new jq7.h(bVar.a), bVar.b);
                    }
                } else {
                    if (!(cVar instanceof fr0.c.a)) {
                        l.g();
                        return null;
                    }
                    if (gVar != null) {
                        rq7 rq7Var2 = (rq7) cr8.p(rq7.class);
                        lr5 lr5VarU2 = gVar.u();
                        lr5VarU2.getClass();
                        rq7Var2.c(lr5VarU2, new nq7.b(new qq7.b(((fr0.c.a) cVar).a), new q3(this.c, 1)), "myjobs-applied");
                    }
                }
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fr0 fr0Var, androidx.fragment.app.g gVar, iba ibaVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$appliedTabViewModel = fr0Var;
            this.$activity = gVar;
            this.$navController = ibaVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$appliedTabViewModel, this.$activity, this.$navController, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) throws Throwable {
            ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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
            fr0 fr0Var = this.$appliedTabViewModel;
            pqc pqcVar = fr0Var.o0;
            C0396a c0396a = new C0396a(this.$activity, this.$navController, fr0Var);
            this.label = 1;
            pqcVar.a.e(c0396a, this);
            return g13.a;
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabKt$AppliedTab$2$1", f = "AppliedTab.kt", l = {}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ fr0 $appliedTabViewModel;
        final /* synthetic */ e8a $myJobsViewModel;
        final /* synthetic */ e13 $scope;
        final /* synthetic */ old $viewState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fr0 fr0Var, e8a e8aVar, e13 e13Var, old oldVar, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$appliedTabViewModel = fr0Var;
            this.$myJobsViewModel = e8aVar;
            this.$scope = e13Var;
            this.$viewState = oldVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$appliedTabViewModel, this.$myJobsViewModel, this.$scope, this.$viewState, lu2Var);
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
            if (this.$appliedTabViewModel.i0 && ((gme) this.$myJobsViewModel.V).getValue() == j7f.c) {
                this.$myJobsViewModel.i("Applied", this.$scope);
                e8a e8aVar = this.$myJobsViewModel;
                e13 e13Var = this.$scope;
                old oldVar = this.$viewState;
                e8aVar.h("Applied", e13Var, oldVar.a, oldVar.g);
            }
            return j6g.a;
        }
    }

    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            long jO;
            SavedJobsDto savedJobsDto = (SavedJobsDto) t2;
            long jO2 = 0;
            if (i6a.f()) {
                Long l = h4.j(savedJobsDto).b;
                jO = l != null ? l.longValue() : 0L;
            } else {
                jO = u63.O(savedJobsDto);
            }
            Long lValueOf = Long.valueOf(jO);
            SavedJobsDto savedJobsDto2 = (SavedJobsDto) t;
            if (i6a.f()) {
                Long l2 = h4.j(savedJobsDto2).b;
                if (l2 != null) {
                    jO2 = l2.longValue();
                }
            } else {
                jO2 = u63.O(savedJobsDto2);
            }
            return ak2.i(lValueOf, Long.valueOf(jO2));
        }
    }

    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ak2.i(Long.valueOf(((SavedJobsDto) t2).getTimeStamp()), Long.valueOf(((SavedJobsDto) t).getTimeStamp()));
        }
    }

    public static final class e implements l74 {
        public final /* synthetic */ fr0 a;
        public final /* synthetic */ zv8 b;
        public final /* synthetic */ mq0 c;

        public e(fr0 fr0Var, zv8 zv8Var, mq0 mq0Var) {
            this.a = fr0Var;
            this.b = zv8Var;
            this.c = mq0Var;
        }

        @Override // defpackage.l74
        public final void dispose() {
            this.a.r(fr0.b.p.a);
            this.b.getLifecycle().c(this.c);
        }
    }

    public static final /* synthetic */ class f extends fa implements gu5<j6g> {
        final /* synthetic */ fr0 $appliedTabViewModel;
        final /* synthetic */ g4a<Boolean> $refreshing$delegate;
        final /* synthetic */ e13 $scope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e13 e13Var, fr0 fr0Var, g4a<Boolean> g4aVar) {
            super("AppliedTab$refresh(Lkotlinx/coroutines/CoroutineScope;Lcom/indeed/android/myjobs/presentation/tabs/AppliedTabViewModel;Landroidx/compose/runtime/MutableState;)Lkotlinx/coroutines/Job;");
            this.$scope = e13Var;
            this.$appliedTabViewModel = fr0Var;
            this.$refreshing$delegate = g4aVar;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            u63.Y(this.$scope, null, null, new rq0(this.$appliedTabViewModel, this.$refreshing$delegate, null), 3);
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabKt$DisplayErrorState$errorStateConfig$1$1$1", f = "AppliedTab.kt", l = {}, m = "invokeSuspend")
    public static final class g extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ e8a $myJobsViewModel;
        final /* synthetic */ ude $sharedViewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e8a e8aVar, ude udeVar, lu2<? super g> lu2Var) {
            super(2, lu2Var);
            this.$myJobsViewModel = e8aVar;
            this.$sharedViewModel = udeVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new g(this.$myJobsViewModel, this.$sharedViewModel, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((g) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            this.$myJobsViewModel.a0.k(new b5a.d(n7g.a(ie7.c0, "app-tracker-applied-emptytabmodalcta")));
            this.$sharedViewModel.m(new ude.c.s("Applied"));
            return j6g.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0575 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x028b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.e8a r30, final defpackage.kjg r31, final defpackage.ss8 r32, androidx.compose.runtime.b r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 1525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qq0.a(e8a, kjg, ss8, androidx.compose.runtime.b, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(fr0 fr0Var, androidx.compose.ui.e eVar, androidx.compose.runtime.b bVar, int i) {
        int i2;
        androidx.compose.ui.e eVar2;
        Float f2;
        fr0Var.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(-685376397);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (cVarH.x(fr0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        int i5 = 1;
        if (cVarH.o(i4 & 1, (i4 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            BrandedAdsDto brandedAdsDto = ((old) r.a(fr0Var.c, cVarH).getValue()).j;
            eVar2 = e.a.b;
            if (brandedAdsDto == null) {
                cVarH.L(226553935);
            } else {
                cVarH.L(226553936);
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
                boolean zX = cVarH.x(fr0Var) | cVarH.x(s9Var);
                Object objV = cVarH.v();
                b.a.C0020a c0020a = b.a.a;
                if (zX || objV == c0020a) {
                    objV = new qj(i3, fr0Var, s9Var);
                    cVarH.p(objV);
                }
                gu5 gu5Var = (gu5) objV;
                boolean zX2 = cVarH.x(fr0Var);
                Object objV2 = cVarH.v();
                if (zX2 || objV2 == c0020a) {
                    objV2 = new j30(fr0Var, i5);
                    cVarH.p(objV2);
                }
                gu5 gu5Var2 = (gu5) objV2;
                boolean zX3 = cVarH.x(fr0Var);
                Object objV3 = cVarH.v();
                if (zX3 || objV3 == c0020a) {
                    objV3 = new oa(fr0Var, 3);
                    cVarH.p(objV3);
                }
                gu5 gu5Var3 = (gu5) objV3;
                boolean zX4 = cVarH.x(fr0Var);
                Object objV4 = cVarH.v();
                if (zX4 || objV4 == c0020a) {
                    objV4 = new hp0(fr0Var, 0);
                    cVarH.p(objV4);
                }
                aa.a(s9Var, eVarI, gu5Var, gu5Var2, gu5Var3, (Function1) objV4, cVarH, 0);
            }
            cVarH.U(false);
        } else {
            cVarH.D();
            eVar2 = eVar;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ip0(fr0Var, eVar2, i);
        }
    }

    public static final void c(final e8a e8aVar, final boolean z, final fr0 fr0Var, androidx.compose.runtime.b bVar, final int i) {
        Bundle bundleA;
        androidx.compose.runtime.c cVarH = bVar.h(1390094637);
        int i2 = (cVarH.x(e8aVar) ? 4 : 2) | i | (cVarH.x(fr0Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        int i3 = 0;
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
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
            x2b x2bVarA = z2b.a(R.drawable.appliedemptystate, 0, cVarH);
            String strI = ak2.I(R.string.empty_screen_icon, cVarH);
            String strI2 = ak2.I(R.string.applied_tab_empty_screen_title, cVarH);
            String strI3 = ak2.I(R.string.applied_tab_empty_screen_sub_title, cVarH);
            String strI4 = ak2.I(R.string.applied_tab_find_job_btn_text, cVarH);
            String strI5 = ak2.I(R.string.not_seeing_an_application, cVarH);
            boolean zX = cVarH.x(udeVar) | cVarH.x(context);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new gq0(i3, udeVar, context);
                cVarH.p(objV);
            }
            gu5 gu5Var = (gu5) objV;
            boolean zX2 = cVarH.x(e8aVar);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new a1(e8aVar, 3);
                cVarH.p(objV2);
            }
            os4.a(new ks4(x2bVarA, strI, strI2, strI3, strI5, gu5Var, strI4, (gu5) objV2, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER), z, true ^ i6a.k(), cVarH, 48, 0);
            if (i6a.k()) {
                cVarH.L(236561122);
                b(fr0Var, null, cVarH, (i2 >> 6) & 14);
                h(udeVar, context, cVarH, 0);
            } else {
                cVarH.L(205621045);
            }
            cVarH.U(false);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, fr0Var, i) { // from class: hq0
                public final /* synthetic */ boolean b;
                public final /* synthetic */ fr0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(49);
                    qq0.c(this.a, this.b, this.c, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void d(e8a e8aVar, fr0 fr0Var, androidx.compose.runtime.b bVar, int i) {
        Bundle bundleA;
        androidx.compose.runtime.c cVarH = bVar.h(-1152833674);
        int i2 = (cVarH.x(e8aVar) ? 4 : 2) | i | (cVarH.x(fr0Var) ? 32 : 16);
        int i3 = 1;
        int i4 = 0;
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
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
            ude udeVar = (ude) brgVarA;
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
            boolean zX = cVarH.x(e13Var) | cVarH.x(e8aVar) | cVarH.x(udeVar);
            Object objV2 = cVarH.v();
            if (zX || objV2 == c0020a) {
                objV2 = new eq0(i4, e13Var, e8aVar, udeVar);
                cVarH.p(objV2);
            }
            gu5 gu5Var = (gu5) objV2;
            boolean zX2 = cVarH.x(fr0Var);
            Object objV3 = cVarH.v();
            if (zX2 || objV3 == c0020a) {
                objV3 = new dd(fr0Var, i3);
                cVarH.p(objV3);
            }
            cx4.a(new gx4(x2bVarA, strI, strI2, strI3, strI5, strI6, gu5Var, strI4, (gu5) objV3), cVarH, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new fq0(e8aVar, i, i4, fr0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(java.util.List r24, final defpackage.e8a r25, final java.util.List r26, final defpackage.fr0 r27, final defpackage.kjg r28, defpackage.ss8 r29, androidx.compose.runtime.b r30, int r31) {
        /*
            Method dump skipped, instruction units count: 1108
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qq0.e(java.util.List, e8a, java.util.List, fr0, kjg, ss8, androidx.compose.runtime.b, int):void");
    }

    public static final void f(String str, androidx.compose.runtime.b bVar, int i) {
        androidx.compose.runtime.c cVar;
        androidx.compose.runtime.c cVarH = bVar.h(2110506333);
        int i2 = i | (cVarH.K(str) ? 4 : 2);
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            tjf tjfVar = hz6.h;
            long j = eu6.m;
            o97.g gVar = o97Var.i;
            cVar = cVarH;
            cif.b(str, androidx.compose.foundation.layout.f.e(e.a.b, androidx.compose.foundation.layout.f.b(16.0f, 16.0f, 16.0f, 0.0f, 8)), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar, cVar, i2 & 14, 0, 65528);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new kp0(str, i, 0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0379, code lost:
    
        if (r0.equals("CONTACTING") == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x037d, code lost:
    
        r12 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0386, code lost:
    
        if (r0.equals("REVIEWED") == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03b9, code lost:
    
        if (r0.equals("APPLIED") != false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03c3, code lost:
    
        if (r0.equals("MAYBE_APPLIED") == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03f6, code lost:
    
        if (r0.equals("VIEWED") == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0409, code lost:
    
        r0 = r4.getString(com.indeed.android.jobsearch.R.string.status_updated);
        r0.getClass();
        r39 = new defpackage.ggg(true, com.indeed.android.jobsearch.R.string.any_updates_since_you_applied, com.indeed.android.jobsearch.R.string.i_m_interviewing, new ude.a.b(r12, r70, r0), 984);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:161:0x036e. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0465 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0637  */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [int] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(final com.indeed.android.myjobs.data.model.dto.SavedJobsDto r70, android.content.Context r71, final defpackage.e13 r72, final defpackage.ude r73, final defpackage.e8a r74, final defpackage.fr0 r75, int r76, boolean r77, final defpackage.kjg r78, androidx.compose.runtime.b r79, final int r80) throws java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instruction units count: 1706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qq0.g(com.indeed.android.myjobs.data.model.dto.SavedJobsDto, android.content.Context, e13, ude, e8a, fr0, int, boolean, kjg, androidx.compose.runtime.b, int):void");
    }

    public static final void h(ude udeVar, Context context, androidx.compose.runtime.b bVar, int i) {
        androidx.compose.runtime.c cVar;
        udeVar.getClass();
        context.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(-1052541297);
        int i2 = (cVarH.x(udeVar) ? 4 : 2) | i | (cVarH.x(context) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
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
            String strI = ak2.I(R.string.not_seeing_an_application, cVarH);
            o97.g gVar = o97Var.i;
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.f.j(aVar, 0.0f, 16.0f, 0.0f, 32.0f, 5);
            boolean zX = cVarH.x(udeVar) | cVarH.x(context);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                objV = new ry(1, udeVar, context);
                cVarH.p(objV);
            }
            cif.b(strI, androidx.compose.foundation.b.d(eVarJ, false, null, null, (gu5) objV, 15), o97Var.c.b.g.g.a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.g, cVarH, 0, 0, 65528);
            cVar = cVarH;
            cVar.U(true);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new xb(udeVar, context, i);
        }
    }

    public static final boolean i(SavedJobsDto savedJobsDto) {
        savedJobsDto.getClass();
        return i6a.n() && savedJobsDto.isJobExpired() && !wl7.b(u63.E(savedJobsDto).a, "HIRED") && !wl7.b(u63.E(savedJobsDto).a, "REJECTED");
    }
}
