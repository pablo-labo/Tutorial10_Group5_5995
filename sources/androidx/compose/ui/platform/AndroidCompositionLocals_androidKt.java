package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.platform.AndroidComposeView;
import com.indeed.android.jobsearch.R;
import defpackage.ald;
import defpackage.bh2;
import defpackage.cia;
import defpackage.d60;
import defpackage.dld;
import defpackage.dn2;
import defpackage.f60;
import defpackage.g4a;
import defpackage.g60;
import defpackage.gu5;
import defpackage.i60;
import defpackage.i6c;
import defpackage.ikd;
import defpackage.j60;
import defpackage.j6g;
import defpackage.jb0;
import defpackage.jkd;
import defpackage.jte;
import defpackage.ka2;
import defpackage.kkd;
import defpackage.l74;
import defpackage.m74;
import defpackage.mj8;
import defpackage.mm2;
import defpackage.ne4;
import defpackage.p74;
import defpackage.q37;
import defpackage.q74;
import defpackage.r09;
import defpackage.r6;
import defpackage.r74;
import defpackage.rm2;
import defpackage.sn3;
import defpackage.t5d;
import defpackage.to4;
import defpackage.um2;
import defpackage.v09;
import defpackage.xf2;
import defpackage.xf6;
import defpackage.yf6;
import defpackage.zv8;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\" \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0005\u001a\u0004\b\b\u0010\u0003¨\u0006\r²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/runtime/h;", "Lzv8;", "getLocalLifecycleOwner", "()Landroidx/compose/runtime/h;", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "Ldld;", "getLocalSavedStateRegistryOwner", "getLocalSavedStateRegistryOwner$annotations", "LocalSavedStateRegistryOwner", "Landroid/content/res/Configuration;", "configuration", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AndroidCompositionLocals_androidKt {
    public static final ne4 a = new ne4(a.a);
    public static final jte b = new jte(b.a);
    public static final dn2 c = new dn2(e.a);
    public static final jte d = new jte(c.a);
    public static final jte e = new jte(d.a);
    public static final jte f = new jte(f.a);

    public static final class a extends mj8 implements gu5<Configuration> {
        public static final a a = new a(0);

        @Override // defpackage.gu5
        public final Configuration invoke() {
            AndroidCompositionLocals_androidKt.b("LocalConfiguration");
            throw null;
        }
    }

    public static final class b extends mj8 implements gu5<Context> {
        public static final b a = new b(0);

        @Override // defpackage.gu5
        public final Context invoke() {
            AndroidCompositionLocals_androidKt.b("LocalContext");
            throw null;
        }
    }

    public static final class c extends mj8 implements gu5<q37> {
        public static final c a = new c(0);

        @Override // defpackage.gu5
        public final q37 invoke() {
            AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
            throw null;
        }
    }

    public static final class d extends mj8 implements gu5<t5d> {
        public static final d a = new d(0);

        @Override // defpackage.gu5
        public final t5d invoke() {
            AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
            throw null;
        }
    }

    public static final class e extends mj8 implements Function1<mm2, Resources> {
        public static final e a = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final Resources invoke(mm2 mm2Var) {
            mm2 mm2Var2 = mm2Var;
            mm2Var2.c(AndroidCompositionLocals_androidKt.a);
            return ((Context) mm2Var2.c(AndroidCompositionLocals_androidKt.b)).getResources();
        }
    }

    public static final class f extends mj8 implements gu5<View> {
        public static final f a = new f(0);

        @Override // defpackage.gu5
        public final View invoke() {
            AndroidCompositionLocals_androidKt.b("LocalView");
            throw null;
        }
    }

    public static final class g extends mj8 implements Function1<Configuration, j6g> {
        final /* synthetic */ g4a<Configuration> $configuration$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(g4a<Configuration> g4aVar) {
            super(1);
            this.$configuration$delegate = g4aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Configuration configuration) {
            g4a<Configuration> g4aVar = this.$configuration$delegate;
            Configuration configuration2 = new Configuration(configuration);
            ne4 ne4Var = AndroidCompositionLocals_androidKt.a;
            g4aVar.setValue(configuration2);
            return j6g.a;
        }
    }

    public static final class h extends mj8 implements Function1<m74, l74> {
        final /* synthetic */ p74 $saveableStateRegistry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(p74 p74Var) {
            super(1);
            this.$saveableStateRegistry = p74Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final l74 invoke(m74 m74Var) {
            return new d60(this.$saveableStateRegistry);
        }
    }

    public static final class i extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ AndroidComposeView $owner;
        final /* synthetic */ jb0 $uriHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(AndroidComposeView androidComposeView, jb0 jb0Var, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2) {
            super(2);
            this.$owner = androidComposeView;
            this.$uriHandler = jb0Var;
            this.$content = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue = num.intValue();
            if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                um2.a(this.$owner, this.$uriHandler, this.$content, bVar2, 0);
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public static final class j extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ AndroidComposeView $owner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(AndroidComposeView androidComposeView, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, int i) {
            super(2);
            this.$owner = androidComposeView;
            this.$content = function2;
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            AndroidCompositionLocals_androidKt.a(this.$owner, this.$content, bVar, ka2.L(this.$$changed | 1));
            return j6g.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(AndroidComposeView androidComposeView, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, androidx.compose.runtime.b bVar, int i2) {
        boolean z;
        androidx.compose.runtime.c cVarH = bVar.h(-520299287);
        int i3 = (i2 & 6) == 0 ? (cVarH.x(androidComposeView) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= cVarH.x(function2) ? 32 : 16;
        }
        if (cVarH.o(i3 & 1, (i3 & 19) != 18)) {
            Context context = androidComposeView.getContext();
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(new Configuration(context.getResources().getConfiguration()));
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = new g(g4aVar);
                cVarH.p(objV2);
            }
            androidComposeView.setConfigurationChangeObserver((Function1) objV2);
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = new jb0(context);
                cVarH.p(objV3);
            }
            jb0 jb0Var = (jb0) objV3;
            AndroidComposeView.b viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners == null) {
                r6.g("Called when the ViewTreeOwnersAvailability is not yet in Available state");
                return;
            }
            dld dldVar = viewTreeOwners.b;
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                Object parent = androidComposeView.getParent();
                parent.getClass();
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                LinkedHashMap linkedHashMap = null;
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = ikd.class.getSimpleName() + ':' + strValueOf;
                ald savedStateRegistry = dldVar.getSavedStateRegistry();
                Bundle bundleA = savedStateRegistry.a(str);
                if (bundleA != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleA.keySet()) {
                        ArrayList parcelableArrayList = bundleA.getParcelableArrayList(str2);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str2, parcelableArrayList);
                    }
                }
                r74 r74Var = r74.b;
                jte jteVar = kkd.a;
                jkd jkdVar = new jkd(linkedHashMap, r74Var);
                try {
                    savedStateRegistry.c(str, new xf2(jkdVar, 1));
                    z = true;
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                p74 p74Var = new p74(jkdVar, new q74(z, savedStateRegistry, str));
                cVarH.p(p74Var);
                objV4 = p74Var;
            }
            p74 p74Var2 = (p74) objV4;
            j6g j6gVar = j6g.a;
            boolean zX = cVarH.x(p74Var2);
            Object objV5 = cVarH.v();
            if (zX || objV5 == c0020a) {
                objV5 = new h(p74Var2);
                cVarH.p(objV5);
            }
            to4.b(j6gVar, (Function1) objV5, cVarH);
            Object objV6 = cVarH.v();
            if (objV6 == c0020a) {
                objV6 = xf6.a(context) ? new sn3(androidComposeView.getView()) : new cia();
                cVarH.p(objV6);
            }
            yf6 yf6Var = (yf6) objV6;
            Configuration configuration = (Configuration) g4aVar.getValue();
            Object objV7 = cVarH.v();
            if (objV7 == c0020a) {
                objV7 = new q37();
                cVarH.p(objV7);
            }
            q37 q37Var = (q37) objV7;
            Object objV8 = cVarH.v();
            Object obj = objV8;
            if (objV8 == c0020a) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                cVarH.p(configuration2);
                obj = configuration2;
            }
            Configuration configuration3 = (Configuration) obj;
            Object objV9 = cVarH.v();
            if (objV9 == c0020a) {
                objV9 = new g60(configuration3, q37Var);
                cVarH.p(objV9);
            }
            g60 g60Var = (g60) objV9;
            boolean zX2 = cVarH.x(context);
            Object objV10 = cVarH.v();
            if (zX2 || objV10 == c0020a) {
                objV10 = new f60(context, g60Var);
                cVarH.p(objV10);
            }
            to4.b(q37Var, (Function1) objV10, cVarH);
            Object objV11 = cVarH.v();
            if (objV11 == c0020a) {
                objV11 = new t5d();
                cVarH.p(objV11);
            }
            t5d t5dVar = (t5d) objV11;
            Object objV12 = cVarH.v();
            if (objV12 == c0020a) {
                objV12 = new j60(t5dVar);
                cVarH.p(objV12);
            }
            j60 j60Var = (j60) objV12;
            boolean zX3 = cVarH.x(context);
            Object objV13 = cVarH.v();
            if (zX3 || objV13 == c0020a) {
                objV13 = new i60(context, j60Var);
                cVarH.p(objV13);
            }
            to4.b(t5dVar, (Function1) objV13, cVarH);
            ne4 ne4Var = um2.v;
            rm2.b(new i6c[]{a.a((Configuration) g4aVar.getValue()), b.a(context), r09.a.a(viewTreeOwners.a), v09.a.a(dldVar), kkd.a.a(p74Var2), f.a(androidComposeView.getView()), d.a(q37Var), e.a(t5dVar), ne4Var.a(Boolean.valueOf(((Boolean) cVarH.M(ne4Var)).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release())), um2.l.a(yf6Var)}, bh2.c(1059770793, new i(androidComposeView, jb0Var, function2), cVarH), cVarH, 56);
        } else {
            cVarH.D();
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new j(androidComposeView, function2, i2);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final ne4 c() {
        return a;
    }

    public static final androidx.compose.runtime.h<zv8> getLocalLifecycleOwner() {
        return r09.a;
    }

    public static final androidx.compose.runtime.h<dld> getLocalSavedStateRegistryOwner() {
        return v09.a;
    }
}
