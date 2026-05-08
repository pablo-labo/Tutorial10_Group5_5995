package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.u;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class x implements w {
    @Override // androidx.datastore.preferences.protobuf.w
    public final v a(Object obj, Object obj2) {
        v vVarI = (v) obj;
        v vVar = (v) obj2;
        if (!vVar.isEmpty()) {
            if (!vVarI.g()) {
                vVarI = vVarI.i();
            }
            vVarI.f();
            if (!vVar.isEmpty()) {
                vVarI.putAll(vVar);
            }
        }
        return vVarI;
    }

    @Override // androidx.datastore.preferences.protobuf.w
    public final u.a<?, ?> b(Object obj) {
        return ((u) obj).a;
    }

    @Override // androidx.datastore.preferences.protobuf.w
    public final v c(Object obj) {
        return (v) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.w
    public final v d(Object obj) {
        return (v) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.w
    public final Object e(Object obj) {
        ((v) obj).h();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.w
    public final v f() {
        return v.a.i();
    }

    @Override // androidx.datastore.preferences.protobuf.w
    public final int g(int i, Object obj, Object obj2) {
        v vVar = (v) obj;
        u uVar = (u) obj2;
        int iC = 0;
        if (vVar.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : vVar.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            uVar.getClass();
            int iR1 = CodedOutputStream.R1(i);
            int iA = u.a(uVar.a, key, value);
            iC = defpackage.b0.c(iA, iA, iR1, iC);
        }
        return iC;
    }

    @Override // androidx.datastore.preferences.protobuf.w
    public final boolean h(Object obj) {
        return !((v) obj).g();
    }
}
