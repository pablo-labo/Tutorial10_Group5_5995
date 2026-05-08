package defpackage;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import androidx.compose.runtime.r;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.indeed.android.rnprofile.RNProfileScreenModule;
import com.indeed.android.tare.broadcast.FormCompletionResult;
import com.indeed.android.tare.broadcast.JSTBroadcast;
import com.indeed.android.tare.broadcast.JSTBroadcastEvent;
import defpackage.grg;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcrb;", "Lm6f;", "Lxh8;", "<init>", "()V", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class crb extends m6f implements xh8 {
    public final frg V;
    public final frg W;
    public final frg X;
    public final frg Y;
    public final frg Z;
    public final Lazy a0;
    public final xj1 b = xj1.e;
    public String b0;
    public final ArrayList c;
    public final a c0;
    public final o8d d;
    public Integer d0;
    public final zcd e;
    public final g4a e0;
    public final t41 f;

    public static final class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Uri uriForDownloadedFile;
            context.getClass();
            intent.getClass();
            long longExtra = intent.getLongExtra("extra_download_id", -1L);
            crb crbVar = crb.this;
            Long l = crbVar.Q().n().k;
            if (l != null && l.longValue() == longExtra) {
                ArrayList arrayList = lz2.a;
                Log.d("ProfileFragment", "Setting up Pdf Preview", null);
                String str = crbVar.Q().n().i;
                if (str != null) {
                    LinkedHashMap linkedHashMap = e94.a;
                    if (linkedHashMap.containsKey(str)) {
                        uriForDownloadedFile = (Uri) linkedHashMap.get(str);
                    } else {
                        Context contextRequireContext = crbVar.requireContext();
                        contextRequireContext.getClass();
                        Long l2 = crbVar.Q().n().k;
                        long jLongValue = l2 != null ? l2.longValue() : -1L;
                        Object systemService = contextRequireContext.getSystemService("download");
                        systemService.getClass();
                        uriForDownloadedFile = ((DownloadManager) systemService).getUriForDownloadedFile(jLongValue);
                    }
                    if (uriForDownloadedFile != null) {
                        linkedHashMap.put(str, uriForDownloadedFile);
                        Uri uri = uriForDownloadedFile;
                        ((gme) crbVar.Q().b0).setValue(s88.a(crbVar.Q().n(), null, null, null, null, null, null, null, null, null, null, null, uri, 16383));
                        String type = crbVar.requireContext().getContentResolver().getType(uri);
                        if (wl7.b(type != null ? MimeTypeMap.getSingleton().getExtensionFromMimeType(type) : null, "pdf")) {
                            p9d p9dVarR = crbVar.R();
                            String str2 = crbVar.Q().n().a;
                            p9dVarR.j(uri, str2 != null ? str2 : "TODO");
                        } else {
                            p9d p9dVarR2 = crbVar.R();
                            String str3 = crbVar.Q().n().a;
                            p9dVarR2.h(uri, str3 != null ? str3 : "TODO");
                        }
                        Log.d("ProfileFragment", "StagedResumeFileUri: " + crbVar.R().g().a, null);
                    }
                }
            }
        }
    }

    @uh3(c = "com.indeed.android.profile.ProfileFragment$refreshProfileData$1", f = "ProfileFragment.kt", l = {1038, 1039, 1041, 1043, 1054, 1056, 1057, 1060, 1065, 1076, 1077, 1092}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        public b(lu2<? super b> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return crb.this.new b(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:169:0x0683, code lost:
        
            if (r6 == r12) goto L215;
         */
        /* JADX WARN: Code restructure failed: missing block: B:200:0x0709, code lost:
        
            if (r7 != r12) goto L202;
         */
        /* JADX WARN: Code restructure failed: missing block: B:214:0x075c, code lost:
        
            if (r2.A(r3, r73) != r12) goto L216;
         */
        /* JADX WARN: Removed duplicated region for block: B:158:0x05ef A[PHI: r1 r4 r7 r71
  0x05ef: PHI (r1v45 v26$b) = (r1v41 v26$b), (r1v48 v26$b) binds: [B:156:0x05eb, B:12:0x00c7] A[DONT_GENERATE, DONT_INLINE]
  0x05ef: PHI (r4v12 java.lang.Object) = (r4v11 java.lang.Object), (r4v17 java.lang.Object) binds: [B:156:0x05eb, B:12:0x00c7] A[DONT_GENERATE, DONT_INLINE]
  0x05ef: PHI (r7v32 java.lang.Object) = (r7v31 java.lang.Object), (r7v33 java.lang.Object) binds: [B:156:0x05eb, B:12:0x00c7] A[DONT_GENERATE, DONT_INLINE]
  0x05ef: PHI (r71v3 java.lang.Class) = (r71v1 java.lang.Class), (r71v4 java.lang.Class) binds: [B:156:0x05eb, B:12:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:161:0x0608  */
        /* JADX WARN: Removed duplicated region for block: B:165:0x063d  */
        /* JADX WARN: Removed duplicated region for block: B:168:0x0654  */
        /* JADX WARN: Removed duplicated region for block: B:178:0x0695  */
        /* JADX WARN: Removed duplicated region for block: B:186:0x06a7 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:195:0x06c4  */
        /* JADX WARN: Removed duplicated region for block: B:209:0x0719 A[PHI: r1 r4 r8
  0x0719: PHI (r1v68 int) = (r1v59 int), (r1v71 int) binds: [B:194:0x06c2, B:208:0x0716] A[DONT_GENERATE, DONT_INLINE]
  0x0719: PHI (r4v37 int) = (r4v29 int), (r4v39 int) binds: [B:194:0x06c2, B:208:0x0716] A[DONT_GENERATE, DONT_INLINE]
  0x0719: PHI (r8v34 int) = (r8v30 int), (r8v35 int) binds: [B:194:0x06c2, B:208:0x0716] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:211:0x071d  */
        /* JADX WARN: Removed duplicated region for block: B:212:0x0729  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0128  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0159 A[PHI: r1
  0x0159: PHI (r1v21 java.lang.Object) = (r1v20 java.lang.Object), (r1v39 java.lang.Object) binds: [B:30:0x0155, B:14:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x016c  */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r74) {
            /*
                Method dump skipped, instruction units count: 1920
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: crb.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class c extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(crb crbVar) {
            super(0);
            this.$this_activityViewModels = crbVar;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class d extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(crb crbVar) {
            super(0);
            this.$this_activityViewModels = crbVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class e extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(crb crbVar) {
            super(0);
            this.$this_activityViewModels = crbVar;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class f extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(crb crbVar) {
            super(0);
            this.$this_activityViewModels = crbVar;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class g extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(crb crbVar) {
            super(0);
            this.$this_activityViewModels = crbVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class h extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(crb crbVar) {
            super(0);
            this.$this_activityViewModels = crbVar;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class i extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(crb crbVar) {
            super(0);
            this.$this_activityViewModels = crbVar;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class j extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(crb crbVar) {
            super(0);
            this.$this_activityViewModels = crbVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class k extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(crb crbVar) {
            super(0);
            this.$this_activityViewModels = crbVar;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class l extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(crb crbVar) {
            super(0);
            this.$this_activityViewModels = crbVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class m extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(crb crbVar) {
            super(0);
            this.$this_activityViewModels = crbVar;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class n extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(crb crbVar) {
            super(0);
            this.$this_activityViewModels = crbVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class o extends mj8 implements gu5<ssb> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(crb crbVar) {
            super(0);
            this.$this_inject = crbVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, ssb] */
        @Override // defpackage.gu5
        public final ssb invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(ssb.class), a9cVar);
        }
    }

    public crb() {
        String[] iSOCountries = Locale.getISOCountries();
        iSOCountries.getClass();
        ArrayList arrayList = new ArrayList(iSOCountries.length);
        for (String str : iSOCountries) {
            arrayList.add(new Locale("", str));
        }
        this.c = arrayList;
        this.d = new o8d();
        this.e = new zcd();
        this.f = new t41(jz0.a());
        xh xhVar = new xh(this, 11);
        iwc iwcVar = fwc.a;
        this.V = os5.a(this, iwcVar.b(x1c.class), new i(this), new j(this), xhVar);
        this.W = os5.a(this, iwcVar.b(p9d.class), new k(this), new l(this), new oe(this, 15));
        this.X = os5.a(this, iwcVar.b(yvb.class), new m(this), new n(this), new zh(this, 19));
        this.Y = os5.a(this, iwcVar.b(aub.class), new c(this), new d(this), new e(this));
        this.Z = os5.a(this, iwcVar.b(j7d.class), new f(this), new g(this), new h(this));
        this.a0 = boa.E(qt8.a, new o(this));
        this.c0 = new a();
        this.e0 = r.f(Boolean.FALSE);
    }

    @Override // defpackage.m6f
    /* JADX INFO: renamed from: F, reason: from getter */
    public final xj1 getB() {
        return this.b;
    }

    @Override // defpackage.m6f
    public final void H(String str) {
        String fragment;
        str.getClass();
        Uri uri = Uri.parse(str);
        if (uri == null || (fragment = uri.getFragment()) == null || !wve.K(fragment, "privacy-modal", false)) {
            return;
        }
        ArrayList arrayList = lz2.a;
        Log.d("ProfileFragment", "Privacy modal deeplink detected: ".concat(str), null);
        if (!c0h.D()) {
            ((i1g) cr8.p(i1g.class)).a(t40.g(this), new bub());
            return;
        }
        RNProfileScreenModule.INSTANCE.getClass();
        synchronized (RNProfileScreenModule.instanceLock) {
            RNProfileScreenModule rNProfileScreenModule = RNProfileScreenModule.instance;
            if (rNProfileScreenModule != null) {
                rNProfileScreenModule.emitNavigateToSubscreenInternal("privacy");
                j6g j6gVar = j6g.a;
            }
        }
    }

    @Override // defpackage.m6f
    public final void I() {
    }

    @Override // defpackage.m6f
    public final void J() {
        q6.n("rich-profile-home-screen", null, null, 6, (tp7) cr8.p(tp7.class));
        ((gme) this.e0).setValue(Boolean.TRUE);
        if (c0h.D()) {
            RNProfileScreenModule.INSTANCE.getClass();
            RNProfileScreenModule.Companion.b();
        }
    }

    @Override // defpackage.m6f
    public final void K() {
        ((gme) this.e0).setValue(Boolean.FALSE);
    }

    @Override // defpackage.m6f
    public final void L(prd prdVar) {
        prdVar.getClass();
        if (((h2g) cr8.p(h2g.class)).g()) {
            gse gseVar = Q().l0;
            Boolean boolValueOf = Boolean.valueOf(prdVar == prd.a);
            gseVar.getClass();
            gseVar.m(null, boolValueOf);
        }
    }

    @Override // defpackage.m6f
    public final void M(gq6 gq6Var) {
        S();
        if (c0h.D()) {
            RNProfileScreenModule.INSTANCE.getClass();
            RNProfileScreenModule.Companion.b();
        }
    }

    @Override // defpackage.m6f
    public final void N() {
    }

    public final aub O() {
        return (aub) this.Y.getValue();
    }

    public final yvb P() {
        return (yvb) this.X.getValue();
    }

    public final x1c Q() {
        return (x1c) this.V.getValue();
    }

    public final p9d R() {
        return (p9d) this.W.getValue();
    }

    public final void S() {
        u63.Y(hh1.A(this), null, null, new b(null), 3);
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d0 = Integer.valueOf(requireActivity().getWindow().getAttributes().softInputMode);
        requireActivity().getWindow().setSoftInputMode(32);
        Context contextRequireContext = requireContext();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE");
        int i2 = Build.VERSION.SDK_INT;
        a aVar = this.c0;
        if (i2 >= 33) {
            contextRequireContext.registerReceiver(aVar, intentFilter, null, null, 2);
        } else {
            contextRequireContext.registerReceiver(aVar, intentFilter, null, null, 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6);
        composeView.setContent(new ah2(513909782, new uv(this, 9), true));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        requireContext().unregisterReceiver(this.c0);
        Integer num = this.d0;
        if (num != null) {
            requireActivity().getWindow().setSoftInputMode(num.intValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        pub.b.a().a();
        String str = this.b0;
        if (str != null) {
            ((JSTBroadcast) cr8.p(JSTBroadcast.class)).unsubscribe(str);
            this.b0 = null;
        }
        super.onDestroyView();
        Q();
        e94.a.clear();
    }

    @Override // defpackage.iw8, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (c0h.D()) {
            RNProfileScreenModule.INSTANCE.getClass();
            RNProfileScreenModule.Companion.b();
        }
    }

    @Override // defpackage.m6f, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        dqa dqaVarR;
        view.getClass();
        super.onViewCreated(view, bundle);
        pub.b.a().a();
        S();
        final int i2 = 1;
        Q().a0.e(getViewLifecycleOwner(), new drb(new Function1(this) { // from class: zqb
            public final /* synthetic */ crb b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:71:0x0159  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x015e  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r9) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 378
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.zqb.invoke(java.lang.Object):java.lang.Object");
            }
        }));
        Q().f0.e(getViewLifecycleOwner(), new drb(new ji(this, 8)));
        Q().g0.e(getViewLifecycleOwner(), new drb(new Function1(this) { // from class: arb
            public final /* synthetic */ crb b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i2;
                crb crbVar = this.b;
                switch (i3) {
                    case 0:
                        JSTBroadcastEvent.FormCompleted formCompleted = (JSTBroadcastEvent.FormCompleted) obj;
                        formCompleted.getClass();
                        ArrayList arrayList = lz2.a;
                        Log.d("ProfileFragment", "Received FormCompleted broadcast event for " + formCompleted.getFormName() + " with result " + formCompleted.getResult(), null);
                        if (formCompleted.getResult() == FormCompletionResult.COMPLETED) {
                            crbVar.S();
                        }
                        break;
                    default:
                        Pair pair = (Pair) ((jz2) obj).a();
                        if (pair != null) {
                            crbVar.R().h((Uri) pair.e(), (String) pair.d());
                        }
                        break;
                }
                return j6g.a;
            }
        }));
        Q().i0.e(getViewLifecycleOwner(), new drb(new se(this, 11)));
        final int i3 = 0;
        Q().k0.e(getViewLifecycleOwner(), new drb(new Function1(this) { // from class: zqb
            public final /* synthetic */ crb b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:71:0x0159  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x015e  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r9) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 378
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.zqb.invoke(java.lang.Object):java.lang.Object");
            }
        }));
        int i4 = 14;
        ((ssb) this.a0.getValue()).b.e(getViewLifecycleOwner(), new drb(new me(this, i4)));
        this.b0 = ((JSTBroadcast) cr8.p(JSTBroadcast.class)).subscribe(fwc.a.b(JSTBroadcastEvent.FormCompleted.class), new od2(6), new Function1(this) { // from class: arb
            public final /* synthetic */ crb b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i3;
                crb crbVar = this.b;
                switch (i32) {
                    case 0:
                        JSTBroadcastEvent.FormCompleted formCompleted = (JSTBroadcastEvent.FormCompleted) obj;
                        formCompleted.getClass();
                        ArrayList arrayList = lz2.a;
                        Log.d("ProfileFragment", "Received FormCompleted broadcast event for " + formCompleted.getFormName() + " with result " + formCompleted.getResult(), null);
                        if (formCompleted.getResult() == FormCompletionResult.COMPLETED) {
                            crbVar.S();
                        }
                        break;
                    default:
                        Pair pair = (Pair) ((jz2) obj).a();
                        if (pair != null) {
                            crbVar.R().h((Uri) pair.e(), (String) pair.d());
                        }
                        break;
                }
                return j6g.a;
            }
        });
        androidx.fragment.app.g activity = getActivity();
        if (activity != null && (dqaVarR = activity.r()) != null) {
            zv8 viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            dqaVarR.a(viewLifecycleOwner, new s77(this, i2));
        }
        Q().o0.e(getViewLifecycleOwner(), new drb(new fj(this, i4)));
    }
}
