package defpackage;

import java.util.Map;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class zo1 implements af0 {
    public final ei8 a;
    public final mq5 b;
    public final Map<n8a, up2<?>> c;
    public final Lazy d;

    public zo1(ei8 ei8Var, mq5 mq5Var, Map map) {
        ei8Var.getClass();
        mq5Var.getClass();
        this.a = ei8Var;
        this.b = mq5Var;
        this.c = map;
        this.d = boa.E(qt8.b, new yo1(this, 0));
    }

    @Override // defpackage.af0
    public final qne g() {
        return qne.p;
    }

    @Override // defpackage.af0
    public final ui8 getType() {
        Object value = this.d.getValue();
        value.getClass();
        return (ui8) value;
    }

    @Override // defpackage.af0
    public final mq5 h() {
        return this.b;
    }

    @Override // defpackage.af0
    public final Map<n8a, up2<?>> i() {
        return this.c;
    }
}
