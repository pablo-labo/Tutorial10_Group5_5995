package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ki implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ luc b;

    public /* synthetic */ ki(luc lucVar, int i) {
        this.a = i;
        this.b = lucVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        luc lucVar = this.b;
        switch (i) {
            case 0:
                lucVar.element = (String) obj;
                return j6g.a;
            default:
                sqd sqdVar = (sqd) obj;
                sqdVar.getClass();
                return Boolean.valueOf(sqdVar != lucVar.element);
        }
    }
}
