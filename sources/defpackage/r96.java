package defpackage;

import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r96 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r96(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((q96) obj2).getClass();
                ((sf7) obj).getClass();
                String strE = ((pp7) cr8.p(pp7.class)).e();
                if (strE == null) {
                    strE = "";
                }
                return u63.Z(new t4e(j6.c("ctk", strE), "iglu:com.snowplowanalytics.iglu/anything-a/jsonschema/1-0-0"));
            default:
                return ((woe) obj2).apply(obj);
        }
    }
}
