package defpackage;

import defpackage.j5c;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class hyf {
    public final List<j5c> a;

    public hyf(m5c m5cVar) {
        List<j5c> listO = m5cVar.o();
        if (m5cVar.p()) {
            int iN = m5cVar.n();
            List<j5c> listO2 = m5cVar.o();
            listO2.getClass();
            List<j5c> list = listO2;
            ArrayList arrayList = new ArrayList(t92.r0(list, 10));
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    u63.o0();
                    throw null;
                }
                j5c j5cVarM = (j5c) obj;
                if (i >= iN) {
                    j5cVarM.getClass();
                    j5c.c cVarM0 = j5c.m0(j5cVarM);
                    cVarM0.d |= 2;
                    cVarM0.f = true;
                    j5cVarM = cVarM0.m();
                    if (!j5cVarM.d()) {
                        throw new UninitializedMessageException();
                    }
                }
                arrayList.add(j5cVarM);
                i = i2;
            }
            listO = arrayList;
        }
        listO.getClass();
        this.a = listO;
    }

    public final j5c a(int i) {
        return this.a.get(i);
    }
}
