package defpackage;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import defpackage.sp7;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lgr2;", "Ll1g;", "Lxh8;", "<init>", "()V", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class gr2 extends l1g implements xh8 {
    public Function2<? super ps7, ? super fs7, j6g> a;
    public fs7 b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d;
    public final t41 e;
    public final frg f;

    @uh3(c = "com.indeed.android.profile.ContactInfoFragment$onViewCreated$1", f = "ContactInfoFragment.kt", l = {103}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return gr2.this.new a(lu2Var);
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
                x1c x1cVar = (x1c) gr2.this.f.getValue();
                this.label = 1;
                Object objL = x1cVar.l(this);
                g13 g13Var = g13.a;
                if (objL == g13Var) {
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

    public static final class b extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gr2 gr2Var) {
            super(0);
            this.$this_activityViewModels = gr2Var;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class c extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(gr2 gr2Var) {
            super(0);
            this.$this_activityViewModels = gr2Var;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public gr2() {
        String[] iSOCountries = Locale.getISOCountries();
        iSOCountries.getClass();
        ArrayList arrayList = new ArrayList(iSOCountries.length);
        for (String str : iSOCountries) {
            arrayList.add(new Locale("", str));
        }
        this.d = arrayList;
        this.e = new t41(jz0.a());
        this.f = os5.a(this, fwc.a.b(x1c.class), new b(this), new c(this), new as0(4));
    }

    public final void F(View view, int i) {
        if (i > 0) {
            View view2 = getView();
            if (!view.equals(view2 != null ? view2.getParent() : null)) {
                LinkedHashMap linkedHashMap = this.c;
                if (!linkedHashMap.containsKey(view)) {
                    linkedHashMap.put(view, new Pair(Boolean.valueOf(view.isFocusable()), Boolean.valueOf(view.isFocusableInTouchMode())));
                }
                view.setFocusable(false);
                view.setFocusableInTouchMode(false);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (!wl7.b(childAt, getView())) {
                    childAt.getClass();
                    F(childAt, i + 1);
                }
            }
        }
    }

    public final void G(View view) {
        Pair pair = (Pair) this.c.get(view);
        if (pair != null) {
            boolean zBooleanValue = ((Boolean) pair.a()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) pair.b()).booleanValue();
            view.setFocusable(zBooleanValue);
            view.setFocusableInTouchMode(zBooleanValue2);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.getClass();
                G(childAt);
            }
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ((tp7) cr8.p(tp7.class)).b(new sp7.f(6, "rich-profile-contact-info-screen", null, null));
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6);
        composeView.setFocusable(true);
        composeView.setFocusableInTouchMode(true);
        composeView.setContent(new ah2(-718722612, new fr2(this, 0), true));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        fs7 fs7Var = this.b;
        ps7 ps7Var = fs7Var != null ? ps7.a : ps7.d;
        Function2<? super ps7, ? super fs7, j6g> function2 = this.a;
        if (function2 != null) {
            function2.invoke(ps7Var, fs7Var);
        }
        this.a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        g activity = getActivity();
        if (activity != null && (viewGroup2 = (ViewGroup) activity.findViewById(R.id.content)) != null) {
            G(viewGroup2);
        }
        this.c.clear();
        g activity2 = getActivity();
        if (activity2 != null && (viewGroup = (ViewGroup) activity2.findViewById(R.id.content)) != null) {
            viewGroup.post(new m50(viewGroup, 1));
        }
        super.onDestroyView();
    }

    @Override // defpackage.l1g, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup viewGroup;
        view.getClass();
        super.onViewCreated(view, bundle);
        if (((x1c) this.f.getValue()).m().a == null) {
            u63.Y(hh1.A(this), null, null, new a(null), 3);
        }
        g activity = getActivity();
        if (activity != null && (viewGroup = (ViewGroup) activity.findViewById(R.id.content)) != null) {
            F(viewGroup, 0);
        }
        view.post(new qx0(view, 1));
    }

    @Override // defpackage.l1g
    public final boolean tryHandleBackNavigation() {
        return false;
    }
}
