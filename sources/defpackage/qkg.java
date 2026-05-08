package defpackage;

import coil3.request.NullRequestDataException;
import defpackage.w27;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class qkg {

    public static final class a implements Function1 {
        public static final a a = new a();

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    public static final uw4 a(w27 w27Var, Throwable th) {
        k07 k07VarInvoke;
        if (th instanceof NullRequestDataException) {
            Function1<w27, k07> function1 = w27Var.o;
            w27.b bVar = w27Var.u;
            k07VarInvoke = function1.invoke(w27Var);
            if (k07VarInvoke == null) {
                k07VarInvoke = bVar.j.invoke(w27Var);
            }
            if (k07VarInvoke == null && (k07VarInvoke = w27Var.n.invoke(w27Var)) == null) {
                k07VarInvoke = bVar.i.invoke(w27Var);
            }
        } else {
            k07VarInvoke = w27Var.n.invoke(w27Var);
            if (k07VarInvoke == null) {
                k07VarInvoke = w27Var.u.i.invoke(w27Var);
            }
        }
        return new uw4(k07VarInvoke, w27Var, th);
    }
}
