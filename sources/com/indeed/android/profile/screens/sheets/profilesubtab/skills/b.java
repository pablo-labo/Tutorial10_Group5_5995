package com.indeed.android.profile.screens.sheets.profilesubtab.skills;

import android.os.Bundle;
import androidx.compose.runtime.b;
import androidx.fragment.app.Fragment;
import defpackage.awd;
import defpackage.b52;
import defpackage.b5g;
import defpackage.boa;
import defpackage.bwb;
import defpackage.c0h;
import defpackage.c1f;
import defpackage.cd;
import defpackage.e13;
import defpackage.ee3;
import defpackage.f51;
import defpackage.fk0;
import defpackage.frg;
import defpackage.fwc;
import defpackage.g51;
import defpackage.gg8;
import defpackage.gme;
import defpackage.grg;
import defpackage.gu5;
import defpackage.hg;
import defpackage.hg6;
import defpackage.hw9;
import defpackage.i8e;
import defpackage.irg;
import defpackage.iwc;
import defpackage.iy3;
import defpackage.j6g;
import defpackage.jrg;
import defpackage.jsb;
import defpackage.jz0;
import defpackage.lu2;
import defpackage.ma;
import defpackage.mj8;
import defpackage.n30;
import defpackage.na0;
import defpackage.oa;
import defpackage.os5;
import defpackage.p63;
import defpackage.pe0;
import defpackage.ps7;
import defpackage.qa9;
import defpackage.qs7;
import defpackage.qt8;
import defpackage.r6;
import defpackage.r7d;
import defpackage.s5;
import defpackage.s98;
import defpackage.svb;
import defpackage.t41;
import defpackage.t92;
import defpackage.to4;
import defpackage.tv;
import defpackage.u63;
import defpackage.uh3;
import defpackage.um2;
import defpackage.v1;
import defpackage.vv;
import defpackage.w0g;
import defpackage.xu5;
import defpackage.yh;
import defpackage.yvb;
import defpackage.zcd;
import defpackage.zf8;
import defpackage.zh;
import defpackage.zie;
import defpackage.zr4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/indeed/android/profile/screens/sheets/profilesubtab/skills/b;", "Lw0g;", "<init>", "()V", "a", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b extends w0g {
    public final zcd g0 = new zcd();
    public final t41 h0 = new t41(jz0.a());
    public final frg i0;
    public final frg j0;
    public boolean k0;
    public Function2<? super ps7, ? super List<qs7>, j6g> l0;

    public static final class a {
        public static b a(List list, boolean z, boolean z2, boolean z3, String str, int i) {
            if ((i & 1) != 0) {
                list = null;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            if ((i & 8) != 0) {
                z3 = false;
            }
            if ((i & 16) != 0) {
                str = null;
            }
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putBoolean("KEY_START_ON_ADD_FLOW", z);
            bundle.putBoolean("KEY_IS_BUILD_SUGGESTION", z2);
            bundle.putBoolean("IS_SKILL_SET", z3);
            bundle.putString("SKILL_SET_ID", str);
            if (list != null && !list.isEmpty()) {
                s98.a aVar = s98.d;
                gg8 gg8Var = gg8.c;
                zf8 zf8VarE = fwc.e(List.class, gg8.a.a(fwc.d(qs7.class)));
                zf8VarE.getClass();
                bundle.putString("KEY_SKILLS_LIST", aVar.b(awd.k(i8e.a, zf8VarE), list));
            }
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.profile.screens.sheets.profilesubtab.skills.b$b, reason: collision with other inner class name */
    @uh3(c = "com.indeed.android.profile.screens.sheets.profilesubtab.skills.ManageSkillsFlowBottomSheet$CustomModalContents$1$1", f = "ManageSkillsFlowBottomSheet.kt", l = {}, m = "invokeSuspend")
    public static final class C0178b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public C0178b(lu2<? super C0178b> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return b.this.new C0178b(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((C0178b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            b bVar = b.this;
            if (!bVar.k0) {
                yvb yvbVarQ = bVar.Q();
                u63.Y(ee3.p(yvbVarQ), null, null, new bwb(yvbVarQ, null), 3);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.screens.sheets.profilesubtab.skills.ManageSkillsFlowBottomSheet$CustomModalContents$2$1", f = "ManageSkillsFlowBottomSheet.kt", l = {}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ List<String> $existingSkillNames;
        final /* synthetic */ boolean $showSuggestedSkillsAlert;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, b bVar, List<String> list, lu2<? super c> lu2Var) {
            super(2, lu2Var);
            this.$showSuggestedSkillsAlert = z;
            this.this$0 = bVar;
            this.$existingSkillNames = list;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new c(this.$showSuggestedSkillsAlert, this.this$0, this.$existingSkillNames, lu2Var);
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
            if (this.$showSuggestedSkillsAlert) {
                b bVar = this.this$0;
                if (!bVar.k0) {
                    ((f51) bVar.j0.getValue()).o(this.$existingSkillNames);
                }
            }
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b bVar) {
            super(0);
            this.$this_activityViewModels = bVar;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class e extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b bVar) {
            super(0);
            this.$this_activityViewModels = bVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class f extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(b bVar) {
            super(0);
            this.$this_viewModels = bVar;
        }

        @Override // defpackage.gu5
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    public static final class g extends mj8 implements gu5<jrg> {
        final /* synthetic */ gu5 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.$ownerProducer = fVar;
        }

        @Override // defpackage.gu5
        public final jrg invoke() {
            return (jrg) this.$ownerProducer.invoke();
        }
    }

    public static final class h extends mj8 implements gu5<irg> {
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return ((jrg) this.$owner$delegate.getValue()).getViewModelStore();
        }
    }

    public static final class i extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            if (gu5Var != null && (p63Var = (p63) gu5Var.invoke()) != null) {
                return p63Var;
            }
            jrg jrgVar = (jrg) this.$owner$delegate.getValue();
            hg6 hg6Var = jrgVar instanceof hg6 ? (hg6) jrgVar : null;
            return hg6Var != null ? hg6Var.getDefaultViewModelCreationExtras() : p63.a.b;
        }
    }

    public static final class j extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(b bVar, Lazy lazy) {
            super(0);
            this.$this_viewModels = bVar;
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            grg.c defaultViewModelProviderFactory;
            jrg jrgVar = (jrg) this.$owner$delegate.getValue();
            hg6 hg6Var = jrgVar instanceof hg6 ? (hg6) jrgVar : null;
            if (hg6Var != null && (defaultViewModelProviderFactory = hg6Var.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            grg.c defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            defaultViewModelProviderFactory2.getClass();
            return defaultViewModelProviderFactory2;
        }
    }

    public b() {
        n30 n30Var = new n30(this, 7);
        iwc iwcVar = fwc.a;
        this.i0 = os5.a(this, iwcVar.b(yvb.class), new d(this), new e(this), n30Var);
        Lazy lazyE = boa.E(qt8.c, new g(new f(this)));
        this.j0 = os5.a(this, iwcVar.b(f51.class), new h(lazyE), new i(lazyE), new j(this, lazyE));
    }

    @Override // defpackage.w0g
    public final void M(int i2, androidx.compose.runtime.b bVar) {
        int i3;
        androidx.compose.runtime.c cVar;
        gu5 gu5Var;
        Function1 function1;
        Function1 function12;
        androidx.compose.runtime.c cVarH = bVar.h(1538871943);
        int i4 = (cVarH.x(this) ? 4 : 2) | i2;
        if (cVarH.o(i4 & 1, (i4 & 3) != 2)) {
            boolean z = Q().v().X;
            boolean zK = cVarH.K(Q().v().Q);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            Object obj = objV;
            if (zK || objV == c0020a) {
                List<zie> list = Q().v().Q;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    String str = ((zie) it.next()).b;
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                cVarH.p(arrayList);
                obj = arrayList;
            }
            List list2 = (List) obj;
            j6g j6gVar = j6g.a;
            boolean zX = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX || objV2 == c0020a) {
                objV2 = new C0178b(null);
                cVarH.p(objV2);
            }
            to4.d(cVarH, j6gVar, (Function2) objV2);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zA = cVarH.a(z) | cVarH.x(this) | cVarH.x(list2);
            Object objV3 = cVarH.v();
            if (zA || objV3 == c0020a) {
                objV3 = new c(z, this, list2, null);
                cVarH.p(objV3);
            }
            to4.d(cVarH, boolValueOf, (Function2) objV3);
            List list3 = (List) ((gme) ((f51) this.j0.getValue()).m0).getValue();
            ArrayList arrayList2 = new ArrayList(t92.r0(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((g51) it2.next()).c);
            }
            boolean z2 = this.k0;
            List<zie> list4 = z2 ? Q().v().R : Q().v().Q;
            b5g b5gVarW = Q().w();
            hw9 hw9Var = new hw9((iy3) cVarH.M(um2.h));
            Bundle bundleRequireArguments = requireArguments();
            boolean z3 = (bundleRequireArguments == null || !bundleRequireArguments.containsKey("KEY_START_ON_ADD_FLOW")) ? false : bundleRequireArguments.getBoolean("KEY_START_ON_ADD_FLOW");
            yvb yvbVarQ = Q();
            boolean zE = c0h.E();
            boolean z4 = Q().v().V;
            String str2 = Q().v().W;
            boolean zH = c0h.H();
            boolean z5 = z && !this.k0;
            boolean zX2 = cVarH.x(this);
            Object objV4 = cVarH.v();
            if (zX2 || objV4 == c0020a) {
                objV4 = new cd(this, 9);
                cVarH.p(objV4);
            }
            Function1 function13 = (Function1) objV4;
            boolean zX3 = cVarH.x(this);
            Object objV5 = cVarH.v();
            if (zX3 || objV5 == c0020a) {
                objV5 = new xu5() { // from class: da9
                    @Override // defpackage.xu5
                    public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String str3 = (String) obj2;
                        zie zieVar = (zie) obj3;
                        gu5 gu5Var2 = (gu5) obj5;
                        str3.getClass();
                        zieVar.getClass();
                        gu5Var2.getClass();
                        com.indeed.android.profile.screens.sheets.profilesubtab.skills.b bVar2 = this.a;
                        bVar2.Q().r(bVar2.k0, str3, zieVar, (zie) obj4, new xa(5, gu5Var2));
                        return j6g.a;
                    }
                };
                cVarH.p(objV5);
            }
            xu5 xu5Var = (xu5) objV5;
            boolean zX4 = cVarH.x(this);
            Object objV6 = cVarH.v();
            if (zX4 || objV6 == c0020a) {
                objV6 = new yh(this, 10);
                cVarH.p(objV6);
            }
            Function1 function14 = (Function1) objV6;
            boolean zX5 = cVarH.x(this);
            Object objV7 = cVarH.v();
            int i5 = 14;
            if (zX5 || objV7 == c0020a) {
                objV7 = new zh(this, i5);
                cVarH.p(objV7);
            }
            gu5 gu5Var2 = (gu5) objV7;
            boolean zX6 = cVarH.x(this);
            Object objV8 = cVarH.v();
            if (zX6 || objV8 == c0020a) {
                gu5Var = gu5Var2;
                objV8 = new s5(this, 8);
                cVarH.p(objV8);
            } else {
                gu5Var = gu5Var2;
            }
            Function2 function2 = (Function2) objV8;
            boolean zX7 = cVarH.x(this);
            Object objV9 = cVarH.v();
            int i6 = 15;
            if (zX7 || objV9 == c0020a) {
                objV9 = new tv(this, i6);
                cVarH.p(objV9);
            }
            Function1 function15 = (Function1) objV9;
            boolean zX8 = cVarH.x(this);
            Object objV10 = cVarH.v();
            if (zX8 || objV10 == c0020a) {
                function1 = function15;
                objV10 = new hg(this, 4);
                cVarH.p(objV10);
            } else {
                function1 = function15;
            }
            Function1 function16 = (Function1) objV10;
            boolean zX9 = cVarH.x(this);
            Object objV11 = cVarH.v();
            if (zX9 || objV11 == c0020a) {
                function12 = function16;
                objV11 = new ma(this, 9);
                cVarH.p(objV11);
            } else {
                function12 = function16;
            }
            Function1 function17 = (Function1) objV11;
            boolean zX10 = cVarH.x(this);
            Object objV12 = cVarH.v();
            if (zX10 || objV12 == c0020a) {
                objV12 = new vv(this, 10);
                cVarH.p(objV12);
            }
            gu5 gu5Var3 = (gu5) objV12;
            boolean zX11 = cVarH.x(this);
            Object objV13 = cVarH.v();
            if (zX11 || objV13 == c0020a) {
                objV13 = new oa(this, 15);
                cVarH.p(objV13);
            }
            gu5 gu5Var4 = (gu5) objV13;
            boolean zX12 = cVarH.x(this);
            Object objV14 = cVarH.v();
            if (zX12 || objV14 == c0020a) {
                objV14 = new pe0(this, 7);
                cVarH.p(objV14);
            }
            Function1 function18 = (Function1) objV14;
            boolean zX13 = cVarH.x(this);
            Object objV15 = cVarH.v();
            if (zX13 || objV15 == c0020a) {
                objV15 = new fk0(this, 12);
                cVarH.p(objV15);
            }
            gu5 gu5Var5 = (gu5) objV15;
            boolean zX14 = cVarH.x(this);
            Object objV16 = cVarH.v();
            if (zX14 || objV16 == c0020a) {
                objV16 = new na0(this, 14);
                cVarH.p(objV16);
            }
            androidx.compose.runtime.c cVar2 = cVarH;
            i3 = 4;
            qa9.a(z2, list4, function13, this.h0, xu5Var, function14, gu5Var, function2, function1, function12, b5gVarW, hw9Var, z3, zH, yvbVarQ, zE, z4, str2, function17, gu5Var3, gu5Var4, function18, arrayList2, z5, gu5Var5, (Function1) objV16, cVar2, 0);
            cVar = cVar2;
        } else {
            androidx.compose.runtime.c cVar3 = cVarH;
            i3 = 4;
            cVar3.D();
            cVar = cVar3;
        }
        androidx.compose.runtime.i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new b52(this, i2, i3);
        }
    }

    @Override // defpackage.w0g
    public final void O() {
        yvb yvbVarQ = Q();
        ((gme) yvbVarQ.d).setValue(svb.a(yvbVarQ.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, zr4.a, null, null, null, false, null, false, null, false, null, null, null, -1, 8386559));
        Function2<? super ps7, ? super List<qs7>, j6g> function2 = this.l0;
        if (function2 != null) {
            function2.invoke(ps7.d, null);
        }
        this.l0 = null;
    }

    public final yvb Q() {
        return (yvb) this.i0.getValue();
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        List list;
        String string;
        super.onCreate(bundle);
        ((gme) Q().e).setValue(b5g.a);
        Bundle arguments = getArguments();
        if (bundle == null) {
            boolean z = false;
            this.k0 = (arguments == null || !arguments.containsKey("KEY_IS_BUILD_SUGGESTION")) ? false : arguments.getBoolean("KEY_IS_BUILD_SUGGESTION");
            String string2 = null;
            if (arguments == null || !arguments.containsKey("KEY_SKILLS_LIST") || (string = arguments.getString("KEY_SKILLS_LIST")) == null) {
                list = null;
            } else {
                s98.a aVar = s98.d;
                v1 v1Var = aVar.b;
                gg8 gg8Var = gg8.c;
                list = (List) aVar.c(awd.k(v1Var, fwc.e(List.class, gg8.a.a(fwc.d(qs7.class)))), string);
            }
            if (this.k0 && list != null) {
                yvb yvbVarQ = Q();
                List list2 = list;
                ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(jsb.n((qs7) it.next(), null));
                }
                ((gme) yvbVarQ.d).setValue(svb.a(yvbVarQ.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, arrayList, null, null, null, false, null, false, null, false, null, null, null, -1, 8386559));
            }
            if (arguments != null && arguments.containsKey("IS_SKILL_SET")) {
                z = arguments.getBoolean("IS_SKILL_SET");
            }
            boolean z2 = z;
            if (arguments != null && arguments.containsKey("SKILL_SET_ID")) {
                string2 = arguments.getString("SKILL_SET_ID");
            }
            yvb yvbVarQ2 = Q();
            ((gme) yvbVarQ2.d).setValue(svb.a(yvbVarQ2.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, z2, string2, false, null, false, null, null, null, -1, 8290303));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (getActivity() != null) {
            ((gme) Q().e).setValue(b5g.a);
        }
        this.l0 = null;
    }
}
