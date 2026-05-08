package com.indeed.android.jsmappservices.util;

import defpackage.pu2;
import defpackage.uh3;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jsmappservices.util.LocationSensor", f = "LocationUtils.kt", l = {82, 87}, m = "detectLocation")
public final class b extends pu2 {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LocationSensor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LocationSensor locationSensor, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = locationSensor;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
