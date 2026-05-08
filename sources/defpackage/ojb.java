package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ojb {
    public final String a;
    public final okc b;
    public final Function1<Context, List<le3<rjb>>> c;
    public final e13 d;
    public final Object e;
    public volatile sz5 f;

    /* JADX WARN: Multi-variable type inference failed */
    public ojb(String str, okc okcVar, Function1<? super Context, ? extends List<? extends le3<rjb>>> function1, e13 e13Var) {
        str.getClass();
        this.a = str;
        this.b = okcVar;
        this.c = function1;
        this.d = e13Var;
        this.e = new Object();
    }

    public final Object a(qf8 qf8Var, Object obj) {
        sz5 sz5Var;
        Context context = (Context) obj;
        context.getClass();
        qf8Var.getClass();
        sz5 sz5Var2 = this.f;
        if (sz5Var2 != null) {
            return sz5Var2;
        }
        synchronized (this.e) {
            try {
                if (this.f == null) {
                    Context applicationContext = context.getApplicationContext();
                    okc okcVar = this.b;
                    Function1<Context, List<le3<rjb>>> function1 = this.c;
                    applicationContext.getClass();
                    List<le3<rjb>> listInvoke = function1.invoke(applicationContext);
                    e13 e13Var = this.d;
                    njb njbVar = new njb(applicationContext, this);
                    listInvoke.getClass();
                    this.f = new sz5(new yge(new mjb(njbVar), u63.Z(new me3(listInvoke, null)), okcVar, e13Var));
                }
                sz5Var = this.f;
                sz5Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return sz5Var;
    }
}
