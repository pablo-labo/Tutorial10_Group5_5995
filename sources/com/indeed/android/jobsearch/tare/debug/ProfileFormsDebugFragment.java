package com.indeed.android.jobsearch.tare.debug;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.r;
import androidx.compose.ui.platform.ComposeView;
import com.indeed.android.rnprofile.RNProfileModalNativeModule;
import defpackage.a74;
import defpackage.ah2;
import defpackage.an0;
import defpackage.c1f;
import defpackage.e13;
import defpackage.eq3;
import defpackage.g13;
import defpackage.g4a;
import defpackage.ir4;
import defpackage.j30;
import defpackage.j6g;
import defpackage.k30;
import defpackage.kpg;
import defpackage.lu2;
import defpackage.no3;
import defpackage.pj;
import defpackage.r6;
import defpackage.r7d;
import defpackage.rqb;
import defpackage.u63;
import defpackage.uh3;
import defpackage.vh8;
import defpackage.vo7;
import defpackage.wj8;
import defpackage.xh8;
import defpackage.z3;
import defpackage.zcd;
import defpackage.zi;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n²\u0006\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/indeed/android/jobsearch/tare/debug/ProfileFormsDebugFragment;", "Lan0;", "Lxh8;", "<init>", "()V", "", "Lwj8;", "languageSkills", "", "isLoading", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProfileFormsDebugFragment extends an0 implements xh8 {
    public final g4a a = r.f(Boolean.FALSE);
    public final zcd b = new zcd();

    @uh3(c = "com.indeed.android.jobsearch.tare.debug.ProfileFormsDebugFragment$onCreateView$1$mainView$1$1$1$1$1", f = "ProfileFormsDebugFragment.kt", l = {154}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ g4a<Boolean> $isLoading$delegate;
        final /* synthetic */ g4a<List<wj8>> $languageSkills$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g4a<List<wj8>> g4aVar, g4a<Boolean> g4aVar2, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$languageSkills$delegate = g4aVar;
            this.$isLoading$delegate = g4aVar2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return ProfileFormsDebugFragment.this.new a(this.$languageSkills$delegate, this.$isLoading$delegate, lu2Var);
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
                ProfileFormsDebugFragment profileFormsDebugFragment = ProfileFormsDebugFragment.this;
                this.label = 1;
                profileFormsDebugFragment.getClass();
                eq3 eq3Var = a74.a;
                obj = u63.q0(no3.c, new rqb(profileFormsDebugFragment, null), this);
                g13 g13Var = g13.a;
                if (obj == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            this.$languageSkills$delegate.setValue((List) obj);
            this.$isLoading$delegate.setValue(Boolean.FALSE);
            return j6g.a;
        }
    }

    public final void E(String str, String str2, String str3, Map<String, ? extends Object> map, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = UUID.randomUUID().toString();
        string.getClass();
        linkedHashMap.put("profileFormCallbackId", string);
        linkedHashMap.put("sectionType", str);
        linkedHashMap.put("mode", str2);
        if (z) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            com.indeed.android.uiplugin.oneoff.a.a.a(new vo7(string, new zi(4, this, contextRequireContext)));
        }
        if (str3 != null) {
            linkedHashMap.put("itemId", str3);
        }
        if (map != null) {
            linkedHashMap.put("formData", map);
        }
        String strM = z3.m(str, ".", str2);
        RNProfileModalNativeModule.INSTANCE.getClass();
        RNProfileModalNativeModule rNProfileModalNativeModule = RNProfileModalNativeModule.instance;
        if (rNProfileModalNativeModule != null) {
            rNProfileModalNativeModule.showProfileFormModalInternal(strM, linkedHashMap);
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        FrameLayout frameLayout = new FrameLayout(requireContext());
        Context context = frameLayout.getContext();
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        kpg.a aVar = kpg.a.a;
        composeView.setViewCompositionStrategy(aVar);
        composeView.setContent(new ah2(770583296, new pj(this, 10), true));
        frameLayout.addView(composeView);
        Context context2 = frameLayout.getContext();
        context2.getClass();
        ComposeView composeView2 = new ComposeView(context2, null, 6);
        composeView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        composeView2.setVisibility(8);
        composeView2.setViewCompositionStrategy(aVar);
        composeView2.setContent(new ah2(336180165, new ir4(4, composeView2, this), true));
        frameLayout.addView(composeView2);
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        RNProfileModalNativeModule.INSTANCE.getClass();
        RNProfileModalNativeModule.onShowModalCallback = null;
        RNProfileModalNativeModule.onHideModalCallback = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        RNProfileModalNativeModule.Companion companion = RNProfileModalNativeModule.INSTANCE;
        j30 j30Var = new j30(this, 15);
        companion.getClass();
        RNProfileModalNativeModule.onShowModalCallback = j30Var;
        RNProfileModalNativeModule.onHideModalCallback = new k30(this, 17);
    }
}
