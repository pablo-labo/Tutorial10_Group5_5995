package defpackage;

import java.util.List;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class j04 implements az2 {
    public Object a;
    public Object b;

    public jhf a(List list) {
        qh4 qh4Var = null;
        try {
            int size = list.size();
            int i = 0;
            qh4 qh4Var2 = null;
            while (i < size) {
                try {
                    qh4 qh4Var3 = (qh4) list.get(i);
                    try {
                        qh4Var3.a((co4) this.b);
                        i++;
                        qh4Var2 = qh4Var3;
                    } catch (Exception e) {
                        e = e;
                        qh4Var = qh4Var3;
                        StringBuilder sb = new StringBuilder();
                        StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                        sb2.append(((co4) this.b).a.a());
                        sb2.append(", composition=");
                        sb2.append(((co4) this.b).c());
                        sb2.append(", selection=");
                        co4 co4Var = (co4) this.b;
                        sb2.append((Object) kjf.h(cr8.c(co4Var.b, co4Var.c)));
                        sb2.append("):");
                        sb.append(sb2.toString());
                        sb.append('\n');
                        z92.V0(list, sb, "\n", null, null, new a3(qh4Var, this), 60);
                        throw new RuntimeException(sb.toString(), e);
                    }
                } catch (Exception e2) {
                    e = e2;
                    qh4Var = qh4Var2;
                }
            }
            co4 co4Var2 = (co4) this.b;
            co4Var2.getClass();
            le0 le0Var = new le0(co4Var2.a.toString());
            co4 co4Var3 = (co4) this.b;
            long jC = cr8.c(co4Var3.b, co4Var3.c);
            kjf kjfVar = kjf.g(((jhf) this.a).b) ? null : new kjf(jC);
            jhf jhfVar = new jhf(le0Var, kjfVar != null ? kjfVar.a : cr8.c(kjf.e(jC), kjf.f(jC)), ((co4) this.b).c());
            this.a = jhfVar;
            return jhfVar;
        } catch (Exception e3) {
            e = e3;
        }
    }

    @Override // defpackage.az2
    public Object convert(Object obj) {
        ResponseBody responseBody = (ResponseBody) obj;
        responseBody.getClass();
        return ((c8e) this.b).a((i04) this.a, responseBody);
    }
}
