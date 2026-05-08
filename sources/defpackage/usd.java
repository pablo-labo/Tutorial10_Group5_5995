package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class usd implements afa {
    public final /* synthetic */ xsd a;

    public usd(xsd xsdVar) {
        this.a = xsdVar;
    }

    @Override // defpackage.afa
    public final long a(long j) {
        xsd xsdVar = this.a;
        return xsdVar.c(xsdVar.k, j, 1);
    }

    @Override // defpackage.afa
    public final long b(int i, long j) {
        xsd xsdVar = this.a;
        xsdVar.j = i;
        nxa nxaVar = xsdVar.b;
        return (nxaVar == null || !(xsdVar.a.d() || xsdVar.a.c())) ? xsdVar.c(xsdVar.k, j, i) : nxaVar.b(j, xsdVar.j, xsdVar.m);
    }
}
