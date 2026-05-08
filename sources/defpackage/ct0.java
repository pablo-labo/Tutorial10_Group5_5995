package defpackage;

import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class ct0 implements Iterator, ze8 {
    public final /* synthetic */ int a = 1;
    public int b;
    public final Object c;

    public ct0(SerialDescriptor serialDescriptor) {
        this.c = serialDescriptor;
        this.b = serialDescriptor.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < ((Object[]) this.c).length) {
                }
                break;
            default:
                if (this.b > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                try {
                    int i2 = this.b;
                    this.b = i2 + 1;
                    return ((Object[]) obj)[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    s6.j(e.getMessage());
                    return null;
                }
            default:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                int iD = serialDescriptor.d();
                int i3 = this.b;
                this.b = i3 - 1;
                return serialDescriptor.h(iD - i3);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ct0(Object[] objArr) {
        objArr.getClass();
        this.c = objArr;
    }
}
