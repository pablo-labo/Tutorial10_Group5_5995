package defpackage;

import android.content.Context;
import defpackage.m15;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class cd3 extends ftf {
    public Provider<etf> V;
    public Provider<Executor> a;
    public ig7 b;
    public Provider c;
    public cpd d;
    public Provider<String> e;
    public Provider<fid> f;

    public static final class a {
        public Context a;

        public final cd3 a() {
            Context context = this.a;
            if (context == null) {
                throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
            }
            cd3 cd3Var = new cd3();
            cd3Var.a = t84.a(m15.a.a);
            ig7 ig7Var = new ig7(context);
            cd3Var.b = ig7Var;
            cd3Var.c = t84.a(new ls9(ig7Var, new o63(ig7Var)));
            ig7 ig7Var2 = cd3Var.b;
            cd3Var.d = new cpd(ig7Var2);
            Provider<String> providerA = t84.a(new s05(ig7Var2));
            cd3Var.e = providerA;
            Provider<fid> providerA2 = t84.a(new hid(cd3Var.d, providerA));
            cd3Var.f = providerA2;
            jod jodVar = new jod();
            ig7 ig7Var3 = cd3Var.b;
            kod kodVar = new kod(ig7Var3, providerA2, jodVar);
            Provider<Executor> provider = cd3Var.a;
            Provider provider2 = cd3Var.c;
            cd3Var.V = t84.a(new gtf(new gq3(provider, provider2, kodVar, providerA2, providerA2), new jhg(ig7Var3, provider2, providerA2, kodVar, provider, providerA2, providerA2), new u2h(provider, providerA2, kodVar, providerA2)));
            return cd3Var;
        }
    }
}
