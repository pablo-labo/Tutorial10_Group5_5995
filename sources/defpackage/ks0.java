package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.indeed.android.jobsearch.R;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.b5a;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ks0 {

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.ArchivedTabKt$ArchivedTab$1$1", f = "ArchivedTab.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ rs0 $archivedTabViewModel;
        final /* synthetic */ e8a $myJobsViewModel;
        final /* synthetic */ e13 $scope;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rs0 rs0Var, e8a e8aVar, e13 e13Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$archivedTabViewModel = rs0Var;
            this.$myJobsViewModel = e8aVar;
            this.$scope = e13Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$archivedTabViewModel, this.$myJobsViewModel, this.$scope, lu2Var);
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
            if (this.$archivedTabViewModel.X && ((gme) this.$myJobsViewModel.V).getValue() == j7f.e) {
                this.$myJobsViewModel.i("Archived", this.$scope);
            }
            return j6g.a;
        }
    }

    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ak2.i(Long.valueOf(((SavedJobsDto) t2).getTimeStamp()), Long.valueOf(((SavedJobsDto) t).getTimeStamp()));
        }
    }

    public static final /* synthetic */ class c extends fa implements gu5<j6g> {
        final /* synthetic */ rs0 $archivedTabViewModel;
        final /* synthetic */ g4a<Boolean> $refreshing$delegate;
        final /* synthetic */ e13 $scope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e13 e13Var, rs0 rs0Var, g4a<Boolean> g4aVar) {
            super("ArchivedTab$refresh(Lkotlinx/coroutines/CoroutineScope;Lcom/indeed/android/myjobs/presentation/tabs/ArchivedTabViewModel;Landroidx/compose/runtime/MutableState;)Lkotlinx/coroutines/Job;");
            this.$scope = e13Var;
            this.$archivedTabViewModel = rs0Var;
            this.$refreshing$delegate = g4aVar;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            u63.Y(this.$scope, null, null, new ls0(this.$archivedTabViewModel, this.$refreshing$delegate, null), 3);
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.ArchivedTabKt$DisplayErrorState$errorStateConfig$1$1$1", f = "ArchivedTab.kt", l = {}, m = "invokeSuspend")
    public static final class d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ e8a $myJobsViewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e8a e8aVar, lu2<? super d> lu2Var) {
            super(2, lu2Var);
            this.$myJobsViewModel = e8aVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new d(this.$myJobsViewModel, lu2Var);
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
            this.$myJobsViewModel.a0.k(new b5a.d(n7g.a(ie7.c0, "app-tracker-archived-emptytabmodalcta")));
            return j6g.a;
        }
    }

    public static final class e implements gu5<j6g> {
        public final /* synthetic */ e13 a;

        public e(e13 e13Var) {
            this.a = e13Var;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            u63.Y(this.a, null, null, new ms0(2, null), 3);
            return j6g.a;
        }
    }

    public static final class f implements gu5<j6g> {
        public final /* synthetic */ e13 a;
        public final /* synthetic */ e8a b;
        public final /* synthetic */ SavedJobsDto c;
        public final /* synthetic */ ude d;

        public f(e13 e13Var, e8a e8aVar, ude udeVar, SavedJobsDto savedJobsDto) {
            this.a = e13Var;
            this.b = e8aVar;
            this.c = savedJobsDto;
            this.d = udeVar;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            u63.Y(this.a, null, null, new ns0(this.b, this.c, this.d, null), 3);
            return j6g.a;
        }
    }

    public static final class g implements gu5<j6g> {
        public final /* synthetic */ e13 a;
        public final /* synthetic */ ude b;
        public final /* synthetic */ SavedJobsDto c;
        public final /* synthetic */ Context d;

        public g(e13 e13Var, ude udeVar, SavedJobsDto savedJobsDto, Context context) {
            this.a = e13Var;
            this.b = udeVar;
            this.c = savedJobsDto;
            this.d = context;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            u63.Y(this.a, null, null, new os0(this.b, this.c, this.d, null), 3);
            return j6g.a;
        }
    }

    public static final class h implements Function1<String, j6g> {
        public static final h a = new h();

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(String str) {
            str.getClass();
            return j6g.a;
        }
    }

    public static final class i implements Function1<Integer, Object> {
        public final /* synthetic */ List a;

        public i(List list) {
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.a.get(num.intValue());
            return null;
        }
    }

    public static final class j implements xu5<xo8, Integer, androidx.compose.runtime.b, Integer, j6g> {
        public final /* synthetic */ List a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ e13 c;
        public final /* synthetic */ e8a d;
        public final /* synthetic */ ude e;

        public j(List list, Context context, e13 e13Var, e8a e8aVar, ude udeVar) {
            this.a = list;
            this.b = context;
            this.c = e13Var;
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
                SavedJobsDto savedJobsDto = (SavedJobsDto) this.a.get(iIntValue);
                bVar2.L(-829154252);
                String jobkey = savedJobsDto.getJobkey();
                String title = savedJobsDto.getTitle();
                String description = savedJobsDto.getDescription();
                String location = savedJobsDto.getLocation();
                String strD = u63.D(this.b, savedJobsDto.getTimeStamp(), ak2.I(R.string.pretext_applied, bVar2), savedJobsDto.getPartnerName(), savedJobsDto.getCandidateStatus());
                boolean withdrawn = savedJobsDto.getWithdrawn();
                String strF = u63.F(savedJobsDto);
                Context context = this.b;
                String strG = u63.G(context, savedJobsDto);
                e13 e13Var = this.c;
                boolean zX = bVar2.x(e13Var);
                Object objV = bVar2.v();
                b.a.C0020a c0020a = b.a.a;
                if (zX || objV == c0020a) {
                    objV = new e(e13Var);
                    bVar2.p(objV);
                }
                gu5 gu5Var = (gu5) objV;
                boolean zX2 = bVar2.x(e13Var);
                e8a e8aVar = this.d;
                boolean zX3 = zX2 | bVar2.x(e8aVar) | bVar2.x(savedJobsDto);
                ude udeVar = this.e;
                boolean zX4 = zX3 | bVar2.x(udeVar);
                Object objV2 = bVar2.v();
                if (zX4 || objV2 == c0020a) {
                    objV2 = new f(e13Var, e8aVar, udeVar, savedJobsDto);
                    bVar2.p(objV2);
                }
                gu5 gu5Var2 = (gu5) objV2;
                boolean zX5 = bVar2.x(e13Var) | bVar2.x(udeVar) | bVar2.x(savedJobsDto) | bVar2.x(context);
                Object objV3 = bVar2.v();
                if (zX5 || objV3 == c0020a) {
                    objV3 = new g(e13Var, udeVar, savedJobsDto, context);
                    bVar2.p(objV3);
                }
                gu5 gu5Var3 = (gu5) objV3;
                Object objV4 = bVar2.v();
                if (objV4 == c0020a) {
                    objV4 = h.a;
                    bVar2.p(objV4);
                }
                b88.e(new c88(jobkey, title, description, location, strD, ox7.b, false, withdrawn, gu5Var, gu5Var2, gu5Var3, null, null, (Function1) objV4, strF, null, null, false, false, null, null, false, strG, false, null, null, false, null, false, null, null, false, null, null, null, false, false, null, null, null, false, null, null, -4220928, 2047), bVar2, 0);
                bVar2.F();
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public static final /* synthetic */ class k extends fa implements gu5<j6g> {
        final /* synthetic */ rs0 $archivedTabViewModel;
        final /* synthetic */ g4a<Boolean> $refreshing$delegate;
        final /* synthetic */ e13 $scope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(e13 e13Var, rs0 rs0Var, g4a<Boolean> g4aVar) {
            super("DisplayJobList$refresh$13(Lkotlinx/coroutines/CoroutineScope;Lcom/indeed/android/myjobs/presentation/tabs/ArchivedTabViewModel;Landroidx/compose/runtime/MutableState;)Lkotlinx/coroutines/Job;");
            this.$scope = e13Var;
            this.$archivedTabViewModel = rs0Var;
            this.$refreshing$delegate = g4aVar;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            u63.Y(this.$scope, null, null, new ps0(this.$archivedTabViewModel, this.$refreshing$delegate, null), 3);
            return j6g.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.e8a r21, defpackage.ss8 r22, androidx.compose.runtime.b r23, int r24) {
        /*
            Method dump skipped, instruction units count: 655
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks0.a(e8a, ss8, androidx.compose.runtime.b, int):void");
    }

    public static final void b(e8a e8aVar, androidx.compose.runtime.b bVar, int i2) {
        Bundle bundleA;
        androidx.compose.runtime.c cVarH = bVar.h(-1543516846);
        int i3 = i2 & 1;
        if (cVarH.o(i3, i3 != 0)) {
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
            Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            x2b x2bVarA = z2b.a(R.drawable.archivedemptystate, 0, cVarH);
            String strI = ak2.I(R.string.empty_screen_icon, cVarH);
            String strI2 = ak2.I(R.string.archived_tab_empty_screen_title, cVarH);
            String strI3 = ak2.I(R.string.archived_tab_empty_screen_sub_title, cVarH);
            String string = context.getString(R.string.not_seeing_an_archived_application);
            boolean zX = cVarH.x(udeVar) | cVarH.x(context);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                objV = new x9(4, udeVar, context);
                cVarH.p(objV);
            }
            os4.a(new ks4(x2bVarA, strI, strI2, strI3, string, (gu5) objV, (String) null, (gu5) null, 384), false, false, cVarH, 0, 6);
        } else {
            cVarH.D();
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new js0(e8aVar, i2);
        }
    }

    public static final void c(e8a e8aVar, rs0 rs0Var, androidx.compose.runtime.b bVar, int i2) {
        Bundle bundleA;
        androidx.compose.runtime.c cVarH = bVar.h(-651335490);
        int i3 = (cVarH.x(e8aVar) ? 4 : 2) | i2 | (cVarH.x(rs0Var) ? 32 : 16);
        int i4 = 1;
        if (cVarH.o(i3 & 1, (i3 & 19) != 18)) {
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
                objV2 = new a10(i4, e13Var, e8aVar);
                cVarH.p(objV2);
            }
            gu5 gu5Var = (gu5) objV2;
            boolean zX2 = cVarH.x(rs0Var);
            Object objV3 = cVarH.v();
            if (zX2 || objV3 == c0020a) {
                objV3 = new k30(rs0Var, 1);
                cVarH.p(objV3);
            }
            cx4.a(new gx4(x2bVarA, strI, strI2, strI3, strI5, strI6, gu5Var, strI4, (gu5) objV3), cVarH, 0);
        } else {
            cVarH.D();
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new td(e8aVar, rs0Var, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final java.util.List<com.indeed.android.myjobs.data.model.dto.SavedJobsDto> r23, defpackage.rs0 r24, final defpackage.e8a r25, defpackage.ss8 r26, androidx.compose.runtime.b r27, int r28) {
        /*
            Method dump skipped, instruction units count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks0.d(java.util.List, rs0, e8a, ss8, androidx.compose.runtime.b, int):void");
    }
}
