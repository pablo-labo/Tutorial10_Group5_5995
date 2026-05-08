package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n7i extends k7i {
    @Override // defpackage.k7i
    public final <L> List<L> a(Object obj, long j) {
        s5i s5iVar = (s5i) rdi.l(obj, j);
        if (s5iVar.Q()) {
            return s5iVar;
        }
        int size = s5iVar.size();
        s5i s5iVarB0 = s5iVar.b0(size == 0 ? 10 : size << 1);
        rdi.d(obj, j, s5iVarB0);
        return s5iVarB0;
    }

    @Override // defpackage.k7i
    public final void b(Object obj, long j, Object obj2) {
        s5i s5iVarB0 = (s5i) rdi.l(obj, j);
        s5i s5iVar = (s5i) rdi.l(obj2, j);
        int size = s5iVarB0.size();
        int size2 = s5iVar.size();
        if (size > 0 && size2 > 0) {
            if (!s5iVarB0.Q()) {
                s5iVarB0 = s5iVarB0.b0(size2 + size);
            }
            s5iVarB0.addAll(s5iVar);
        }
        if (size > 0) {
            s5iVar = s5iVarB0;
        }
        rdi.d(obj, j, s5iVar);
    }

    @Override // defpackage.k7i
    public final void c(Object obj, long j) {
        ((s5i) rdi.l(obj, j)).W();
    }
}
