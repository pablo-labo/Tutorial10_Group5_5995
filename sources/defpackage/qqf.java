package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class qqf implements sf7 {
    public final String a;
    public final String b;
    public final HashMap c;
    public final h00 d;
    public final ArrayList e;
    public final UUID f;
    public long g;
    public Long h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public qqf(rx4 rx4Var, h00 h00Var) {
        HashMap<String, Object> map;
        Object obj;
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.f = uuidRandomUUID;
        this.g = System.currentTimeMillis();
        this.e = z92.B1(rx4Var.getEntities());
        this.h = null;
        this.c = new HashMap(lc9.g0(rx4Var.a()));
        this.d = h00Var;
        this.j = rx4Var instanceof pqf;
        if (!(rx4Var instanceof dxg)) {
            if (rx4Var instanceof u3) {
                this.b = ((u3) rx4Var).d();
                this.i = true;
                return;
            } else {
                e4 e4Var = rx4Var instanceof e4 ? (e4) rx4Var : null;
                this.a = e4Var != null ? e4Var.d() : null;
                this.i = false;
                return;
            }
        }
        Object obj2 = ((HashMap) b()).get("e");
        this.b = obj2 != null ? obj2.toString() : null;
        t4e t4eVar = (t4e) ((HashMap) b()).get("selfDescribingEventData");
        if (t4eVar != null && (map = t4eVar.a) != null && (obj = map.get("schema")) != null) {
            string = obj.toString();
        }
        this.a = string;
        this.k = true;
    }

    public final List<t4e> a() {
        ArrayList arrayList = this.e;
        if (arrayList != null) {
            return arrayList;
        }
        wl7.g("entities");
        throw null;
    }

    public final Map<String, Object> b() {
        HashMap map = this.c;
        if (map != null) {
            return map;
        }
        wl7.g("payload");
        throw null;
    }
}
