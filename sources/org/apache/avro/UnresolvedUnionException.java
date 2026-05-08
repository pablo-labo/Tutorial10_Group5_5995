package org.apache.avro;

import defpackage.l6;
import defpackage.t40;
import defpackage.u40;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public class UnresolvedUnionException extends AvroRuntimeException {
    private g unionSchema;
    private Object unresolvedDatum;

    /* JADX WARN: Illegal instructions before constructor call */
    public UnresolvedUnionException(g gVar, g.f fVar, Object obj) {
        String strValueOf = String.valueOf(gVar);
        String strValueOf2 = String.valueOf(obj);
        super(l6.i(u40.f("Not in union ", strValueOf, ": ", strValueOf2, " (field="), fVar.b, ")"));
        this.unionSchema = gVar;
        this.unresolvedDatum = obj;
    }

    public UnresolvedUnionException(Object obj, g gVar) {
        super(t40.l("Not in union ", String.valueOf(gVar), ": ", String.valueOf(obj)));
        this.unionSchema = gVar;
        this.unresolvedDatum = obj;
    }
}
