package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ka7 extends byf {
    public final rxf[] b;
    public final wxf[] c;
    public final boolean d;

    public ka7(rxf[] rxfVarArr, wxf[] wxfVarArr, boolean z) {
        rxfVarArr.getClass();
        wxfVarArr.getClass();
        this.b = rxfVarArr;
        this.c = wxfVarArr;
        this.d = z;
    }

    @Override // defpackage.byf
    public final boolean b() {
        return this.d;
    }

    @Override // defpackage.byf
    public final wxf d(ui8 ui8Var) {
        v62 v62VarD = ui8Var.M0().d();
        rxf rxfVar = v62VarD instanceof rxf ? (rxf) v62VarD : null;
        if (rxfVar != null) {
            int index = rxfVar.getIndex();
            rxf[] rxfVarArr = this.b;
            if (index < rxfVarArr.length && wl7.b(rxfVarArr[index].j(), rxfVar.j())) {
                return this.c[index];
            }
        }
        return null;
    }

    @Override // defpackage.byf
    public final boolean e() {
        return this.c.length == 0;
    }
}
