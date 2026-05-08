package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class gt0 extends p92 {
    public final /* synthetic */ int b;
    public final zy8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt0(KSerializer kSerializer, int i) {
        super(kSerializer);
        this.b = i;
        kSerializer.getClass();
        switch (i) {
            case 1:
                super(kSerializer);
                SerialDescriptor descriptor = kSerializer.getDescriptor();
                descriptor.getClass();
                this.c = new ft0(descriptor, 1);
                break;
            default:
                SerialDescriptor descriptor2 = kSerializer.getDescriptor();
                descriptor2.getClass();
                this.c = new ft0(descriptor2, 0);
                break;
        }
    }

    @Override // defpackage.m1
    public final Object a() {
        switch (this.b) {
            case 0:
                return new ArrayList();
            default:
                return new HashSet();
        }
    }

    @Override // defpackage.m1
    public final int b(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList.size();
            default:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet.size();
        }
    }

    @Override // defpackage.m1
    public final Object g(Object obj) {
        switch (this.b) {
            case 0:
                throw null;
            default:
                throw null;
        }
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        switch (this.b) {
        }
        return (ft0) this.c;
    }

    @Override // defpackage.m1
    public final Object h(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList;
            default:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet;
        }
    }

    @Override // defpackage.n92
    public final void i(int i, Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                arrayList.add(i, obj2);
                break;
            default:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                hashSet.add(obj2);
                break;
        }
    }
}
