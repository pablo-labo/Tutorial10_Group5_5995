package defpackage;

import defpackage.d0a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0a implements Function1 {
    public final /* synthetic */ d0a a;
    public final /* synthetic */ luc b;
    public final /* synthetic */ iuc c;
    public final /* synthetic */ xsd d;
    public final /* synthetic */ huc e;

    public /* synthetic */ g0a(d0a d0aVar, luc lucVar, iuc iucVar, xsd xsdVar, huc hucVar) {
        this.a = d0aVar;
        this.b = lucVar;
        this.c = iucVar;
        this.d = xsdVar;
        this.e = hucVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, d0a$a] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        d0a d0aVar = this.a;
        d0a.a aVarD = d0a.d(d0aVar.e);
        if (aVarD != null) {
            d0aVar.e(aVarD);
            luc lucVar = this.b;
            ?? A = ((d0a.a) lucVar.element).a(aVarD);
            lucVar.element = A;
            long j = A.a;
            xsd xsdVar = this.d;
            this.c.element = xsdVar.g(xsdVar.e(j));
            this.e.element = !w74.d(r0 - fFloatValue);
        }
        return Boolean.valueOf(aVarD != null);
    }
}
