package defpackage;

import defpackage.lla;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class jqf extends lla.a {
    public final /* synthetic */ mqf a;

    public jqf(mqf mqfVar) {
        this.a = mqfVar;
    }

    @Override // lla.a
    public final void a(HashMap map) {
        mqf mqfVar = this.a;
        if (mqfVar.u) {
            Object obj = map.get("event");
            rx4 rx4Var = obj instanceof rx4 ? (rx4) obj : null;
            if (rx4Var != null) {
                mqfVar.c(rx4Var);
            }
        }
    }
}
