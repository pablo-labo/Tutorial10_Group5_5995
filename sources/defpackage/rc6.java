package defpackage;

import defpackage.qc6;
import defpackage.wg0;
import kotlin.jvm.functions.Function1;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public final class rc6 implements Function1<wg0<ResponseBody>, j6g> {
    public final /* synthetic */ jjd a;
    public final /* synthetic */ pua<Object> b;

    public rc6(jjd jjdVar, pua puaVar, hsa hsaVar) {
        this.a = jjdVar;
        this.b = puaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(wg0<ResponseBody> wg0Var) {
        wg0<ResponseBody> wg0Var2 = wg0Var;
        wg0Var2.getClass();
        boolean z = wg0Var2 instanceof wg0.a;
        jjd jjdVar = this.a;
        if (z) {
            p81 p81Var = ((wg0.a) wg0Var2).a;
            p81Var.getClass();
            jjdVar.resumeWith(new wg0.a(p81Var));
        }
        if (wg0Var2 instanceof wg0.b) {
            to1 e = ((ResponseBody) ((wg0.b) wg0Var2).a).getE();
            e.getClass();
            jjdVar.resumeWith(qc6.a.b(xua.b(this.b, new uo1(e))));
        }
        return j6g.a;
    }
}
