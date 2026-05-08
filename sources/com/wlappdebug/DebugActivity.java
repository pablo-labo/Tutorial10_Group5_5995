package com.wlappdebug;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jobsearch.R;
import com.wlappdebug.DebugActivity;
import com.wlappdebug.r;
import defpackage.a9c;
import defpackage.boa;
import defpackage.dh3;
import defpackage.ela;
import defpackage.f72;
import defpackage.fh3;
import defpackage.fwc;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.k2;
import defpackage.kc9;
import defpackage.mj8;
import defpackage.o0d;
import defpackage.oc9;
import defpackage.pf5;
import defpackage.pnb;
import defpackage.qpg;
import defpackage.qt8;
import defpackage.r6;
import defpackage.th3;
import defpackage.u63;
import defpackage.wd3;
import defpackage.wi0;
import defpackage.y7;
import defpackage.ybf;
import defpackage.yob;
import defpackage.z92;
import defpackage.zr4;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/wlappdebug/DebugActivity;", "Lwi0;", "<init>", "()V", "a", "b", "c", "d", "e", "wlappdebug_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class DebugActivity extends wi0 {
    public static final /* synthetic */ int D0 = 0;
    public final c A0;
    public final c B0;
    public final c C0;
    public final Lazy q0;
    public final Lazy r0;
    public final Lazy s0;
    public final zr4 t0;
    public final zr4 u0;
    public final LinkedHashMap v0;
    public final c w0;
    public final c x0;
    public final c y0;
    public final c z0;

    public static final class a {
    }

    public static final class b<T> {
    }

    public static final class c {
        public final int a;
        public final String b;
        public final gu5<CharSequence> c;
        public final CharSequence d;
        public final gu5<j6g> e;
        public final Function1<Context, View> f;
        public final boolean g;

        public c() {
            throw null;
        }

        public c(int i, String str, gu5 gu5Var, gu5 gu5Var2, Function1 function1, int i2) {
            String str2 = (i2 & 8) != 0 ? null : "Edit";
            gu5Var2 = (i2 & 16) != 0 ? com.wlappdebug.a.a : gu5Var2;
            boolean z = (i2 & 64) == 0;
            gu5Var.getClass();
            gu5Var2.getClass();
            this.a = i;
            this.b = str;
            this.c = gu5Var;
            this.d = str2;
            this.e = gu5Var2;
            this.f = function1;
            this.g = z;
        }
    }

    public static final class d extends RecyclerView.b0 {
        public final View u;
        public final TextView v;
        public final TextView w;
        public final Button x;
        public final FrameLayout y;

        public d(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.debugSectionExpander);
            viewFindViewById.getClass();
            this.u = viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.debugSectionTitleText);
            viewFindViewById2.getClass();
            this.v = (TextView) viewFindViewById2;
            this.w = (TextView) view.findViewById(R.id.debugSectionSummaryText);
            View viewFindViewById3 = view.findViewById(R.id.debugSectionCtaButton);
            viewFindViewById3.getClass();
            this.x = (Button) viewFindViewById3;
            this.y = (FrameLayout) view.findViewById(R.id.debugSectionContainer);
        }
    }

    public static final class e extends RecyclerView.e<d> {
        public final ArrayList d;
        public final Set<c> e;

        public e(ArrayList arrayList) {
            this.d = arrayList;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((c) obj).g) {
                    arrayList2.add(obj);
                }
            }
            this.e = z92.D1(arrayList2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int c() {
            return this.d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int e(int i) {
            return this.e.contains((c) this.d.get(i)) ? 2 : 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final void g(RecyclerView.b0 b0Var, int i) {
            final d dVar = (d) b0Var;
            FrameLayout frameLayout = dVar.y;
            Button button = dVar.x;
            c cVar = (c) this.d.get(i);
            View view = dVar.a;
            int i2 = cVar.a;
            CharSequence charSequence = cVar.d;
            view.setId(i2);
            dVar.u.setOnClickListener(new View.OnClickListener() { // from class: ch3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    RecyclerView recyclerView;
                    RecyclerView.e<? extends RecyclerView.b0> adapter;
                    int iJ;
                    DebugActivity.e eVar = this;
                    Set<DebugActivity.c> set = eVar.e;
                    DebugActivity.d dVar2 = dVar;
                    int i3 = -1;
                    if (dVar2.s != null && (recyclerView = dVar2.r) != null && (adapter = recyclerView.getAdapter()) != null && (iJ = dVar2.r.J(dVar2)) != -1 && dVar2.s == adapter) {
                        i3 = iJ;
                    }
                    if (i3 >= 0) {
                        DebugActivity.c cVar2 = (DebugActivity.c) eVar.d.get(i3);
                        if (set.contains(cVar2)) {
                            set.remove(cVar2);
                        } else {
                            set.add(cVar2);
                        }
                        eVar.a.c(i3);
                    }
                }
            });
            dVar.v.setText(cVar.b);
            TextView textView = dVar.w;
            if (textView != null) {
                textView.setText(cVar.c.invoke());
            }
            if (charSequence == null) {
                button.setVisibility(8);
            } else {
                button.setVisibility(0);
                button.setText(charSequence);
                button.setOnClickListener(new dh3(cVar, 0));
            }
            if (frameLayout != null) {
                frameLayout.removeAllViews();
                Function1<Context, View> function1 = cVar.f;
                Context context = frameLayout.getContext();
                context.getClass();
                View viewInvoke = function1.invoke(context);
                if (viewInvoke != null) {
                    frameLayout.addView(viewInvoke);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final RecyclerView.b0 h(ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            if (i == 1) {
                View viewInflate = layoutInflaterFrom.inflate(R.layout.item_debug_section_collapsed, viewGroup, false);
                viewInflate.getClass();
                return new d(viewInflate);
            }
            if (i != 2) {
                throw new ela("An operation is not implemented: should not happen");
            }
            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.item_debug_section_expanded, viewGroup, false);
            viewInflate2.getClass();
            return new d(viewInflate2);
        }
    }

    public static final class f extends mj8 implements gu5<CharSequence> {
        public f() {
            super(0);
        }

        @Override // defpackage.gu5
        public final CharSequence invoke() {
            return DebugActivity.A(DebugActivity.this).d();
        }
    }

    public static final class g extends mj8 implements Function1<Context, View> {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final View invoke(Context context) {
            Context context2 = context;
            context2.getClass();
            DebugActivity debugActivity = DebugActivity.this;
            return DebugActivity.C(debugActivity, context2, new com.wlappdebug.e(debugActivity));
        }
    }

    public static final class h extends mj8 implements gu5<CharSequence> {
        public static final h a = new h(0);

        @Override // defpackage.gu5
        public final CharSequence invoke() {
            return Build.VERSION.RELEASE + ' ' + Build.MANUFACTURER + ' ' + Build.MODEL;
        }
    }

    public static final class i extends mj8 implements Function1<Context, View> {
        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final View invoke(Context context) {
            Context context2 = context;
            context2.getClass();
            return DebugActivity.C(DebugActivity.this, context2, new com.wlappdebug.i(context2));
        }
    }

    public static final class j extends mj8 implements gu5<CharSequence> {
        public j() {
            super(0);
        }

        @Override // defpackage.gu5
        public final CharSequence invoke() {
            List listA = com.wlappdebug.r.a();
            StringBuilder sb = new StringBuilder();
            List list = listA;
            DebugActivity debugActivity = DebugActivity.this;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((r.b) debugActivity.s0.getValue()).a((r.a) it.next());
                }
            }
            sb.append("0 of ");
            sb.append(listA.size());
            sb.append(" set");
            return sb.toString();
        }
    }

    public static final class k extends mj8 implements gu5<j6g> {
        public k() {
            super(0);
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            DebugActivity.this.startActivity(new Intent(DebugActivity.this, (Class<?>) DebugFlagsActivity.class));
            return j6g.a;
        }
    }

    public static final class l extends mj8 implements Function1<Context, View> {
        public l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final View invoke(Context context) {
            Context context2 = context;
            context2.getClass();
            DebugActivity debugActivity = DebugActivity.this;
            return DebugActivity.C(debugActivity, context2, new com.wlappdebug.k(debugActivity));
        }
    }

    public static final class m extends mj8 implements gu5<CharSequence> {
        public m() {
            super(0);
        }

        @Override // defpackage.gu5
        public final CharSequence invoke() {
            String strD;
            long jLastModified = new File(DebugActivity.this.getFilesDir(), "debug_last_exception_dump.txt").lastModified();
            if (jLastModified == 0) {
                return "No crash dumped";
            }
            long jCurrentTimeMillis = (System.currentTimeMillis() - jLastModified) / 1000;
            StringBuilder sb = new StringBuilder();
            sb.append(new Date(jLastModified).toString());
            sb.append(", ");
            if (jCurrentTimeMillis < 60) {
                strD = jCurrentTimeMillis + "s ago";
            } else if (jCurrentTimeMillis < 3600) {
                strD = r6.d(jCurrentTimeMillis / 60, "m ago", new StringBuilder());
            } else if (jCurrentTimeMillis < 86400) {
                strD = r6.d(jCurrentTimeMillis / 3600, "h ago", new StringBuilder());
            } else {
                strD = r6.d(jCurrentTimeMillis / 86400, "d ago", new StringBuilder());
            }
            sb.append(strD);
            return sb.toString();
        }
    }

    public static final class n extends mj8 implements Function1<Context, View> {
        public n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final View invoke(Context context) {
            Context context2 = context;
            context2.getClass();
            DebugActivity debugActivity = DebugActivity.this;
            return DebugActivity.C(debugActivity, context2, new com.wlappdebug.l(debugActivity));
        }
    }

    public static final class o extends mj8 implements gu5<CharSequence> {
        public o() {
            super(0);
        }

        @Override // defpackage.gu5
        public final CharSequence invoke() {
            return DebugActivity.A(DebugActivity.this).c().getAll().size() + " item(s)";
        }
    }

    public static final class p extends mj8 implements Function1<Context, View> {
        public p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final View invoke(Context context) {
            Context context2 = context;
            context2.getClass();
            DebugActivity debugActivity = DebugActivity.this;
            return DebugActivity.C(debugActivity, context2, new com.wlappdebug.o(debugActivity));
        }
    }

    public static final class q extends mj8 implements gu5<CharSequence> {
        public q() {
            super(0);
        }

        @Override // defpackage.gu5
        public final CharSequence invoke() {
            List<ybf> listD = DebugActivity.B(DebugActivity.this).a().d();
            StringBuilder sb = new StringBuilder();
            List<ybf> list = listD;
            DebugActivity debugActivity = DebugActivity.this;
            int i = 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (DebugActivity.B(debugActivity).c(((ybf) it.next()).getName()) != null && (i = i + 1) < 0) {
                        u63.n0();
                        throw null;
                    }
                }
            }
            sb.append(i);
            sb.append(" of ");
            sb.append(listD.size());
            sb.append(" overridden");
            return sb.toString();
        }
    }

    public static final class r extends mj8 implements gu5<j6g> {
        public r() {
            super(0);
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            DebugActivity.this.startActivity(new Intent(DebugActivity.this, (Class<?>) DebugProctorActivity.class));
            return j6g.a;
        }
    }

    public static final class s extends mj8 implements Function1<Context, View> {
        public s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final View invoke(Context context) {
            Context context2 = context;
            context2.getClass();
            DebugActivity debugActivity = DebugActivity.this;
            return DebugActivity.C(debugActivity, context2, new com.wlappdebug.p(debugActivity));
        }
    }

    public static final class t extends mj8 implements gu5<CharSequence> {
        public static final t a = new t(0);

        @Override // defpackage.gu5
        public final CharSequence invoke() {
            try {
                return ((o0d) pf5.c().b(o0d.class)).a().a().size() + " item(s)";
            } catch (IllegalStateException unused) {
                return "Firebase not initialized";
            }
        }
    }

    public static final class u extends mj8 implements Function1<Context, View> {
        public u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final View invoke(Context context) {
            Context context2 = context;
            context2.getClass();
            return DebugActivity.C(DebugActivity.this, context2, com.wlappdebug.q.a);
        }
    }

    public static final class v extends mj8 implements gu5<th3> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(DebugActivity debugActivity) {
            super(0);
            this.$this_inject = debugActivity;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, th3] */
        @Override // defpackage.gu5
        public final th3 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(th3.class), a9cVar);
        }
    }

    public static final class w extends mj8 implements gu5<yob<k2>> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(DebugActivity debugActivity) {
            super(0);
            this.$this_inject = debugActivity;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, yob<k2>] */
        @Override // defpackage.gu5
        public final yob<k2> invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(yob.class), a9cVar);
        }
    }

    public static final class x extends mj8 implements gu5<r.b> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(DebugActivity debugActivity) {
            super(0);
            this.$this_inject = debugActivity;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [com.wlappdebug.r$b, java.lang.Object] */
        @Override // defpackage.gu5
        public final r.b invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(r.b.class), a9cVar);
        }
    }

    public DebugActivity() {
        v vVar = new v(this);
        qt8 qt8Var = qt8.a;
        this.q0 = boa.E(qt8Var, vVar);
        this.r0 = boa.E(qt8Var, new w(this));
        this.s0 = boa.E(qt8Var, new x(this));
        zr4 zr4Var = zr4.a;
        this.t0 = zr4Var;
        this.u0 = zr4Var;
        this.v0 = new LinkedHashMap();
        this.w0 = new c(R.id.debugSectionAppInfo, "App", new f(), null, new g(), 88);
        this.x0 = new c(R.id.debugSectionDevice, "Device", h.a, null, new i(), 88);
        this.y0 = new c(R.id.debugSectionPrefs, "Preferences", new o(), null, new p(), 88);
        this.z0 = new c(R.id.debugSectionRemoteConfig, "Remote Config", t.a, null, new u(), 88);
        this.A0 = new c(R.id.debugSectionLastCrash, "Last Crash", new m(), null, new n(), 88);
        this.B0 = new c(R.id.debugSectionFlags, "Debug Flags", new j(), new k(), new l(), 64);
        this.C0 = new c(R.id.debugSectionProctor, "App Proctor", new q(), new r(), new s(), 64);
    }

    public static final th3 A(DebugActivity debugActivity) {
        return (th3) debugActivity.q0.getValue();
    }

    public static final yob B(DebugActivity debugActivity) {
        return (yob) debugActivity.r0.getValue();
    }

    public static final TextView C(DebugActivity debugActivity, Context context, Function1 function1) {
        debugActivity.getClass();
        TextView textView = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        function1.invoke(spannableStringBuilder);
        textView.setText(new SpannedString(spannableStringBuilder));
        textView.setTextIsSelectable(true);
        return textView;
    }

    @Override // androidx.fragment.app.g, androidx.activity.ComponentActivity, defpackage.dg2, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        int i2 = y7.F0;
        androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = wd3.a;
        y7 y7Var = (y7) qpg.W(layoutInflater, R.layout.activity_debug, null);
        y7Var.getClass();
        y7Var.e0(new oc9(Build.VERSION.SDK_INT >= 35 ? 50 : 0));
        setContentView(y7Var.r0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "Debug Screen");
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(0.6f);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) " (wlappdebug 1.11.1)");
        spannableStringBuilder.setSpan(relativeSizeSpan, length, spannableStringBuilder.length(), 17);
        setTitle(new SpannedString(spannableStringBuilder));
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.debugSectionsRecyclerView);
        List listA0 = u63.a0(this.w0, this.x0, this.y0, this.z0, this.A0, this.B0, this.C0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.t0.getClass();
        TreeMap treeMapX = kc9.X(linkedHashMap, new fh3());
        ArrayList arrayList = new ArrayList(treeMapX.size());
        for (Map.Entry entry : treeMapX.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (str == null) {
                str = "Actions";
            }
            arrayList.add(new c(R.id.debugSectionActions, str, new com.wlappdebug.b(list), null, new com.wlappdebug.d(list, this), 24));
        }
        ArrayList arrayListH1 = z92.h1(listA0, arrayList);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.u0.getClass();
        TreeMap treeMapX2 = kc9.X(linkedHashMap2, new f72(1));
        ArrayList arrayList2 = new ArrayList(treeMapX2.size());
        for (Map.Entry entry2 : treeMapX2.entrySet()) {
            String str2 = (String) entry2.getKey();
            List list2 = (List) entry2.getValue();
            if (str2 == null) {
                str2 = "Metrics";
            }
            arrayList2.add(new c(R.id.debugSectionMetrics, str2, new com.wlappdebug.m(list2), null, new com.wlappdebug.n(list2, this), 24));
        }
        recyclerView.setAdapter(new e(z92.h1(arrayListH1, arrayList2)));
        if (Build.VERSION.SDK_INT >= 35) {
            recyclerView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: bh3
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    int i3 = DebugActivity.D0;
                    view.getClass();
                    windowInsets.getClass();
                    return vzg.a(view, recyclerView, windowInsets);
                }
            });
        }
    }

    @Override // defpackage.wi0, androidx.fragment.app.g, android.app.Activity
    public final void onStart() {
        super.onStart();
        RecyclerView.e adapter = ((RecyclerView) findViewById(R.id.debugSectionsRecyclerView)).getAdapter();
        if (adapter != null) {
            adapter.a.b();
        }
    }
}
