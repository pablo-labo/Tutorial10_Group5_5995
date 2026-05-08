package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import com.wlappdebug.r;
import defpackage.eo2;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk19;", "Lwi0;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class k19 extends wi0 {
    public final Lazy q0;
    public eo2.a r0;
    public final Lazy s0;
    public final Lazy t0;
    public long u0;

    public static final class a extends mj8 implements gu5<s9e> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k19 k19Var) {
            super(0);
            this.$this_inject = k19Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, s9e] */
        @Override // defpackage.gu5
        public final s9e invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(s9e.class), a9cVar);
        }
    }

    public static final class b extends mj8 implements gu5<nm0> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k19 k19Var) {
            super(0);
            this.$this_inject = k19Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, nm0] */
        @Override // defpackage.gu5
        public final nm0 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(nm0.class), a9cVar);
        }
    }

    public static final class c extends mj8 implements gu5<r.b> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(k19 k19Var) {
            super(0);
            this.$this_inject = k19Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [com.wlappdebug.r$b, java.lang.Object] */
        @Override // defpackage.gu5
        public final r.b invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(r.b.class), a9cVar);
        }
    }

    public k19() {
        a aVar = new a(this);
        qt8 qt8Var = qt8.a;
        this.q0 = boa.E(qt8Var, aVar);
        this.s0 = boa.E(qt8Var, new b(this));
        this.t0 = boa.E(qt8Var, new c(this));
    }

    public final void A() {
        Lazy lazy = this.q0;
        long j = ((s9e) lazy.getValue()).d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.u0 > 30000) {
            this.u0 = jCurrentTimeMillis;
            s9e s9eVar = (s9e) lazy.getValue();
            w74 w74Var = s9eVar.b;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (s9eVar.d == 0 || jCurrentTimeMillis2 - s9eVar.c > 1800000) {
                s9eVar.d = jCurrentTimeMillis2;
                String string = UUID.randomUUID().toString();
                string.getClass();
                s9eVar.e = string.substring(0, 13);
                s9eVar.f = s9eVar.c;
            }
            s9eVar.c = jCurrentTimeMillis2;
            s9eVar.a.c(new r9e(s9eVar));
        }
        if (((s9e) lazy.getValue()).d != j) {
            ((nm0) this.s0.getValue()).i("pref.is_new_session", true);
        }
    }

    @Override // defpackage.wi0, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        String strM;
        context.getClass();
        bu8 bu8Var = bu8.a;
        String strE = bu8Var.e();
        String strF = bu8Var.f();
        if (strE == null) {
            Locale locale = Locale.getDefault();
            String country = locale.getCountry();
            strM = (country == null || country.length() == 0) ? locale.getLanguage() : z3.m(locale.getLanguage(), "-", locale.getCountry());
        } else {
            ck6 ck6VarB = e87.b(strE, strF);
            if (ck6VarB.a.equals(strE)) {
                strM = z3.m(strF == null ? ck6VarB.b : strF, "-", strE);
            } else {
                ArrayList arrayList = lz2.a;
                lz2.b("ConfigurationWrapper", "Trying to retrieve non-existent country by code: ".concat(strE), false, new Throwable());
                strM = "en-US";
            }
        }
        ArrayList arrayList2 = lz2.a;
        lz2.d("ConfigurationWrapper", l6.i(u40.f("Locale from pref: '", strF, "-", strE, "', effective: '"), strM, "'"), false, null);
        Locale localeForLanguageTag = Locale.forLanguageTag(strM);
        localeForLanguageTag.getClass();
        lz2.d("ConfigurationWrapper", "@@wrap: config locale will be updated to: " + localeForLanguageTag, false, null);
        Configuration configuration = context.getResources().getConfiguration();
        Locale.setDefault(localeForLanguageTag);
        configuration.setLocales(new LocaleList(localeForLanguageTag));
        super.attachBaseContext(new ContextWrapper(context.createConfigurationContext(configuration)));
    }

    @Override // androidx.fragment.app.g, androidx.activity.ComponentActivity, defpackage.dg2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.r0 = eo2.b;
    }

    @Override // androidx.fragment.app.g, android.app.Activity
    public void onResume() {
        super.onResume();
        A();
        ((r.b) this.t0.getValue()).c("debugBar.transparent");
    }

    @Override // defpackage.wi0, androidx.fragment.app.g, android.app.Activity
    public void onStart() {
        super.onStart();
        eo2.a aVar = eo2.b;
        if (this.r0 != aVar) {
            ArrayList arrayList = lz2.a;
            yd8 yd8VarB = fwc.a.b(getClass());
            eo2.a aVar2 = this.r0;
            Integer numValueOf = aVar2 != null ? Integer.valueOf(aVar2.a) : null;
            lz2.d("LocalizedActivity", "Recreating " + yd8VarB + " due to configuration change " + numValueOf + " -> " + aVar.a, false, null);
            this.r0 = aVar;
            recreate();
        }
    }

    @Override // android.app.Activity
    public final void onUserInteraction() {
        super.onUserInteraction();
        A();
    }
}
